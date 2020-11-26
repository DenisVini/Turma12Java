create database ecommerce;
	use ecommerce;
    drop table produtos;
    create table produtos(
		id int not null auto_increment primary key,
        nome varchar(255),
        preco double(7,2),
        estoque int,
        datacadastro datetime default current_timestamp
		);
        
        insert into produtos (id, nome, preco, estoque, datacadastro) values
        (1,'Camiseta',10.20,10,default),
        (2,'Calca',20.20,10,default),
        (3,'iPhone 15',15000.40,10,default),
        (4,'Samsung s20',12000.30,10,default),
        (5,'212 Sexy',325.00,10,default),
        (6,'PS6',8000.99,10,default),
        (7,'TV',4000.99,10,default),
        (8,'Cafeteira',59.99,10,default);
        
        select * from produtos
        where preco > 500;
        
        select * from produtos
        where preco < 500;
        
        update produtos 
        set nome = 'PS5'
        where id = 6 ;