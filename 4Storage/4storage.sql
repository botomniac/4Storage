create database 4storage;

#drop database 4storage;

use 4storage;

create table usuario(usuario_id tinyint not null auto_increment,
usuario_nome varchar(20),
usuario_email varchar(40),
usuario_senha varchar(20),
usuario_espaco_max double,
usuario_espaco_usado double, 
primary key(usuario_nome)
);

#select * from documento;

#describe documento;

create table documento(documento_id tinyint not null auto_increment,
documento_nome varchar(50),
documento_tamanho double,
documento_uploader_nome varchar(20), 
documento_data date,
primary key(documento_id),
FOREIGN KEY (documento_uploader_nome) 
REFERENCES usuario(usuario_nome)

);