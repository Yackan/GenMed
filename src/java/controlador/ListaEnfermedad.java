/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import New_VO.VO_Enfermedad;
import New_VO.VO_Especialidad;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD_Doctor;
import New_VO.VO_Medico;


import java.util.ArrayList;
import modelo.BD_Enfermedad;
import modelo.BD_especialidad;
/**
 *
 * @author Sulay2016
 */
public class ListaEnfermedad extends HttpServlet {

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
            BD_Enfermedad bd_D = new BD_Enfermedad();
            ArrayList<VO_Enfermedad> personas = bd_D.getPersonas();

            
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
                    + "            <h2>Lista de Enfermedades</h2>\n"
                    + "        </div>\n"
                    + "        <div class=\"col-md-12 \">\n"
                    + "            <br>\n"
                    + "            <table class=\"table table-hover\">\n"
                    + "                <thead>\n"
                    + "                    <tr>\n"
                    + "                       <th>id enfermedad</th>\n"
                    + "                        <th>nombre enfermedad</th>\n"
                   + "                            <th>Descripcion </th>\n"
                    + "                    </tr>\n"
                    + "                </thead>\n"
                    + "                <tbody>\n");

            for (VO_Enfermedad persona : personas ) {
                int index = personas.indexOf(persona);
                int d=index+1;
                content.append(""
                        + "<tr>\n"
                        + "<td>" + d+ "</td>\n"
                        + "<td>" + persona.getNombre() + "</td>\n"
                        + "<td>" + persona.getDescripcion()+ "</td>\n"
                        + "</tr>\n");
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
