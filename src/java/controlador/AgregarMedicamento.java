/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import New_VO.VO_Medicamento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BD_Usuario;
import New_VO.VO_Usuario;
import modelo.BD_Medicamento;

/**
 *
 * @author Asus-PC
 */
public class AgregarMedicamento extends HttpServlet {
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
                    + "            <h2>Agregar Usuario</h2>\n"
                    + "            <br>\n"
                    + "            <form action=\"AgregarMedicamento.html\" method=\"POST\" class=\"col-md-4 col-md-offset-4\">\n"

                    + "\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Nombre\">Nombre Comercial:</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtNombreComercial\"  placeholder=\"Nombre del objeto que contiene el medicamento \" required>\n"
                    + "                </div>\n"
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"Apellido\">Nombre</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtNombre\" required>\n"
                    + "                </div>\n"
                            
                            
                    + "                  <div class=\"form-group\">\n"
                    + "                    <label for=\"Cedula\">Dosis</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtCedula\" placeholder=\"Cuantas vees debe consumirlo \" required>\n"
                    + "                </div>\n"
                            
                            
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">CantidadNumerica</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtCantidadNumerica\"  placeholder=\"escribir Numero que acompaña a las unidades \" required>\n"
                    + "                </div>\n"
                    
                    +"           <div class=\"form-group\">\n" 
                                      +"      <td><label for=\"Prefijo\">Cantidad      </label>\n" 
                    +"          <select name=\"Prefijo\"></td>\n"
                            +"         <option value=\"E\">Exa=   E</option>      \n"
                            +"         <option value=\"P\">Pera=   T</option>\n" 
                            +"         <option value=\"T\">Tera=   T</option>\n" 
                            +"         <option value=\"M\">Giga= tonelada=G </option>\n"
                            +"         <option value=\"K\">Kilo=   K</option>\n" 
                            +"         <option value=\"h\">hecto= h</option>\n"
                            +"         <option value=\"da\"> </option>\n" 
                            +"         <option value=\"d\">deci= d</option>\n" 
                            +"         <option value=\"m\">mili= m</option>\n" 
                            +"         <option value=\"μ\">micro= μ</option>\n" 
                            +"         <option value=\"n\">nano= n</option>\n" 
                            +"         <option value=\"p\">pico= p</option>\n"
                            +"         <option value=\"f\">femto= f</option>\n" 
                            +"         <option value=\"a\">atto= a</option>\n"
                            +"          </select> </div>\n" 
                            +"          \n" 
                            +"              <div class=\"form-group\">\n" 
                            +"        <td><label for=\"cientifico\">son en:     </label>  \n"
                            +"           <select name=\"Unidades\">\n"
                            +"           <option value=\"g\">gramos=   g</option>\n" 
                            +"           <option value=\"L\">litros=   L</option>\n" 
                            +"           <option value=\"lb\">libra=  lb</option>\n" 
                            +"           <option value=\"m\">metro=  m</option>\n"
                            +"            </select> </div>\n"        
                            
                                  
                    + "<div class=\"form-group\">\n"
                    + "                    <label for=\"Sangre\">Via de Administracion de medicamentos</label>\n"                             
                  
                    + " <select name=\"tipo de Administracion\">\n" 
                    +"                <option value=\"Via Oral\">Via Oral</option>\n"
                    +"                <option value=\"Via topica\">Via topica</option>\n" 
                    +"                <option value=\"Via Transdermica\">Via Transdermicassss</option>\n"
                    +"                <option value=\"Via oftalmica\">Via oftalmica</option>\n"
                    +"                <option value=\"Via optica\">Via optica</option>\n" 
                    +"                <option value=\"Via intranasal\">Via intranasal</option>\n"
                    +"                <option value=\"Via inhalatoria\">Via inhalatoria</option>\n"
                    +"                <option value=\"Via rectal\">Via rectal</option>\n"
                    + "                <option value=\"Via vaginal\">Via vaginal</option>\n"
                    + "                <option value=\"Via parental\">Via parental</option>\n"       
                    +"            </select>\n"
                    + "                </div>\n" 
            
                    
                     + "                </div>\n"             
                            
                            
                            
                            
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">Frecuencia</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtFrecuencia\"  placeholder=\"numero de concentracion\" required>\n"
                    + "                </div>\n"
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">Tiempo</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtTiempo\"  placeholder=\"numero de concentracion\" required>\n"
                    + "                </div>\n"     
                            
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">Cantidad</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtCantidad\"  placeholder=\"numero de concentracion\" required>\n"
                    + "                </div>\n"
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">Cantidad en letras</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtCantidadLetras\"  placeholder=\"numero de concentracion\" required>\n"
                    + "                </div>\n"      
                            
                            
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">posologia</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtPosologia\"  placeholder=\"numero de concentracion\" required>\n"
                    + "                </div>\n"
                            
                    + "                <div class=\"form-group\">\n"
                    + "                    <label for=\"CORREO\">recomendaciones</label>\n"
                    + "                    <input type=\"text\" class=\"form-control\" name=\"txtRecomendaciones\"  placeholder=\"numero de concentracion\" required>\n"
                    + "                </div>\n"                  
               
                            
                            
                            
                            
                    
                  
            
              
                    
                    
                    
                    + "\n"
                    + "                <button type=\"submit\" class=\"btn btn-success\">Guardar</button>\n"
                    + "            </form>\n"
                    + "        </div>\n"
                    + "\n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");

            out.close();
        }
    }

    protected void postProcessRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ///  int a= Integer.parseInt("txtCedula");

        String nombreComercial= request.getParameter("txtNombreComercial");
        String nombre = request.getParameter("txtNombre");
        String Dosis = request.getParameter("txtCedula");
        String CantidadNumerica = request.getParameter("txtCantidadNumerica");
        String prefijo = request.getParameter("Prefijo");
        String unidades = request.getParameter("Unidades");
        String ViaAdmin = request.getParameter("tipo de Administracion");
        String frecuencia = request.getParameter("txtFrecuencia");
        String tiempo = request.getParameter("txtTiempo");        
        String Cantidad = request.getParameter("txtCantidad");
        String CantidadLetras = request.getParameter("txtCantidadLetras");
        String Posologia = request.getParameter("txtPosologia");
        String Recomendaciones = request.getParameter("txtRecomendaciones");
        
        VO_Medicamento farmaco = new VO_Medicamento(a, nombre, nombreComercial, frecuencia, Integer.parseInt(Dosis),Integer.parseInt(CantidadNumerica), 
                prefijo, unidades, ViaAdmin, Integer.parseInt(frecuencia), Integer.parseInt(tiempo),Integer.parseInt(Cantidad), CantidadLetras, Posologia, Recomendaciones);

        BD_Medicamento bd = new BD_Medicamento();
        bd.addMedicamento(farmaco);
        a++;
        response.sendRedirect("ListaMedicamento.html");
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
