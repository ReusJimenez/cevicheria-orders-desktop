package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class FormBebida extends javax.swing.JFrame {

    DefaultTableModel dtmBebida = new DefaultTableModel();

    public FormBebida() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void mostrar(String tabla) {
        String sql = "select * from " + tabla;
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getConexion();
        String[] cabecera = new String[]{"ID", "Cliente", "Bebida", "Tamanho", "Cantidad", "Precio"};
        dtmBebida.setColumnIdentifiers(cabecera);
        tblBebida.setModel(dtmBebida);
        String[] datos = new String[6];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                dtmBebida.addRow(datos);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbChicha = new javax.swing.JComboBox<>();
        cbTchicha = new javax.swing.JComboBox<>();
        btnCChicha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbTlimonada = new javax.swing.JComboBox<>();
        cbLimonada = new javax.swing.JComboBox<>();
        btnCLimonada = new javax.swing.JButton();
        btnCTe = new javax.swing.JButton();
        cbTte = new javax.swing.JComboBox<>();
        cbTe = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txttamanho = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtIdBebidas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBebida = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/te.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 170, 183));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limonada.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 160, 180));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Chicha.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 200));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Chicha Morada");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 190, -1, -1));

        cbChicha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cbChicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        cbTchicha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Pequenho", "Mediano", "Grande" }));
        jPanel1.add(cbTchicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 100, -1));

        btnCChicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btnCChicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCChichaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCChicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 110, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Chicha Morada"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 38));

        cbTlimonada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Pequenho", "Mediano", "Grande" }));
        jPanel1.add(cbTlimonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        cbLimonada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cbLimonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        btnCLimonada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btnCLimonada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLimonadaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCLimonada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, -1));

        btnCTe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btnCTe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTeActionPerformed(evt);
            }
        });
        jPanel1.add(btnCTe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 110, 100));

        cbTte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Pequenho", "Mediano", "Grande" }));
        jPanel1.add(cbTte, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        cbTe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cbTe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Té");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 32, 35));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Limonada"); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 38));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 720));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 720));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 720));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel12.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(0, 0, 0));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel12.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel32.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(0, 0, 0));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel36.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel32.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 380, 10));

        jPanel12.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 390, 10));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 390, 10));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Tamaño:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Cantidad:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setText("COMPRA:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Cantidad:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Tamaño:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("COMPRA:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Cantidad:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Tamaño:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 0, 0));
        jLabel29.setText("COMPRA:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 380, 10));

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 380, 10));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 400, 670));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login_logoCevicheria.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 120, 130));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CEVICHERÍA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 248, 57));

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("\"AIDÉ\"");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 248, -1));

        jPanel3.setBackground(new java.awt.Color(62, 156, 156));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Bebida:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, -1));

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Cantidad:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, -1));

        txtCantidad.setEditable(false);
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 170, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Precio:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, -1));

        txtPrecio.setEditable(false);
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 100, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("Tamaño:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, -1));

        txttamanho.setEditable(false);
        txttamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttamanhoActionPerformed(evt);
            }
        });
        jPanel3.add(txttamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 170, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 100, -1));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 110, -1));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 100, -1));

        txtIdBebidas.setEditable(false);
        jPanel3.add(txtIdBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setText("ID:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 90, -1));

        btnAtras.setBackground(new java.awt.Color(0, 0, 102));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRÁS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 100, 40));

        tblBebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBebida);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 340, 230));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setText("Cliente:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jPanel41.setBackground(new java.awt.Color(0, 0, 0));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 660, 430, 10));

        btnMostrar.setBackground(new java.awt.Color(0, 0, 0));
        btnMostrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 110, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 380, 670));

        jPanel4.setBackground(new java.awt.Color(62, 156, 156));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(0, 0, 0));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 100));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 100));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 100));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 100));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 380, 10));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 10));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 10));

        jLabel17.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("BEBIDAS");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 400, 100));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 770));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 10));

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 240, 10));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-marino.jpg"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 760));

        jPanel23.setBackground(new java.awt.Color(0, 0, 0));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 380, 10));

        jPanel2.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 430, 10));

        jPanel25.setBackground(new java.awt.Color(0, 0, 0));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 370, 10));

        jPanel2.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 420, 10));

        jPanel31.setBackground(new java.awt.Color(0, 0, 0));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 10, 770));

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel1.setText("REGISTROS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
        getContentPane().add(jProgressBar2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txttamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttamanhoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        InicioComidaBebida inic = new InicioComidaBebida();
        inic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCChichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCChichaActionPerformed
        txtNombre.setText("Chicha");
        if (cbTchicha.getSelectedItem().toString().compareTo("Pequenho") == 0) {
            txtPrecio.setText("2");
        } else {
            if (cbTchicha.getSelectedItem().toString().compareTo("Mediano") == 0) {
                txtPrecio.setText("3");
            } else {
                txtPrecio.setText("4");
            }
        }
        txtCantidad.setText(cbChicha.getSelectedItem().toString());
        txttamanho.setText(cbTchicha.getSelectedItem().toString());
    }//GEN-LAST:event_btnCChichaActionPerformed

    private void btnCLimonadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLimonadaActionPerformed
        txtNombre.setText("Limonada");
        if (cbTlimonada.getSelectedItem().toString().compareTo("Pequenho") == 0) {
            txtPrecio.setText("1");
        } else {
            if (cbTlimonada.getSelectedItem().toString().compareTo("Mediano") == 0) {
                txtPrecio.setText("2");
            } else {
                txtPrecio.setText("3");
            }
        }
        txtCantidad.setText(cbLimonada.getSelectedItem().toString());
        txttamanho.setText(cbTlimonada.getSelectedItem().toString());
    }//GEN-LAST:event_btnCLimonadaActionPerformed

    private void btnCTeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTeActionPerformed
        txtNombre.setText("Te");
        if (cbTte.getSelectedItem().toString().compareTo("Pequenho") == 0) {
            txtPrecio.setText("1");
        } else {
            if (cbTte.getSelectedItem().toString().compareTo("Mediano") == 0) {
                txtPrecio.setText("2");
            } else {
                txtPrecio.setText("3");
            }
        }
        txtCantidad.setText(cbTe.getSelectedItem().toString());
        txttamanho.setText(cbTte.getSelectedItem().toString());
    }//GEN-LAST:event_btnCTeActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        mostrar("bebidaxcliente");
    }//GEN-LAST:event_btnMostrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    public javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCChicha;
    private javax.swing.JButton btnCLimonada;
    private javax.swing.JButton btnCTe;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnMostrar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbChicha;
    public javax.swing.JComboBox<String> cbLimonada;
    public javax.swing.JComboBox<String> cbTchicha;
    public javax.swing.JComboBox<String> cbTe;
    public javax.swing.JComboBox<String> cbTlimonada;
    public javax.swing.JComboBox<String> cbTte;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBebida;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtIdBebidas;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txttamanho;
    // End of variables declaration//GEN-END:variables
}