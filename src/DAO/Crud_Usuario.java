/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Vistas.FrmUsuario;
import static Vistas.FrmUsuario.jTable_usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author Jean
 */
public class Crud_Usuario extends Conexion1 {

    public Crud_Usuario() {

    }
    public static int idUsuario;
    
//metodo para lograr el login
       public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;
        Connection cn = Conexion1.conectar();

        String sql = "SELECT usuario, PASSWORD FROM tb_usuario where usuario = '" + objeto.getUsuario() + "' AND PASSWORD='" + objeto.getPassword() + "';";//almacena sentencia
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql); //se ejecuta
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }
        return respuesta;
    }
    /**
     *
     * metodo panel derecho
     */
    public static void Limpiar() {
        FrmUsuario.txt_nombre.setText("");
        FrmUsuario.txt_apellido.setText("");
        FrmUsuario.txt_dni.setText("");
        FrmUsuario.txt_usuario.setText("");
        FrmUsuario.txt_password.setText("");
        FrmUsuario.txt_telefono.setText("");

    }
       public static void Limpiar2() {
        FrmUsuario.txt_gestionar_nombre.setText("");
        FrmUsuario.txt_gestionar_apellido.setText("");
        FrmUsuario.txt_gestionar_dni.setText("");
        FrmUsuario.txt_gestionar_usuario.setText("");
        FrmUsuario.txt_gestionar_password.setText("");
        FrmUsuario.txt_gestionar_telefono.setText("");

    }

    /**
     *
     * metodo panel izquierdo
     */
    
     public static void CargarTablaUsuarios() {
        Connection con = Conexion1.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select * from tb_usuario";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmUsuario.jTable_usuario = new JTable(model);
            FrmUsuario.jScrollPane1.setViewportView(FrmUsuario.jTable_usuario);

            model.addColumn("N°");//ID
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Dni");
            model.addColumn("Usuario");
            model.addColumn("Contraseña");
            model.addColumn("Telefono");
            model.addColumn("Estado");

            while (rs.next()) {
                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla usuarios: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_usuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_usuario.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idUsuario = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSeleccionados(idUsuario);//metodo
                }
            }
        });
    }
     //metodo enviar los datos seleccionados
    private static void EnviarDatosClienteSeleccionados(int idUsuario) {
        try {
            try (Connection con = Conexion1.conectar()) {
                PreparedStatement pst = con.prepareStatement(
                        "SELECT * FROM tb_usuario WHERE idUsuario ='" + idUsuario + "'");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    FrmUsuario.txt_gestionar_nombre.setText(rs.getString("nombre")); //"
                    FrmUsuario.txt_gestionar_apellido.setText(rs.getString("apellido")); //"
                    FrmUsuario.txt_gestionar_dni.setText(rs.getString("dni")); //"
                    FrmUsuario.txt_gestionar_usuario.setText(rs.getString("usuario")); //"
                    FrmUsuario.txt_gestionar_password.setText(rs.getString("password")); //"
                    FrmUsuario.txt_gestionar_telefono.setText(rs.getString("telefono")); //"

                }
            }

        } catch (SQLException e) {
            System.out.println("Error al seleccionar usuario" + e);
        }
    }
    
    /////////////////////////////////////////////////////////////////////////
     /**
     * **************************************************
     * metodo para guardar un usuario
     * **************************************************
     */
    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion1.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_usuario VALUES (?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); // id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getDni());
            consulta.setString(5, objeto.getUsuario());
            consulta.setString(6, objeto.getPassword());
            consulta.setString(7, objeto.getTelefono());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario desde el controlador: " + e);
        }
        return respuesta;
    }

    //metodo para consulta si el usuario ya está guardado( ya existe)
    public boolean existeUsuario(String dni) {
        boolean respuesta = false;
        String sql = "SELECT dni FROM tb_usuario WHERE dni='" + dni + "';";
        Statement st;

        try {
            Connection cn = Conexion1.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql); //se ejecuta
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar existencia de usuario"+e); //borré el +e despues de: usuario " 

        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion1.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set nombre=?, apellido = ?, dni = ?, usuario = ?, password= ?, telefono = ?, estado = ? where idUsuario ='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getDni());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario desde el crud: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion1.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_usuario where idUsuario ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }
    
}
