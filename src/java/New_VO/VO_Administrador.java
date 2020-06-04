/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New_VO;

/**
 *
 * @author Asus-PC
 */
public class VO_Administrador extends VO_Usuario {

    private int idAdmin;//idamin INT NOT NULL auto_increment PRIMARY KEY, 
    private String contraseña;//contraseña varchar(30) NOT NULL,
    private int cedulaAdmin;//  cedula INT NOT NULL,    
    private String apodo;
    private String  alergias;  

    
    public VO_Administrador() {
        super();
        this.idAdmin = 95;
        this.contraseña = "casa";
        this.cedulaAdmin = 1018;
        this.apodo = "Dyams";
        this.alergias = "AINES";
    }
    
    
    public VO_Administrador(int idAdmin, String contraseña, int cedulaAdmin, String apodo, String alergias, int cedula, String nombre, String apellido, String correo, String fechaNacimiento, String sangre, String condicion) {
        super(cedula, nombre, apellido, correo, fechaNacimiento, sangre, condicion);
        this.idAdmin = idAdmin;
        this.contraseña = contraseña;
        this.cedulaAdmin = cedula;
        this.apodo = apodo;
        this.alergias = alergias;
    }

   

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCedulaAdmin() {
        return cedulaAdmin;
    }

    public void setCedulaAdmin(int cedulaAdmin) {
        this.cedulaAdmin = cedulaAdmin;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

  

    public VO_Administrador cast(Object t) {
        VO_Administrador mobj = VO_Administrador.class.cast(t);
        return mobj;
    }

}
