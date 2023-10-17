package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion2 {

    //conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");//este no sirve ya que se trabaja con la conexion del paquete DAO
            return cn;

        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);

        }
        return null;
    }

}
