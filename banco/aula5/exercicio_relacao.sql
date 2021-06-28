CREATE TABLE cargos (
	id_ SERIAL,
	descricao VARCHAR(60),
	salario DECIMAL(7,2) NOT NULL,
	
	PRIMARY KEY (id_)
);
INSERT INTO cargos(descricao, salario)
VALUES ('mfjf', 500.0);

CREATE TABLE eventos (
	id_ SERIAL,
	descricao VARCHAR(60),
	tipo VARCHAR(1) NOT NULL CHECK(tipo IN('A','D')),
	valor_evento DECIMAL(7,2) NOT NULL,
	dt_validade DATE NOT NULL,
	
	primary KEY (id_)
);
INSERT INTO eventos(descricao, tipo, valor_evento, dt_validade)
VALUES ('mfjf', 'A', 8000.5, '2021/2/2');


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
INSERT INTO funcionarios(nome, telefone, email, endereco, cpf, carteira_trabalho, pis, dt_admissao, dt_demissao, dt_nascimento, salario, id_cargo)
VALUES ('jão', '123', 'teste@teste', 'pedro coelho', '1904', '24214', '24142', '2002/2/2', '2021/2/2', '1904/2/2', 150.0, 1);

INSERT INTO funcionarios(nome, telefone, email, endereco, cpf, carteira_trabalho, pis, dt_admissao, dt_demissao, dt_nascimento, salario, id_cargo)
VALUES ('FAbiaNO', '321', 'teste@t33e', 'coelho', '1902', '242515', '243242', '2002/3/3', '2021/3/3', '1904/3/3', 155.0, 2);

select * from cargos

CREATE TABLE calculos(
	id_ SERIAL,
	mes_competencia INTEGER NOT NULL,
	ano_competencia INTEGER NOT NULL,
	id_funcionario INTEGER REFERENCES funcionarios(id_),
	valor_bruto DECIMAL(7,4) NOT NULL,
	valor_liquido DECIMAL(7,4) NOT NULL,
	
	PRIMARY KEY(id_)
);

INSERT INTO calculos(mes_competencia, ano_competencia, id_funcionario, valor_bruto, valor_liquido)
VALUES (5, 2020, 1, 150.00, 100.00);

CREATE TABLE eventos_manuais (
	id_ SERIAL,
	mes_competencia INTEGER NOT NULL, 
	ano_competencia INTEGER NOT NULL,
	id_funcionario INTEGER REFERENCES funcionarios(id_),
	id_evento INTEGER REFERENCES eventos(id_),
	valor_evento DECIMAL(7,4),
	
	PRIMARY KEY(id_)
);
INSERT INTO eventos_manuais(mes_competencia, ano_competencia, id_funcionario, id_evento, valor_evento)
VALUES (5, 2000, 1, 1, 200.70);

CREATE TABLE Calculos_Composicao (
	id_ SERIAL,
	id_calculo INTEGER REFERENCES calculos(id_),
	id_eventos_manuais INTEGER REFERENCES eventos_manuais(id_),
	valor_calculado DECIMAL(7,4),
	
	PRIMARY KEY(id_)
);
INSERT INTO Calculos_Composicao(id_calculo, id_eventos_manuais, valor_calculado)
VALUES (1, 1, 500.20);

SELECT * FROM cargos;
SELECT * FROM eventos;
SELECT * FROM funcionarios;
SELECT * FROM calculos;
SELECT * FROM eventos_manuais;
SELECT * FROM Calculos_Composicao;

--1)Selecionar apenas a descricao e valor dos eventos.

SELECT descricao, valor_evento
FROM eventos

/*2)Selecionar o nome, e-mail e salários dos 
Funcionários, mas demonstrar como nmNome,
nmEmail e vlrSalario.*/
SELECT nome AS nmNome, email AS nmEmail, salario AS vlrSalario 
FROM funcionarios;

/*3) Selecionar apenas os funcionários com salário
superior a R$: 1000,00*/
SELECT salario 
FROM funcionarios
WHERE salario > 1000;

/*4) Selecionar os diferentes valores de salário
Na tabela de cargos*/
SELECT salario
FROM cargos;

/*5) Selecionar os funcionários ordenando 
por nome e cpf de forma decrescente.*/
SELECT nome, cpf
FROM funcionarios
ORDER BY nome, cpf asc;

/*6)Selecionar os eventos de tipo Aumento e com
valor superior a R$: 100,00.*/ 
SELECT tipo, valor_evento
FROM eventos
WHERE tipo = 'A' AND valor_evento >= 100;

/*7) Selecionar os cargos com código entre 10 e 100 */
SELECT id_
FROM cargos
WHERE id_ between 10 and 100;

/*8)Selecionar o nome dos funcionário em letras 
maiúsculas.*/
SELECT lower(nome)
FROM funcionarios;

/*9) Selecionar os funcionários que começam com
a letra T e terminam com a letro O*/
SELECT nome
FROM funcionarios 
WHERE nome LIKE 'T%O';

/*10) Atualizar os salários dos cargos em R$: 100,00,
quando o salário do cargo for inferior há R$:1500,00.*/
UPDATE cargos
	SET salario = salario + 100
WHERE salario <= 1500.00;

/*11) Faça um computado com o tipo do evento,
demostrando Aumento ou Desconto.
SELECT * FROM eventos; 

SELECT tipo,
tipo 'A' as Aumento,
FROM eventos;*/

/*12) Demonstre no mesmo SQL, o nome e CPF do 
Funcionário e a descrição do seu cargo*/
SELECT nome, cpf, descricao
FROM funcionarios INNER JOIN cargos 
ON (funcionarios.id_ = cargos.id_);

/*13) Com o group by, demonstre a soma dos 
salários calculados para cada competência*/
SELECT valor_calculado
FROM Calculos_Composicao
GROUP BY valor_calculado

/*14 – Com exists, selecione os funcionários com
salário calculado em 2021.
SELECT ano_competencia
FROM calculos
WHERE EXISTS(SELECT 2021
FROM funcionarios
WHERE funcionarios.id_ = calculos.id_);
*/
SELECT * FROM cargos;
SELECT * FROM eventos;
SELECT * FROM funcionarios;
SELECT * FROM calculos;
SELECT * FROM eventos_manuais;
SELECT * FROM Calculos_Composicao;

/*15 – Com in, selecione os funcionários com eventos
Manuais lançados para Julho/2021 do tipo desconto*/
SELECT nome
FROM funcionarios
WHERE id_ IN (SELECT id_
			  FROM eventos_manuais
			 WHERE mes_competencia = 7 AND ano_competencia = 2021);











