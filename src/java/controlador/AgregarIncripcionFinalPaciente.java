/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import New_VO.VO_Paciente;
import New_VO.VO_PacienteL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD_Usuario;
import New_VO.VO_Usuario;
import modelo.BD_Paciente;
import modelo.BD_Pacientel;

/**
 *
 * @author Asus-PC
 */
public class AgregarIncripcionFinalPaciente extends HttpServlet {

    int a = 3;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println(
                    "<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>Agregar Paciente</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <br>\n"
                    + "        <a class=\"btn btn-primary\" href=\"index.html\">Menu</a>\n"
                    + "        <br>\n"
                    + "\n"
                    + "        \n"
                    + "        <div class=\"col-md-12 text-center\">\n"
                    + "\n"
                    + "            <h2>Agregar Paciente</h2>\n"
                    + "            <br>\n"
                    + "            <form action=\"AgregarIncripcionFinal.html\" method=\"POST\" class=\"col-md-4 col-md-offset-4\">\n"
                    + "                  <div class=\"form-group\">\n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"Cedula\">Cedula</label>\n"
                    + "<input type=\"number\" class=\"form-control\"placeholder=\"Escriba Id, Cedula, pasaporte\"size=\"40\" name=\"txtCedula\"   required>\n"
                    + "</div>\n"
                    + "<br>\n"
                    + "\n"
                    + "\n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"Nombre\">Nombre:</label>\n"
                    + "<input type=\"text\" class=\"form-control\"placeholder=\"Escriba Sus nombres\" size=\"40\"  name=\"txtNombre\" required>\n"
                    + "</div>\n"
                    + "<br>\n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"Apellido\">Apellido</label>\n"
                    + "<input type=\"text\" class=\"form-control\" placeholder=\"Escriba Sus apellidos\" size=\"40\"  name=\"txtApellido\" required>\n"
                    + "</div>\n"
                    + "\n"
                    + "<br><div class=\"form-group\">\n"
                    + "<label for=\"CORREO\">Correo</label>\n"
                    + "<input type=\"email\" class=\"form-control\"placeholder=\"Escriba su correo para que este informado\" name=\"txtCorreo\" size=\"40\" required>\n"
                    + "</div>\n"
                    + "<br>\n"
                    + "\n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"Apodo\">escriba Apodo</label>\n"
                    + "<input type=\"text\" class=\"form-control\" placeholder=\"Escriba su nombre de usuario\" size=\"40\"  name=\"txtApodo\" required>\n"
                    + "</div>    \n"
                    + "<br>\n"
                    + "\n"
                    + " <div class=\"form-group\">\n"
                    + " <label for=\"contrasenia\">escriba contrasenia</label>\n"
                    + " <input type=\"password\" class=\"form-control\" name=\"txtContrasenia\" id=\"myInput\" placeholder=\"Escriba su cantreña de usuario\" size=\"40\" required>\n"
                    + " <input type=\"checkbox\" onclick=\"myFunctionContrasenia()\">Mostrar Contraseña\" </div>  </div>\n"
                    + "<br> \n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"Alergia\">escriba Alergia</label>\n"
                    + "<input type=\"text\" class=\"form-control\" placeholder=\"Escriba sus alergias\" size=\"40\" name=\"txtAlergia\" required>\n"
                    + "</div>                            \n"
                    + "                            \n"
                    + "<br>\n"
                    + "<div class=\"form-group\">\n"
                    + "fecha de nacimiento:\n"
                    + " <input type=\"date\" name=\"Nacimiento\" id=\"Nacimiento\" onclick=\"myFunctionEdad()\"/>\n"
                    + " <button onclick=\"myFunctionEdad()\" disabled><h id=\"demo\">Datos confidenmcial</h></button>\n"
                    + "  <br> <br>\n"
                    + "<label for=\"Paciente Condicion\">Condicion del paciente:</label>\n"
                    + "           <select name=\"Paciente Condicion \">\n"
                    + "               <option value=\"Ninguna\">Niguna</option>\n"
                    + "\n"
                    + "                <option value=\"impedimento temporal\">impedimento temporal</option>\n"
                    + "                <option value=\"impedimento permanente\">impedimento permanente</option>\n"
                    + "                <option value=\"Enfermedad neurologias\">enfermedad Neurologias</option>\n"
                    + "                <option value=\"Enfermedad neurodegenerativas\">enfermedad neurodegenerativas</option>\n"
                    + "                <option value=\"Enfemerdad que no impedie accidenes motrices como neuronales\">otros</option>\n"
                    + "         \n"
                    + "            </select>\n"
                    + "</select><p id=\"demo\"> descripcion de la condicion paciente</p>\n"
                    + "</div>  \n"
                    + "<br>\n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"Sangre\">Sangre</label>\n"
                    + "<select name=\"tipo de sangre\">\n"
                    + "<option value=\"O+\">O+</option>\n"
                    + "<option value=\"O-\">O-</option>\n"
                    + "<option value=\"A+\">A+</option>\n"
                    + "<option value=\"A-\">A-</option>\n"
                    + "<option value=\"B+\">B+</option>\n"
                    + "<option value=\"B-\">B-</option>\n"
                    + "<option value=\"AB+\">AB+</option>\n"
                    + "<option value=\"AB-\">AB-</option>\n"
                    + "</select>\n"
                    + "</div> \n"
                    + "\n"
                    + "\n"
                    + "<div class=\"form-group\">\n"
                    + "<label for=\"CORREO\">Correo del tutor</label>\n"
                    + "<input type=\"email\" class=\"form-control\" name=\"myBtn\" id=\"myBtn\" placeholder=\"Solo se puede llenar si se cumple una condicion\" size=\"40\" disabled required>\n"
                    + "</div>\n"
                    + "</div> \n"
                    + "<br><br>\n"
                    + "\n"
                    + "\n"
                    + "  <button type=\"submit\" class=\"btn btn-success\">Guardar</button>\n"
                    + "            </form>\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "<script>\n"
                    + "function myFunctionContrasenia() {\n"
                    + "var x = document.getElementById(\"myInput\");\n"
                    + "if (x.type === \"password\") {\n"
                    + "x.type = \"text\";\n"
                    + "} else {\n"
                    + "x.type = \"password\";\n"
                    + "}\n"
                    + "}\n"
                    + "</script>\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "       \n"
                    + "<script>\n"
                    + "let seleccionar = document.querySelector('select');\n"
                    + "let parrafo = document.querySelector('p');\n"
                    + "\n"
                    + "seleccionar.addEventListener('change', establecerClima);\n"
                    + "\n"
                    + "function establecerClima() {\n"
                    + "  let eleccion = seleccionar.value;\n"
                    + "\n"
                    + "  if (eleccion === 'impedimento temporal') {\n"
                    + "    parrafo.textContent = 'Usuario el cual tiene una lesion en las manos, brazos antebrazos "
                    + "con un vendaje o enyesamiento y su tiempo de inmovilizacion es de corto periodo';\n"
                    + "    document.getElementById(\"myBtn\").disabled = false;\n"
                    + "  } else if (eleccion === 'impedimento permanente') {\n"
                    + "    parrafo.textContent = ' Perdida parcial o completa de un miembro del cuerpo ubicado entre: "
                    + "manos, brazos, anetbrazos impidiendo o entorpeciendo la manipulacion del dispositivo electronico';\n"
                    + "    document.getElementById(\"myBtn\").disabled = false;} \n"
                    + "    else if (eleccion === 'Enfermedad neurologias') {\n"
                    + "    parrafo.textContent = 'Paciente en riesgo, clasifican quienes tengan enfermedades como:  enfermedad de Huntington,"
                    + " distrofia muscular, espina bífida, Parkinson, mal de Alzheimer, derrames cerebrales, médula espinal, cerebro, epilepsia,"
                    + " tumores cerebrales, meningitis, Narcolpesia, Cataplexia '; \n"
                    + "    document.getElementById(\"myBtn\").disabled = false;} \n"
                    + "    else if (eleccion === 'Enfermedad neurodegenerativas') {\n"
                    + "    parrafo.textContent = ' Pacientes de alto riesgo,  Enfermedad de Alzheimer,Esclerosis lateral amiotrófica, Ataxia de Friedreich,"
                    + " Enfermedad de Huntington, Demencia con cuerpos de Lewy, Enfermedad de Parkinson, Atrofia muscular espinal, Narcolpesia y Cataplexia';    \n"
                    + "    document.getElementById(\"myBtn\").disabled = false;} \n"
                    + "    else if (eleccion === 'otro') {\n"
                    + "    parrafo.textContent = 'Aunque tienen una enfermedad, esta misma no afecta ni su sistemas neuronal ni su motriz o movimiento para minipular "
                    + "la aplicacion con sus propias manos';  }   \n"
                    + "  else {\n"
                    + "    parrafo.textContent = '';  }\n"
                    + "}</script>\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "<script>\n"
                    + "function myFunctionEdad() {\n"
                    + "  var y=\"July 21, 1983 \";\n"
                    + "  var x = document.getElementById(\"Nacimiento\").value;  \n"
                    + "  var d = new Date(x);\n"
                    + "  var dd = new Date();  \n"
                    + "  var n = d.getFullYear();\n"
                    + "  var m = dd.getFullYear();\n"
                    + "  var g=m-n;\n"
                    + "  \n"
                    + "  var nac=\"Nacio en el anio,  \";\n"
                    + "  var su=\"  su edad es \";\n"
                    + "  var men=\" anios, Eres menor de edad\";\n"
                    + "  var may=\" anios, Eres mayor de edad\";\n"
                    + "  var vet=\" anios, Eres un adulto mayor\";\n"
                    + "  if(g >= 18){\n"
                    + "   document.getElementById(\"demo\").innerHTML = nac+n+su+g+may;\n"
                    + "      if(g >= 70){\n"
                    + "      document.getElementById(\"demo\").innerHTML = nac+n+su+g+vet;\n"
                    + "      document.getElementById(\"myBtn\").disabled = false;\n"
                    + "  }\n"
                    + "  \n"
                    + "  }\n"
                    + "  else{\n"
                    + "  document.getElementById(\"demo\").innerHTML = nac+m+su+g+men;\n"
                    + "  document.getElementById(\"myBtn\").disabled = false;}  \n"
                    + "}\n"
                    + "</script>\n"
                    + "\n"
                    + "\n"
                    + "<script>\n"
                    + "\n"
                    + "function myFunctionTratamiento(x) {\n"
                    + "  var y=document.getElementById(\"inicio\").value;   var j = new Date(y);\n"
                    + "  var x = document.getElementById(\"final\").value;  var i = new Date(x);  \n"
                    + "  var d = new Date(); \n"
                    + "  \n"
                    + "\n"
                    + "  \n"
                    + "  \n"
                    + "  var n = j.getFullYear();  var m = i.getFullYear(); var g=m-n;\n"
                    + "  var b = j.getMonth();  var d = i.getMonth(); var h=d-b;\n"
                    + "  var p = j.getDay();  var q = i.getDay(); var r=q-p;\n"
                    + "  \n"
                    + "  \n"
                    + "  \n"
                    + "  \n"
                    + "  var nac=\"El tratamiento es\";\n"
                    + "  var su=\"   dias con  \";\n"
                    + "  var men=\" mes , para tantos\";\n"
                    + "  var may=\" anios, para finalizarlo\";\n"
                    + "  \n"
                    + "\n"
                    + "  document.getElementById(\"rey\").innerHTML =nac+r+su+h+men+g+may; \n"
                    + "}\n"
                    + "</script>\n"
                    + "\n"
                    + "<script>\n"
                    + "function myFunctionRegresiva() {\n"
                    + "  var i = document.getElementById(\"final\").value;  \n"
                    + "  var  x= new Date(i);      var y = new Date();  \n"
                    + "  var n = x.getFullYear();  var m = y.getFullYear();var g=m-n;\n"
                    + "  var b = x.getMonth();     var d = y.getMonth(); var h=d-b;\n"
                    + "  var p = x.getDay();       var q = y.getDay(); var r=q-p;\n"
                    + "  \n"
                    + "  \n"
                    + "  var nac=\"El tratamiento finaliza dentro de \";\n"
                    + "  var su=\"  dias con \";\n"
                    + "  var men=\" mes para tantos \";\n"
                    + "  var may=\" anios, buena suerte y exitos\"; \n"
                    + "  \n"
                    + "  \n"
                    + "  document.getElementById(\"reina\").innerHTML = nac+r+su+h+men+g+may;\n"
                    + "}\n"
                    + "</script>\n"
                    + "\n"
                    + "</body>\n"
                    + "</html>\n"
                    + ""
                    + "");

            out.close();
        }
    }

    protected void postProcessRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ///  int a= Integer.parseInt("txtCedula");

        String numero = request.getParameter("txtCedula");
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");
        String corrreo = request.getParameter("txtCorreo");
        String Apodo = request.getParameter("txtApodo");
        String contrasenia = request.getParameter("txtContrasenia");
        String Alergia = request.getParameter("txtAlergia");
        String fechaNacimiento = request.getParameter("Nacimiento");
        String condicion = request.getParameter("Paciente Condicion ");
        String Sangre = request.getParameter("tipo de sangre");
        String corrreoTutor = request.getParameter("myBtn");

        VO_Usuario persona = new VO_Usuario(Integer.parseInt(numero), nombre, apellido, corrreo, fechaNacimiento, Sangre, condicion);

        BD_Usuario bd = new BD_Usuario();
        bd.addPersona(persona);

        VO_PacienteL grado2 = new VO_PacienteL(a, contrasenia, Integer.parseInt(numero), Apodo, Alergia, corrreoTutor,
                Integer.parseInt(numero), nombre, apellido, corrreo, fechaNacimiento, Sangre, condicion);
        BD_Pacientel db_grado2 = new BD_Pacientel();
        db_grado2.addPacienteL(grado2);

        VO_Paciente enfermo = new VO_Paciente(a, contrasenia, Integer.parseInt(numero), Apodo, Alergia, Integer.parseInt(numero),
                nombre, apellido, corrreo, fechaNacimiento, Sangre, condicion);
        BD_Paciente bd_paciente = new BD_Paciente();
        bd_paciente.addPaciente(enfermo);

        a++;
        response.sendRedirect("ListaUsuario.html");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        postProcessRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
