CREATE TABLE cargos (
	id_ SERIAL,
	descricao VARCHAR(60),
	salario DECIMAL(7,2) NOT NULL,
	
	PRIMARY KEY (id_)
);

CREATE TABLE eventos (
	id_ SERIAL,
	descricao VARCHAR(60),
	tipo VARCHAR(1) NOT NULL CHECK(tipo IN('A','D')),
	valor_evento DECIMAL(7,2) NOT NULL,
	dt_validade DATE NOT NULL,
	
	primary KEY (id_)
);

CREATE TABLE funcionarios (
	id_ SERIAL,
	nome VARCHAR(60) NOT NULL,
	telefone VARCHAR(12),
	email VARCHAR(100),
	endereco VARCHAR(100) NOT NULL,
	cpf VARCHAR(12) NOT NULL,
	carteira_trabalho VARCHAR(12) NOT NULL,
	pis VARCHAR(12) NOT NULL,
	dt_admissao DATE NOT NULL,
	dt_demissao DATE NOT NULL,
	dt_nascimento DATE NOT NULL,
	salario DECIMAL (7,4),
	id_cargo INTEGER REFERENCES cargos(id_),
	
	PRIMARY KEY(id_)
);

CREATE TABLE calculos(
	id_ SERIAL,
	mes_competencia INTEGER NOT NULL,
	ano_competencia INTEGER NOT NULL,
	id_funcionario INTEGER REFERENCES funcionarios(id_),
	valor_bruto DECIMAL(7,4) NOT NULL,
	valor_liquido DECIMAL(7,4) NOT NULL,
	
	PRIMARY KEY(id_)
);

CREATE TABLE eventos_manuais (
	id_ SERIAL,
	mes_competencia INTEGER NOT NULL, 
	ano_competencia INTEGER NOT NULL,
	id_funcionario INTEGER REFERENCES funcionarios(id_),
	id_evento INTEGER REFERENCES eventos(id_),
	valor_evento DECIMAL(7,4),
	
	PRIMARY KEY(id_)
);

CREATE TABLE Calculos_Composicao (
	id_ SERIAL,
	id_calculo INTEGER REFERENCES calculos(id_),
	id_eventos_manuais INTEGER REFERENCES eventos_manuais(id_),
	valor_calculado DECIMAL(7,4),
	
	PRIMARY KEY(id_)
);