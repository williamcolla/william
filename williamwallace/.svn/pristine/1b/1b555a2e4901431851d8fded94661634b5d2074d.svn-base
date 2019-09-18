create table ex3.tb_veiculo(
	placa INTEGER primary key not null,
	modelo VARCHAR(20),
	chassi INTEGER,
	categoria VARCHAR(20),
	cor VARCHAR(20),
	cpf INTEGER,
	anaFab VARCHAR(13)
	);

create table ex3.tb_proprietario(
	cpf INTEGER primary key not null,
	nome VARCHAR(50),
	idade INTEGER,
	sexo VARCHAR(10),
	dataNasc VARCHAR(13),
	rua VARCHAR(50),
	estado VARCHAR(50),
	cidade VARCHAR(50),
	bairro VARCHAR(50),
	numero INTEGER
	);

create table ex3.tb_agente(
	matriculo INTEGER primary key not null,
	dataCompra Varchar(50),
	nome VARCHAR(50),
	tempoServ INTEGER
	);
	
create table ex3.tb_infracoes(
	idInfra INTEGER primary key not null,
	matricula INTEGER,
	dataInfra VARCHAR(13),
	tipoInfra INTEGER,
	hora VARCHAR(15),
	foreign key (matricula) references ex3.tb_agente,
	foreign key (tipoInfra) references ex3.tb_tipoinfra
	);

create table ex3.tb_local(
	codigo INTEGER primary key not null,
	posicaoGeo VARCHAR(50),
	veloPermi FLOAT
	);

create table ex3.tb_tipoinfra(
	codigo INTEGER primary key not null,
	valor FLOAT
	);

create table ex3.tb_comete(
	idComete INTEGER primary key not null,
	placa INTEGER,
	idInfra INTEGER,
	foreign key (placa) references ex3.tb_veiculo,
	foreign key (idInfra) references ex3.tb_infracoes
	);

create table ex3.tb_ocorre(
	idOcorre INTEGER primary key not null,
	codigo INTEGER,
	idInfra INTEGER,
	foreign key (codigo) references ex3.tb_local,
	foreign key (idInfra) references ex3.tb_infracoes
	);