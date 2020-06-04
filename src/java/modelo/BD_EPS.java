/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Eps;
import java.util.ArrayList;

/**
 *
 * @author Sulay2016
 */
public class BD_EPS {
    public static ArrayList<VO_Eps> salud;
    
    
    public BD_EPS() {
     
        if (salud == null) {
            
            this.salud = new ArrayList<>();
            this.salud.add(new VO_Eps(6574,"Sanidad Militar","Bogota D.C"));
            this.salud.add(new VO_Eps(79575,"Compensar","Neiva"));
        }
    }

    public void addEps(VO_Eps persona) {
        this.salud.add(persona);
    }

    public ArrayList<VO_Eps> getPersonas() {
        return salud;
    }

 

    
}
