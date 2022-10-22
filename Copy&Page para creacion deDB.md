create database parkingdb;
use parkingdb;
create table registros(
    nombre varchar(50),
    apellido varchar(50),
    placa varchar(50),
    hora_ingreso int,
    hora_salida int,
    primary key (placa)
);
select * from registros;
