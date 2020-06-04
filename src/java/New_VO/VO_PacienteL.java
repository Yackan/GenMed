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
public class VO_PacienteL extends VO_Usuario {

    private int idPacienteL;//idVendedor INT NOT NULL auto_increment PRIMARY KEY, 
    private String contraseña;//contraseña varchar(30) NOT NULL,
    private int cedulaPacienteL;//cedula INT NOT NULL,     
    private String apodo;
    private String  alergias;  
    private String correoTutor;//correo varchar(30) NOT NULL,

    public VO_PacienteL(int idPacienteL, String contraseña, int cedulaPacienteL, String apodo, String alergias, String correoTutor, int cedula, String nombre, String apellido, String correo, String fechaNacimiento, String sangre, String condicion) {
        super(cedula, nombre, apellido, correo, fechaNacimiento, sangre, condicion);
        this.idPacienteL = idPacienteL;
        this.contraseña = contraseña;
        this.cedulaPacienteL = cedula;
        this.apodo = apodo;
        this.alergias = alergias;
        this.correoTutor = correoTutor;
    }

    
    
    

    public int getIdPacienteL() {
        return idPacienteL;
    }

    public void setIdPacienteL(int idPacienteL) {
        this.idPacienteL = idPacienteL;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCedulaPacienteL() {
        return cedulaPacienteL;
    }

    public void setCedulaPacienteL(int cedulaPacienteL) {
        this.cedulaPacienteL = cedulaPacienteL;
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

    public String getCorreoTutor() {
        return correoTutor;
    }

    public void setCorreoTutor(String correoTutor) {
        this.correoTutor = correoTutor;
    }
    
    



   

    

    public VO_PacienteL cast(Object t) {
        VO_PacienteL mobj = VO_PacienteL.class.cast(t);
        return mobj;
    }

}
