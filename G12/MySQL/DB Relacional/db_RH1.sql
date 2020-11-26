CREATE DATABASE if not exists RH1 ;
	use RH1;
    Create table Funcionario(
		id int not null auto_increment primary key,
		nome varchar(30) NOT NULL,
         dia_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
        sexo enum('M','F','Outro'),
        salario double(7,3)
    );
    drop table funcionario ;
    
    insert into Funcionario ( id, nome, dia_cadastro,sexo,salario) values
	(1,'Denis',default,'M',1.000),
	(2,'Edson',default,'M',1.500),
    (3,'Bruna',default,'F',1.999),
    (4,'Mara',default,'F',2.500),
    (5,'José',default,'M',3.400);
    #Salarios acima de 2000:
    select * from funcionario
    where salario >2.000;
    #Salarios abaixo de 2000:
    select * from funcionario
    where salario <2.000;
    
    #Alterando um dado da tabela.
    update funcionario 
    set salario = 2.000
    where id = 3;
    
    