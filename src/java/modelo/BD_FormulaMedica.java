/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Enfermedad;
import New_VO.VO_Eps;
import New_VO.VO_Especialidad;
import New_VO.VO_FormulaMedica;
import New_VO.VO_Medicamento;
import New_VO.VO_Medico;
import New_VO.VO_Usuario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD_FormulaMedica {
    
    
public static ArrayList<VO_Medicamento> personas;
public static ArrayList<VO_Eps> salud;
public static ArrayList<VO_Medico> doctores;
public static ArrayList<VO_Especialidad> especialista;
public static ArrayList<VO_Enfermedad> illness;
public static ArrayList<VO_Usuario> user;

public static ArrayList<VO_FormulaMedica> tratamiento;

    public static int i;
    public BD_FormulaMedica() {
     i=1;
        if (tratamiento == null) {
            
            this.tratamiento = new ArrayList<>();
            
            this.tratamiento.add(new VO_FormulaMedica(1,1,1,1,1,"2018-06-01","2060-08-12","Bogota"));
            this.tratamiento.add(new VO_FormulaMedica(2,2,2,2,2,"2018-06-01","2060-08-12","Neiva"));
            
        }
   
    }

    public void addTratamiento(VO_Medicamento persona) {
        this.personas.add(persona);
        
    }
 

    public ArrayList<VO_Medicamento> getPersonas() {
        return personas;
    }

    



}
