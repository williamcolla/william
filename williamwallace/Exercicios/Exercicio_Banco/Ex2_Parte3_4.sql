create table ex2.tb_paciente(
	idPac INTEGER primary key not null,
	nomePac VARCHAR(50),
	ruaPac VARCHAR(50),
	bairroPac VARCHAR(50),
	numPac INTEGER,
	cidadePac VARCHAR(50)
	);

	drop table ex2.tb_exames

create table ex2.tb_convenio(
	CNPJ INT primary key not null,
	nomeCon VARCHAR(50),
	pessoaCont VARCHAR(50)
	);

create table ex2.tb_exames(
	idExa INTEGER primary key not null,
	nomeExa VARCHAR(50),
	diagExa VARCHAR(100),
	numExa INTEGER,
	idpac INTEGER,
	cnpj INTEGER,
	foreign key (idpac) references ex2.tb_paciente,
	foreign key (cnpj) references ex2.tb_convenio
	);

create table ex2.tb_telefone(
	telefone VARCHAR(13) primary key not null,
	idPac INTEGER,
	foreign key (idPac) references ex2.tb_paciente
	);


	
insert into ex2.tb_paciente (idPac, nomePac, ruaPac, bairroPac, numPac, cidadePac) VALUES
	(1, 'João da Fiat', 'Rua América', null, 123, null),
	(2, 'Maria Jaguar', 'Av. Ipiranga', null, 321, null),
	(3, 'José Mercedes', 'Rua Brasil', null, 231, null);

insert into ex2.tb_telefone (telefone, idPac) VALUES
	('3227-5555', 1),
	('3224-4232', 2),
	('3225-1234', 3);

select p.nomePac, p.ruaPac, p.numPac, t.telefone
from ex2.tb_paciente as p, ex2.tb_telefone as t
where p.idPac = t.idPac;