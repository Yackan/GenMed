/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import New_VO.VO_Medicamento;
import New_VO.VO_Usuario;
import java.util.ArrayList;

/**
 *
 * @author Labing I5
 */
public class BD_Medicamento {
public static ArrayList<VO_Medicamento> personas;
public static ArrayList<VO_Medicamento> personales;
    public static int i;
    public BD_Medicamento() {
     i=1;
        if (personas == null) {
            
            this.personas = new ArrayList<>();
            
            this.personas.add(new VO_Medicamento(2,"Vigia", "modafinil","tabla",3,100,"m","g","oral",0,91,273,"dociento setenta y tres",
                    "2 tableta durante el desayuno y una tableta en el almuerzo","7am-1pm"));
            this.personas.add(new VO_Medicamento(2,"Nitrofurantoina Generico", "Nitrofurantoina","tabla",1,100,"M","G","oral",6,8,32,"treinta dos",
                    " 1 tableta cada 6 horas durante 8 dias","6am-12h-6pm-12h"));
            
        }
   
    }

    public void addMedicamento(VO_Medicamento persona) {
        this.personas.add(persona);
        
    }
 

    public ArrayList<VO_Medicamento> getPersonas() {
        return personas;
    }

    



}
