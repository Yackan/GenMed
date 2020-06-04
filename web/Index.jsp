<%-- 
    Document   : Index
    Created on : 31/05/2020, 01:27:49 AM
    Author     : Sulay2016
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3pro.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style>
.buttonload {  background-color: #4CAF50; /* Green background */  border: none; /* Remove borders */
  color: white; /* White text */  padding: 12px 24px; /* Some padding */  font-size: 20px; /* Set a font-size */
}

/* Add a right margin to each icon */
.fa {  margin-left: -12px;  margin-right: 8px;}

.fakeimg {    height: 200px;    background: #aaa;  }
   body {  font-family: "Bodoni MT Condensed";  font-size: 22px;}
  h1 {font-family: "Georgia"; font-size: 2.5em; }
  h2 {font-family: "Gloucester MT Extra Condensed" ;  font-size: 1.875em;font-style: oblique;font-weight: lighter;}
  h3 {font-family: "Gloucester MT Extra Condensed" ;  font-size: 1.875em;font-weight: normal;font-weight: bold; color: #33bbff}
  h4 {font-family: "Gloucester MT Extra Condensed" ;  font-size: 1.875em;font-weight: normal;font-weight: bold; color: #000000}
    h5 {font-family: "Gloucester MT Extra Condensed" ;  font-size:  1.275em;font-weight: oblique;font-weight ligth: bold; color: #000000}
  p { font-family: "Bodoni MT Condensed" ; font-size: 1.775em;font-style: normal;}
   p1 { font-family: "Bodoni MT Condensed" ; font-size: 1.600em;font-style: normal;}
   p2 { font-family: "Bodoni MT Condensed" ; font-size: 0.975em;font-style: normal;}
 span {  color: #33bbff;  border: 1px }
 span1 {  color: #00e673;  border: 1px }
 .extra span {  color:#00e673;}
.button {  background-color: #ffffff;  border: none;  color: black;  text-align: right;  text-decoration: none;  display: inline-block;  font-size: 16px;  margin: 4px 2px;  cursor: pointer;
  padding: 14px 120px;
}

footer {
  text-align: center;
  padding: 3px;
  background-color: w3-pale-blue;
  color: white;
}

div.a {class: "w3-sidebar w3-bar-block:w3-pale-green";  width: 100%;  border: 1px  solid #99ffdd;style="margin-left:150px"}
div.b { class="w3-bar w3-pale-green"  ;width: 10%;  border: 1px  solid #ccf2ff; style="margin-left:130px" }
div.c {  width: 100%;  border: 1px  solid #99ffdd; }



</style>


<body>

<div class="jumbotron text-center w3-pale-blue">
  <tr><h1 align="center">GenMed</h1>
  <h2 align="center">ayudaremos a recuperar tu vida</h2> </tr>
</div>
    
      <div class="w3-bar w3-pale-green w3-border-top w3-border-bottom" width="100%">
     <p2 class="w3-bar-item"> </p2>
      <p2 class="w3-bar-item">Pagina oficial</p2>
    <button class="w3-bar-item w3-button tablink  onclick="openCity(event,'lake')"> </button>
    <button class="w3-bar-item w3-button tablink" onclick="openCity(event,'Paris')">Iniciar sesion</button>
    <button class="w3-bar-item w3-button tablink" onclick="openCity(event,'Tokyo')">Quejas y reclamos</button>
    <button class="w3-bar-item w3-button tablink" onclick="openCity(event,'Roma')">Loading</button>
  </div>

<div class="w3-sidebar w3-bar-block  w3-pale-green w3-collapse w3-card w3-animate-left" style="width:200px;" id="mySidebar"> 
  <button class="w3-bar-item w3-button tablink" onclick="openCity(event, 'Bogota')">Mision</button>
  <button class="w3-bar-item w3-button tablink" onclick="openCity(event, 'Cali')">vision</button>
  <button class="w3-bar-item w3-button tablink" onclick="openCity(event, 'Venecia')">Servicios</button>
 <button class="w3-bar-item w3-button tablink" onclick="openCity(event, 'London')"> </button> 
 
</div>
    





 
 

 

<div id="manzana"style="margin-left:200px" >

  <div id="Bogota" class="w3-container city" style="margin-top:-10px">
    <br>
   <h3>Mision</h3>
   <div class="fakeimg">Fake Image</div>
      <p>  La misión de la empresa es comprometerse en ayudar a los pacientes a mejorar su calidad de
vida. Por tal motivo las aplicaciones le permitirán registrarse y recordarle el momento
indicado para tomarse su medicamento.</p>
      <br>
  </div>

  <div id="Cali" class="w3-container city" style="display:none">
    <h3>Vision</h3>
      <div class="fakeimg">Fake Image</div>
      <p>la empresa es una organización sin ánimo de lucro por su finalidad es convertirse en un
soporte de ayuda a los pacientes mediante una herramienta tecnológica que les permita ser
constantes a la hora de consumir sus medicamentos</p>
  </div>

  <div id="Venecia" class="w3-container city" style="display:none">
    <h3>Servicios ofrecidos</h3>
      <div class="fakeimg">Fake Image</div>
      <p>los servicios establecidos por la empresa por el momento es generar una aplicación de
recordatorio para los pacientes quienes sus médicos tratantes han establecido determinando
tratamientos con medicamentos específicos si horarios fijos para el paciente
</p>
</div>
    </div>


<div id="pera" style="margin-left:220px">


  <div id="Paris" class="w3-container w3-border city" style="display:none">
    
    
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
    <br>
    
    
    
    
    
      </div> </form>
    
    
    
  </div>
<div id="mango" style="margin-left:220px">
  <div id="Tokyo" class="w3-container w3-border city" >
  
  
  <br>
      
         <div id="perfil" class="w3-col m6 w3-large w3-margin-bottom" >
         <h5> llene el formulario tomando como referencia el ejemplo que se muestra a continaucion</h5>
         <h5> a su lado izquierdo</h5>
        <i class="fa fa-map-marker" style="width:30px" style="margin-left:10px"></i> <p1>Chicago, US</p1><br>
        <i class="fa fa-phone" style="width:30px" style="margin-left:10px"></i> <p1>Phone: +00 151515</p1><br>
        <i class="fa fa-envelope" style="width:30px" style="margin-left:10px"> </i> <p1>Email: mail@mail.com</p1><br>
      </div>
        
         <div class="w3-col m6">
      <form action="/action_page.php" target="_blank">
          <div class="w3-row-padding" style="margin-left:10px">
            
             <tr> <input class="w3-input w3-border" type="text" placeholder="Nombre" required name="Name" ></tr>
            <br>
            
             <tr> <input class="w3-input w3-border" type="text" placeholder="Correo" required name="Email"></tr>
            <br>
            <input class="w3-input w3-border" type="text" placeholder="Mensaje" required name="Message">
          </div>
          
         <tr> <button class="w3-button w3-black w3-section w3-right" type="submit">SEND</button></tr>
        </form></div>  
         <br>  
</div></div>
  
  
  
  
  
  
 <div id="pnia" style="margin-left:220px">
<div id="lake" class="w3-container w3-border city" >
    <h2>every human has the posibility to do anything that them propuse, but if their healty is low their ideas brillants lose forever if they don't treat it.</h2>
    <div class="fakeimg">Fake Image</div>
    mission  :
    <p>The company's mission is help patients that they need to remember their medical treatment with our products , we try hard and the plan is  to save  a majority patients if they used our products</p> 
vision:
<p>the purpose of company is to become a
support to help patients through a technological tool that allows them to be constant when consuming your medications. 

in the future,  a majority our  products will be free because we are a non-profit organization, but some times, we need you to help us, your attribute, donation or buy  our products, this money help us to make new things and help you.</p>

</div>  </div>
     
     
     <div id="fresa" style="margin-left:220px">
<div id="London" class="w3-container w3-border city" >
    <h2>Campaña Publicitaria</h2>
    <div class="fakeimg">Fake Image</div>
   </div>  </div>
         
         
    <div id="mora" style="margin-left:220px">
  <div id="Roma" class="w3-container w3-border city" >
   Nuevos artefactos tecnologicos   :
    <button class="buttonload">
    <i class="fa fa-spinner fa-spin"></i>Loading
</button></tr></p>

    <p>Nuevos Eventos sociales : 
    <button class="buttonload">
  <i class="fa fa-circle-o-notch fa-spin"></i>Loading
</button></p>

<p> Mucho mas proximamente       :   
<button class="buttonload">
  <i class="fa fa-refresh fa-spin"></i>Loading
</button></p>
 </div>  </div>






    <!-- Footer -->
<footer class="w3-center w3-pale-green w3-padding-64 w3-opacity w3-hover-opacity-off" width="100%">
  <a href="#home" class="w3-button w3-light-grey"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  <div class="w3-xlarge w3-section">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" title="Dyams" target="_blank" class="Dyams">w3.css</a></p>
</footer>
  


<script>
function openCity(evt, cityName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" w3-red", ""); 
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " w3-pale-blue";
}
</script>

</body>
</html>
