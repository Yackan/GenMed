/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT;

import controlador.IBaseDatos;
import New_VO.VO_Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sulay2016
 */
public class UsuarioDOT implements IBaseDatos {

    private ArrayList<VO_Usuario> bdPersonas;

    public UsuarioDOT() {
        this.bdPersonas = new ArrayList<>();
    }

    @Override
    public boolean insert(Object t) {
        VO_Usuario persona = null;
        persona.cast(t);

        if (this.search(persona.getCedula()) == null) {
            return this.bdPersonas.add(persona);
        }
        return false;
    }

    

    @Override
    public boolean delete(Object t) {
        VO_Usuario persona = null;
        persona.cast(t);
        return this.bdPersonas.remove(persona);
    }

    public boolean update(int id, Object t) {
        VO_Usuario persona = null;
        persona.cast(t);
        for (int i = 0; i < this.bdPersonas.size(); i++) {
           VO_Usuario aux = this.bdPersonas.get(i);
            if (aux.getCedula() == id) {
                this.bdPersonas.get(i).setNombre(persona.getNombre());
                this.bdPersonas.get(i).setApellido(persona.getApellido());
                return true;
            }
        }
        return false;
    }

    public Object search(int id) {
        for (VO_Usuario persona : bdPersonas) {
            if (persona.getCedula() == id) {
                return persona;
            }
        }
        return null;
    }
    public  VO_Usuario cast(Object t) {
        VO_Usuario mobj = VO_Usuario.class.cast(t);
        return mobj;
     }

    @Override
    public List findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
