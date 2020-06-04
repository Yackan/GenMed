/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New_VO;

/**
 *
 * @author Labing I5
 */
public class VO_Usuario {
    private int cedula;//cedula INT NOT NULL PRIMARY KEY, 
    private String nombre;//nombre varchar(30) NOT NULL,
    private String apellido;//apellido varchar(30) NOT NULL,
    private String correo;//correo varchar(30) NOT NULL,
    
    private String fechaNacimiento;//fechaNacimiento Date NOT NULL,
    private String sangre;//sangre varchar(30) NOT NULL,
    private String condicion;//condicion varchar(30) NOT NULL,

    
       
    public VO_Usuario( ) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.sangre = sangre;
        this.condicion = condicion;
    }
    
    
    
    public VO_Usuario( int cedula, String nombre, String apellido, String correo, String fechaNacimiento, String sangre, String condicion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.sangre = sangre;
        this.condicion = condicion;
    }

  



    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    
    
    
    
    public  VO_Usuario cast(Object t) {
        VO_Usuario mobj = VO_Usuario.class.cast(t);
        return mobj;
     }

}
