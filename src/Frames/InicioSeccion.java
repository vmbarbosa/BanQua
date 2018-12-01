/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.Controlador;
import Classes.Correo;
import Classes.Metodos;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author danie
 */
public class InicioSeccion extends javax.swing.JFrame {

    public InicioSeccion() {
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
        IconCerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        ButtonRecuperarContraseña = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        BottonRegistro = new rsbuttom.RSButtonMetro();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        jPanel2.setLayout(new java.awt.BorderLayout());

        IconCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cruz.png"))); // NOI18N
        IconCerrar.setToolTipText("");
        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(IconCerrar, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 103, 142));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        rSButtonMetro1.setBackground(new java.awt.Color(23, 158, 224));
        rSButtonMetro1.setText("Ingresar");
        rSButtonMetro1.setColorHover(new java.awt.Color(128, 188, 255));
        rSButtonMetro1.setColorNormal(new java.awt.Color(23, 158, 224));
        rSButtonMetro1.setColorPressed(new java.awt.Color(128, 140, 207));
        rSButtonMetro1.setMaximumSize(new java.awt.Dimension(63, 17));
        rSButtonMetro1.setMinimumSize(new java.awt.Dimension(63, 17));
        rSButtonMetro1.setPreferredSize(new java.awt.Dimension(63, 17));
        rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMetro1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel1.add(rSButtonMetro1, gridBagConstraints);

        ButtonRecuperarContraseña.setText(" Recuperar Contraseña");
        ButtonRecuperarContraseña.setColorHover(new java.awt.Color(0, 121, 167));
        ButtonRecuperarContraseña.setColorNormal(new java.awt.Color(0, 103, 142));
        ButtonRecuperarContraseña.setColorPressed(new java.awt.Color(0, 94, 130));
        ButtonRecuperarContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonRecuperarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonRecuperarContraseña.setPreferredSize(new java.awt.Dimension(141, 17));
        ButtonRecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRecuperarContraseñaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 42, 0);
        jPanel1.add(ButtonRecuperarContraseña, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IcoUser.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 25);
        jPanel1.add(Usuario, gridBagConstraints);

        Password.setMaximumSize(new java.awt.Dimension(8, 20));
        Password.setMinimumSize(new java.awt.Dimension(8, 20));
        Password.setPreferredSize(new java.awt.Dimension(8, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 312;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 0, 0, 25);
        jPanel1.add(Password, gridBagConstraints);

        BottonRegistro.setBackground(new java.awt.Color(23, 158, 224));
        BottonRegistro.setText("Registrar");
        BottonRegistro.setColorHover(new java.awt.Color(128, 188, 255));
        BottonRegistro.setColorNormal(new java.awt.Color(23, 158, 224));
        BottonRegistro.setColorPressed(new java.awt.Color(128, 140, 207));
        BottonRegistro.setPreferredSize(new java.awt.Dimension(63, 17));
        BottonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonRegistroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 25);
        jPanel1.add(BottonRegistro, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prin.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipady = -36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IcoContra.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private String codigo = generarCodigo();

    public String generarCodigo() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAletorio1 = aleatorio.nextInt(100) * 555;
        aleatorio.setSeed(System.currentTimeMillis());
        int intAletorio2 = aleatorio.nextInt(10000) * 333;
        aleatorio.setSeed(System.currentTimeMillis());
        return intAletorio1 + "codigo" + intAletorio2;
    }

    Correo co = new Correo();

    public void enviarCorreo() {
        co.setContrasena("Daniel2018");
        co.setUsuarriodelCorreo("temporalpeach2018@gmail.com");
        co.setAsunto("Cambio de contraseña");
        co.setDestino(JOptionPane.showInputDialog("Escriba el correo donde desea resivir el codigo"));
        co.setMensaje(codigo);
        co.setNombredelArchivo("");
        co.setRutadelArchivo("");

        Controlador c = new Controlador();
        if (c.enviarCorreo(co)) {
            JOptionPane.showMessageDialog(null, "Se envio el correo", "ENVIADO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se envio el correo", "NO ENVIADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
        Metodos met = new Metodos();
        String direUsu = "Usuario.txt";
        if (met.EncontrarUsuario(direUsu, Usuario.getText(), Password.getText(), 2)) {
            usuario = Usuario.getText();
            nombre_profesor = met.EncontrarNombre(direUsu, usuario);
            Principal prin = new Principal();
            prin.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "INGRESO ERRONEO", "VERIFICAR PASWORD O NICKNAME", JOptionPane.ERROR_MESSAGE);
        }
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
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void BottonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonRegistroActionPerformed
        Registrarse r = new Registrarse();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BottonRegistroActionPerformed

    private void ButtonRecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRecuperarContraseñaActionPerformed
        enviarCorreo();
    }//GEN-LAST:event_ButtonRecuperarContraseñaActionPerformed

    private void IconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconCerrarMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    public static void main(String[] args) {
        InicioSeccion ini = new InicioSeccion();
        ini.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro BottonRegistro;
    private rsbuttom.RSButtonMetro ButtonRecuperarContraseña;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
