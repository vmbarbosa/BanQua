/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Classes.Metodos;
import static Frames.InicioSeccion.usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author danie
 */
public class Registrarse extends javax.swing.JFrame {

    InicioSeccion inicio = new InicioSeccion();
    Metodos met = new Metodos();
    String rutaImagen = "";
    int mouseX;
    int mouseY;

    public Registrarse() {
        initComponents();

        jLabel8.setForeground(Color.decode("#00678e"));
        jLabel7.setForeground(Color.decode("#00678e"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        IconCerrar = new javax.swing.JLabel();
        IconCerrar1 = new javax.swing.JLabel();
        IconMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JTextField();
        Cedula1 = new javax.swing.JTextField();
        Usuario1 = new javax.swing.JTextField();
        Contra = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BottonRegistrar = new rsbuttom.RSButtonMetro();
        VerificarContra1 = new javax.swing.JPasswordField();
        BottonIngresarFoto = new rsbuttom.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();
        Foto1 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "NickName", "Pasword", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jFrame1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 87, 116));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconCerrar.setToolTipText("");
        IconCerrar.setPreferredSize(new java.awt.Dimension(42, 35));
        jPanel2.add(IconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        IconCerrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarBlanco.png"))); // NOI18N
        IconCerrar1.setToolTipText("");
        IconCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconCerrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconCerrar1MouseExited(evt);
            }
        });
        jPanel2.add(IconCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 31, 33));

        IconMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MinBlanco.png"))); // NOI18N
        IconMin.setToolTipText("");
        IconMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconMinMouseExited(evt);
            }
        });
        jPanel2.add(IconMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 33));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 103, 142));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 40, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 40, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 40, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 40, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Verificar contraseña: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 40, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        Nombre1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 2, 0, 31);
        jPanel1.add(Nombre1, gridBagConstraints);

        Cedula1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cedula1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cedula1KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 2, 0, 31);
        jPanel1.add(Cedula1, gridBagConstraints);

        Usuario1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 2, 0, 31);
        jPanel1.add(Usuario1, gridBagConstraints);

        Contra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 2, 0, 31);
        jPanel1.add(Contra, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Las contraseñas no son iguales.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 2, 0, 31);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("La Cedula es solo numerica.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 0, 31);
        jPanel1.add(jLabel8, gridBagConstraints);

        BottonRegistrar.setText("Registrar");
        BottonRegistrar.setColorHover(new java.awt.Color(101, 203, 255));
        BottonRegistrar.setColorNormal(new java.awt.Color(53, 188, 255));
        BottonRegistrar.setColorPressed(new java.awt.Color(0, 159, 239));
        BottonRegistrar.setFocusable(false);
        BottonRegistrar.setMaximumSize(new java.awt.Dimension(180, 30));
        BottonRegistrar.setMinimumSize(new java.awt.Dimension(180, 30));
        BottonRegistrar.setPreferredSize(new java.awt.Dimension(180, 30));
        BottonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 2, 20, 0);
        jPanel1.add(BottonRegistrar, gridBagConstraints);

        VerificarContra1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VerificarContra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VerificarContra1KeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 0, 31);
        jPanel1.add(VerificarContra1, gridBagConstraints);

        BottonIngresarFoto.setText("Ingresar foto de perfil");
        BottonIngresarFoto.setColorHover(new java.awt.Color(101, 203, 255));
        BottonIngresarFoto.setColorNormal(new java.awt.Color(53, 188, 255));
        BottonIngresarFoto.setColorPressed(new java.awt.Color(0, 159, 239));
        BottonIngresarFoto.setFocusable(false);
        BottonIngresarFoto.setMaximumSize(new java.awt.Dimension(180, 31));
        BottonIngresarFoto.setMinimumSize(new java.awt.Dimension(180, 31));
        BottonIngresarFoto.setPreferredSize(new java.awt.Dimension(180, 30));
        BottonIngresarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonIngresarFotoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 10, 0, 0);
        jPanel1.add(BottonIngresarFoto, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(23, 158, 224));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Perfil Blanco.png"))); // NOI18N
        Foto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel3.add(Foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 200));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        Correo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CorreoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 194;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 2, 0, 31);
        jPanel1.add(Correo, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Correo debe tener un \"@\".");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 2, 0, 31);
        jPanel1.add(jLabel9, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BottonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonRegistrarActionPerformed

        if (met.confNum(this.Cedula1.getText())) {
            if (Contra.getText().equals(VerificarContra1.getText())) {
                String foto2 = "";
                if (!this.rutaImagen.equals("")) {
                    foto2 = this.rutaImagen;
                } else {
                    foto2 = "|¬¬|";
                }
                String Nombre2 = this.Nombre1.getText();
                String Cedula2 = this.Cedula1.getText();
                String NickName2 = this.Usuario1.getText();
                String Pasword2 = this.Contra.getText();
                String Correo2 = this.Correo.getText();
                File Usu = new File("C:\\ProgramData\\BanQua\\Usuario.txt");
                if (!Usu.exists()) {
                    try {
                        Usu.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Metodos met = new Metodos();
                String x = "C:\\ProgramData\\BanQua\\Usuario.txt";
                String temp;
                try {
                    temp = met.concatenar(x);
                    met.guardar(temp, x, Nombre2 + "%%%%%" + Cedula2 + "%%%%%" + NickName2 + "%%%%%" + Pasword2 + "%%%%%" + foto2 + "%%%%%" + Correo2);
                } catch (IOException ex) {
                    Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
                Nombre1.setText("");
                Cedula1.setText("");
                Usuario1.setText("");
                Contra.setText("");
                VerificarContra1.setText("");
                Correo.setText("");
                JOptionPane.showMessageDialog(this, "Registro Exitoso.", "Notificacion.", JOptionPane.INFORMATION_MESSAGE);
                inicio.setVisible(true);
                File Pro = new File("C:\\ProgramData\\BanQua\\Profesor");
                if (!Pro.exists()) {
                    Pro.mkdirs();
                }
                File f = new File("C:\\ProgramData\\BanQua\\Profesor/" + NickName2);
                f.mkdir();
                File F = new File("C:\\ProgramData\\BanQua\\Profesor/" + NickName2 + "/Asignatura.txt");
                try {
                    F.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                Nombre1.setText("");
                Cedula1.setText("");
                Usuario1.setText("");
                Contra.setText("");
                VerificarContra1.setText("");
                JOptionPane.showMessageDialog(this, "Contraseñas Diferentes.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Cedula1.setText("");
            JOptionPane.showMessageDialog(this, "Campo de cedula es numerico.", "Error!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_BottonRegistrarActionPerformed

    private void BottonIngresarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonIngresarFotoActionPerformed
        JFileChooser archivo = new JFileChooser();
        archivo.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG,PNG", "jpg", "png");
        archivo.setFileFilter(filtroImagen);
        archivo.setDialogTitle("Buscar Imagen");
        File ruta = new File("C:\\Users\\elspo\\Downloads");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File file = archivo.getSelectedFile();
            this.rutaImagen = String.valueOf(file);
            Image foto = getToolkit().getImage(this.rutaImagen);
            foto = foto.getScaledInstance(Foto1.getWidth(), Foto1.getHeight(), Image.SCALE_DEFAULT);
            Foto1.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_BottonIngresarFotoActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void VerificarContra1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VerificarContra1KeyReleased
        if (this.Contra.getText().equals(this.VerificarContra1.getText())) {
            this.jLabel7.setForeground(Color.decode("#00678e"));
        } else {
            this.jLabel7.setForeground(Color.decode("#FFCC00"));
        }
    }//GEN-LAST:event_VerificarContra1KeyReleased

    private void Cedula1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cedula1KeyReleased
        if (met.confNum(this.Cedula1.getText())) {
            this.jLabel8.setForeground(Color.decode("#00678e"));
        } else {
            this.jLabel8.setForeground(Color.decode("#FFCC00"));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Cedula1KeyReleased

    private void IconCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrar1MouseClicked
        dispose();
        this.setVisible(false);
        InicioSeccion ini = new InicioSeccion();
        ini.setVisible(true);
    }//GEN-LAST:event_IconCerrar1MouseClicked

    private void IconCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrar1MouseEntered
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL resource = classLoader.getResource("Imagenes/y.png");
        IconCerrar1.setIcon(new ImageIcon(resource));
    }//GEN-LAST:event_IconCerrar1MouseEntered

    private void IconCerrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrar1MouseExited
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL foto = classLoader.getResource("Imagenes/CerrarBlanco.png");
        IconCerrar1.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconCerrar1MouseExited

    private void IconMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_IconMinMouseClicked

    private void IconMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMinMouseEntered
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL foto = classLoader.getResource("Imagenes/z.png");
        IconMin.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconMinMouseEntered

    private void IconMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMinMouseExited
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL foto = classLoader.getResource("Imagenes/MinBlanco.png");
        IconMin.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconMinMouseExited

    private void CorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyReleased
        String[] x = Correo.getText().split("@");
        if (x.length != 1) {
            this.jLabel9.setForeground(Color.decode("#00678e"));
        } else {
            this.jLabel9.setForeground(Color.decode("#FFCC00"));
        }
    }//GEN-LAST:event_CorreoKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL foto = classLoader.getResource("Imagenes/Libro.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(foto));        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro BottonIngresarFoto;
    private rsbuttom.RSButtonMetro BottonRegistrar;
    private javax.swing.JTextField Cedula1;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel Foto1;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconCerrar1;
    private javax.swing.JLabel IconMin;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Usuario1;
    private javax.swing.JPasswordField VerificarContra1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
