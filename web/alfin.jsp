<%-- 
    Document   : alfin
    Created on : 1/06/2020, 11:39:35 PM
    Author     : Sulay2016
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
 <input type="date" name="Compas" id="Compas" />
 <button onclick="myFunctionEdad()"><p id="demo">Datos confidenmcial</p></button>
  <br> <br>


<br>

ingresar fecha de inicio
  <input type="date" name="inicio" id="inicio" />
   <br> ingresar fecha de final
  <input type="date" name="final" id="final" />
  <br>  <br>
 <button onclick="myFunctionTratamiento()"><p id="rey">duracion tratamiento</p></button>

 <button onclick="myFunctionRegresiva()"><p id="reina">cuanta regresiva</p></button>



<br>
<br>
<br>
<br>
<button id="myBtn" disabled>Correo tutor</button>



<script>
function myFunctionEdad() {
  var y="July 21, 1983 ";
  var x = document.getElementById("Compas").value;  
  var d = new Date(x);
  var dd = new Date();  
  var n = d.getFullYear();
  var m = dd.getFullYear();
  var g=m-n;
  
  var nac="Nacio en el anio,  ";
  var su="  su edad es ";
  var men=" anios, Eres menor de edad";
  var may=" anios, Eres mayor de edad";
  
  if(g >= 18){
  document.getElementById("demo").innerHTML = nac+n+su+g+may;
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
