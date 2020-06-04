/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import New_VO.VO_Paciente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD_Usuario;
import New_VO.VO_Usuario;
import New_VO.VO_Paciente;
import modelo.BD_Paciente;
/**
 *
 * @author Asus-PC
 */
public class AgregarPaciente extends HttpServlet {
int a=3;
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
                    + "        <title>Agregar Usuario</title>\n"
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
                    + "            <form action=\"AgregarPaciente.html\" method=\"POST\" class=\"col-md-4 col-md-offset-4\">\n"
                    + "                  <div class=\"form-group\">\n"
                    + "                    <label for=\"Cedula\">cEDULA</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtCedula\" required>\n"
                    + "                </div>\n"
                    + "\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Nombre\">Nombre:</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtNombre\" required>\n"
                    + "                </div>\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Apellido\">Apellido</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtApellido\" required>\n"
                    + "                </div>\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">cORREO</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtCorreo\" required>\n"
                    + "                </div>\n"
                            
                            
                     + "                </div>\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Apodo\">escriba Apodo</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtApodo\" required>\n"
                    + "                </div>\n"       
                            
                    + "                </div>\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"contrasenia\">escriba contrasenia</label>\n"
                    + "                    <input type=\"password\" class=\"form-control\" name=\"txtContrasenia\" id=\"myInput\" required>\n"
                    + "                    <input type=\"checkbox\" onclick=\"myFunctionContrasenia()\">Mostrar Contraseña"
                            
                            
                            
                            
                    + "                </div>\n"   
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Alergia\">escriba Alergia</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtAlergia\" required>\n"
                    + "                </div>\n"                              
                            
                            
                            
                    
                    + "                </div>\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"fecha\">fechaNacimiento</label>\n"              
                    + "                    <td><input type=\"Date\" id=\"start\" name=\"Nacimiento\"        value=\"1900-01-01\"       min=\"1900-01-01\" max=\"2150-12-31\"></td>"
                    + "                </div>"
                    
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Sangre\">Sangre</label>\n"                             
                  
                    + " <select name=\"tipo de sangre\">\n" 
                    +"                <option value=\"O+\">O+</option>\n"
                    +"                <option value=\"O-\">O-</option>\n" 
                    +"                <option value=\"A+\">A+</option>\n"
                    +"                <option value=\"A-\">A-</option>\n"
                    +"                <option value=\"B+\">B+</option>\n" 
                    +"                <option value=\"B-\">B-</option>\n"
                    +"                <option value=\"AB+\">AB+</option>\n"
                    +"                <option value=\"AB-\">AB-</option>\n" 
                    +"            </select>\n"
                    + "                </div>\n" 
            
                    
                     + "                </div>\n" 
                   
            + "                <div class=\"form-group\">\n"
            + "                    <label for=\"Condicion\">Condicion</label>\n"
            
            
            
            + "              <select name=\"Paciente Condicion \">\n" 
            +"               <option value=\"Ninguna\">Niguna</option>\n"
            +"\n" 
            +"                <option value=\"impedimento temporal\">impedimento temporal</option>\n"
            +"                <option value=\"impedimento permanente\">impedimento permanente</option>\n"
            +"                <option value=\"Enfermedad neurologias\">enfermedad Neurologias</option>\n" 
            +"                <option value=\"Enfermedad neurodegenerativas\">enfermedad neurodegenerativas</option>\n" 
            +"                <option value=\"Enfemerdad que no impedie accidenes motrices como neuronales\">otros</option>\n" 
            +"         \n"
            +"            </select>\n"  
            + "                </div>\n" 
                    
                    
                    
                    + "\n"
                    + "                <button type=\"submit\" class=\"btn btn-success\">Guardar</button>\n"
                    + "            </form>\n"
                    + "        </div>\n"
                    + "\n"
                    
                    +" <script>\n" 
                            +"function myFunctionContrasenia() {\n" 
                            +"  var x = document.getElementById(\"myInput\");\n"
                            +"  if (x.type === \"password\") {\n" 
                            +"    x.type = \"text\";\n" 
                            +"  } else {\n"
                            +"    x.type = \"password\";\n"
                            +"  }\n"
                            +"}\n" 
                            +"</script>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");

            out.close();
        }
    }

    protected void postProcessRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        String numero = request.getParameter("txtCedula");
        String nombre = request.getParameter("txtNombre");
        String apellido = request.getParameter("txtApellido");        
        String Apodo = request.getParameter("txtApodo");
        String contrasenia = request.getParameter("txtContrasenia");
        String Alergia = request.getParameter("txtAlergia");
        String corrreo = request.getParameter("txtCorreo");
        String fechaNacimiento = request.getParameter("Nacimiento");
        String Sangre = request.getParameter("tipo de sangre");
        String condicion = request.getParameter("Paciente Condicion ");
        VO_Usuario persona = new VO_Usuario(Integer.parseInt(numero),nombre,apellido, corrreo,fechaNacimiento,Sangre,condicion);
        VO_Paciente enfermo=new VO_Paciente(a, contrasenia, Integer.parseInt(numero), Apodo, Alergia, Integer.parseInt(numero), nombre, apellido, corrreo, fechaNacimiento, Sangre, condicion);

        BD_Usuario bd_user = new BD_Usuario();
        bd_user.addPersona(persona);
        
         BD_Paciente bd_paciente = new BD_Paciente();
        bd_paciente.addPaciente(enfermo);
        
        a++;
        response.sendRedirect("ListaPaciente.html");
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
