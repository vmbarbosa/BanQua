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
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
    public static String Correo = "";
    int mouseX;
    int mouseY;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        IconCerrar = new javax.swing.JLabel();
        IconMin = new javax.swing.JLabel();
        IconCerrar1 = new javax.swing.JLabel();
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
        jPanel2.add(IconCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 35));

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
        jPanel2.add(IconCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 0, 31, 33));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 103, 142));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        rSButtonMetro1.setText("Ingresar");
        rSButtonMetro1.setColorHover(new java.awt.Color(101, 203, 255));
        rSButtonMetro1.setColorNormal(new java.awt.Color(53, 188, 255));
        rSButtonMetro1.setColorPressed(new java.awt.Color(0, 159, 239));
        rSButtonMetro1.setFocusPainted(false);
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
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel1.add(rSButtonMetro1, gridBagConstraints);

        ButtonRecuperarContraseña.setText(" Recuperar Contraseña");
        ButtonRecuperarContraseña.setColorHover(new java.awt.Color(0, 121, 167));
        ButtonRecuperarContraseña.setColorNormal(new java.awt.Color(0, 103, 142));
        ButtonRecuperarContraseña.setColorPressed(new java.awt.Color(0, 94, 130));
        ButtonRecuperarContraseña.setFocusable(false);
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
        gridBagConstraints.insets = new java.awt.Insets(19, 30, 42, 0);
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

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 25);
        jPanel1.add(Usuario, gridBagConstraints);

        Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password.setMaximumSize(new java.awt.Dimension(8, 20));
        Password.setMinimumSize(new java.awt.Dimension(8, 20));
        Password.setPreferredSize(new java.awt.Dimension(8, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 312;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 0, 0, 25);
        jPanel1.add(Password, gridBagConstraints);

        BottonRegistro.setText("Registrar");
        BottonRegistro.setColorHover(new java.awt.Color(101, 203, 255));
        BottonRegistro.setColorNormal(new java.awt.Color(53, 188, 255));
        BottonRegistro.setColorPressed(new java.awt.Color(0, 159, 239));
        BottonRegistro.setFocusPainted(false);
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
        gridBagConstraints.ipady = 14;
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
        File f = new File("Usuario.txt");
        if(f.exists()){
        Metodos met = new Metodos();
        String direUsu = "Usuario.txt";
        if (met.EncontrarUsuario(direUsu, Usuario.getText(), Password.getText(), 2)) {
            rSButtonMetro1.setEnabled(false);
            usuario = Usuario.getText();
            nombre_profesor = met.EncontrarNombre(direUsu, usuario);
            Correo = met.EncontrarCorreo(direUsu, usuario);
            Principal prin = new Principal();
            prin.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Ingreso Erroneo", "Verificar contraseña y usuario.", JOptionPane.ERROR_MESSAGE);
        }}else{
             JOptionPane.showMessageDialog(this, "Ingreso Erroneo", "No se ha registrado ningun usuario.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void BottonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonRegistroActionPerformed
        Registrarse r = new Registrarse();
        r.setVisible(true);
        r.jLabel9.setForeground(Color.decode("#00678e"));
        this.setVisible(false);
    }//GEN-LAST:event_BottonRegistroActionPerformed

    private void ButtonRecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRecuperarContraseñaActionPerformed
        RecuperarContraseña RC = new RecuperarContraseña();
        RC.BloqDesBoton(RC.EC, "...");
        RC.BloqDesBoton(RC.CC, "...");
        RC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonRecuperarContraseñaActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

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

    private void IconCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrar1MouseClicked
        System.exit(0);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL foto = classLoader.getResource("Imagenes/Libro.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(foto));
    }//GEN-LAST:event_formWindowActivated

    public static void main(String[] args) {
        InicioSeccion ini = new InicioSeccion();
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
    private rsbuttom.RSButtonMetro BottonRegistro;
    private rsbuttom.RSButtonMetro ButtonRecuperarContraseña;
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JLabel IconCerrar1;
    private javax.swing.JLabel IconMin;
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
