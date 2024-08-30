package Controlador;

import Modelo.CBebidas;
import Modelo.CCliente;
import DAO.DAOBebidaImpl;
import Vista.FormBebida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlBebida implements ActionListener {
    private CCliente mod;
    private CBebidas mod1;
    private DAOBebidaImpl modc;
    private FormBebida frm;

    public CtrlBebida(CCliente mod, CBebidas mod1, DAOBebidaImpl modc, FormBebida frm) {
        this.mod = mod;
        this.mod.pedido2 = mod1;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnRegistrar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Bebidas");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnRegistrar) {
            mod.setNombre(frm.txtCliente.getText());
            mod.pedido2.setNombre(frm.txtNombre.getText());
            mod.pedido2.setTamanho(frm.txttamanho.getText());
            mod.pedido2.setCantidad(Integer.parseInt(frm.txtCantidad.getText().trim()));
            mod.pedido2.setPrecio(Double.parseDouble(frm.txtPrecio.getText().trim()));

            if (modc.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnModificar) {
            mod.pedido2.setId(Integer.parseInt(frm.txtIdBebidas.getText().trim()));
            mod.setNombre(frm.txtCliente.getText());
            mod.pedido2.setTamanho(frm.txttamanho.getText());
            mod.pedido2.setNombre(frm.txtNombre.getText());
            mod.pedido2.setCantidad(Integer.parseInt(frm.txtCantidad.getText().trim()));
            mod.pedido2.setPrecio(Double.parseDouble(frm.txtPrecio.getText().trim()));

            if (modc.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnEliminar) {
            mod.pedido.setId(Integer.parseInt(frm.txtIdBebidas.getText().trim()));

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
                frm.txtIdBebidas.setText(String.valueOf(mod.pedido2.getId()));
                frm.txtCliente.setText(mod.getNombre());
                frm.txttamanho.setText(mod.pedido2.getTamanho());
                frm.txtNombre.setText(mod.pedido2.getNombre());
                frm.txtCantidad.setText(String.valueOf(mod.pedido2.getCantidad()));
                frm.txtPrecio.setText(String.valueOf(mod.pedido2.getPrecio()));
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
        frm.cbLimonada.setSelectedIndex(0);
        frm.cbTe.setSelectedIndex(0);
        frm.txtNombre.setText("");
        frm.txttamanho.setText("");
        frm.txtPrecio.setText("");
        frm.txtCantidad.setText("");
        frm.cbChicha.setSelectedIndex(0);
        frm.cbTchicha.setSelectedIndex(0);
        frm.cbTlimonada.setSelectedIndex(0);
        frm.cbTte.setSelectedIndex(0);
    }
}