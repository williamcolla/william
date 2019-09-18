create table ex4.tb_produto(
	codigo INTEGER primary key not null,
	estoque INTEGER,
	valor FLOAT,
	nome VARCHAR(50),
	descricao VARCHAR(100)
	);

create table ex4.tb_cliente(
	cpf INTEGER primary key not null,
	nome VARCHAR(50),
	idade INTEGER,
	telefone VARCHAR(13),
	rua VARCHAR(20),
	cidade VARCHAR(20),
	bairro VARCHAR(20),
	numero INTEGER
	);

create table ex4.tb_vendedor(
	cpf INTEGER primary key not null,
	nome VARCHAR(50),
	salario FLOAT
	);

create table ex4.tb_venda(
	id INTEGER primary key not null,
	data VARCHAR(13),
	valor_total FLOAT
	);

create table ex4.tb_vendido(
	id_venda INTEGER primary key not null,
	qtd_vendida INTEGER,
	id INTEGER,
	codigo INTEGER,
	foreign key (id) references ex4.tb_venda,
	foreign key (codigo) references ex4.tb_produto
	);
	