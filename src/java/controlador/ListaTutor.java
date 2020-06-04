/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD_Usuario;
import New_VO.VO_PacienteL;
import New_VO.VO_Tutor;
import modelo.BD_Pacientel;
import modelo.BD_Tutor;

/**
 *
 * @author Labing I5
 */
public class ListaTutor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    int k=1;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            BD_Tutor bd = new BD_Tutor();
            ArrayList<VO_Tutor> personas = bd.getPersonas();
            
            
            BD_Pacientel bdp = new BD_Pacientel();            
            ArrayList<VO_PacienteL> pacientes = bdp.getPersonas();
            StringBuilder content = new StringBuilder();
            content.append("\n"
                    + "<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>Listar</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "        <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <br>\n"
                    + "        <a class=\"btn btn-primary\" href=\"index.html\">Menu</a>\n"
                    + "        <br>\n"
                    + "        <div class=\"col-md-12 text-center\">\n"
                    + "\n"
                    + "            <h2>Lista de tutores</h2>\n"
                    + "        </div>\n"
                    + "        <div class=\"col-md-12 \">\n"
                    + "            <br>\n"
                    + "            <table class=\"table table-hover\">\n"
                    + "                <thead>\n"
                    + "                    <tr>\n"
                    
                    + "                       <th>idPaciente</th>\n"
                    + "                        <th>cedula</th>\n"
                    + "                        <th>Nombre</th>\n"
                    + "                        <th>Apellido</th>\n"
                    +"                         <th>contrasenia</th>\n" 
                    +"                         <th>Apodo</th>\n" 
                    
                    +"                         <th>Numero del paciente al cual esta vinculado</th>\n"
                    +"                         <th>Alergias</th>\n"
                    + "                    </tr>\n"
                    + "                </thead>\n"
                    + "                <tbody>\n");

            for (VO_Tutor persona : personas ) {
               
                int index = personas.indexOf(persona);
                int d=index+1;
               
                content.append(""
                        + "<tr>\n"
                        + "<td>" + d+ "</td>\n"                        
                        + "<td>" + persona.getApodo()+ "</td>\n"
                        + "<td>" + persona.getApellido() + "</td>\n"                                
                        + "<td>" + persona.getContraseña()+ "</td>\n"
                        + "<td>" + persona.getApodo()+ "</td>\n"
                        + "<td>" + persona.getAlergias()+ "</td>\n"
                        + "<td>" + persona.getIdPacienteL()+ "</td>\n"
                );
                 k++;
            }

            content.append(""
                    + "                </tbody>\n"
                    + "            </table>\n"
                    + "        </div>\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");

            out.println(content.toString());
            out.close();
        }
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
        processRequest(request, response);
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
