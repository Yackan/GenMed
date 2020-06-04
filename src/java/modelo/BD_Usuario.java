/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Usuario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD_Usuario {
public static ArrayList<VO_Usuario> personas;
public static ArrayList<VO_Usuario> personales;
    public static int i;
    public BD_Usuario() {
     i=1;
        if (personas == null) {
            
            this.personas = new ArrayList<>();
            
            this.personas.add(new VO_Usuario(1018,"Sulay", "Cupitra Cupitra","sfcupitra@.....com","1995-03-01","o+","Narcolepsia"));
            this.personas.add(new VO_Usuario(531016,"Tania", "Cupitra Cupitra","fscupitr5a@.....com","1985-12-31","o-","insomionio"));
            
        }
        if(personales == null) {
            i++;
            this.personales = new ArrayList<>();
            
            this.personales.add(new VO_Usuario(1018,"Sulay", "Cupitra Cupitra","sfcupitra@.....com","1995-03-01","o+","Narcolepsia"));
            this.personales.add(new VO_Usuario(531016,"Tania", "Cupitra Cupitra","fscupitr5a@.....com","1985-12-31","o-","insomionio"));
            
        }
    }

    public void addPersona(VO_Usuario persona) {
        this.personas.add(persona);
        this.personales.add(i,persona);
        
    }
 

    public ArrayList<VO_Usuario> getPersonas() {
        return personas;
    }

 
public void updatePersona(VO_Usuario persona,String correo, String condicion,int cedula) {
    if (cedula==persona.getCedula()){            
       persona.setCorreo(correo);
       this.personas.add(persona);
    }
    

    }
    



}
