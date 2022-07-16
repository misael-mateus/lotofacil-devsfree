# Challenge DevsFree #2

- REST API LOTERIA NÚMEROS SEQUÊNCIAIS PARA LOTERIA

## Stack

- Maven 4.0.0
- Java 17
- Spring Boot 2.7.1

## Instruções

1. Para o sorteio da Mega-Sena é carregado um globo com 60 bolas, numeradas de 01 a 60, sendo sorteados 6 números.
2. Para o sorteio da Quina é carregado um globo com 80 bolas, numeradas de 01 a 80, sendo sorteados 5 números.
3. Para o sorteio da Lotofácil é carregado um globo com 25 bolas, numeradas de 01 a 25, sendo sorteados 15 números.
4. Para o sorteio da Lotomania é carregado um globo com 100 bolas, numeradas de 00 a 99, sendo sorteados 20 números.

## Port

- Default port 8080

## Endpoints

#### tipo de jogo: mega_sena, quina, loto_facil, loto_mania

>GET /loteria / "tipo de jogo" ? quantidade="quantidade de apostas" <br>
Exemplo: localhost:8080/loteria/mega_sena?quantidade=3
``` json
[[57,48,9,29,18,34],[27,9,28,3,53,46],[56,18,60,47,15,12]]
```

## Observações

- O Limite de apostas por requisição é de 2147483647. 

