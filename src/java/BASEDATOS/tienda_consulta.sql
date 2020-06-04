
use tienda;

insert into Persona values(1014,'Tania','Cupitra','thania@hotmail.com');
insert into Persona values(2845,'Nicolas','Leon','nickLuckas@hotmail.com');
insert into Persona values(17895,'Julian','Aldan','oniichan@hotmail.com');
insert into Persona values(5021,'Lina','Yepes','YepesLin@hotmail.com');
insert into Persona values(423,'Carolina','Castro','Castrocc@hotmail.com');
insert into Persona values(58745,'Paula','Sequera','sepa@hotmail.com');

insert into Cliente (direccion, cedula) values('Tolima',1014);
insert into Cliente (direccion, cedula) values('Neiva',423);

insert into Vendedor (contraseña, cedula)  values('Bogota',17895);
insert into Vendedor (contraseña, cedula)  values('Barranquilla',5021);

insert into Adminsitrador (contraseña, cedula)  values('San Andres',2845);
insert into Adminsitrador (contraseña, cedula)  values('Popayan',58745);

insert into PersonaXCliente (cedula,idCliente)  values(1014,1);
insert into PersonaXCliente (cedula,idCliente)  values(423,2);

insert into PersonaXVendedor (cedula,idVendedor)  values(17895,1);
insert into PersonaXVendedor (cedula,idVendedor)  values(5021,2);

insert into PersonaXAdminsitrador (cedula,idamin)  values(2845,1);
insert into PersonaXAdminsitrador (cedula,idamin)  values(58745,2);

insert into computador (marca) values('HP');
insert into computador (marca) values('COMPAQ');
insert into computador (marca) values('ASUS');

insert into CajaRegistradora (idcompu,idVendedor)  values(3,1);
insert into CajaRegistradora (idcompu,idVendedor)  values(2,2);



insert into Producto (nombre,codeBarras,cantidad, precio,fecha,proveedor)  values('leche','ergfdfg155',4,2500,'3 diciembre 2018','colanta');
insert into Producto (nombre,codeBarras,cantidad, precio,fecha,proveedor)  values('pollo','rtyujio548',9,3500,'9 diciembre 2018','Kokorico');
insert into Producto (nombre,codeBarras,cantidad, precio,fecha,proveedor)  values('jugo','fdfhjij98',8,85045,'10 diciembre 2018','Alpina');

-- ///////////////////////////////////////////////////////////////

SELECT * FROM PERSONA;

select PC.idusua ClienteID ,P.nombre, C.direccion
from PersonaXCliente PC
JOIN Persona P ON P.cedula=PC.cedula
JOIN CLIENTE C ON C.idCliente=PC.idCliente;


select PC.idusua AdminID,P.nombre,P.apellido,C.contraseña  
from PersonaXAdminsitrador PC
JOIN Persona P ON P.cedula=PC.cedula
JOIN Adminsitrador C ON C.idamin=PC.idamin;


select *from PersonaXVendedor PC
JOIN Persona P ON P.cedula=PC.cedula
JOIN Vendedor C ON C.idVendedor=PC.idVendedor;


select PC.idusua VendedorID,P.nombre, P.apellido,C.contraseña  
from PersonaXVendedor PC
JOIN Persona P ON P.cedula=PC.cedula
JOIN Vendedor C ON C.idVendedor=PC.idVendedor;


SELECT cr.idCC IDuso,  c.idCompu computadorN°
,v.idVendedor
FROM CajaRegistradora cr
JOIN computador c on c.idcompu=cr.idcompu
JOIN Vendedor v ON v.idVendedor=cr.idVendedor;

