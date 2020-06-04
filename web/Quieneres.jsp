<%-- 
    Document   : referencia
    Created on : 3/06/2020, 12:30:18 PM
    Author     : Sulay2016
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head> 
        <title>Agregar Usuario</title> 
        <meta charset= "UTF-8 "> 
        <meta name= "viewport " content= "width=device-width, initial-scale=1.0 "> 
        <link rel= "stylesheet " href= "bootstrap.min.css "> 
    </head> 
    <body> 
        <br> 
        <a class= "btn btn-primary " href= "index.html ">Menu</a> 
        <br> 


        <div class= "col-md-12 text-center "> 

            <h2>Agregar Usuario</h2> 
            <br> 
            <form action= "AgregarUsuario.html " method= "POST " class= "col-md-4 col-md-offset-4 "> 
                <div class= "form-group "> 
                    <label for= "Cedula ">cEDULA</label> 
                    <input type= "text " class= "form-control " name= "txtCedula " required> 
                </div> 

                <div class= "form-group "> 
                    <label for= "Nombre ">Nombre:</label> 
                    <input type= "text " class= "form-control " name= "txtNombre " required> 
                </div> 
                <div class= "form-group "> 
                    <label for= "Apellido ">Apellido</label> 
                    <input type= "text " class= "form-control " name= "txtApellido " required> 
                </div> 
                <div class= "form-group "> 
                    <label for= "CORREO ">cORREO</label> 
                    <input type= "text " class= "form-control " name= "txtApellido " required> 
                </div> 



                <div class= "form-group "> 
                    <label for= "fecha ">fechaNacimiento</label>               
                    <td><input type="Date" id="start" name="trip-start"        value="1900-01-01"       min="1900-01-01" max="2150-12-31"></td>

                </div>


                <div class= "form-group "> 
                    <label for= "Sangre ">Sangre</label>                              

                    <select name= "tipo de sangre ">  
                        <option value= "O+ ">O+</option> 
                        <option value= "O- ">O-</option>  
                        <option value= "A+ ">A+</option> 
                        <option value= "A- ">A-</option> 
                        <option value= "B+ ">B+</option>  
                        <option value= "B- ">B-</option> 
                        <option value= "AB+ ">AB+</option> 
                        <option value= "AB- ">AB-</option>  
                    </select> 
                </div>  


                <div class= "form-group "> 
                    <label for= "Condicion ">Condicion</label> 



                    <select name= "Paciente Condicion  ">  
                        <option value= "Ninguna ">Niguna</option> 

                        <option value= "impedimento temporal ">impedimento temporal</option> 
                        <option value= "impedimento permanente ">impedimento permanente</option> 
                        <option value= "Enfermedad neurologias ">enfermedad Neurologias</option>  
                        <option value= "Enfermedad neurodegenerativas ">enfermedad neurodegenerativas</option>  
                        <option value= "Enfemerdad que no impedie accidenes motrices como neuronales ">otros</option>  

                    </select>   





                    <button type= "submit " class= "btn btn-success ">Guardar</button> 
                </div>  
        </div>  
    </form> 
</div> 

</body> 
</html> 