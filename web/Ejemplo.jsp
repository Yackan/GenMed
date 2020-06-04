<%-- 
    Document   : Ejemplo
    Created on : 30/05/2020, 11:32:52 PM
    Author     : Sulay2016
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container">
  <h2>Tabs</h2>
  <p>Tabs are perfect for single page web applications, or for web pages capable of displaying different subjects. Click on the links below.</p>
</div>

<div class="w3-bar w3-black">
  <button class="w3-bar-item w3-button" onclick="openCity('London')">London</button>
  <button class="w3-bar-item w3-button" onclick="openCity('Paris')">Paris</button>
  <button class="w3-bar-item w3-button" onclick="openCity('Tokyo')">Tokyo</button>
  <button class="w3-bar-item w3-button" onclick="openCity('Bogota')">iniciar sesion</button>
    <button class="w3-bar-item w3-button" onclick="openCity('Cali')">contacto</button>
</div>

<div id="London" class="w3-container city">
  <h2>London</h2>
  <p>London is the capital city of England.</p>
</div>

<div id="Paris" class="w3-container city" style="display:none">
  <h2>Paris</h2>
  <p>Paris is the capital of France.</p> 
</div>

<div id="Tokyo" class="w3-container city" style="display:none">
  <h2>Tokyo</h2>
  <p>Tokyo is the capital of Japan.</p>
</div>


<div id="Bogota" class="w3-container city" style="display:none">

<div id="id01" class="modal">
  
  <form class="modal-content animate" action="/action_page.php" method="post">
  <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
     
    </div>

     <div class="container">
     <p>Bienvenido, inicie seccion</p><p> </p><p> </p>
     
     <tr> <td><label for="uname"><b>Usuario Cliente  </b></label></td>
      <td><input type="text" placeholder="ingresar Usuario" name="uname" required></td></tr>
<p> </p><p> </p>
      <tr><label for="psw"><b>Contrasenia</b></label>
      <td><input type="password" placeholder="ingresar contrasenia" name="psw" required></td></tr>
 <p> </p>             
      
      <div class="container" style="background-color:#f1f1f1">

      
      <br><span class="psw1">¿No tiene cuenta de usuario? <a href="#">registrarse</a></span></br>     
      <br left><span class="psw1">olvido <a href="#">contraseña?</a></span></br>
    </div>
 <p> </p>       <tr>
      <td><button type="submit" center>Login</button></td>
      <td><button type="button" onclick="document.getElementById('id01').style.display='none'"class="cancelbtn" left  >Cancelar</button></td></tr>
      
      
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>
    
    
      </div> </form>

</div>

<script>
function openCity(cityName) {
  var i;
  var x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  document.getElementById(cityName).style.display = "block";  
}
</script>



</body>
</html>
