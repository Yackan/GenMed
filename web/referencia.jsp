<%-- 
    Document   : referencia
    Created on : 2/06/2020, 12:27:18 AM
    Author     : Sulay2016
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <style>

            * {  box-sizing: border-box;}
            .arriba {  border: 1px ;  background-color: #e6f7ff;  
                       padding-top: 1%;/* punto inicial*/  padding-right: 5%;   /* margen lado derecho*/  
                       padding-left: 5%;/* margen lado izquierdo*/  padding-bottom: 1%;/* margen de lo ancho*/}

            .derecha{
                border:1px ; width: 30%;/* tamaño*/
                background-color: white;  padding-top: 1%;/* punto inicial*/
                padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/
                padding-bottom: 50%;/* margen de lo ancho*/  margin-top:1%;  
                text-align:center;/* alina letras al centro*/  float:right; /* dirigir a derecha*/}


            .izquierda{

                border:1px ;width: 30%;/* tamaño*/
                background-color: white;  padding-top: 1%;/* punto inicial*/
                padding-right: 0.001%;   /* margen lado derecho*/  padding-left: 0.001%;/* margen lado izquierdo*/
                padding-bottom: 50%;/* margen de lo ancho*/  margin-top:1%;  
                text-align:left;/* alina letras al centro*/  float:left; /* dirigir a derecha*/}

            .centro{

                width: 40%;/* tamaño*/ border: 1px ;
                background-color: white;  padding-top: 1%;/* punto inicial*/
                padding-right: 1%;   /* margen lado derecho*/  padding-left: 1%;/* margen lado izquierdo*/
                padding-bottom: 51.25%;/* margen de lo ancho*/   margin-top:1%; 
                text-align:left;/* alina letras al centro*/  float:left; /* dirigir a derecha*/}
            .abajo{

                width: 100%;/* tamaño*/ border: 1px ;
                background-color: #e6f7ff;  padding-top: 1%;/* punto inicial*/
                padding-right: 5%;   /* margen lado derecho*/  padding-left: 5%;/* margen lado izquierdo*/
                padding-bottom: 1%;/* margen de lo ancho*/   margin-top:1%;  
                text-align:left;/* alina letras al centro*/  float:left; /* dirigir a derecha*/}



            table {  width:100%;}
            table, th, td {  border: 2px solid white;  border-collapse: collapse;  class:"w3-hover-red";}
            table#t01 tr:nth-child(even) { background: linear-gradient(to right,#66ccff, #b3e6ff,#b3ffd9,#ccffe6,#e6fff2,#e6f7ff,#ffffff,#e6f7ff,#e6fff2,#e6fff2,#ccffe6,#b3ffd9, #b3e6ff,#66ccff );}
            table#t01 tr:nth-child(odd) { background: linear-gradient(to right,#66ccff -4%, #b3e6ff,#b3ffd9 ,#ccffe6,#e6fff2,#e6f7ff,#e6f7ff,#e6fff2,#ccffe6,#b3ffd9, #b3e6ff,#66ccff );}


            table#t01 th {background-image:   repeating-radial-gradient(  #66ccff,#99ffcc,#e6f7ff 45%);color: black;}

            table#t02 tr:nth-child(odd) {background-image: linear-gradient(  to right,#99ffcc ,#b3e6ff,#cceeff,#e6f7ff ,#e6fff2,#e6fff2,#e6f7ff,#cceeff,#b3e6ff,#99ffcc );}
            table#t02 tr:nth-child(even) {background-image: linear-gradient( to right,#99ffcc,#b3e6ff,#cceeff,#e6f7ff ,#e6fff2,#ffffff,#e6fff2,#e6f7ff,#cceeff,#b3e6ff,#99ffcc );}
            table#t02 th { background-image: repeating-radial-gradient(  #99ffcc ,#66ccff ,#e6f7ff 45%);
            <!-- ackground-image: radial-gradient(centro color, medio color, afuera color)   -->
            <!--background-image: linear-gradient(((direccion del angulo)numero de angulo) deg, color 1,   color 2); -->





            @media only screen and (max-width:620px) {  /* For mobile phones: */.arriba, .derecha, .izquierda,.centro,.abajo,table,th ,td,table#t02 tr,table#t02 th{    width:100%;  }

        </style>
    </head>
    <body>



        <div class="arriba">
            <h2>Using individual padding properties</h2>


            This div element has a top padding of 50px, a right padding of 30px, a bottom padding of 50px, and a left padding of 80px.</div>
        <div class="izquierda">
            <!-- <h2>auxilio der</h2> --> 
            <div class="w3-container">
                <h2>Importante Leer</h2>
                <h id="demo">Seleccionar  el unico icono en forma de circulo para asi mismo conzosco a cual grupo de edad peertenece, es obligatorio seleccionar ese icono</h>

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
                        <td class="w3-hover-text-deep-purple"><p>aquellos usuarios quienes su edad no clasifica segun la Constitucion politica de Colombia la cual son los 18 años se le denomina mayor de edad</p>  
                    </tr>


                    <tr class="w3-hover-text-indigo">    
                        <td class="w3-hover-text-deep-purple">Adulto Mayor</td>
                        <td class="w3-hover-text-deep-purple">  
                            <p> Son personas las cuales sus edades son entre los 60 años en adelante segun Las personas adultas mayores son sujetos de derecho, socialmente activos, con garantías y responsabilidades respecto de sí mismas, su familia y su sociedad, con su entorno inmediato y con las futuras generaciones. Las personas envejecen de múltiples maneras dependiendo de las experiencias, eventos cruciales y transiciones afrontadas durante sus cursos de vida, es decir, implica procesos de desarrollo y de deterioro. Generalmente, una persona adulta mayor es una persona de 60 años o más de edad.
                                .</p>
                        </td>  
                    </tr>
                </table>
            </div>
        </div>


        <div class="derecha">

            <h2>Importante Leer</h2>
            <p1>de acuerdo con la clasificacion de su salud seleccione su <em>condicion</em> de acuerdo a esta tabla</p1>

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
                <p1>El cerebro, la médula espinal y los nervios conforman el sistema nervioso.</p1><p> Cuando algo funciona mal en una parte del sistema nervioso:</p><p> es posible que tenga dificultad para moverse, hablar, tragar, respirar o aprender.</p><p> También puede haber problemas con la memoria, los sentidos o el estado de ánimo.</p></td>
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
        </div>


        <div class="centro">
            <div class="col-md-12 text-center">

                <div class="form-group">
                    <h2>Formulario de inscripcion</h2>
                    <h3>llene todos los campos segun sea solicitado, la descripcion de la condicion paciente es: </h3>

                    <label for="Cedula">Cedula</label>
                    <input type="number" class="form-control"placeholder="Escriba Id, Cedula, pasaporte"size="25" name="txtCedula"   required>
                </div>
                <br>


                <div class="form-group">
                    <label for="Nombre">Nombre:</label>
                    <input type="text" class="form-control"placeholder="Escriba Sus nombres" size="40"  name="txtNombre" required>
                </div>
                <br>
                <div class="form-group">
                    <label for="Apellido">Apellido</label>
                    <input type="text" class="form-control" placeholder="Escriba Sus apellidos" size="40"  name="txtApellido" required>
                </div>

                <br><div class="form-group">
                    <label for="CORREO">Correo</label>
                    <input type="email" class="form-control"placeholder="Escriba su correo para que este informado" name="txtCorreo" size="40" required>
                </div>
                <br>

                <div class="form-group">
                    <label for="Apodo">escriba Apodo</label>
                    <input type="text" class="form-control" placeholder="Escriba su nombre de usuario" size="40"  name="txtApodo" required>
                </div>    
                <br>

                <div class="form-group">
                    <label for="contrasenia">escriba contrasenia</label>
                    <input type="password" class="form-control" name="txtContrasenia" id="myInput" placeholder="Escriba su cantreña de usuario" size="40" required>
                    <br>
                    <input type="checkbox" onclick="myFunctionContrasenia()">Mostrar Contraseña" </div>  </div>
            <br> 
            <div class="form-group">
                <label for="Alergia">escriba Alergia</label>
                <input type="text" class="form-control" placeholder="Escriba sus alergias" size="40" name="txtAlergia" required>
            </div>                            

            <br>
            <div class="form-group">
                fecha de nacimiento:
                <input type="date" name="Nacimiento" id="Nacimiento" required/>
                <br>
                <input type="radio" id="female" name="gender" value="female" onclick="myFunctionEdad()" required> 
                <label for="female"><h id="demo">Datos confidenmcial</h></label><br>
            </div>  
            <br> <br>
            <div class="form-group">
                <label for="Paciente Condicion">Condicion del paciente:</label>
                <select id="Paciente Condicion">
                    <option value="">--Haga una elección--</option>
                    <option value="impedimento temporal">impedimento temporal</option>
                    <option value="impedimento permanente">impedimento permanente</option>
                    <option value="Enfermedad neurologias">Enfermedad neurologias</option>
                    <option value="Enfermedad neurodegenerativas">Enfermedad neurodegenerativas</option>
                    <option value="otro">otro</option>
                </select><p id="demo">  </p>
            </div>  
            <br>
            <div class="form-group">
                <label for="Sangre">Sangre</label>
                <select name="tipo de sangre">
                    <option value="O+">O+</option>
                    <option value="O-">O-</option>
                    <option value="A+">A+</option>
                    <option value="A-">A-</option>
                    <option value="B+">B+</option>
                    <option value="B-">B-</option>
                    <option value="AB+">AB+</option>
                    <option value="AB-">AB-</option>
                </select>
            </div> 


            <div class="form-group">
                <label for="CORREO">Correo del tutor</label>
                <input type="email" class="form-control" name="myBtn" id="myBtn" placeholder="Solo se puede llenar si se cumple una condicion" size="40" disabled required>
                <br><br>
            </div>
            <button type=\"submit\" class=\"btn btn-success\">Guardar</button>

        </div>
    </div>


    <div class="abajo">

        <h2>auxilio der</h2>

        This div element has a top padding of 50px, a right padding of 30px, a bottom padding of 50px, and a left padding of 80px.
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
                document.getElementById("myBtn").disabled = false;
            } else if (eleccion === 'Enfermedad neurologias') {
                parrafo.textContent = 'Paciente en riesgo, clasifican quienes tengan enfermedades como:  enfermedad de Huntington, distrofia muscular, espina bífida, Parkinson, mal de Alzheimer, derrames cerebrales, médula espinal, cerebro, epilepsia, tumores cerebrales, meningitis, Narcolpesia, Cataplexia ';
                document.getElementById("myBtn").disabled = false;
            } else if (eleccion === 'Enfermedad neurodegenerativas') {
                parrafo.textContent = ' Pacientes de alto riesgo,  Enfermedad de Alzheimer,Esclerosis lateral amiotrófica, Ataxia de Friedreich, Enfermedad de Huntington, Demencia con cuerpos de Lewy, Enfermedad de Parkinson, Atrofia muscular espinal, Narcolpesia y Cataplexia';
                document.getElementById("myBtn").disabled = false;
            } else if (eleccion === 'otro') {
                parrafo.textContent = 'Aunque tienen una enfermedad, esta misma no afecta ni su sistemas neuronal ni su motriz o movimiento para minipular la aplicacion con sus propias manos';
            } else {
                parrafo.textContent = '';
            }
        }</script>








    <script>
        function myFunctionEdad() {
            var y = "July 21, 1983 ";
            var x = document.getElementById("Nacimiento").value;
            var d = new Date(x);
            var dd = new Date();
            var n = d.getFullYear();
            var m = dd.getFullYear();
            var g = m - n;

            var nac = "Nacio en el anio,  ";
            var su = "  su edad es ";
            var men = " anios, Eres menor de edad";
            var may = " anios, Eres mayor de edad";
            var vet = " anios, Eres un adulto mayor";
            if (g >= 18) {
                document.getElementById("demo").innerHTML = nac + n + su + g + may;
                if (g >= 70) {
                    document.getElementById("demo").innerHTML = nac + n + su + g + vet;
                    document.getElementById("myBtn").disabled = false;
                }

            } else {
                document.getElementById("demo").innerHTML = nac + m + su + g + men;
                document.getElementById("myBtn").disabled = false;
            }
        }
    </script>


    <script>

        function myFunctionTratamiento(x) {
            var y = document.getElementById("inicio").value;
            var j = new Date(y);
            var x = document.getElementById("final").value;
            var i = new Date(x);
            var d = new Date();




            var n = j.getFullYear();
            var m = i.getFullYear();
            var g = m - n;
            var b = j.getMonth();
            var d = i.getMonth();
            var h = d - b;
            var p = j.getDay();
            var q = i.getDay();
            var r = q - p;




            var nac = "El tratamiento es";
            var su = "   dias con  ";
            var men = " mes , para tantos";
            var may = " anios, para finalizarlo";


            document.getElementById("rey").innerHTML = nac + r + su + h + men + g + may;
        }
    </script>

    <script>
        function myFunctionRegresiva() {
            var i = document.getElementById("final").value;
            var x = new Date(i);
            var y = new Date();
            var n = x.getFullYear();
            var m = y.getFullYear();
            var g = m - n;
            var b = x.getMonth();
            var d = y.getMonth();
            var h = d - b;
            var p = x.getDay();
            var q = y.getDay();
            var r = q - p;


            var nac = "El tratamiento finaliza dentro de ";
            var su = "  dias con ";
            var men = " mes para tantos ";
            var may = " anios, buena suerte y exitos";


            document.getElementById("reina").innerHTML = nac + r + su + h + men + g + may;
        }
    </script>

</body>
</html>
