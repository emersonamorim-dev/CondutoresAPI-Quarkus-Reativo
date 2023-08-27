# Aplicação CondutoresAPI - Quarkus Reativo com PostgreSQL

Codificação em Java para aplicação usando programação reativa foi desenvolvida utilizando o framework Quarkus e tem como objetivo fornecer uma API RESTful para gerenciar condutores e ocorrências. Ela utiliza PostgreSQL como banco de dados e é construída com práticas de programação reativa.

## Características 🚀 

CRUD completo para Condutores e Ocorrências.
Integração com PostgreSQL.
Programação reativa com Quarkus.
Configuração simplificada.


## Pré-requisitos 📋

Java 11 ou superior.

Gradle.

PostgreSQL.

## Configuração e Execução 🛠
Configuração do Banco de Dados
Instale o PostgreSQL.
Crie um banco de dados chamado 'minha_aplicacao'.
Atualize o arquivo application.properties com as credenciais corretas do banco de dados.
Executando a Aplicação


# Clone o repositório
git clone https://github.com/seu_usuario/seu_repositorio.git

# Navegue até o diretório do projeto
cd seu_repositorio

# Compile e execute a aplicação
mvn quarkus:dev

## Endpoints 🌐 
## Condutores:

GET /condutores: Lista todos os condutores.

POST /condutores: Cria um novo condutor.

PUT /condutores/{id}: Atualiza um condutor pelo ID.

DELETE /condutores/{id}: Deleta um condutor pelo ID.

## Ocorrências:

GET /ocorrencias: Lista todas as ocorrências.

POST /ocorrencias: Cria uma nova ocorrência.

PUT /ocorrencias/{id}: Atualiza uma ocorrência pelo ID.

DELETE /ocorrencias/{id}: Deleta uma ocorrência pelo ID.



## Autor:
Emerson Amorim
