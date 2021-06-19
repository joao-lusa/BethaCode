CREATE TABLE empresas(
i_empresas	SERIAL,
nome VARCHAR(100) NOT NULL,
nome_fantasia VARCHAR(100) NOT NULL,
funcionarios INTEGER CHECK(funcionarios > 0),
i_atividades INTEGER REFERENCES atividades(i_atividade),
	
PRIMARY KEY(i_empresas)
);

SELECT * FROM empresas;
SELECT * FROM atividades;

INSERT INTO empresas(nome, nome_fantasia, funcionarios, i_atividades)
values('Betha', 'Betha Sistemas', 580, 2);