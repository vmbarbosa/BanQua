/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Controlador;
import Classes.Correo;
import Classes.Metodos;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import rsbuttom.RSButtonMetro;

/**
 *
 * @author danie
 */
public class RecuperarContraseña extends javax.swing.JFrame {

    public RecuperarContraseña() {
        initComponents();
    }

    public static String usuario = "";
    public static String nombre_profesor = "";
    int mouseX;
    int mouseY;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        IconMin = new javax.swing.JLabel();
        IconCerrar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Cedu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CC = new rsbuttom.RSButtonMetro();
        EC = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        CorreoCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UsuarioCo = new javax.swing.JTextField();
        UsuarioCe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 87, 116));
        jPanel2.setPreferredSize(new java.awt.Dimension(405, 35));
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
        jPanel2.add(IconMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 0, 30, 33));

        IconCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarBlanco.png"))); // NOI18N
        IconCerrar.setToolTipText("");
        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconCerrarMouseExited(evt);
            }
        });
        jPanel2.add(IconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 0, 31, 33));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 4, -1, 35));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 103, 142));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Opcion 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 295;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 35);
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("*Ingresa el nombre de usuario y cedula asociado a esta cuenta.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 35);
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IcoUser.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 20, 0, 0);
        jPanel1.add(jLabel12, gridBagConstraints);

        Cedu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Cedu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeduKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 35);
        jPanel1.add(Cedu, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icomoon_e65d(0)_32.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(jLabel13, gridBagConstraints);

        CC.setText("Cambiar Contraseña");
        CC.setColorHover(new java.awt.Color(101, 203, 255));
        CC.setColorNormal(new java.awt.Color(53, 188, 255));
        CC.setColorPressed(new java.awt.Color(0, 159, 239));
        CC.setFocusable(false);
        CC.setMaximumSize(new java.awt.Dimension(63, 17));
        CC.setMinimumSize(new java.awt.Dimension(63, 17));
        CC.setPreferredSize(new java.awt.Dimension(63, 17));
        CC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 12, 0);
        jPanel1.add(CC, gridBagConstraints);

        EC.setText("Enviar Correo");
        EC.setColorHover(new java.awt.Color(101, 203, 255));
        EC.setColorNormal(new java.awt.Color(53, 188, 255));
        EC.setColorPressed(new java.awt.Color(0, 159, 239));
        EC.setFocusable(false);
        EC.setMaximumSize(new java.awt.Dimension(63, 17));
        EC.setMinimumSize(new java.awt.Dimension(63, 17));
        EC.setPreferredSize(new java.awt.Dimension(63, 17));
        EC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        jPanel1.add(EC, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IcoUser.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        CorreoCampo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CorreoCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CorreoCampoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 35);
        jPanel1.add(CorreoCampo, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCorreo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Opcion 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 295;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 35);
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("su correo, es recomendable cambiarla desde el menu de Perfil.");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 35);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Ingresa el correo y nombre de usuario asociado a esta cuenta.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 35);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Recuperación de la contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 111;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 20, 0, 35);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Acontinuacion se le enviara una nueva contraseña provicional a");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 35);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("------------------------------------------ o -----------------------------------------");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 20, 0, 35);
        jPanel1.add(jLabel4, gridBagConstraints);

        UsuarioCo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UsuarioCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioCoActionPerformed(evt);
            }
        });
        UsuarioCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsuarioCoKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 35);
        jPanel1.add(UsuarioCo, gridBagConstraints);

        UsuarioCe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UsuarioCe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsuarioCeKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 35);
        jPanel1.add(UsuarioCe, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private String codigo;

    public String generarCodigo() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAletorio1 = aleatorio.nextInt(100) * 555;
        aleatorio.setSeed(System.currentTimeMillis());
        int intAletorio2 = aleatorio.nextInt(10000) * 333;
        aleatorio.setSeed(System.currentTimeMillis());
        return intAletorio1 + "codigo" + intAletorio2;
    }

    Correo co = new Correo();
    Metodos met = new Metodos();

    public boolean VerificarIdentidad() {
        String nombre2 = UsuarioCo.getText();
        if (!met.EncontrarNombre("Usuario.txt", nombre2).equals("")) {
            if (met.EncontrarCorreo("Usuario.txt", nombre2).equals(CorreoCampo.getText())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Correo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void enviarCorreo() {
        co.setContrasena("Daniel2018");
        co.setUsuarriodelCorreo("temporalpeach2018@gmail.com");
        co.setAsunto("Cambio de contraseña");
        co.setDestino(CorreoCampo.getText());
        codigo = generarCodigo();
        String Mensa = "Cuenta de Peach(Nombre Provisional)\n"
                + "Código para restablecer contraseña\n"
                + "Usa este código como una contraseña provisional de la cuenta Peach " + UsuarioCo.getText() + ", el cual te permitira acceder a tu cuenta\n"
                + "Este es tu código:";
        co.setMensaje(Mensa + codigo);
        co.setNombredelArchivo("");
        co.setRutadelArchivo("");

        Metodos met = new Metodos();
        ArrayList<String[]> registros = met.LeerArchivoDaniel("Usuario.txt");
        String nombre;
        String Total = "";
        for (int i = 0; i < registros.size(); i++) {
            nombre = registros.get(i)[2];
            if (nombre.equals(UsuarioCo.getText())) {
                if ((registros.get(i)[5]).equals(CorreoCampo.getText())) {
                    Total = Total + registros.get(i)[0] + "," + registros.get(i)[1] + "," + registros.get(i)[2] + "," + codigo + "," + registros.get(i)[4] + "," + registros.get(i)[5] + "\r\n";
                }
            } else {
                Total = Total + registros.get(i)[0] + "," + registros.get(i)[1] + "," + registros.get(i)[2] + "," + registros.get(i)[3] + "," + registros.get(i)[4] + "," + registros.get(i)[5] + "\r\n";
            }
        }
        File file = new File("Usuario.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(Total);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(RecuperarContraseña.class.getName()).log(Level.SEVERE, null, ex);
        }

        Controlador c = new Controlador();
        if (c.enviarCorreo(co)) {
            JOptionPane.showMessageDialog(null, "Se envio el correo", "ENVIADO", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            this.setVisible(false);
            InicioSeccion ini = new InicioSeccion();
            ini.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se envio el correo", "NO ENVIADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECActionPerformed
        String[] s = CorreoCampo.getText().split("@");
        if (s.length > 1) {
            if (VerificarIdentidad()) {
                enviarCorreo();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo validar la identida, vuelva a interlo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo de correo debe tenr como minimo un \"@\".", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ECActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void CCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCActionPerformed
        boolean Cedula = false;
        try {
            Integer.parseInt(Cedu.getText());
            Cedula = true;
        } catch (NumberFormatException exe) {
            Cedula = false;
            JOptionPane.showMessageDialog(this, "Cedula es solo un campo numerio", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if (Cedula == true) {
            String Contraseña = JOptionPane.showInputDialog(this, "Digite la nueva contraseña", "Cambio Contraseña", JOptionPane.INFORMATION_MESSAGE);
            if (Contraseña != null && !Contraseña.equals("")) {
                Metodos met = new Metodos();
                ArrayList<String[]> registros = met.LeerArchivoDaniel("Usuario.txt");
                String nombre;
                String Total = "";
                for (int i = 0; i < registros.size(); i++) {
                    nombre = registros.get(i)[2];
                    if (nombre.equals(UsuarioCe.getText())) {
                        if ((registros.get(i)[1]).equals(Cedu.getText())) {
                            Total = Total + registros.get(i)[0] + "," + registros.get(i)[1] + "," + registros.get(i)[2] + "," + codigo + "," + registros.get(i)[4] + "," + registros.get(i)[5] + "\r\n";
                        }
                    } else {
                        Total = Total + registros.get(i)[0] + "," + registros.get(i)[1] + "," + registros.get(i)[2] + "," + registros.get(i)[3] + "," + registros.get(i)[4] + "," + registros.get(i)[5] + "\r\n";
                    }
                }
                File file = new File("Usuario.txt");
                FileWriter fw = null;
                try {
                    fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(Total);
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(RecuperarContraseña.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No ha escrito una nueva contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_CCActionPerformed

    private void IconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseClicked
        dispose();
        this.setVisible(false);
        InicioSeccion ini = new InicioSeccion();
        ini.setVisible(true);
    }//GEN-LAST:event_IconCerrarMouseClicked

    private void IconMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMinMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_IconMinMouseClicked

    private void IconCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseExited
        File file = new File("src\\Imagenes\\CerrarBlanco.png");
        Image foto = getToolkit().getImage(String.valueOf(file));
        IconCerrar.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconCerrarMouseExited

    private void IconMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMinMouseEntered
        File file = new File("src\\Imagenes\\z.png");
        Image foto = getToolkit().getImage(String.valueOf(file));
        IconMin.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconMinMouseEntered

    private void IconMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconMinMouseExited
        File file = new File("src\\Imagenes\\MinBlanco.png");
        Image foto = getToolkit().getImage(String.valueOf(file));
        IconMin.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconMinMouseExited

    private void IconCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseEntered
        File file = new File("src\\Imagenes\\y.png");
        Image foto = getToolkit().getImage(String.valueOf(file));
        IconCerrar.setIcon(new ImageIcon(foto));
    }//GEN-LAST:event_IconCerrarMouseEntered

    private void UsuarioCeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioCeKeyReleased
        if (Cedu.getText().equals("")) {
            BloqDesBoton(CC, "...");
        } else {
            BloqDesBoton(CC, "");
        }
    }//GEN-LAST:event_UsuarioCeKeyReleased

    private void CeduKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeduKeyReleased
        if (UsuarioCe.getText().equals("")) {
            BloqDesBoton(CC, "...");
        } else {
            BloqDesBoton(CC, "");
        }
    }//GEN-LAST:event_CeduKeyReleased

    private void UsuarioCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioCoActionPerformed

    private void UsuarioCoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsuarioCoKeyReleased
        if (CorreoCampo.getText().equals("")) {
            BloqDesBoton(EC, "...");
        } else {
            BloqDesBoton(EC, "");
        }
    }//GEN-LAST:event_UsuarioCoKeyReleased

    private void CorreoCampoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoCampoKeyReleased
        if (UsuarioCo.getText().equals("")) {
            BloqDesBoton(EC, "...");
        } else {
            BloqDesBoton(EC, "");
        }
    }//GEN-LAST:event_CorreoCampoKeyReleased

    //Metodo de Principal
    public void BloqDesBoton(RSButtonMetro Boton, String Condicion) {// Pone los botones de color gris o azul dependiendo de la opcion de los JComboBox
        if ("...".equals(Condicion)) {
            Boton.setEnabled(false);
            Boton.setColorNormal(Color.lightGray);
            Boton.setColorPressed(Color.lightGray);
            Boton.setColorHover(Color.lightGray);
        } else {
            Boton.setEnabled(true);
            Boton.setColorHover(Color.decode("#01A5E4"));
            Boton.setColorNormal(Color.decode("#0180B0"));
            Boton.setColorPressed(Color.decode("#025F82"));
        }
    }

    public static void main(String[] args) {
        RecuperarContraseña ini = new RecuperarContraseña();
        ini.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro CC;
    private javax.swing.JTextField Cedu;
    private javax.swing.JTextField CorreoCampo;
    public rsbuttom.RSButtonMetro EC;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconMin;
    private javax.swing.JTextField UsuarioCe;
    private javax.swing.JTextField UsuarioCo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
