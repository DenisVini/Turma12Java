create database db_pizzaria_legal;
use db_pizzaria_legal;
drop table tb_categoria;
create table tb_categoria (
	id_categoria int not null auto_increment primary key,
    tipo varchar(255)
);
	insert into tb_categoria(id_categoria, tipo) values
    (1,'Doce'),
    (2,'Salgado'),
    (3,'Vegana'),
    (4,'Massa Frita'),
	(5,'Vegeratiana');
    drop table tb_pizza;
create table tb_pizza (
	id_pizza int not null auto_increment primary key,
    preco double(4,2),
    sabor varchar(255),
    id_categoria int,
    tamanho enum('Grande','Broto'),
     constraint fk_categoria FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria));

	insert into tb_pizza(id_categoria, sabor, preco) values 
		(1,'Chocolate-Branco',27.00),
        (1,'Chocolate',23.99),
        (2,'Frango',35.99),
        (2,'Calabresa',22.99),
        (3,'Tomate',28.99),
        (3,'Escarola',39.20),
        (5,'Ovos',26.99),
        (5,'Atum',29.30);
        
	select * from tb_pizza;
    
    select * from tb_categoria;
    
    select * from tb_pizza
    inner join tb_categoria
    where tb_categoria.id_categoria = tb_pizza.id_categoria;