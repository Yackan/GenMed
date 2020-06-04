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
public class VO_Tutor extends VO_Usuario {

    private int idTutor;//idVendedor INT NOT NULL auto_increment PRIMARY KEY, 
    private String apodo;
    private String  alergias;  
    private String contraseña;//contraseña varchar(30) NOT NULL,
    private int idPacienteL;//idVendedor INT NOT NULL

     public VO_Tutor() {
        super();
        this.idTutor = idTutor;
        this.contraseña = contraseña;
        this.apodo = apodo;
        this.alergias = alergias;
        this.idPacienteL = idPacienteL;
    }

    public VO_Tutor(int idTutor, String apodo, String alergias, String contraseña, int idPacienteL, int cedula, String nombre, String apellido, String correo, String fechaNacimiento, String sangre, String condicion) {
        super(cedula, nombre, apellido, correo, fechaNacimiento, sangre, condicion);
        this.idTutor = idTutor;
        this.apodo = apodo;
        this.alergias = alergias;
        this.contraseña = contraseña;
        this.idPacienteL = idPacienteL;
    }
    
    



    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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



    public int getIdPacienteL() {
        return idPacienteL;
    }

    public void setIdPacienteL(int idPacienteL) {
        this.idPacienteL = idPacienteL;
    }

    
    
    
   

    

    public VO_Tutor cast(Object t) {
        VO_Tutor mobj = VO_Tutor.class.cast(t);
        return mobj;
    }

}
