CREATE TABLE enderecos_pessoas(
	i_pessoas INTEGER REFERENCES pessoas(i_pessoas),
	tipo_endereco VARCHAR(1) CHECK(tipo_endereco in ('P','S','C')) DEFAULT 'P',
	bairro VARCHAR(60),
	rua	VARCHAR(60),
	numero VARCHAR(10),
	cidade VARCHAR(60),
	uf	VARCHAR(2)	DEFAULT 'SC',
	
	PRIMARY KEY(i_pessoas, tipo_endereco)
);
	
SELECT * FROM enderecos_pessoas;	

INSERT INTO enderecos_pessoas
(i_pessoas, tipo_endereco, bairro, rua, numero, cidade, uf)
values(1, 'C', 'Centro', 'Qualquer', 'S/N', 'Criciuma', 'SC');

SELECT * FROM pessoas order by i_pessoas asc;