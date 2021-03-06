﻿# gRPC protokol u komunikaciji između mikroservisa
 
## Instrukcije za pokretanje 

### Pokretanje servera u Javi

Nakon pozicioniranja u folder java vršimo sljedeće korake:

1.Kompajliranje servera

./gradlew installDist

2.Pokretanje servera

./build/install/examples/bin/send-code-server

Dobijamo sljedeću poruku, što znači da je server pokrenut:

Aug 30, 2019 3:34:23 PM io.grpc.examples.helloworld.SendCodeServer start

INFO: Servers for registration started, listening on 50050 

### Pokretanje servera u NodeJs-u

Pokrenimo sada i server implementiran u nodeJs-u. Nakon pozicioniranja u folder node-backend, sljedećom komandom pokrećemo server:
node registration_server

Potrebno je pokrenuti i server REST_API_server.js, nakon pozicioniranja u folder node-backend pozivamo ga u novoj konzoli sa komandom:
node REST_API_server

### Pokretanje React projekta

Nakon pokretanja svih servera, pokrećemo i React projekat (pozicioniranje u node->Frontend->my-app) sa komandom npm start gdje se u browser-u otvara stranica. 

![alt text](https://github.com/apanjeta2/grpc-communication/blob/master/signin.png)

Klikom na link za registraciju, otvara nam se forma u kojoj možemo unijeti podatke 

![alt text](https://github.com/apanjeta2/grpc-communication/blob/master/signup.png)

Potvdom na button Register se poziva server REST_API_server koji poziva gRPC mikroservis za registraciju prosljeđujući mu podatke sa forme, a on poziva mikroservsi za slanje i generisanje koda.

S obzirom da smo unutar registration_server.js fajla izvršili ispis odgovora koji vrati mikroservis SendCodeService unutar konzole iz koje smo pokrenuli prvi server imamo sljedeći ispis:

vPFdItOYo97cDl (ovdje ispisuje random generisani kod)
1 document inserted

Prva linija predstavlja kod koji je generisao mikroservis SendCodeServer, i isti kod je poslan na email naveden u formi.

![alt text](https://github.com/apanjeta2/grpc-communication/blob/master/mail.png)
 
Ovime je pokazano da se komunikacija između različitih servera odvija uspješno.
