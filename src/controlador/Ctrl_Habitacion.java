/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAO.Crud_Habitacion;
import Vistas.FrmHabitacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import modelo.Habitacion;

/**
 *
 * @author Jean
 */
public class Ctrl_Habitacion implements ActionListener {

    FrmHabitacion vista;
    Crud_Habitacion crud;

    public Ctrl_Habitacion(FrmHabitacion vista) {
        this.vista = vista;
        this.crud = new Crud_Habitacion();
        // Agregar el ActionListener A los botones
        Crud_Habitacion.CargarTablaHabitacion();
        this.vista.btn_guardar.addActionListener(this);
        this.vista.btn_actualizar.addActionListener(this);
        this.vista.btn_eliminar.addActionListener(this);
        this.vista.btn_buscar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
