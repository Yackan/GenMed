package DAO;

import controlador.IBaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import New_VO.VO_Usuario;
import controlador.Conexion;

/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2 Clase que permite la gestion de la tabla Depto en la base de
 * datos.
 */
public class UsuarioDAO implements IBaseDatos<VO_Usuario> {

    /**
     * Funcion que permite obtener una lista de los departamentos existentes en
     * la base de datos
     *
     * @return List<Departamento> Retorna la lista de Departamentos existentes
     * en la base de datos
     */
    public List<VO_Usuario> findAll() throws SQLException {
        List<VO_Usuario> departamentos = null;
        String query = "SELECT * FROM Persona";
        Connection connection=Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idS = 0;
            String nombre = null, apellido = null, correo = null,
                    Carrera = null, areaTrabajo = null, especialidad = null,
                    tipoEmpleado = null;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<VO_Usuario>();
                }

                VO_Usuario registro = new VO_Usuario(idS, nombre, apellido, correo, especialidad, nombre, correo);
                idS = rs.getInt(Integer.parseInt("cEDULA"));
                registro.setCedula(idS);

                nombre = rs.getString("Nombre");
                registro.setNombre(nombre);

                apellido = rs.getString("apellido");
                registro.setApellido(apellido);

                correo = rs.getString("correo");
                registro.setCorreo(correo);
                

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

    /**
     * Funcion que permite realizar la insercion de un nuevo registro en la
     * tabla Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de insercion es exitosa.
     */
    public boolean insert(VO_Usuario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        //insert into VOPersona values(1014,'Tania','Cupitra','thania@hotmail.com','Ing quimica','Direccion Tecnica','SIG','jefe');
        String query = " insert into Persona " + " values (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Funcion que permite realizar la actualizacion de un nuevo registro en la
     * tabla Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de actualizacion es exitosa.
     */
    public boolean update(VO_Usuario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();

        /*UPDATE VOPersona 
SET nombre = 'Yackanqa', apellido = 'teilay', correo='camiloc@hotmail.com',
        carrera='ingeniero fisico',areaTrabajo='Direccion Tecnica',
        especialidad='Hidrologia',tipoEmpleado='jefe'
WHERE cedula = 1014;*/
        String query = "update Persona set nombre = ?,apellido=?,"
                + "correo=?,  carrera=?,areaTrabajo=?,"
                + "        especialidad=?,tipoEmpleado=?" + " where cedula = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getNombre());
            preparedStmt.setString(2, t.getApellido());
            preparedStmt.setString(1, t.getCorreo());
            

            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * Funcion que permite realizar la eliminario de registro en la tabla
     * Departamento
     *
     * @param Departamento recibe un objeto de tipo Departamento
     * @return boolean retorna true si la operacion de borrado es exitosa.
     */
    public boolean delete(VO_Usuario t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from Persona where cedula = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getCedula());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
