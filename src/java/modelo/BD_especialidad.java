/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Especialidad;
import java.util.ArrayList;

/**
 *
 * @author Sulay2016
 */
public class BD_especialidad {
    int cont=1;
     public static ArrayList<VO_Especialidad> doctores;
     
    public BD_especialidad() {
     
        if (doctores == null) {
            
            this.doctores = new ArrayList<>();
            this.doctores.add(new VO_Especialidad(1,"Clinica del sueño","Especializada en Trastornos del Sueño"));
            this.doctores.add(new VO_Especialidad(2,"Ortopedia","La ortopedia es la especialidad médica que se dedica al diagnóstico, tratamiento, "
                    + "rehabilitación y prevención de lesiones y enfermedades del sistema musculo esquelético del cuerpo humano."));
        }
    }

    public void addEspecialista(VO_Especialidad persona) {
        this.doctores.add(persona);
    }

    public ArrayList<VO_Especialidad> getPersonas() {
        return doctores;
    }

 

    
}
