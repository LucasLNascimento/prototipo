CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE aluno(
id BIGINT NOT NULL PRIMARY KEY,
nome VARCHAR (255) NOT NULL,
cpf VARCHAR (255) NOT NULL UNIQUE
);

ALTER TABLE aluno ADD COLUMN numero BIGINT NOT NULL;
ALTER TABLE aluno MODIFY COLUMN id BIGINT (20) AUTO_INCREMENT;

INSERT INTO aluno(id, nome, cpf, numero) VALUES (1,2,3);

select * from aluno;

CREATE USER 'mykaeltest'@'localhost' IDENTIFIED BY '123456';
GRANT SELECT, DELETE, DROP, INSERT, UPDATE ON db_escola.* TO 'mykaeltest';

CREATE TABLE cadastro_produto(
	cod_produto VARCHAR (13) NOT NULL PRIMARY KEY,
    nome_produto VARCHAR (100) NOT NULL,
    valor_inicial DECIMAL (6, 2) NOT NULL,
    valor_final DECIMAL (6, 2) NOT NULL,
    quantidade INT NOT NULL,
    marca_produto VARCHAR (100) NOT NULL,
    tipo VARCHAR (100) NOT NULL,
    dimensao VARCHAR (100) NOT NULL,
    peso DECIMAL (3, 2 ) NOT NULL,
    descricao VARCHAR (100) NOT NULL
);

ALTER TABLE cadastro_produto MODIFY COLUMN cod_produto INT (13) AUTO_INCREMENT;
ALTER TABLE cadastro_produto MODIFY COLUMN peso DECIMAL (6, 2);

INSERT INTO cadastro_produto (cod_produto, nome_produto, valor_inicial, valor_final, quantidade, marca_produto, tipo, dimensao, peso, descricao) VALUES (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

select * from cadastro_produto;