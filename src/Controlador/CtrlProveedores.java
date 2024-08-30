package Controlador;

import Modelo.CProveedor;
import Modelo.CIngredientes;
import DAO.DAOProveedoresImpl;
import Vista.FormProveedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlProveedores implements ActionListener {
    private CProveedor mod;
    private DAOProveedoresImpl modc;
    private FormProveedores frm;

    public CtrlProveedores(CProveedor mod, CIngredientes ingred, DAOProveedoresImpl modc, FormProveedores frm) {
        this.mod = mod;
        this.mod.ingr = ingred;
        this.modc = modc;
        this.frm = frm;
        this.frm.btnRegistrar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Proveedores");
        frm.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnRegistrar) {
            mod.setNombre(frm.txtNombre.getText());
            mod.setTelefono(Integer.parseInt(frm.txtTelefono.getText().trim()));
            mod.ingr.setTipo(frm.cbTipo.getSelectedItem().toString());

            if (modc.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnModificar) {
            mod.setId(Integer.parseInt(frm.txtIdProveedor.getText().trim()));
            mod.setNombre(frm.txtNombre.getText());
            mod.setTelefono(Integer.parseInt(frm.txtTelefono.getText().trim()));
            mod.ingr.setTipo(frm.cbTipo.getSelectedItem().toString());

            if (modc.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnEliminar) {
            mod.setId(Integer.parseInt(frm.txtIdProveedor.getText().trim()));

            if (modc.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnBuscar) {
            mod.setNombre(frm.txtNombre.getText());

            if (modc.buscar(mod)) {
                frm.txtIdProveedor.setText(String.valueOf(mod.getId()));
                frm.txtTelefono.setText(String.valueOf(mod.getTelefono()));
                frm.cbTipo.setSelectedItem(mod.ingr.getTipo());
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
        frm.txtIdProveedor.setText("");
        frm.txtNombre.setText("");
        frm.txtTelefono.setText("");
        frm.cbTipo.setSelectedIndex(0);
    }
}