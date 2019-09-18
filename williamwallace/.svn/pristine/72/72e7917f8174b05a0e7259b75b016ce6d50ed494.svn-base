create table ex6.tb_veiculo(
	placa VARCHAR(8) primary key not null,
	estado VARCHAR(20),
	km FLOAT,
	modelo VARCHAR(20),
	marca VARCHAR(20),
	ano VARCHar(11)
	);

create table ex6.tb_cliente(
	cpf INTEGER primary key not null,
	nome VARCHAR(50),
	endereco VARCHAR(50),
	cidade VARCHAR(50),
	telefone VARCHAR(13)
	);

create table ex6.tb_locacao(
	idLoc INTEGER primary key not null,
	cpf INTEGER,
	placa VARCHAR(8),
	dataIn VARCHAR(13),
	dataDev VARCHAR(13),
	kmRod FLOAT,
	foreign key (cpf) references ex6.tb_cliente,
	foreign key (placa) references ex6.tb_veiculo
	);

insert into ex6.tb_veiculo (placa, estado, km, modelo, marca, ano)
		VALUES ('AGB-2846', 'São Paulo', 78945.34, 'Uno', 'Fiat', '2003'),
		('WEM-2019', 'Belo Horizonte', 0.0, 'Evoque', 'Range Rover', '2019');

insert into ex6.tb_cliente (cpf, nome, endereco, cidade, telefone)
	VALUES (47321, 'William Colla', 'Rua José de Andrade, 514', 'Belo Horizonte', '(24)994563212');

insert into ex6.tb_locacao (idLoc, cpf, placa, dataIn, dataDev, kmRod) 
	VALUES (1, 47321, 'WEM-2019', '11/10/2007', '20/10/2007', 70.0);

select * from ex6.tb_veiculo as v
where v.ano = '2003'

select c.nome
from ex6.tb_cliente as c
where c.cidade = 'Belo Horizonte'

select l.placa
from ex6.tb_locacao as l
where l.dataIn = '11/10/2007'

select l.cpf, c.nome
from ex6.tb_locacao as l, ex6.tb_cliente as c
where l.dataIn = '20/10/2007'

