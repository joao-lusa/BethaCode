CREATE TABLE responsaveis_alunosBetha(
	i_responsaveis INTEGER,
	i_alunos INTEGER REFERENCES alunosBetha(i_alunos),
	nome varchar(60) NOT NULL,
	telefone VARCHAR(14),
	email VARCHAR(100),
	PRIMARY KEY(i_responsaveis)
);

SELECT * FROM responsaveis_alunosBetha;
SELECT * FROM alunosBetha;