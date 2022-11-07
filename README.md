# Pre-requisitos

1. Instalar Virtual Box:
https://www.virtualbox.org/wiki/Downloads

2. Instalar Docker:
https://docs.docker.com/desktop/install/windows-install/

3. Instalar MySQL Workbench (opcional)
https://dev.mysql.com/downloads/workbench/

# Iniciando

1. Criar pasta "projeto" e dentro dela fazer o clone deste repositório

2. Entrar no repositório e executar: docker-compose up

3. Criar conexão com o banco 
user: root
pass: C0nnect123
host: localhost
porta: 3307

Executar:

INSERT INTO spring_jwt.roles(name) VALUES('ROLE_USER');

INSERT INTO spring_jwt.roles(name) VALUES('ROLE_MODERATOR');

INSERT INTO spring_jwt.roles(name) VALUES('ROLE_ADMIN');


4.  Usar o arquivo "api_postman_collection.json" para importar no postman as APIs

