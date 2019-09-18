create table ex1.tb_artista(
	codigo INTEGER PRIMARY KEY NOT NULL,
	nome VARCHAR(50),
	dataNasc VARCHAR(11),
	dataFale VARCHAR(11),
	texto VARCHAR(500),
	paisOrigem VARCHAR(20),
	EstiloInsp VARCHAR(15)
	);

create table ex1.tb_leiloeiro(
	idLeilo INTEGER primary key not null,
	nomeLeilo VARCHAR(50)
	);

create table ex1.tb_tipo(
	idTipo INTEGER primary key not null,
	material VARCHAR(10),
	tecnica VARCHAR(20),
	estadoConser VARCHAR(10),
	outroTipo VARCHAR(10)
	);

create table ex1.tb_leiloes(
	dataReali VARCHAR(11) primary key not null,
	valorVenda FLOAT,
	localLei VARCHAR(50),
	idLeilo INTEGER,
	foreign key (idLeilo) references ex1.tb_leiloeiro
	);

create table ex1.tb_cliente(
	cpf INTEGER primary key not null,
	nome VARCHAR(50),
	idade VARCHAR(11),
	rua VARCHAR(20),
	numero INTEGER,
	bairro VARCHAR(20),
	cidade VARCHAR(20)
	);

create table ex1.tb_telefones(
	telefone VARCHAR(13),
	cpf INTEGER,
	CONSTRAINT pk_CE primary key(telefone, cpf),
	foreign key(cpf) references ex1.tb_cliente
	);

create table ex1.tb_compra(
	codigoId INTEGER primary key not null,
	cpf INTEGER,
	dataRe VARCHAR(11),
	foreign key(cpf) references ex1.tb_cliente,
	foreign key(dataRe) references ex1.tb_leiloes
	);

create table ex1.tb_obra(
	id INTEGER primary key not null,
	codigo INTEGER,
	dataRe VARCHAR(11),
	descricao VARCHAR(50),
	anoFinalizada VARCHAR(11),
	valor FLOAT,
	altura FLOAT,
	largura FLOAT,
	foreign key(codigo) references ex1.tb_artista,
	foreign key(dataRe) references ex1.tb_leiloes
	);

create table ex1.tb_escultura(
	id INTEGER primary key not null,
	material VARCHAR(50),
	foreign key (id) references ex1.tb_obra
	);

create table ex1.tb_outroTipo(
	id INTEGER primary key not null,
	foreign key (id) references ex1.tb_obra
	);

create table ex1.tb_pintura(
	id INTEGER primary key not null,
	estadoConser VARCHAR,
	tecnica VARCHAR,
	foreign key (id) references ex1.tb_obra
	);

drop table ex1.tb_obra;
drop table ex1.tb_escultura;
drop table ex1.tb_outroTipo;
drop table ex1.tb_pintura;
drop table ex1.tb_compra;
drop table ex1.tb_telefones;
drop table ex1.tb_artista;
drop table ex1.tb_tipo;
drop table ex1.tb_leiloes;
drop table ex1.tb_cliente;

select * from ex1.tb_artista;
select * from ex1.tb_tipo;
select * from ex1.tb_leiloes;
select * from ex1.tb_cliente;
select * from ex1.tb_telefones;
select * from ex1.tb_compra;
select * from ex1.tb_obra;

insert into ex1.tb_artista (codigo, nome, dataNasc, dataFale, texto, paisOrigem, EstiloInsp) VALUES (1, 'Josberval', '22/04/1913', '15/06/1993', 'Gosta do estilo barroco', 'Alemanha', 'Barroco'),
	(2, 'Von Neumann', '06/02/1892', '13/12/1971', 'Gostava de jogar xadrez', 'Hungria', 'Renascentista');

insert into ex1.tb_tipo (idTipo, material, tecnica, estadoConser, outroTipo) VALUES (1, 'Pano', 'Tinta a óleo', 'BOM', 'NÃO'), 
	(2, 'Papel', 'Modelagem', 'ÓTIMO', 'NÃO');

insert into ex1.tb_leiloes (nomeLeilo, valorVenda, local, dataReali) VALUES ('Carlos Eduardo', 1203572.45, 'Cada de leiloes do Carlos', '17/05/2019'),
	('Eloah Vicente', 930253.21, 'Casa de leiloes do Carlos', '19/04/2018'); 

insert into ex1.tb_cliente (cpf, nome, idade, rua , numero, bairro, cidade) VALUES (47111, 'Batman', 35, 'Rua do morcego', 481, 'Batcaverna', 'Gothan'),
	(49382, 'Mari Correia', 18, 'Rio das borboletas', 32, 'Vila Nova', 'Tanabian');

insert into ex1.tb_telefones (telefone, cpf) VALUES ('(17)996522523', 47111), ('(11)998342156', 49382);

insert into ex1.tb_compra (codigoId, cpf, nomeLeilo) VALUES (1, 47111, 'Carlos Eduardo'), (2, 49382, 'Eloah Vicente');

insert into ex1.tb_obra (id, codigo, nomeLeilo, descricao, anoFinalizada, valor, altura, largura) VALUES (1, 2, 'Carlos Eduardo', 'Obra muito boa e rara', '28-04-1845', 1000040.67, 3.17, 2.76),
	(2, 1, 'Eloah Vicente', 'Obra achada depois de 100 anos que ela se perdeu', '07/02/1543', 254375.45, 6.34, 4.23);

insert into ex1.tb_obra (id, codigo, nomeLeilo, descricao, anoFinalizada, valor, altura, largura) VALUES 
	(3, 1, 'Eloah Vicente', 'Oferta', '27/06/1728', 2543705.45, 6.34, 4.23);

-- PARTE 5
select o.id, a.nome, l.nomeLeilo, o.valor
from ex1.tb_obra as o, ex1.tb_artista as a, ex1.tb_leiloes as l
where o.valor > 1000000 and o.codigo = a.codigo and o.nomeLeilo = l.nomeLeilo;

insert into ex1.tb_artista (codigo, nome, dataNasc, dataFale, texto, paisOrigem, EstiloInsp) 
VALUES (3, 'José Silva', '12/10/1567', '15/06/1629', 'Inspirado em Van Gogh', 'Espanha', 'Modernismo');

insert into ex1.tb_obra (id, codigo, nomeLeilo, descricao, anoFinalizada, valor, altura, largura) VALUES 
	(4, 3, 'Eloah Vicente', 'Expirado', '27/06/1588', 1163989.19, 2.84, 1.78), (5, 3, 'Eloah Vicente', 'Expirado', '27/06/16128', 245619.78, 1.84, 1.67);

select o.id, o.descricao, a.nome
from ex1.tb_obra as o, ex1.tb_artista as a
where a.nome = 'José Silva' and o.codigo = a.codigo;


insert into ex1.tb_cliente (cpf, nome, idade, rua , numero, bairro, cidade) 
	VALUES (54328, 'Laura Viana', 27, 'Avenida da Paz', 278, 'Cariundiuva', 'São Paulo'), 
	(32867, 'William Colla', 32, 'Rua Jardim do Lago', 4123, 'Hortolândia', 'São Paulo');	

select nome, count(nome) as Quantidade
from ex1.tb_cliente
where cidade = 'São Paulo'
group by nome;



