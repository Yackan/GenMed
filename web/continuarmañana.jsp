<%-- 
    Document   : continuarmañana
    Created on : 3/06/2020, 12:45:51 AM
    Author     : Sulay2016
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">  
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>


@media only screen and (max-width:620px) {  /* For mobile phones: */  div,table{    width:100%;  }}

div {
    class:"w3-container w3-white w3-center w3-xlarge";font-family:"Georgia";
    font-style: normal ;font-weight: bold;font-size: 2.5em;
}
div#celular{
     class:"w3-container  w3-hide-small w3-red w3-center w3-xlarge";font-family:"Georgia";
    font-style: italic ;font-weight: bold;font-size: 2.5em;
}
div#Tablet{
     class:"w3-container  w3-hide-medium w3-green w3-center w3-xlarge";font-family:"Georgia";
    font-style: bold ;font-weight: bold;font-size: 2.5em;
}

div#Computador{
     class:"w3-container  w3-hide-large w3-blue w3-center w3-xlarge";font-family:"Georgia";
    font-style: bold ;font-weight: bold;font-size: 2.5em;
}

</style>
<body>

<div class="jumbotron text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container">
  <div class="row">
  
  
    <div class="col-sm-4">
      <div class="w3-row-padding w3-col  w3-container w3-padding-64  w3-light-white w3-small w3-center " id="contact">
      <form action="/action_page.php" target="_blank">
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-padding-16" type="number" placeholder="How many people" required name="People"></p>
      <p><input class="w3-input w3-padding-16" type="datetime-local" placeholder="Date and time" required name="date" value="2017-11-16T20:00"></p>
      <p><input class="w3-input w3-padding-16" type="text" placeholder="Message \ Special requirements" required name="Message"></p>
      <p><button class="w3-button w3-light-grey w3-section" type="submit">SEND MESSAGE</button></p>
    </form>
  </div>  
</div>
    
    
    <div class="col-sm-4">
      <div class="w3-row-padding w3-col w3-padding-64 w3-container   w3-light-grey w3-small w3-center">
        <h4>Contact</h4>
        <p>Questions? Go ahead.</p>
        <form action="/action_page.php" target="_blank">
        <p><input class=" w3-input w3-border" type="text" placeholder="ingresar: Cedula ,tarjeta de identificacion o pasaporte" name="Cedula" required></p>       
          <p><input class="w3-half w3-input w3-border" type="text" placeholder="Nombre" name="Nombre" required></p>          
          <p><input class="w3-half w3-input w3-border" type="text" placeholder="Apellido" name="Apellido" required></p>
          <p><input class=" w3-input w3-border" type="email" placeholder="Correo" name="Correo" required></p>
          
          <p><input class=" w3-input  w3-light-grey w3-small w3-center" type="text" placeholder="" name="espacio" disabled required></p> 
          <p> <input class="w3-half  w3-input w3-border-4" type="date" name="Nacimiento" id="Nacimiento" required/></p>
            <p>  <input class=" w3-half  w3-input w3-large"  type="radio" id="female" name="gender" value="female" onclick="myFunctionEdad()" required> </p> 
            
          <p><input class=" w3-light-grey  w3-center w3-xlarge" type="text" placeholder="Clasificacion edad" name="Clasificacion edad" disabled required><h id="demo"></h></p> 
          <p><input class=" w3-input  w3-light-grey w3-small w3-center" type="text" placeholder="" name="espacio" disabled required></p> 
          
          <p><input class=" w3-input w3-border" type="text" placeholder="nombre Usuario" name="Apodo" required></p>
          <p><input class="w3-half  w3-input w3-border" type="password" placeholder="Contrasenia" name="Contrasenia" required></p>
           <p> <input type="checkbox" onclick="myFunctionContrasenia()" class="w3-half  w3-input -w3-xxxlarge">Mostrar Contraseña"  </p>
          
          <p><input class=" w3-input  w3-light-grey w3-small w3-center" type="text" placeholder="" name="Nombre" disabled required></p>  
          <p><input class="w3-input w3-border" type="email" placeholder="Escribir Alergias" name="Alergia" required></p>
          
          <p id="demo"><input class="w3-half w3-input " type="text" placeholder="Condicion del paciente:" name="Condicion del paciente:" disabled  required></p>
          </p>
          <p><select class="w3-half   w3-input w3-large" id="Paciente Condicion" >
          <option value="">--Haga una elección--</option>
          <option value="impedimento temporal">impedimento temporal</option>
          <option value="impedimento permanente">impedimento permanente</option>
          <option value="Enfermedad neurologias">Enfermedad neurologias</option>
          <option value="Enfermedad neurodegenerativas">Enfermedad neurodegenerativas</option>
          <option value="otro">otro</option></select></p>
          <p></p>
          <p class=" w3-light-grey  w3-center w3-small" >
          de acuerdo con la clasificacion de su salud seleccione su <em>condicion</em> de acuerdo a esta tabla</p> 
          
          <p><input class="w3-half w3-input " type="text" placeholder="Sangre:" name="Sangree:" disabled  required></p></p>
          <select name="tipo de sangre" class=" w3-input w3-small  w3-half">
          <option value="O+">O+</option>
          <option value="O-">O-</option>
          <option value="A+">A+</option>
          <option value="A-">A-</option>
          <option value="B+">B+</option>
          <option value="B-">B-</option>
          <option value="AB+">AB+</option>
          <option value="AB-">AB-</option> 
          </select>        
          </p>
         <p> <input type="email" class="form-control" name="myBtn" id="myBtn" placeholder="escriba correo del tutor si cumple con la condicion" size="40" disabled required></p>
           <button class="w3-button w3-black w3-section" type="submit"><i class="fa fa-paper-plane"></i> SEND MESSAGE</button>
        </form>
      </div>  </div>
    </div>
    
  </div>
</div>









<script>
function myFunctionContrasenia() {
var x = document.getElementById("myInput");
if (x.type === "password") {
x.type = "text";
} else {
x.type = "password";
}
}
</script>

       
<script>
let seleccionar = document.querySelector('select');
let parrafo = document.querySelector('p');

seleccionar.addEventListener('change', establecerClima);

function establecerClima() {
  let eleccion = seleccionar.value;

  if (eleccion === 'impedimento temporal') {
    parrafo.textContent = 'Usuario el cual tiene una lesion en las manos, brazos antebrazos con un vendaje o enyesamiento y su tiempo de inmovilizacion es de corto periodo';
    document.getElementById("myBtn").disabled = false;
  } else if (eleccion === 'impedimento permanente') {
    parrafo.textContent = ' Perdida parcial o completa de un miembro del cuerpo ubicado entre: manos, brazos, anetbrazos impidiendo o entorpeciendo la manipulacion del dispositivo electronico';
    document.getElementById("myBtn").disabled = false;} 
    else if (eleccion === 'Enfermedad neurologias') {
    parrafo.textContent = 'Paciente en riesgo, clasifican quienes tengan enfermedades como:  enfermedad de Huntington, distrofia muscular, espina bífida, Parkinson, mal de Alzheimer, derrames cerebrales, médula espinal, cerebro, epilepsia, tumores cerebrales, meningitis, Narcolpesia, Cataplexia '; 
    document.getElementById("myBtn").disabled = false;} 
    else if (eleccion === 'Enfermedad neurodegenerativas') {
    parrafo.textContent = ' Pacientes de alto riesgo,  Enfermedad de Alzheimer,Esclerosis lateral amiotrófica, Ataxia de Friedreich, Enfermedad de Huntington, Demencia con cuerpos de Lewy, Enfermedad de Parkinson, Atrofia muscular espinal, Narcolpesia y Cataplexia';    
    document.getElementById("myBtn").disabled = false;} 
    else if (eleccion === 'otro') {
    parrafo.textContent = 'Aunque tienen una enfermedad, esta misma no afecta ni su sistemas neuronal ni su motriz o movimiento para minipular la aplicacion con sus propias manos';  }   
  else {
    parrafo.textContent = '';  }
}</script>








<script>
function myFunctionEdad() {
  var y="July 21, 1983 ";
  var x = document.getElementById("Nacimiento").value;  
  var d = new Date(x);
  var dd = new Date();  
  var n = d.getFullYear();
  var m = dd.getFullYear();
  var g=m-n;
  
  var nac="Nacio en el anio,  ";
  var su="  su edad es ";
  var men=" anios, Eres menor de edad";
  var may=" anios, Eres mayor de edad";
  var vet=" anios, Eres un adulto mayor";
  if(g >= 18){
   document.getElementById("demo").innerHTML = nac+n+su+g+may;
      if(g >= 70){
      document.getElementById("demo").innerHTML = nac+n+su+g+vet;
      document.getElementById("myBtn").disabled = false;
  }
  
  }
  else{
  document.getElementById("demo").innerHTML = nac+m+su+g+men;
  document.getElementById("myBtn").disabled = false;}  
}
</script>


<script>

function myFunctionTratamiento(x) {
  var y=document.getElementById("inicio").value;   var j = new Date(y);
  var x = document.getElementById("final").value;  var i = new Date(x);  
  var d = new Date(); 
  

  
  
  var n = j.getFullYear();  var m = i.getFullYear(); var g=m-n;
  var b = j.getMonth();  var d = i.getMonth(); var h=d-b;
  var p = j.getDay();  var q = i.getDay(); var r=q-p;
  
  
  
  
  var nac="El tratamiento es";
  var su="   dias con  ";
  var men=" mes , para tantos";
  var may=" anios, para finalizarlo";
  

  document.getElementById("rey").innerHTML =nac+r+su+h+men+g+may; 
}
</script>

<script>
function myFunctionRegresiva() {
  var i = document.getElementById("final").value;  
  var  x= new Date(i);      var y = new Date();  
  var n = x.getFullYear();  var m = y.getFullYear();var g=m-n;
  var b = x.getMonth();     var d = y.getMonth(); var h=d-b;
  var p = x.getDay();       var q = y.getDay(); var r=q-p;
  
  
  var nac="El tratamiento finaliza dentro de ";
  var su="  dias con ";
  var men=" mes para tantos ";
  var may=" anios, buena suerte y exitos"; 
  
  
  document.getElementById("reina").innerHTML = nac+r+su+h+men+g+may;
}
</script>

</body>
</html>
