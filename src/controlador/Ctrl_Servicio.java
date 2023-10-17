/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAO.Conexion1;
import DAO.Crud_Servicio;
//import static DAO.Crud_Servicio.obtenerIdCategoriaCombo;
import Vistas.FrmServicio;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Servicio;

/**
 *
 * @author Jean
 */
public class Ctrl_Servicio implements ActionListener {

//    int obtenerIdCategoriaCombo = Crud_Servicio.obtenerIdCategoriaCombo;
    static int obtenerIdCategoriaCombo = 0;

    FrmServicio vista;
    Crud_Servicio crud;

    public Ctrl_Servicio(FrmServicio vista) {
        this.vista = vista;
        this.crud = new Crud_Servicio();
        // Agregar el ActionListener A los botones
        Crud_Servicio.CargarTablaProductos();
        this.vista.btn_guardar.addActionListener(this);
        this.vista.btn_actualizar.addActionListener(this);
        this.vista.btn_eliminar.addActionListener(this);
        this.vista.btn_buscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_buscar) {
            //BUSCA PRODUCTO SEGUN SU ID
            if (FrmServicio.txt_buscar_idProducto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escribe el ID del producto a buscar");
            } else {
                String productoBuscar = FrmServicio.txt_buscar_idProducto.getText().trim();
                Connection cn = Conexion1.conectar();
                String sql = "SELECT * FROM tb_producto where idProducto  = '" + productoBuscar + "'";
                Statement st;
                try {
                    st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    if (rs.next()) {

                        FrmServicio.txt_gestionar_nombre.setText(rs.getString("nombre")); //"
                        FrmServicio.txt_gestionar_cantidad.setText(rs.getString("cantidad")); //"
                        FrmServicio.txt_gestionar_discripcion.setText(rs.getString("discripcion")); //"
                        FrmServicio.txt_gestionar_precio.setText(rs.getString("precio")); //"
                        int iva = rs.getInt("IGV");
                        switch (iva) {
                            case 0:
                                FrmServicio.jComboBox_gestionarIGV.setSelectedItem("Sin IGV");
                                break;
                            case 16:
                                FrmServicio.jComboBox_gestionarIGV.setSelectedItem("16%");
                                break;
                            case 18:
                                FrmServicio.jComboBox_gestionarIGV.setSelectedItem("18%");
                                break;
                            default:
                                FrmServicio.jComboBox_gestionarIGV.setSelectedItem("Seleccione igv:");
                                break;
                        }
                         int idCate = rs.getInt("idCategoria");
                FrmServicio.jComboBox_gestionarCategoria.setSelectedItem(Crud_Servicio.relacionarCategoria(idCate));

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Id de producto incorrecta o no encontrada!");
                    }
                    FrmServicio.txt_buscar_idProducto.setText("");
                    cn.close();
                } catch (SQLException a) { // como el "e" está ocupado se coloca "a
                    System.out.println("¡Error al buscar producto!, " + a);
                }
            }
        }
        if (e.getSource() == vista.btn_guardar) {
//            int obtenerIdCategoriaCombo = Crud_Servicio.obtenerIdCategoriaCombo;
            Servicio producto = new Servicio();
            Crud_Servicio controlProducto = new Crud_Servicio();
            String iva = "";
            String categoria = "";
            iva = FrmServicio.jComboBoxIGV.getSelectedItem().toString().trim();
            categoria = FrmServicio.jComboBoxCategoria.getSelectedItem().toString().trim();

            //validar campos
            if (FrmServicio.txt_nombre.getText().equals("") || FrmServicio.txt_cantidad.getText().equals("") || FrmServicio.txt_precio.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
//                FrmServicio.txt_nombre.setBackground(Color.red);
//                FrmServicio.txt_cantidad.setBackground(Color.red);
//                FrmServicio.txt_precio.setBackground(Color.red);
            } else {
                //consulta para ver si el producto ya existe
                if (!controlProducto.existeProducto(FrmServicio.txt_nombre.getText().trim())) {
                    if (iva.equalsIgnoreCase("Seleccione IGV:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione iva.");
                    } else {
                        if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                            JOptionPane.showMessageDialog(null, "Seleccione categoria");
                        } else {
                            try {
                                producto.setNombre(FrmServicio.txt_nombre.getText().trim());
                                producto.setCantidad(Integer.parseInt(FrmServicio.txt_cantidad.getText().trim()));
                                String precioTXT = "";
                                double Precio = 0.0;
                                precioTXT = FrmServicio.txt_precio.getText().trim();
                                boolean aux = false;
                                /*
                            *Si el usuario ingresa , (coma) como punto decimal,
                            lo transformamos a punto (.)
                                 */
                                for (int i = 0; i < precioTXT.length(); i++) {
                                    if (precioTXT.charAt(i) == ',') {
                                        String precioNuevo = precioTXT.replace(",", ".");
                                        Precio = Double.parseDouble(precioNuevo);
                                        aux = true;
                                    }
                                }
                                //evaluar la condicion
                                if (aux == true) {
                                    producto.setPrecio(Precio);
                                } else {
                                    Precio = Double.parseDouble(precioTXT);
                                    producto.setPrecio(Precio);
                                }

                                producto.setDiscripcion(FrmServicio.txt_discripcion.getText().trim());
                                //Porcentaje IVA
                                if (iva.equalsIgnoreCase("Sin IGV:")) {
                                    producto.setIGV(0);
                                } else if (iva.equalsIgnoreCase("16%")) {
                                    producto.setIGV(16);
                                } else if (iva.equalsIgnoreCase("18%")) {
                                    producto.setIGV(18);
                                }

                                //idcategoria - cargar metodo que obtiene el id de categoria
                                this.IdCategoria();
                                producto.setIdCategoria(obtenerIdCategoriaCombo);
                                producto.setEstado(1);

                                if (controlProducto.guardar(producto)) {
                                    JOptionPane.showMessageDialog(null, "Registro Guardado");
//                                txt_nombre.setBackground(Color.green);
//                                txt_cantidad.setBackground(Color.green);
//                                txt_precio.setBackground(Color.green);
//                                txt_discripcion.setBackground(Color.green);
                                    Crud_Servicio.CargarTablaProductos();
                                    Crud_Servicio.CargarComboCategoria();
                                    FrmServicio.jComboBoxIGV.setSelectedItem("Seleccione IGV:");
                                    Crud_Servicio.Limpiar();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                                }

                            } catch (HeadlessException | NumberFormatException a) { // era "e" en vez de "a"
                                System.out.println("Error en: " + a);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El producto ya existe en la Base de Datos");
                    FrmServicio.txt_nombre.setBackground(Color.red);
                }
            }
        }

        if (e.getSource() == vista.btn_actualizar) {
            int idProducto = Crud_Servicio.idProducto;
            Servicio producto = new Servicio();
            Crud_Servicio controlProducto = new Crud_Servicio();
            String iva = "";
            String categoria = "";
            iva = FrmServicio.jComboBox_gestionarIGV.getSelectedItem().toString().trim();
            categoria = FrmServicio.jComboBox_gestionarCategoria.getSelectedItem().toString().trim();

            //validar campos
            if (FrmServicio.txt_gestionar_nombre.getText().isEmpty() || FrmServicio.txt_gestionar_cantidad.getText().isEmpty() || FrmServicio.txt_gestionar_precio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } else {
                if (iva.equalsIgnoreCase("Seleccione IGV:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione un IGV válida");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione una categoria válida");
                    } else {
                        try {
                            producto.setNombre(FrmServicio.txt_gestionar_nombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(FrmServicio.txt_gestionar_cantidad.getText().trim()));
                            String precioTXT = "";
                            double Precio = 0.0;
                            precioTXT = FrmServicio.txt_gestionar_precio.getText().trim();
                            boolean aux = false;
                            /*
                            *Si el usuario ingresa , (coma) como punto decimal,
                            lo transformamos a punto (.)
                             */
                            for (int i = 0; i < precioTXT.length(); i++) {
                                if (precioTXT.charAt(i) == ',') {
                                    String precioNuevo = precioTXT.replace(",", ".");
                                    Precio = Double.parseDouble(precioNuevo);
                                    aux = true;
                                }
                            }
                            //evaluar la condicion
                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(precioTXT);
                                producto.setPrecio(Precio);
                            }
                            //actualiza el igv
                            producto.setDiscripcion(FrmServicio.txt_gestionar_discripcion.getText().trim());
                            //Porcentaje IGV
                            if (iva.equalsIgnoreCase("Seleccione IGV")) {
                                producto.setIGV(0);
                            } else if (iva.equalsIgnoreCase("Sin IGV")) {
                                producto.setIGV(0);
                            } else if (iva.equalsIgnoreCase("16%")) {
                                producto.setIGV(16);
                            } else if (iva.equalsIgnoreCase("18%")) {
                                producto.setIGV(18);
                            }

                            //idcategoria - cargar metodo que obtiene el id de categoria
                            this.IdCategoria2();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);

                            if (controlProducto.actualizar(producto, idProducto)) {
                                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                                Crud_Servicio.CargarTablaProductos();
                                Crud_Servicio.CargarComboCategorias();
                                FrmServicio.jComboBox_gestionarIGV.setSelectedItem("Seleccione IGV::");
                                Crud_Servicio.Limpiar2();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al Actualizar desde el controlador");
                            }
                        } catch (HeadlessException | NumberFormatException a) {
                            System.out.println("Error en: " + a);
                        }
                    }
                }
            }
        }

        if (e.getSource() == vista.btn_eliminar) {
            int idProducto = Crud_Servicio.idProducto;
            Crud_Servicio controlProducto = new Crud_Servicio();
            if (idProducto == 0) {
                JOptionPane.showMessageDialog(null, "¡Seleccione un Producto!");
            } else {
                if (!controlProducto.eliminar(idProducto)) {
                    JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                    Crud_Servicio.CargarTablaProductos();
                    Crud_Servicio.CargarComboCategorias();
                    Crud_Servicio.Limpiar2();
                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al eliminar producto!");
                }
            }
        }

    }
//esto es para el combo de la izquierda

    public static int IdCategoria() {
        String sql = "select * from tb_categoria where discripcion = '" + FrmServicio.jComboBoxCategoria.getSelectedItem() + "'"; // 
        Statement st;
        try {
            Connection cn = Conexion1.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }

    //esto para obtner la id del combo de la derecha
    private int IdCategoria2() {
        String sql = "select * from tb_categoria where discripcion = '" + FrmServicio.jComboBox_gestionarCategoria.getSelectedItem() + "'";// se cambia jComboBox_gestionarCategoria por jComboBoxCategoria
        Statement st;
        try {
            Connection cn = Conexion1.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }
    /**
     *
     * metodos panel izquierdo
     */
    // Metodo para cargar las categorias en el combo (panel derecho)

    /**
     *
     * metodos panel derecho
     */
}
