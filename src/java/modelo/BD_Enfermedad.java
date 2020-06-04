/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Enfermedad;
import New_VO.VO_Especialidad;
import java.util.ArrayList;

/**
 *
 * @author Sulay2016
 */
public class BD_Enfermedad {
    int cont=1;
     public static ArrayList<VO_Enfermedad> illness;
     
    public BD_Enfermedad() {
     
        if (illness == null) {
            
            this.illness = new ArrayList<>();
            this.illness.add(new VO_Enfermedad(1,"Narcolepsia","Enfermedad del sueño el cual la persona duerme a cualquier momento sin importar la hora"));
            this.illness.add(new VO_Enfermedad(2,"insomnio"," Enfermedad del sueño la cual la persona no puede ni tiene la capaciadad para dormir"));
        }
    }

    public void addIllnes(VO_Enfermedad persona) {
        this.illness.add(persona);
    }

    public ArrayList<VO_Enfermedad> getPersonas() {
        return illness;
    }

 

    
}
