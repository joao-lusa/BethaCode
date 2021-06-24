CREATE TABLE paises(
	id_ SERIAL,
	idioma VARCHAR(60) NOT NULL,
	
	PRIMARY KEY(id_)
);

CREATE TABLE categorias(
	id_ SERIAL,
	nome VARCHAR(60) NOT NULL,
	
	PRIMARY KEY(id_)
);

CREATE TABLE extencoes(
	id_ SERIAL,
	nome VARCHAR(60) NOT NULL,
	descricao VARCHAR(60),
	
	PRIMARY KEY(id_)
);

CREATE TABLE modelos(
	id_ SERIAL,
	nome VARCHAR(60) NOT NULL,
	especicacoes VARCHAR(60) NOT NULL,
	
	PRIMARY KEY(id_)
);

CREATE TABLE consoles(
	id_ SERIAL,
	num_serie INTEGER NOT NULL,
	id_modelo INTEGER REFERENCES modelos(id_),
	
	PRIMARY KEY(id_)
);

CREATE TABLE usuarios(
	id_ SERIAL,
	nome VARCHAR(60) NOT NULL,
	data_nas DATE NOT NULL,
	email VARCHAR(100) NOT NULL,
	nome_fantasia VARCHAR(60) NOT NULL,
	cartao_credito INTEGER,
	id_pais INTEGER REFERENCES paises(id_),
	id_console INTEGER REFERENCES consoles(id_), 
	
	PRIMARY KEY(id_)
);

CREATE TABLE jogos(
	id_ SERIAL,
	nome VARCHAR(60) NOT NULL,
	preco DECIMAL (7,2) NOT NULL,
	id_pais INTEGER REFERENCES paises(id_),
	id_extencao INTEGER REFERENCES extencoes(id_),
	
	PRIMARY KEY(id_)
);

CREATE TABLE usuarios_jogos(
	id_jogo INTEGER REFERENCES jogos(id_),
	id_usuario INTEGER REFERENCES usuarios(id_)
);

CREATE TABLE paises_jogos(
	id_jogo INTEGER REFERENCES jogos(id_),
	id_usuario INTEGER REFERENCES usuarios(id_)
);

CREATE TABLE compras(
	id_ SERIAL,
	data_compra DATE,
	id_jogo INTEGER REFERENCES jogos(id_),
	id_usuario INTEGER REFERENCES usuarios(id_),
	
	PRIMARY KEY(id_)
);