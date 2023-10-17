/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Jean
 */
public class Crud_FrmCheck_In extends Conexion1 {
//            public static void CargarTablaHabitacion() {
//                
//        Connection con = Conexion1.conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String sql = "select * from tb_habitacion";
//        Statement st;
//        try {
//            st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            FrmHabitacion.jTable_habitacion = new JTable(model);
//            FrmHabitacion.jScrollPane1.setViewportView(FrmHabitacion.jTable_habitacion);
//
//            model.addColumn("ID°");//ID
//            model.addColumn("N° habitación");
//            model.addColumn("Piso");
//            model.addColumn("descripción");
//            model.addColumn("Precio");
//            model.addColumn("Tipo");
//            model.addColumn("Estado");
//
//            while (rs.next()) {
//                Object fila[] = new Object[7];
//                for (int i = 0; i < 7; i++) {
//                    fila[i] = rs.getObject(i + 1);
//                }
//                model.addRow(fila);
//            }
//            con.close();
//        } catch (SQLException e) {
//            System.out.println("Error al llenar la tabla clientes: " + e);
//        }
//        //evento para obtener campo al cual el usuario da click
//        //y obtener la interfaz que mostrara la informacion general
//        jTable_habitacion.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int fila_point = jTable_habitacion.rowAtPoint(e.getPoint());
//                int columna_point = 0;
//
//                if (fila_point > -1) {
//                    idHabitacion = (int) model.getValueAt(fila_point, columna_point);
//                    EnviarDatosHabitacionesSeleccionadas(idHabitacion);//metodo
//                }
//            }
//        });
//    }
}
