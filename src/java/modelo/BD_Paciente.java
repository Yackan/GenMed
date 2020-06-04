/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import New_VO.VO_Paciente;
import New_VO.VO_Usuario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD_Paciente {
public static ArrayList<VO_Paciente> personales;
    public static int i=3;
    public BD_Paciente() {

        if (personales==null) {
            this.personales = new ArrayList<>();            
             
            this.personales.add(new VO_Paciente(1, "luz",1018, "Dyams", "AINES", 1018,"Sulay", "Cupitra Cupitra","sfctyrtureterte@.....com","1995-03-01","o+","Narcolepsia"));         
            this.personales.add(new VO_Paciente(2, "luz",531016, "Yackan", ",Mani",531016,"Tania", "Cupitra Cupitra","kasrtsmas95@.....com","1985-12-31","o-","insomionio"));   
            
        }
                        /*this.personales.add(new VO_Paciente(i, contraseña, i, apodo, alergias, i, nombre, apellido, correo, fechaNacimiento, sangre, condicion))*/     
        
    }

 public void addPaciente(VO_Paciente persona) {
        this.personales.add(persona);    
       
    }

    public ArrayList<VO_Paciente> getPersonas() {
        return personales;
    }


    



}
