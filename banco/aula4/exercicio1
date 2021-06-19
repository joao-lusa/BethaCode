--exercício

CREATE TABLE atividades(
	i_atividade SERIAL,
	descricao VARCHAR(60) NOT NULL UNIQUE,
	tipo VARCHAR(1) NOT NULL CHECK(tipo IN ('A','S')),
	classificacao VARCHAR(1) NOT NULL CHECK(classificacao IN ('A','I','C','S')),
	aliquota DECIMAL(7,4) NOT NULL CHECK(aliquota >0),
	
	PRIMARY KEY(i_atividade)
);

INSERT INTO atividades(descricao, tipo, classificacao, aliquota)
VALUES('oloko', 'A', 'I', 2);

SELECT * FROM atividades