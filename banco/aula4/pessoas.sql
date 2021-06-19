CREATE TABLE pessoas(
i_pessoas SERIAL,
nome VARCHAR(60) NOT NULL,
tipo_pessoa	VARCHAR(1) CHECK(tipo_pessoa IN ('F','J')) DEFAULT 'F',
cpf_cnpj VARCHAR(14) NOT NULL UNIQUE,
email	VARCHAR(100),
telefone VARCHAR(14),
celular	VARCHAR(14),
	
PRIMARY KEY(i_pessoas)
);

SELECT * FROM pessoas;

INSERT INTO pessoas
(i_pessoas, nome, tipo_pessoa, cpf_cnpj, email)
values(3, 'Joao','J', '55', 'teste@tttt');