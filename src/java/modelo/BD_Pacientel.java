/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import New_VO.VO_Paciente;
import New_VO.VO_PacienteL;
import New_VO.VO_Usuario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD_Pacientel {
public static ArrayList<VO_PacienteL> personales;
    public static int i;
    public BD_Pacientel() {
     i=1;
        if (personales==null) {
            this.personales = new ArrayList<>();            
             
            this.personales.add(new VO_PacienteL(1, "noche",457, "Dyams", "Ninguna","kasrtsmas95@.....com", 457,"Ines", "Timote Rodriguez","qwrertertrtureterte@.....com","1945-06-31","O+","Husos fragiles"));         
           this.personales.add(new VO_PacienteL(1, "penumbra",789, "redk", "Ninguna","dyertyfsdf@.....com", 789,"Laurel", "reyes Mejia","qyuityye@.....com","1980-03-14","O+","Recuperando cirugia de ojos"));    
            
        }
                        /*this.personales.add(new VO_Paciente(i, contraseña, i, apodo, alergias, i, nombre, apellido, correo, fechaNacimiento, sangre, condicion))*/     
        
    }

    public void addPacienteL(VO_PacienteL persona) {
        this.personales.add(persona);        
    }
 public void addPaciente(VO_PacienteL persona) {
        this.personales.add(persona);        
    }

  public ArrayList<VO_PacienteL> getPersonas() {
        return personales;
    }
    



}
