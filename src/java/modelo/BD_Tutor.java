/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import New_VO.VO_Tutor;
import New_VO.VO_PacienteL;
import New_VO.VO_Usuario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD_Tutor {
public static ArrayList<VO_Tutor> personales;
    public static int i;
    public BD_Tutor() {
     i=1;
        if (personales==null) {
            this.personales = new ArrayList<>();            
             
            this.personales.add(new VO_Tutor(1, "Sur","noche", "Ninguna",1, 789,"Laurel", "reyes Mejia","qyuityye@.....com","1980-03-14","O+","otro"));         
           this.personales.add(new VO_Tutor(2,"norte","penumbra","Ninguna",2, 789,"Laurel", "reyes Mejia","qyuityye@.....com","1980-03-14","O+","otro"));    
            
        }
                        /*this.personales.add(new VO_Paciente(i, contraseña, i, apodo, alergias, i, nombre, apellido, correo, fechaNacimiento, sangre, condicion))*/     
        
    }

    public void addTutor(VO_Tutor persona) {
        this.personales.add(persona);        
    }
 public void addPaciente(VO_Tutor persona) {
        this.personales.add(persona);        
    }

  public ArrayList<VO_Tutor> getPersonas() {
        return personales;
    }
    



}
