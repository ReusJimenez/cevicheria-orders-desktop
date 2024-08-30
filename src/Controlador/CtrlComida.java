package Controlador;

import Modelo.CComidas;
import Modelo.CCliente;
import DAO.DAOComidaImpl;
import Vista.FormComida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlComida implements ActionListener {
    private CCliente mod;
    private CComidas mod1;
    private DAOComidaImpl modc;
    private FormComida frm;

    public CtrlComida(CCliente mod, CComidas mod1, DAOComidaImpl modc, FormComida frm) {
        this.mod = mod;
        this.mod.pedido = mod1;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnRegistrar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Comidas");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnRegistrar) {
            mod.setNombre(frm.txtCliente.getText());
            mod.pedido.setNombre(frm.txtNombre.getText());
            mod.pedido.setCantidad(Integer.parseInt(frm.txtCantidad.getText().trim()));
            mod.pedido.setPrecio(Double.parseDouble(frm.txtPrecio.getText().trim()));

            if (modc.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnModificar) {
            mod.pedido.setId(Integer.parseInt(frm.txtIdComidas.getText().trim()));
            mod.setNombre(frm.txtCliente.getText());
            mod.pedido.setNombre(frm.txtNombre.getText());
            mod.pedido.setCantidad(Integer.parseInt(frm.txtCantidad.getText().trim()));
            mod.pedido.setPrecio(Double.parseDouble(frm.txtPrecio.getText().trim()));

            if (modc.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnEliminar) {
            mod.pedido.setId(Integer.parseInt(frm.txtIdComidas.getText().trim()));

            if (modc.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnBuscar) {
            mod.setNombre(frm.txtCliente.getText());

            if (modc.buscar(mod)) {
                frm.txtIdComidas.setText(String.valueOf(mod.pedido.getId()));
                frm.txtCliente.setText(mod.getNombre());
                frm.txtNombre.setText(mod.pedido.getNombre());
                frm.txtCantidad.setText(String.valueOf(mod.pedido.getCantidad()));
                frm.txtPrecio.setText(String.valueOf(mod.pedido.getPrecio()));
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
        frm.cbCeviche.setSelectedIndex(0);
        frm.cbCevichito.setSelectedIndex(0);
        frm.txtNombre.setText("");
        frm.txtPrecio.setText("");
        frm.txtCantidad.setText("");
        frm.cbChanfainita.setSelectedIndex(0);
        frm.cbJalea.setSelectedIndex(0);
    }
}