➡️Projeto bastante desafiador e intuitivo para testar nossos conhecimentos com a linguagem Java e suas ferramentas como o Spring Boot, já vinha trabalhando neste projeto há algum tempo, mas hoje o mesmo chega ao fim, foi uma ótima jornada de aprendizado e desafios.

- abaixo listarei tudo que foi usado nesta aplicação.


-Java 21
-Spring Boot versão mais recente
-Docker
-AWS para por em produção, OBS: não precisa necessariamente usar ela, podendo usar qualquer serviço CLOUD de sua preferência.
-Biblioteca do google (google zxing) para gerar o QR CODE

Alterações que precisam ser feita no POM.XML

--Adicione no properties ->        <google.zxing.version>3.5.2</google.zxing.version>
        		 ->	   <aws.sdk.version>2.20.0</aws.sdk.version>




-Adicione na dependency -> 		        <dependency>
           					 <groupId>com.google.zxing</groupId>
           					 <artifactId>core</artifactId>
            					<version>${google.zxing.version}</version>

       					 </dependency>
      					  <dependency>
         					   <groupId>com.google.zxing</groupId>
          					  <artifactId>javase</artifactId>
           					 <version>${google.zxing.version}</version>
      					  </dependency>
   					 </dependencies>
