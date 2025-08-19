FórumHub API
📖 Sobre o Projeto
FórumHub é uma API RESTful desenvolvida como parte do desafio de back-end do programa Oracle Next Education (ONE). A aplicação simula um fórum de discussão, permitindo que usuários autenticados criem, visualizem, atualizem e deletem tópicos de discussão, de forma similar ao fórum da Alura.

O principal objetivo do projeto é aplicar os conhecimentos de desenvolvimento back-end com Java e Spring, construindo uma API segura, seguindo as melhores práticas do mercado, incluindo autenticação/autorização com tokens JWT e versionamento de banco de dados com Flyway.

✨ Funcionalidades
🔐 Autenticação: Acesso seguro via token JWT. Apenas usuários autenticados podem interagir com os tópicos.

CRUD de Tópicos:
-   Criar: Cadastrar um novo tópico no fórum.
-   Listar: Visualizar todos os tópicos cadastrados com paginação.
-   Detalhar: Exibir as informações de um tópico específico.
-   Atualizar: Modificar o título, mensagem ou estado de um tópico.
-   Deletar: Remover um tópico do fórum.

✔️ Validações: Regras de negócio para garantir a integridade dos dados, como não permitir tópicos duplicados.

🛠️ Tecnologias Utilizadas
O projeto foi desenvolvido com as seguintes tecnologias:

Java 17: Versão da linguagem de programação.

Spring Boot 3: Framework para criação de aplicações Java de forma rápida e robusta.

Spring Security: Para implementação da camada de autenticação e autorização.

Maven: Gerenciador de dependências e build do projeto.

JPA (Hibernate): Para o mapeamento objeto-relacional e persistência de dados.

MySQL: Banco de dados relacional para armazenamento das informações.

Flyway: Ferramenta para versionamento e migração do banco de dados.

Lombok: Biblioteca para reduzir código boilerplate (getters, setters, construtores).

JWT (JSON Web Token): Para a geração de tokens de autenticação.

🚀 Como Executar o Projeto
Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

JDK 17

Maven

MySQL 8

Um cliente de API, como Insomnia ou Postman.

Rodando a Aplicação
Clone o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

Configure o Banco de Dados:

Crie um banco de dados no MySQL com o nome forumhub.

Abra o arquivo src/main/resources/application.properties e altere as propriedades spring.datasource.username e spring.datasource.password com suas credenciais do MySQL.

Execute a aplicação:

Pela sua IDE (IntelliJ, Eclipse) ou pelo terminal, execute o comando Maven:

mvn spring-boot:run

A API estará disponível em http://localhost:8080.

Endpoints da API
Autenticação
POST /login
Realiza a autenticação de um usuário e retorna um token JWT.

Request Body:

{
  "login": "seu_email@example.com",
  "senha": "sua_senha"
}

Success Response (200 OK):

{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}

Tópicos
Todos os endpoints de tópicos requerem um token JWT no cabeçalho Authorization.

Header: Authorization: Bearer <seu_token_jwt>

POST /topicos
Cadastra um novo tópico.

Request Body:

{
  "titulo": "Dúvida sobre Spring Security",
  "mensagem": "Como configuro o SecurityFilter corretamente?",
  "autor": "Nome do Autor",
  "curso": "Spring Boot 3"
}

Success Response (201 Created):
Retorna o tópico recém-criado.

GET /topicos
Lista todos os tópicos cadastrados. Suporta paginação.

Query Params (Opcional):

page: Número da página (começa em 0).

size: Quantidade de itens por página.

sort: Campo para ordenação (ex: data_criacao,desc).

Success Response (200 OK):
Retorna uma página de tópicos.

GET /topicos/{id}
Detalha um tópico específico pelo ID.

Success Response (200 OK):
Retorna os dados completos do tópico.

PUT /topicos
Atualiza os dados de um tópico.

Request Body:

{
  "id": 1,
  "titulo": "Dúvida sobre Spring Security (Atualizado)",
  "mensagem": "A dúvida foi solucionada."
}

Success Response (200 OK):
Retorna o tópico com os dados atualizados.

DELETE /topicos/{id}
Exclui um tópico pelo ID.

Success Response (204 No Content):
Retorna uma resposta vazia.

👨‍💻 Autor
Desenvolvido por Rafael Paolini.
