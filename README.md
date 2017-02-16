# mars-rover WEB SERVICE

MARS-ROVER WEB SERVICE realiza todas operações para encontrar a localização do rover em marte, sendo necessário a definição dos pontos cartesianos(x,y), a direção que ele está indo (norte (N), sul (S), leste (E), oeste (W)) e os comandos que serão executados, girarEsquerda (L), girarDireita (R), mover (M).
Também é necessário as coordenadas x,y do Planalto. As coordenadas do rover não poderão ser maiores que as coordenadas do Planalto.

Requerimentos:

 - JDK 1.7 ou maior
 - Maven 3.3.9

Dependências:

spring-boot-starter-web
spring-boot-starter-test
junit version 4.2

Ambiente de Desenvolvimento:

  - Eclipse Neon IDE
  - Spring Boot 1.4.2 (ver se é esse msm)	

Executando:

Para executar o projeto devemos executar o seguinte comando no diretório raiz do projeto nosso projeto.

```
	mvn spring-boot:run
```

Para executar os testes do projeto devemos executar o seguinte comando no diretório raiz do nosso projeto.

```
	mvn test
```

Após executar o projeto devemos fazer uma requisição HTTP utilizando o método GET para endpoint, nessa requisação vai ser passado as coordenadas x,y e a direção desejada, exemplo: 1 2 N

```
 	http://{host}:{port}/rover/coordinates/x/1/y/2/direction/N
```
 
Deve-se fazer outra requisição HTTP utilizando o método GET para endpoint, definindo a posição do plateau, exemplo: x = 5, y = 5

```
	http://{host}:{port}/rover/plateau/x/5/y/5
```

Por fim a ultima requisição HTTP utilizando o método GET para endpoint, nessa requisação vamos passar os comandos que o rover deverá executar, exemplo: LMLMLMLMM

```
	http://{host}:{port}/rover/commands/LMLMLMLMM
```

Após esse comando, será retornado na tela a posição na qual o rover se encontra, após essa série de comandos espera-se que o retorno seja: 1 3 N


 
