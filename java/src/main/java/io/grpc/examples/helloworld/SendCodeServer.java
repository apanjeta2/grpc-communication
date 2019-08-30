
package io.grpc.examples.helloworld;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import java.io.File;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author DT User
 */
public class SendCodeServer {

    private static final Logger logger = Logger.getLogger(SendCodeServer.class.getName());

    private Server server;

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50050;
        server = ServerBuilder.forPort(port)
                .addService(new SendCodeServiceImpl())
                .build()
                .start();
        logger.info("Servers for registration started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                SendCodeServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    
     public static void main(String[] args) throws IOException, InterruptedException {
        final SendCodeServer server = new SendCodeServer();
        server.start();
        server.blockUntilShutdown();
    }
     
    static class SendCodeServiceImpl extends SendCodeServiceGrpc.SendCodeServiceImplBase {

        @Override
        public void generateCode(Email req, StreamObserver<Code> responseObserver) {

           	String char_lower = "abcdefghijklmnopqrstuvwxyz";
           	String char_upper = char_lower.toUpperCase();
           	String num = "0123456789";
           	String passw = char_lower + char_upper + num;
           	String str = shuffleString(passw);
           	    
            Random rand = new Random(); 
        	String code= str.substring(1, 15);

        	sendEmail("sendCodeServer@gmail.com", req.getEmail(), "Your password is "+ code );
            Code reply = Code.newBuilder().setMessage("The code is sent to " + req.getEmail()).setCode(code).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }

    }
    public static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return letters.stream().collect(Collectors.joining());
    }
    
    
    public static void sendEmail(String from, String to, String msg) {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("sendCodeServer@gmail.com", "grpcDiplomski");
            }
        });
        session.setDebug(true);
        
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Mail Subject");


            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            Transport.send(message);

    } catch (Exception e) {
        e.printStackTrace();
    }

        
}
   

}
