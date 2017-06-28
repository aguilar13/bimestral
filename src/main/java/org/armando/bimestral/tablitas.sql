/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  ossmx
 * Created: May 30, 2017
 */

create table direccion(id integer primary key auto_increment,numero integer,calle varchar(40),cp integer,municipio varchar(40));
drop table direccion;
select * from direccion;

create table sala_cine(id_sala integer primary key,titulo_pelicula varchar(80),clasificacion varchar(20),num_asientos integer);

create table boleto(id_boleto integer primary key auto_increment,sid_sala integer,costo_boleto float,foreign key (sid_sala) references sala_cine(id_sala));

describe sala_cine;
describe boleto;