<%-- 
    Document   : Pagina1
    Created on : 31/05/2020, 12:53:24 PM
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
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<style>
  table {  width:100%;}
  table, th, td {  border: 2px solid white;  border-collapse: collapse;  class:"w3-hover-red";  padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/border: 0.25% ;text-align: "justify"; margin-top:1%;  }
  table#t01 tr:nth-child(even) { background: linear-gradient(to right,#66ccff, #b3e6ff,#b3ffd9,#ccffe6,#e6fff2,#e6f7ff,#ffffff,#e6f7ff,#e6fff2,#e6fff2,#ccffe6,#b3ffd9, #b3e6ff,#66ccff ); padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/text-align: justify}
  table#t01 tr:nth-child(odd) { background: linear-gradient(to right,#66ccff -4%, #b3e6ff,#b3ffd9 ,#ccffe6,#e6fff2,#e6f7ff,#e6f7ff,#e6fff2,#ccffe6,#b3ffd9, #b3e6ff,#66ccff ); padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/text-align: justify}
  table#t01 th {background-image:   repeating-radial-gradient(  #66ccff,#99ffcc,#e6f7ff 45%);color: black; padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/text-align: justify}
  table#t02 tr:nth-child(odd) {background-image: linear-gradient(  to right,#99ffcc ,#b3e6ff,#cceeff,#e6f7ff ,#e6fff2,#e6fff2,#e6f7ff,#cceeff,#b3e6ff,#99ffcc );text-align: justify}
  table#t02 tr:nth-child(even) {background-image: linear-gradient( to right,#99ffcc,#b3e6ff,#cceeff,#e6f7ff ,#e6fff2,#ffffff,#e6fff2,#e6f7ff,#cceeff,#b3e6ff,#99ffcc );text-align: justify}
  table#t02 th { background-image: repeating-radial-gradient(  #99ffcc ,#66ccff ,#e6f7ff 45%);
  
  
  
@media only screen and (max-width:1600px) {  /* For mobile phones: */.arriba, .derecha, .izquierda,.centro,.abajo,table,th ,td, table#t02 tr,table#t01 tr, table#t02 th,table#t01 th{    width:100%;  background-attachment: scroll;  padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/min-height: 400px; }


@media only screen and (max-width:620px) {  /* For mobile phones: */.arriba, .derecha, .izquierda,.centro,.abajo,table,th ,td, table#t02 tr,table#t01 tr, table#t02 th,table#t01 th{    width:100%;  background-attachment: scroll;  padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/ min-height: 400px;}

</style>

<body>
    <div class="col-sm-4">
      <div class="w3-row-padding w3-col  w3-container w3-padding-64   w3-small w3-center " id="contact" min-height=" -100px">
      <form action="/action_page.php" target="_blank" disabled>
           <table id="t01">
                <thead>
                    <tr class="w3-hover-text-indigo">
                        <th class="w3-hover-text-deep-purple">Clasificacion de enfermedades</th>
                        <th class="w3-hover-text-deep-purple">Descripcion</th>
                        <th class="w3-hover-text-deep-purple">enfermedades que clasifica</th>
                    </tr>
                </thead>

                <tr class="w3-hover-text-indigo">    
                    <td class="w3-hover-text-deep-purple">Enfermedades degenerativas</td>
                    <td class="w3-hover-text-deep-purple"><p>en las cuales las células nerviosas están dañadas o mueren</p>      
                    <td class="w3-hover-text-deep-purple"> 
                        <p>Enfermedad de Alzheimer</p>
                        <p>Enfermedad de Parkinson</p>       
                    </td>
                </tr>


                <tr class="w3-hover-text-indigo">    
                    <td class="w3-hover-text-deep-purple">Enfermedades neurológicas</td>
                    <td class="w3-hover-text-deep-purple">  
                <p>El cerebro, la médula espinal y los nervios conforman el sistema nervioso.</p><p> Cuando algo funciona mal en una parte del sistema nervioso:</p><p> es posible que tenga dificultad para moverse, hablar, tragar, respirar o aprender.</p><p> También puede haber problemas con la memoria, los sentidos o el estado de ánimo.</p></td>
                <td class="w3-hover-text-deep-purple">


                    <p>la enfermedad de Huntington, la distrofia muscular<p>
                    <p>la espina bífida</p>
                    <p>Enfermedades degenerativas</p>
                    <p>los derrames cerebrales</p>
                    <p>la médula espinal</p>
                    <p>el cerebro</p>
                    <p>la epilepsia</p>
                    <p>Cáncer  tales como los tumores cerebrales</p>
                    <p>Infecciones como la meningitis</p>
                    <p>Narcolepsia</p>
                    <p>Cataplexia</p>
                </td>
                </tr>


                <tr class="w3-hover-text-indigo">
                    <td class="w3-hover-text-deep-purple">Enfermedades neurodegenerativas</td>
                    <td class="w3-hover-text-deep-purple">
                        <p>Las enfermedades neurodegenerativas afectan varias actividades que el cuerpo realiza, como el equilibrio, movimiento, hablar, respirar y funciones del corazón.</p>
                        <p> Muchas de estas enfermedades son genéticas.</p>
                        <p> Las causas pueden ser alcoholismo, un tumor o un ataque cerebrovascular (ACV). Otras causas incluyen toxinas, químicos y virus. Otras veces, las causas se desconocen.</p></td>
                    <td class="w3-hover-text-deep-purple">
                        <p>Enfermedad de Alzheimer</p>
                        <p>Esclerosis lateral amiotrófica</p>
                        <p>Ataxia de Friedreich</p>
                        <p>Enfermedad de Huntington</p>
                        <p>Demencia con cuerpos de Lewy</p>
                        <p>Enfermedad de Parkinson</p>
                        <p>Atrofia muscular espinal</p>
                        <p>Narcolepsia y Cataplexia</p>
                    </td>
                </tr>

            </table>
            </form>
      </div>  
</div>
    






<div class="col-sm-4">
      <div class="w3-row-padding w3-col w3-padding-64 w3-container    w3-small w3-center"min-height=" -100px">
      <form action="/action_page.php" target="_blank" disabled>
        <h1 class="   w3-center w3-xxlarge">Formato de Inscripcion</h1>
        <p class="   w3-center w3-xlarge">Usuario(a):.</p>
        <form action="/action_page.php" target="_blank">
        <p><input class=" w3-input w3-border " type="text" placeholder="ingresar: Cedula ,tarjeta de identificacion o pasaporte" name="txtCedula" required></p>       
          <p><input class="w3-half w3-input w3-border" type="text" placeholder="Nombre" name="txtNombre" required></p>          
          <p><input class="w3-half w3-input w3-border" type="text" placeholder="Apellido" name="txtApellido" required></p>
          <p><input class=" w3-input w3-border" type="email" placeholder="Correo" name="txtCorreo" required></p>
          
          <p><input class=" w3-input  w3-white w3-small " type="text" placeholder="" name="espacio" disabled required></p> 
          
            <label class=" w3-col w3-input  w3-small" style="width:100%"><p id="demo" class=" w3-light-grey  w3-center w3-small" >fecha de nacimiento al finalizar toque obligatoriamente el boton en forma circular  </p>  </label> 
          <p> <input class="  w3-input w3-border-4 w3-half " type="date" name="Nacimiento" id="Nacimiento"  required/></p>
           <p>  <input class=" w3-half  w3-input w3-small"  type="radio" id="female" name="gender" value="female" onclick="myFunctionEdad()" required> </p> 
          
          
         <p><input class=" w3-input  w3-white w3-small " type="text" placeholder="" name="espacio" disabled required></p> 
          
          <p><input class=" w3-input w3-border" type="text" placeholder="nombre Usuario" name="txtApodo" required></p>
          <p><input class="form-control w3-half  w3-input w3-border" type="password" placeholder="Contrasenia" name="txtContrasenia" id="myInput" required></p>
           <p> <input type="checkbox" onclick="myFunctionContrasenia()" >Mostrar Contraseña"  </p>
          
          <p><input class=" w3-input  w3-white w3-small " type="text" placeholder="" name="espacio" disabled required></p>  
          <p><input class="w3-input w3-border" type="text" placeholder="Escribir Alergias" name="txtAlergia" required></p>
          

          
     <label class="  w3-half" > <p class="  w3-center w3-small" >
         su salud  <em>Clasifica en:</em>  </p> </label> 
          
          <p><select class="w3-half   w3-input w3-small" id="Paciente Condicion" >
          <option value="">--Haga una elección--</option>
          <option value="impedimento temporal">impedimento temporal</option>
          <option value="impedimento permanente">impedimento permanente</option>
          <option value="Enfermedad neurologias">Enfermedad neurologias</option>
          <option value="Enfermedad neurodegenerativas">Enfermedad neurodegenerativas</option>
          <option value="otro">otro</option></select></p>
        
          <label class="    w3-small" style="width:100% "><br> <p1 class=" w3-light-grey  w3-center w3-small" >
          <em>De acuerdo a la opcion escogida asi mimso quedo clasificado</em> </p1> </label> 
          <label class=" w3-col w3-input  w3-small" style="width:100%"> </label> 
          
          
           <label class="  w3-half" > <p class="  w3-center w3-small" >
        tipo de<em>Sangre:</em>  </p> </label> 
          
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
           <button class="btn-success w3-button w3-black w3-section" type="submit"><i class="fa fa-paper-plane"></i> SEND MESSAGE</button>
          
       </form>
      </div>  </div>
      
<div class="col-sm-4">
      <div class="w3-row-padding w3-col  w3-container w3-padding-64  w3-light-white w3-small w3-center " id="contact"min-height=" -100px">
      <form action="/action_page.php" target="_blank">
       <table id="t02">
                    <thead>
                        <tr class="w3-hover-text-deep-black">
                            <th class="w3-hover-text-deep-black">Clasificacion por edad</th>
                            <th class="w3-hover-text-deep-black">Descripcion</th>
                        </tr>
                    </thead>

                    <tr class="w3-hover-text-indigo">
                        <td class="w3-hover-text-deep-purple">adulto</td>
                        <td class="w3-hover-text-deep-purple">
                            <p>Son aquellos clientes los cuales sus años oscilan entre los 18 años pero son menores a 60 años </p></td>
                    </tr>


                    <tr class="w3-hover-text-indigo">    
                        <td class="w3-hover-text-deep-purple">Menores de edad</td>
                        <td class="w3-hover-text-deep-purple"><p>aquellos usuarios quienes su edad no clasifica segun la Constitucion politica de Colombia 
                                la cual son los 18 años se le denomina mayor de edad</p>  
                    </tr>


                    <tr class="w3-hover-text-indigo">    
                        <td class="w3-hover-text-deep-purple">Adulto Mayor</td>
                        <td class="w3-hover-text-deep-purple">  
                            <p> Son personas las cuales sus edades son entre los 60 años en adelante segun Las personas adultas mayores son sujetos de derecho, socialmente activos, con garantías y responsabilidades respecto de sí mismas, su familia y su sociedad, con su entorno inmediato y con las futuras generaciones.</p><p> Las personas envejecen de múltiples maneras dependiendo de las experiencias, eventos cruciales y transiciones afrontadas durante sus cursos de vida, es decir, implica procesos de desarrollo y de deterioro. Generalmente, una persona adulta mayor es una persona de 60 años o más de edad.
                                .</p>
                        </td>  
                    </tr>
                </table>
    </form>
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
let parrafo = document.querySelector('p1');

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
