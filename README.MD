CleanArch

Como rodar a aplicação:

Execute o doccker compose dentro da pasta docker compose, com o seguinte comando no terminal:
docker-compose up -d

Aguarda até que todos os containers estejam disponíveis. 

No KafkaAnalytics via Intellij insira os seguintes tópicos.
tp-cpf-validated
tp-cpf-validation

Rodar a aplicação. 

Necessário ter o docker instalado.

Na pasta wiremock tem um jar que precisa ser iniciado, o comando é:
java -jar .\wiremock-standalone-3.4.2.jar --port 8082
