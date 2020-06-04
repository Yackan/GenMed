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
public class VO_Paciente extends VO_Usuario {

    private int idPaciente;//idVendedor INT NOT NULL auto_increment PRIMARY KEY, 
    private String contraseña;//contraseña varchar(30) NOT NULL,
    private int cedulaPaciente;//cedula INT NOT NULL,    
    private String apodo;
    private String  alergias;  

    public VO_Paciente(int idPaciente, String contraseña, int cedulaPaciente, String apodo, String alergias, int cedula, String nombre, String apellido, String correo, String fechaNacimiento, String sangre, String condicion) {
        super(cedula, nombre, apellido, correo, fechaNacimiento, sangre, condicion);
        this.idPaciente = idPaciente;
        this.contraseña = contraseña;
         this.cedulaPaciente = cedula;
        this.apodo = apodo;
        this.alergias = alergias;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(int cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
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
    
    

    

    public VO_Paciente cast(Object t) {
        VO_Paciente mobj = VO_Paciente.class.cast(t);
        return mobj;
    }

}
