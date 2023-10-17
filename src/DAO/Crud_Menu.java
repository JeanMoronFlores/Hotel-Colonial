/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Vistas.FrmMenu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jean
 */
public class Crud_Menu extends Conexion1 {
    //dar formato a los decimales
    static  DecimalFormat df = new DecimalFormat("#.##");

    public static void CargarTablaPizza() {
        Connection con = Conexion1.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM tb_producto WHERE idCategoria = 5"; // Filtrar por categoría 1
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmMenu.jTable_pizza = new JTable(model);
            FrmMenu.jScrollPane6.setViewportView(FrmMenu.jTable_pizza);

            model.addColumn("Servicio");
            model.addColumn("descripcion");
            model.addColumn("Precio");

            while (rs.next()) {
                Object fila[] = new Object[3]; // Solo hay 3 columnas en la tabla
                fila[0] = rs.getObject("nombre");
                fila[1] = rs.getObject("discripcion");
                // Convertir los valores de precio e IGV a tipos numéricos
                double precio = (double) rs.getObject("precio");
                int igv = (int) rs.getObject("IGV");
                // Realizar la operación y asignar el resultado a la columna 2 (precio + IGV)
               double  resultado = precio + (igv / 100.0) * precio;
               fila[2] = df.format(resultado);
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla menú pizza: " + e);
        }
    }

    public static void CargarTablaBebidas() {
        Connection con = Conexion1.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM tb_producto WHERE idCategoria = 7"; // Filtrar por categoría 2
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmMenu.jTable_bebidas = new JTable(model);
            FrmMenu.jScrollPane7.setViewportView(FrmMenu.jTable_bebidas);

            model.addColumn("Bebida");
            model.addColumn("descripcion");
            model.addColumn("Precio");

            while (rs.next()) {
                //esto es los campos que extraemos de la BBDD de la tabla productos 
                Object fila[] = new Object[3]; // Solo hay 3 columnas en la tabla
                fila[0] = rs.getObject("nombre");
                fila[1] = rs.getObject("discripcion");
                 // Convertir los valores de precio e IGV a tipos numéricos
                double precio = (double) rs.getObject("precio");
                int igv = (int) rs.getObject("IGV");
                // Realizar la operación y asignar el resultado a la columna 2 (precio + IGV)
               double  resultado = precio + (igv / 100.0) * precio;
               fila[2] = df.format(resultado);
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla menú bebida: " + e);
        }
    }

    public static void CargarTablaPiqueos() {
        Connection con = Conexion1.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM tb_producto WHERE idCategoria = 5"; // Filtrar por categoría 3
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            FrmMenu.jTable_piqueos = new JTable(model);
            FrmMenu.jScrollPane8.setViewportView(FrmMenu.jTable_piqueos);

            model.addColumn("Piqueo");
            model.addColumn("descripcion");
            model.addColumn("Precio");

            while (rs.next()) {
                //esto es los campos que extraemos de la BBDD de la tabla productos 
                Object fila[] = new Object[3]; // Solo hay 3 columnas en la tabla
                fila[0] = rs.getObject("nombre");
                fila[1] = rs.getObject("discripcion");
                 // Convertir los valores de precio e IGV a tipos numéricos
                double precio = (double) rs.getObject("precio");
                int igv = (int) rs.getObject("IGV");
                // Realizar la operación y asignar el resultado a la columna 2 (precio + IGV)
               double  resultado = precio + (igv / 100.0) * precio;
               fila[2] = df.format(resultado);
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla menú bebida: " + e);
        }
    }

}
