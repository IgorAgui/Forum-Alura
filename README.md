# Challenge | Java | Back-end | FORUM ALURA API REST

<p align="center" >
     <img width="600" heigth="400" src="https://raw.githubusercontent.com/IgorAgui/Forum-Alura/main/Img/ApiForum.PNG">
</p>


# Desafio <img width="48" height="48" src="https://img.icons8.com/color/48/spring-logo.png" alt="spring-logo"/>
Desenvolver uma API REST usando o Spring Boot

# Requisitos
- Criar um novo tópico
- Atualizar um tópico
- Excluir um tópico
- Mostrar todos os tópicos criados
- Mostrar um tópico específico
- Status do Tópico

## <img width="64" height="64" src="https://img.icons8.com/nolan/64/1A6DFF/C822FF/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Tecnologias Utilizadas:
- JAVA
- Spring Boot 3.1.4
- Token JWT
- Spring Data JPA
- MySQL
- Swagger UI
- BCrypt Password
- Spring Security
- IntelliJ IDEA

## <img width="64" height="64" src="https://img.icons8.com/color/48/java-coffee-cup-logo--v1.png" alt="java-coffee-cup-logo--v1"/>Requisitos para utilizar o aplicativo:

- Java 17 ou Superior
- MySQL Server

## ⚙️ Configurando o MySQL:
- Criando o Banco de Dados (O nome deve ser **forum;**)
```sql
CREATE DATABASE forum;
```
- Quando a aplicação for iniciada, ela irá criar automaticamente o usuário e senha.
```
user= igor@alura.com  e password= 123456
```
- Você deve utilizar esses dados na função Post/login, que irá gerar um Bearer Token JWT para ser utilizado como autorização🔓 nas outras funções.

## :octocat: Guia completo das funções da API, quando o aplicativo em execução:
```
http://localhost:8080/swagger-ui/index.html
```
<p align="center" >
     <img width="800" heigth="600" src="https://raw.githubusercontent.com/IgorAgui/Forum-Alura/main/Img/ApiForum.PNG">
</p>















