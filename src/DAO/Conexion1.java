package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Jean
 */
public class Conexion1 {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
            return cn;

        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);

        }
        return null;
    }

}
