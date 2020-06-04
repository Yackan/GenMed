/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Medico;
import java.util.ArrayList;

/**
 *
 * @author Sulay2016
 */
public class BD_Doctor {
    public static ArrayList<VO_Medico> doctores;
    
    
    public BD_Doctor() {
     
        if (doctores == null) {
            
            this.doctores = new ArrayList<>();
            this.doctores.add(new VO_Medico(135345345,"Sanchez Monry"));
            this.doctores.add(new VO_Medico(26543535,"Aukl Mayert"));
        }
    }

    public void addDoctor(VO_Medico persona) {
        this.doctores.add(persona);
    }

    public ArrayList<VO_Medico> getPersonas() {
        return doctores;
    }

 

    
}
