package tienda;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Venta");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MiTiendita = new javax.swing.JLabel();
        ivProducto1 = new javax.swing.JLabel();
        ivProducto2 = new javax.swing.JLabel();
        ivProducto3 = new javax.swing.JLabel();
        ivProducto4 = new javax.swing.JLabel();
        tAceiteVegetal = new javax.swing.JLabel();
        tLeche = new javax.swing.JLabel();
        tAtun = new javax.swing.JLabel();
        tCola = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        btSuma1 = new javax.swing.JButton();
        etCantidad1 = new javax.swing.JTextField();
        btResta1 = new javax.swing.JButton();
        btSuma2 = new javax.swing.JButton();
        etCantidad2 = new javax.swing.JTextField();
        btResta2 = new javax.swing.JButton();
        btSuma3 = new javax.swing.JButton();
        etCantidad3 = new javax.swing.JTextField();
        btResta3 = new javax.swing.JButton();
        btSuma4 = new javax.swing.JButton();
        etCantidad4 = new javax.swing.JTextField();
        btResta4 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JLabel();
        txtCantidad1 = new javax.swing.JLabel();
        txtCantidad2 = new javax.swing.JLabel();
        txtCantidad3 = new javax.swing.JLabel();
        btCleanVenta = new javax.swing.JButton();
        btPagar = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        ivProducto5 = new javax.swing.JLabel();
        ivProducto6 = new javax.swing.JLabel();
        ivProducto7 = new javax.swing.JLabel();
        ivProducto8 = new javax.swing.JLabel();
        tYerba = new javax.swing.JLabel();
        TCafe = new javax.swing.JLabel();
        tketchup = new javax.swing.JLabel();
        tmayonesa = new javax.swing.JLabel();
        precio5 = new javax.swing.JLabel();
        precio6 = new javax.swing.JLabel();
        precio7 = new javax.swing.JLabel();
        precio8 = new javax.swing.JLabel();
        txtCantidad4 = new javax.swing.JLabel();
        txtCantidad5 = new javax.swing.JLabel();
        txtCantidad6 = new javax.swing.JLabel();
        txtCantidad7 = new javax.swing.JLabel();
        btResta5 = new javax.swing.JButton();
        etCantidad5 = new javax.swing.JButton();
        btSuma5 = new javax.swing.JButton();
        btResta6 = new javax.swing.JButton();
        etCantidad6 = new javax.swing.JButton();
        btSuma6 = new javax.swing.JButton();
        btResta7 = new javax.swing.JButton();
        etCantidad7 = new javax.swing.JButton();
        btSuma7 = new javax.swing.JButton();
        btResta8 = new javax.swing.JButton();
        etCantidad8 = new javax.swing.JButton();
        btSuma8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiTiendita.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MiTiendita.setForeground(new java.awt.Color(255, 255, 51));
        MiTiendita.setText("TIENDA - STORE");
        getContentPane().add(MiTiendita, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        ivProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceite.jpg"))); // NOI18N
        getContentPane().add(ivProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 170));

        ivProducto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leche.jpg"))); // NOI18N
        getContentPane().add(ivProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 170, 170));

        ivProducto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pescado.jpg"))); // NOI18N
        getContentPane().add(ivProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 92, 170, 170));

        ivProducto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresco.jpg"))); // NOI18N
        getContentPane().add(ivProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 92, 170, 170));

        tAceiteVegetal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAceiteVegetal.setForeground(new java.awt.Color(255, 255, 255));
        tAceiteVegetal.setText("Aceite vegetal");
        getContentPane().add(tAceiteVegetal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        tLeche.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tLeche.setForeground(new java.awt.Color(255, 255, 255));
        tLeche.setText("Leche de vaca");
        getContentPane().add(tLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        tAtun.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tAtun.setForeground(new java.awt.Color(255, 255, 255));
        tAtun.setText("Atún en lata");
        getContentPane().add(tAtun, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        tCola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tCola.setForeground(new java.awt.Color(255, 255, 255));
        tCola.setText("Refresco en lata");
        getContentPane().add(tCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        precio1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 0));
        precio1.setText("13000");
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        precio2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 0));
        precio2.setText("9000");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 60, 20));

        precio3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 255, 0));
        precio3.setText("11500");
        getContentPane().add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        precio4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio4.setForeground(new java.awt.Color(255, 255, 0));
        precio4.setText("7000");
        getContentPane().add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        btSuma1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma1.setText("+");
        btSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma1ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 50, 30));

        etCantidad1.setEditable(false);
        etCantidad1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad1.setText("0");
        etCantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 50, 30));

        btResta1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta1.setText("-");
        btResta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta1ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 50, 30));

        btSuma2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma2.setText("+");
        btSuma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma2ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 50, 30));

        etCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad2.setText("0");
        etCantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad2ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 50, 30));

        btResta2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta2.setText("-");
        btResta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta2ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 50, 30));

        btSuma3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma3.setText("+");
        btSuma3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma3ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 50, 30));

        etCantidad3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad3.setText("0");
        getContentPane().add(etCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 50, 30));

        btResta3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta3.setText("-");
        btResta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta3ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 50, 30));

        btSuma4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSuma4.setText("+");
        btSuma4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma4ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 50, 30));

        etCantidad4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etCantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etCantidad4.setText("0");
        etCantidad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad4ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 50, 30));

        btResta4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btResta4.setText("-");
        btResta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta4ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 50, 30));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setText("Cantidad");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        txtCantidad1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad1.setText("Cantidad");
        getContentPane().add(txtCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        txtCantidad2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad2.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad2.setText("Cantidad");
        getContentPane().add(txtCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        txtCantidad3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad3.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad3.setText("Cantidad");
        getContentPane().add(txtCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        btCleanVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCleanVenta.setText("Cancelar compra");
        btCleanVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCleanVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btCleanVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 760, 170, 51));

        btPagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPagar.setText("Proceder al pago");
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 760, 170, 51));

        btCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCerrarSesion.setText("Cerrar sesión");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 170, 51));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store3}.jpg"))); // NOI18N
        fondo.setText("jLabel3");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 800, 500));

        ivProducto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yerba.jpg"))); // NOI18N
        ivProducto5.setText("jLabel4");
        getContentPane().add(ivProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 170, 170));

        ivProducto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cafe.jpg"))); // NOI18N
        ivProducto6.setText("jLabel1");
        getContentPane().add(ivProducto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 170, 170));

        ivProducto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ketchup.jpg"))); // NOI18N
        ivProducto7.setText("jLabel2");
        getContentPane().add(ivProducto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 170, 170));

        ivProducto8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mayonesa.jpg"))); // NOI18N
        ivProducto8.setText("jLabel1");
        getContentPane().add(ivProducto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 170, 170));

        tYerba.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tYerba.setForeground(new java.awt.Color(255, 255, 255));
        tYerba.setText("Yerba");
        getContentPane().add(tYerba, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, -1, -1));

        TCafe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TCafe.setForeground(new java.awt.Color(255, 255, 255));
        TCafe.setText("Café");
        getContentPane().add(TCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, -1));

        tketchup.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tketchup.setForeground(new java.awt.Color(255, 255, 255));
        tketchup.setText("Ketchup ");
        getContentPane().add(tketchup, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 130, 20));

        tmayonesa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tmayonesa.setForeground(new java.awt.Color(255, 255, 255));
        tmayonesa.setText("Mayonesa");
        getContentPane().add(tmayonesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 610, 130, 20));

        precio5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio5.setForeground(new java.awt.Color(255, 255, 0));
        precio5.setText("12000");
        getContentPane().add(precio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 100, -1));

        precio6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio6.setForeground(new java.awt.Color(255, 255, 0));
        precio6.setText("35000");
        getContentPane().add(precio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 100, -1));

        precio7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio7.setForeground(new java.awt.Color(255, 255, 0));
        precio7.setText("20000");
        getContentPane().add(precio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 110, -1));

        precio8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        precio8.setForeground(new java.awt.Color(255, 255, 0));
        precio8.setText("20000");
        getContentPane().add(precio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, 90, -1));

        txtCantidad4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad4.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad4.setText("Cantidad");
        getContentPane().add(txtCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 100, -1));

        txtCantidad5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad5.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad5.setText("Cantidad");
        getContentPane().add(txtCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, 100, -1));

        txtCantidad6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad6.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad6.setText("Cantidad");
        getContentPane().add(txtCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 670, 100, -1));

        txtCantidad7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad7.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad7.setText("Cantidad");
        getContentPane().add(txtCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 670, 100, -1));

        btResta5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btResta5.setText("-");
        btResta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta5ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, 60, 30));

        etCantidad5.setBackground(new java.awt.Color(70, 73, 75));
        etCantidad5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etCantidad5.setText("0");
        etCantidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad5ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 700, 50, 30));

        btSuma5.setText("+");
        btSuma5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma5ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, 50, 30));

        btResta6.setText("-");
        btResta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta6ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, 50, 30));

        etCantidad6.setBackground(new java.awt.Color(70, 73, 75));
        etCantidad6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etCantidad6.setText("0");
        getContentPane().add(etCantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 700, 50, 30));

        btSuma6.setText("+");
        btSuma6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma6ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 700, 50, 30));

        btResta7.setText("-");
        btResta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta7ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, 50, 30));

        etCantidad7.setBackground(new java.awt.Color(70, 73, 75));
        etCantidad7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etCantidad7.setText("0");
        getContentPane().add(etCantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 50, 30));

        btSuma7.setText("+");
        btSuma7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma7ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 700, 50, 30));

        btResta8.setText("-");
        btResta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResta8ActionPerformed(evt);
            }
        });
        getContentPane().add(btResta8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 700, 40, 30));

        etCantidad8.setBackground(new java.awt.Color(70, 73, 75));
        etCantidad8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etCantidad8.setText("0");
        etCantidad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etCantidad8ActionPerformed(evt);
            }
        });
        getContentPane().add(etCantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 700, 50, 30));

        btSuma8.setText("+");
        btSuma8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuma8ActionPerformed(evt);
            }
        });
        getContentPane().add(btSuma8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/store2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btResta1ActionPerformed

    private void btResta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btResta2ActionPerformed

    private void btResta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btResta3ActionPerformed

    private void btResta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btResta4ActionPerformed

    private void btSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma2ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad2.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad2.setText(resultado);
    }//GEN-LAST:event_btSuma2ActionPerformed

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        // TODO add your handling code here:
        
        String cantidad1= etCantidad1.getText();
        int c1 = Integer.parseInt(cantidad1);
        String cantidad2= etCantidad2.getText();
        int c2 = Integer.parseInt(cantidad2);
        String cantidad3= etCantidad3.getText();
        int c3 = Integer.parseInt(cantidad3);
        String cantidad4= etCantidad4.getText();
        int c4 = Integer.parseInt(cantidad4);
        String cantidad5= etCantidad5.getText();
        int c5 = Integer.parseInt(cantidad5);
        String cantidad6= etCantidad6.getText();
        int c6 = Integer.parseInt(cantidad6);
        String cantidad7= etCantidad7.getText();
        int c7 = Integer.parseInt(cantidad7);
        String cantidad8= etCantidad8.getText();
        int c8 = Integer.parseInt(cantidad8);
        
        if(c1==0 && c2==0 && c3==0 && c4==0 && c5==0 && c6==0 && c7==0 && c8==0){
            JOptionPane.showMessageDialog(null, "No hay articulos para pagar");
        }else{
            if(c1<0|| c2<0 || c3<0 || c4<0 || c5<0 || c6<0 || c7<0 || c8<0){
            JOptionPane.showMessageDialog(null, "NO PUEDES INGRESAR CANTIDADES NEGATIVAS");
            }else{
                this.setVisible(false);
                Detalle ventana3 = new Detalle();
        
                ventana3.cantidades(cantidad1, cantidad2, cantidad3, cantidad4);
                ventana3.setVisible(true);
            }
        
        
        }
        
        
        
    }//GEN-LAST:event_btPagarActionPerformed
    
    private void btSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma1ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad1.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad1.setText(resultado);
    }//GEN-LAST:event_btSuma1ActionPerformed

    private void btSuma3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma3ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad3.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad3.setText(resultado);
    }//GEN-LAST:event_btSuma3ActionPerformed

    private void btSuma4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma4ActionPerformed
        // TODO add your handling code here:
        Integer cantidad = Integer.parseInt(etCantidad4.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad4.setText(resultado);
    }//GEN-LAST:event_btSuma4ActionPerformed

    private void etCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad1ActionPerformed

    
    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        // TODO add your handling code here:
        Login ventana1 = new Login();
        this.setVisible(false);
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btCleanVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanVentaActionPerformed
        // TODO add your handling code here:
        etCantidad1.setText("0");
        etCantidad2.setText("0");
        etCantidad3.setText("0");
        etCantidad4.setText("0");
        etCantidad4.setText("0");
    }//GEN-LAST:event_btCleanVentaActionPerformed

    private void etCantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad2ActionPerformed

    private void btSuma5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma5ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad5.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad5.setText(resultado);
    }//GEN-LAST:event_btSuma5ActionPerformed

    private void etCantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad5ActionPerformed

    private void btSuma7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma7ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad7.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad7.setText(resultado);
    }//GEN-LAST:event_btSuma7ActionPerformed

    private void btResta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta6ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad6.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad6.setText(resultado);
    }//GEN-LAST:event_btResta6ActionPerformed

    private void etCantidad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad8ActionPerformed

    private void btResta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta5ActionPerformed
 Integer cantidad = Integer.parseInt(etCantidad5.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad5.setText(resultado);        
    }//GEN-LAST:event_btResta5ActionPerformed

    private void btResta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta7ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad7.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad7.setText(resultado);
    }//GEN-LAST:event_btResta7ActionPerformed

    private void btResta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResta8ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad8.getText());
        
        String resultado = String.valueOf(resta(cantidad));
       
        etCantidad8.setText(resultado);
    }//GEN-LAST:event_btResta8ActionPerformed

    private void etCantidad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etCantidad4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etCantidad4ActionPerformed

    private void btSuma6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma6ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad6.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad6.setText(resultado);
    }//GEN-LAST:event_btSuma6ActionPerformed

    private void btSuma8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuma8ActionPerformed
        // TODO add your handling code here:
         Integer cantidad = Integer.parseInt(etCantidad8.getText());
        
        String resultado = String.valueOf(suma(cantidad));
       
        etCantidad8.setText(resultado);
    }//GEN-LAST:event_btSuma8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    private int suma(int cantidad){
        cantidad = cantidad +1;        
        return cantidad;
    }
    private int resta(int cantidad){
        if(cantidad>0){
            cantidad = cantidad -1;
        }
        return cantidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MiTiendita;
    private javax.swing.JLabel TCafe;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btCleanVenta;
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btResta1;
    private javax.swing.JButton btResta2;
    private javax.swing.JButton btResta3;
    private javax.swing.JButton btResta4;
    private javax.swing.JButton btResta5;
    private javax.swing.JButton btResta6;
    private javax.swing.JButton btResta7;
    private javax.swing.JButton btResta8;
    private javax.swing.JButton btSuma1;
    private javax.swing.JButton btSuma2;
    private javax.swing.JButton btSuma3;
    private javax.swing.JButton btSuma4;
    private javax.swing.JButton btSuma5;
    private javax.swing.JButton btSuma6;
    private javax.swing.JButton btSuma7;
    private javax.swing.JButton btSuma8;
    private javax.swing.JTextField etCantidad1;
    private javax.swing.JTextField etCantidad2;
    private javax.swing.JTextField etCantidad3;
    private javax.swing.JTextField etCantidad4;
    private javax.swing.JButton etCantidad5;
    private javax.swing.JButton etCantidad6;
    private javax.swing.JButton etCantidad7;
    private javax.swing.JButton etCantidad8;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel ivProducto1;
    private javax.swing.JLabel ivProducto2;
    private javax.swing.JLabel ivProducto3;
    private javax.swing.JLabel ivProducto4;
    private javax.swing.JLabel ivProducto5;
    private javax.swing.JLabel ivProducto6;
    private javax.swing.JLabel ivProducto7;
    private javax.swing.JLabel ivProducto8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    private javax.swing.JLabel precio5;
    private javax.swing.JLabel precio6;
    private javax.swing.JLabel precio7;
    private javax.swing.JLabel precio8;
    private javax.swing.JLabel tAceiteVegetal;
    private javax.swing.JLabel tAtun;
    private javax.swing.JLabel tCola;
    private javax.swing.JLabel tLeche;
    private javax.swing.JLabel tYerba;
    private javax.swing.JLabel tketchup;
    private javax.swing.JLabel tmayonesa;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtCantidad1;
    private javax.swing.JLabel txtCantidad2;
    private javax.swing.JLabel txtCantidad3;
    private javax.swing.JLabel txtCantidad4;
    private javax.swing.JLabel txtCantidad5;
    private javax.swing.JLabel txtCantidad6;
    private javax.swing.JLabel txtCantidad7;
    // End of variables declaration//GEN-END:variables
}
