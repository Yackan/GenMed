/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import New_VO.VO_Medicamento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD_Medicamento;
import New_VO.VO_Medicamento;
/**
 *
 * @author Labing I5
 */
public class ListaMedicamento extends HttpServlet {

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
            BD_Medicamento bd = new BD_Medicamento();
            ArrayList<VO_Medicamento> personas = bd.getPersonas();

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
                    + "            <h2>Lista de Medicamento</h2>\n"
                    + "        </div>\n"
                    + "        <div class=\"col-md-12 \">\n"
                    + "            <br>\n"
                    + "            <table class=\"table table-hover\">\n"
                    + "                <thead>\n"
                    + "                    <tr>\n"
                    
                    + "<th>id Medicamento</th>\n"
                    + "                        <th>Nombre Comercial</th>\n"
                    + "                        <th>Nombre medicamento</th>\n"
                    + "                        <th>Cantidad</th>\n"
                    +"                         <th>Dosis</th>\n" 
                    +"                         <th>Concentracion</th>\n" 
                    +"                         <th>Via administracion</th>\n" 
                    
                    
                    +"                         <th>frecuencia</th>\n"
                    +"                         <th>tiempo</th>\n"
                    +"                         <th>cantidad</th>\n"
                    +"                         <th>cantidad letras</th>\n"
                    +"                         <th>posologia</th>\n"
                    +"                         <th>recomendaciones</th>\n"
                    + "                    </tr>\n"
                    + "                </thead>\n"
                    + "                <tbody>\n");

            for (VO_Medicamento persona : personas) {
                int index = personas.indexOf(persona);
                int d=index+1;
                String concentracion=persona.getCantidadNumerica()+persona.getPrefijo()+persona.getUnidades();
                
                content.append(""
                        + "<tr>\n"
                        + "<td>" + d+ "</td>\n"
                        + "<td>" + persona.getNombreComercial()+ "</td>\n"
                        + "<td>" + persona.getNombre()+ "</td>\n"
                        + "<td>" + persona.getFormaFarmaceutica()+ "</td>\n"
                        + "<td>" + persona.getDosis()+ "</td>\n"
                        + "<td>" + concentracion+ "</td>\n" 
                        + "<td>" + persona.getViaAdministrativa()+ "</td>\n"
                                
                        + "<td>" + persona.getFrecuencia()+ "</td>\n"
                        + "<td>" + persona.getTiempo()+ "</td>\n"
                        + "<td>" + persona.getCantidad()+ "</td>\n"
                        + "<td>" + persona.getCantidadLetras()+ "</td>\n"
                        + "<td>" + persona.getPosologia()+ "</td>\n"
                         + "<td>" + persona.getRecomendaciones()+ "</td>\n"
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
