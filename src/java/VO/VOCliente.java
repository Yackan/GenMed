/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import New_VO.VO_Usuario;

/**
 *
 * @author Asus-PC
 */
public class VOCliente extends VO_Usuario {

    private int idCliente;//idCliente INT NOT NULL auto_increment PRIMARY KEY, 
    private String direccion;// direccion varchar(30) NOT NULL,
    private int cedulaCliente;// cedula INT NOT NULL,

    public VOCliente(int idCliente, String direccion, int cedulaCliente, int cedula, String nombre, String apellido, String correo, String fechaNacimiento, String sangre, String condicion) {
        super(cedula, nombre, apellido, correo, fechaNacimiento, sangre, condicion);
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.cedulaCliente = cedulaCliente;
    }




    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }


    public  VOCliente cast(Object t) {
        VOCliente mobj = VOCliente.class.cast(t);
        return mobj;
     }
}
