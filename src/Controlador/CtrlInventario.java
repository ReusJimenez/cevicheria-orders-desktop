package Controlador;

import Modelo.CInventario;
import Modelo.CIngredientes;
import DAO.DAOInventarioImpl;
import Vista.FormInventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlInventario implements ActionListener {
    private CInventario mod;
    private DAOInventarioImpl modc;
    private FormInventario frm;

    public CtrlInventario(CInventario mod, CIngredientes cant_ingred, DAOInventarioImpl modc, FormInventario frm) {
        this.mod = mod;
        this.mod.cant = cant_ingred;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnRegistrar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Inventario");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnRegistrar) {
            mod.cant.setCantidad(Integer.parseInt(frm.txtCantidad.getText().trim()));
            mod.setFechaentrada(frm.txtFecha.getText());
            mod.setTipo(frm.cbTipo.getSelectedItem().toString());

            if (modc.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnModificar) {
            mod.setId(Integer.parseInt(frm.txtIdIngrediente.getText().trim()));
            mod.cant.setCantidad(Integer.parseInt(frm.txtCantidad.getText().trim()));
            mod.setFechaentrada(frm.txtFecha.getText());
            mod.setTipo(frm.cbTipo.getSelectedItem().toString());

            if (modc.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnEliminar) {
            mod.setId(Integer.parseInt(frm.txtIdIngrediente.getText().trim()));

            if (modc.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnBuscar) {
            mod.setTipo(frm.cbTipo.getSelectedItem().toString());

            if (modc.buscar(mod)) {
                frm.txtIdIngrediente.setText(String.valueOf(mod.getId()));
                frm.txtCantidad.setText(String.valueOf(mod.cant.getCantidad()));
                frm.txtFecha.setText(String.valueOf(mod.getFechaentrada()));
                frm.cbTipo.setSelectedItem(mod.getTipo());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        frm.txtIdIngrediente.setText("");
        frm.cbTipo.setSelectedIndex(0);
        frm.txtCantidad.setText("");
    }
}