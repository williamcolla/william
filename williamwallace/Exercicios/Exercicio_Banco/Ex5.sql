create table ex5.tb_empregado(
	nome_empregado VARCHAR(50) primary key not null,
	rua VARCHAR(20),
	cidade VARCHAR(20)
	);

create table ex5.tb_companhia(
	nome_companhia VARCHAR(50) primary key not null,
	cidade VARCHAR(20)
	);


create table ex5.tb_trabalha(
	id INTEGER primary key not null,
	salario FLOAT,
	nome_empre VARCHAR(20),
	nome_comp VARCHAR(20),
	foreign key (nome_empre) references ex5.tb_empregado,
	foreign key (nome_comp) references ex5.tb_companhia
	);

create table ex5.tb_gerente(
	nome_gerente VARCHAR(20) primary key not null,
	nome_empre VARCHAR(20),
	foreign key (nome_empre) references ex5.tb_empregado
	);

insert into ex5.tb_empregado (nome_empregado, rua, cidade)
	VALUES ('Roberto Carlos', 'Rua dos pianos', 'Perdeneiras'),
	('João da Silva', 'Av. dos Atletas', 'São Carlos'),
	('Carla Rodrigues', 'Av. Santa Rita', 'Rondonopolis');

insert into ex5.tb_empregado (nome_empregado, rua, cidade)
	VALUES ('Wallace Correia', 'Av. Tanabi', 'Moraes');


insert into ex5.tb_companhia (nome_companhia, cidade) 
	VALUES ('Byte Corporation', 'Rio Preto');

insert into ex5.tb_trabalha (id, salario, nome_empre, nome_comp)
	VALUES (7, 16638.32, 'Wallace Correia', 'XYZ Ltda');


insert into ex5.tb_trabalha (id, salario, nome_empre, nome_comp)
	VALUES (1, 12459.45, 'João da Silva', 'XYZ Ltda'),
	(2, 9456.89, 'Carla Rodrigues', 'XYZ Ltda'),
	(3, 4653.26, 'Roberto Carlos', 'Coca');

insert into ex5.tb_gerente (nome_gerente, nome_empre)
	VALUES ('Rodrigo Vieira', 'Carla Rodrigues'),
	('Roberto Carlos', 'Roberto Carlos');
	
select * from ex5.tb_empregado
select * from ex5.tb_gerente
select * from ex5.tb_companhia
select * from ex5.tb_trabalha

select t.nome_empre
from ex5.tb_trabalha as t
where t.nome_comp = 'XYZ Ltda'

select e.cidade
from ex5.tb_empregado as e, ex5.tb_companhia as c
where c.nome_companhia = 'XYZ Ltda'

select t.nome_empre, e.rua, e.cidade
from ex5.tb_empregado as e, ex5.tb_trabalha as t
where e.nome_empregado = t.nome_empre and t.nome_comp = 'XYZ Ltda' and t.salario > 10000

select t.nome_empre, e.rua, e.cidade
from ex5.tb_empregado as e
join ex5.tb_trabalha as t on(e.nome_empregado = t.nome_empre)
where t.nome_comp = 'XYZ Ltda' and t.salario > 10000

select e.nome_empregado
from ex5.tb_empregado as e
join ex5.tb_companhia as c 
on (c.cidade = e.cidade)

select e1.nome_empregado
from ex5.tb_empregado as e, ex5.tb_gerente as g, ex5.tb_empregado as e1
where e.nome_empregado = g.nome_gerente and g.nome_empre = e1.nome_empregado
and e.rua = e1.rua and e.cidade = e1.cidade

select e1.nome_empregado
from ex5.tb_empregado as e
join ex5.tb_gerente as g on(e.nome_empregado = g.nome_gerente)
join ex5.tb_empregado as e1 on(g.nome_empre = e1.nome_empregado)
where e.rua = e1.rua and e.cidade = e1.cidade

select t.nome_empre
from ex5.tb_trabalha as t 
where not t.nome_comp = 'XYZ Ltda'

select t.nome_empre
from ex5.tb_trabalha as t, ex5.tb_trabalha as t1
where t1.nome_comp = 'Byte Corporation' and  t.salario > t1.salario

select t.nome_empre
from ex5.tb_trabalha as t
where t.nome_comp = 'XYZ Ltda' and t.salario > (select max(salario) from ex5.tb_trabalha as t1 where t1.nome_comp = 'Byte Corporation');

