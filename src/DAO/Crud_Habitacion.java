/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Vistas.FrmHabitacion;
import static Vistas.FrmHabitacion.jTable_habitacion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Habitacion;

/**
 *
 * @author Jean
 */
public class Crud_Habitacion extends Conexion1{
      public static int idHabitacion;

    public void Crud_Habitacion() {

    }
    
    
        public static void CargarTablaHabitacion() {
        Connection con = Conexion1.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from tb_habitacion";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmHabitacion.jTable_habitacion = new JTable(model);
            FrmHabitacion.jScrollPane1.setViewportView(FrmHabitacion.jTable_habitacion);

            model.addColumn("ID°");//ID
            model.addColumn("N° habitación");
            model.addColumn("Piso");
            model.addColumn("descripción");
            model.addColumn("Precio");
            model.addColumn("Tipo");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla clientes: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_habitacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_habitacion.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idHabitacion = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosHabitacionesSeleccionadas(idHabitacion);//metodo
                }
            }
        });
    }
            //metodo enviar los datos seleccionados

    private static void EnviarDatosHabitacionesSeleccionadas(int idHabitacion) {
        try {
            Connection con = Conexion1.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "SELECT * FROM tb_habitacion WHERE idhabitacion ='" + idHabitacion + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                FrmHabitacion.txt_numeroHabitacion.setText(rs.getString("numero")); //"
                FrmHabitacion.txt_pisoHabitacion.setText(rs.getString("piso")); //"
                FrmHabitacion.txt_precioHabitacion.setText(rs.getString("precio_diario")); //"
                FrmHabitacion.txt_discripcionHabitacion.setText(rs.getString("descripcion")); //"
                

            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al seleccionar cliente" + e);
        }
    }
     //metodo para guardar habitaciones
        public boolean guardar(Habitacion objeto) {
        boolean respuesta = false;
        Connection cn = Conexion1.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_habitacion values(?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); // id
            consulta.setString(2, objeto.getNumero());
            consulta.setString(3, objeto.getPiso());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setDouble(5, objeto.getPrecio_diario());
            consulta.setString(6, objeto.getTipo_habitacion());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar habitación" + e);
        }
        return respuesta;
    }
}
