/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta;

import carpeta.Medicos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class ejemplo {
List<Medicos> clienteCelular = new ArrayList<>();
int index;
Medicos cliente;

public int buscarCliente(String r) {

    Medicos c1 = new Medicos();
    c1.idMedico=1;c1.nombre="ejemplo";
    
    Medicos c2 = new Medicos();
    c2.idMedico=2;c2.nombre="sfd";
    
    
      Medicos c3 = new Medicos();
      c3.idMedico=2;c3.nombre="sfd";
      
      clienteCelular = Arrays.asList(c1, c2, c3);


        for (Medicos item : clienteCelular) {

            while (clienteCelular.iterator().hasNext()) {

                if (clienteCelular.stream().anyMatch(cli -> cli.nombre.equals(r))) {
                    index = clienteCelular.indexOf(item);
                    break;
                }
            }
        }

    return index;
}

public static void main(String[] args) {
    ejemplo c = new ejemplo();
    
    
    System.out.println("El objeto con el String seleccionado de parámetro se encuentra en la posición número: "+ c.buscarCliente("ejemplo3"));
}

}

