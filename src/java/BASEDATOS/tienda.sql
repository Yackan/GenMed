drop schema if exists tienda;
create database tienda;
use tienda;

create table Persona(
	cedula INT NOT NULL  PRIMARY KEY, 
	nombre varchar(30) NOT NULL,
    apellido varchar(30) NOT NULL,
     correo varchar(30) NOT NULL
    
);
create table Cliente(
	idCliente INT NOT NULL auto_increment PRIMARY KEY, 
    direccion varchar(30) NOT NULL,
     cedula INT NOT NULL,
     FOREIGN KEY (cedula) REFERENCES Persona (cedula)
);

create table Vendedor(
	idVendedor INT NOT NULL auto_increment PRIMARY KEY, 
	contraseña varchar(30) NOT NULL,
     cedula INT NOT NULL,
     FOREIGN KEY (cedula) REFERENCES Persona (cedula)
);

create table Adminsitrador(
	idamin INT NOT NULL auto_increment PRIMARY KEY, 
	contraseña varchar(30) NOT NULL,
     cedula INT NOT NULL,
     FOREIGN KEY (cedula) REFERENCES Persona (cedula)
);



create table computador(
idcompu INT NOT NULL auto_increment PRIMARY KEY, 
marca VARCHAR(30) NOT NULL
);

create table CajaRegistradora(
idCC INT NOT NULL auto_increment PRIMARY KEY, 
idcompu INT NOT NULL,
idVendedor INT NOT NULL,
FOREIGN KEY (idVendedor) REFERENCES Vendedor (idVendedor),
FOREIGN KEY (idcompu) REFERENCES computador (idcompu)
);

create table Producto(
	idProducto INT NOT NULL auto_increment PRIMARY KEY, 
  nombre  varchar(30)  not null,
  codeBarras varchar(30)  not null,
  cantidad INT NOT null,
  precio INT NOT null,
  fecha varchar(30)  not null,
  proveedor varchar(30) not null      
);

create table Inventario(
	idInventario INT NOT NULL auto_increment PRIMARY KEY, 
    idProducto INT NOT NULL ,
    cantidad int,
    FOREIGN KEY (idProducto) REFERENCES Producto (idProducto)
);

create table factura(
	idfactura INT NOT NULL auto_increment PRIMARY KEY, 
	fechaFactura varchar(30) NOT NULL,
    infoMercado varchar(30) not null,
    impuesto varchar(30) not null,
    cambio int 
    
);

create table Compras(
	idCompras INT NOT NULL auto_increment PRIMARY KEY, 
    idProducto INT NOT NULL,  
    idfactura INT NOT NULL,
      cedula INT NOT NULL,
     idVendedor INT NOT NULL,
     idProducto INT NOT NULL,     
     FOREIGN KEY (cedula) REFERENCES Persona (cedula),
     FOREIGN KEY (idVendedor) REFERENCES Vendedor (idVendedor),
     FOREIGN KEY (idCliente) REFERENCES Cliente (idCliente),
     FOREIGN KEY (idProducto) REFERENCES Producto (idProducto)
);



create table PersonaXCliente(
	idusua INT NOT NULL auto_increment PRIMARY KEY, 
  cedula INT NOT NULL,
  idCliente INT NOT NULL,
     FOREIGN KEY (cedula) REFERENCES Persona (cedula),
     FOREIGN KEY (idCliente) REFERENCES Cliente (idCliente)
);
create table PersonaXVendedor(
	idusua INT NOT NULL auto_increment PRIMARY KEY, 
  cedula INT NOT NULL,
  idVendedor INT NOT NULL ,
     FOREIGN KEY (cedula) REFERENCES Persona (cedula),
     FOREIGN KEY (idVendedor) REFERENCES Vendedor (idVendedor)
);

create table PersonaXAdminsitrador(
	idusua INT NOT NULL auto_increment PRIMARY KEY, 
  cedula INT NOT NULL,
  idamin INT NOT NULL,
     FOREIGN KEY (cedula) REFERENCES Persona (cedula),
     FOREIGN KEY (idamin) REFERENCES Adminsitrador (idamin)
);

