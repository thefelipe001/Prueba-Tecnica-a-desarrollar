create database EmpresaX;
use EmpresaX;

Create table Cliente(
Id int identity(1,1) primary key,
Nombre varchar(50)not null,
Telefono varchar(50)not null,
Estado varchar(50)not null

)

Create table Direcciones(
Id int identity(1,1) primary key,
Direccion varchar(50)not null,
Cliente_Id varchar(50)not null
)


 alter table Direcciones
 add constraint FK_Direcciones_Clientes
  foreign key (Cliente_id)
  references Cliente(Id);