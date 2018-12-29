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
        Regresar = new javax.swing.JLabel();
        IconCerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        Regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Entypo_e712(0)_42.png"))); // NOI18N
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        jPanel2.add(Regresar, java.awt.BorderLayout.LINE_START);

        IconCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cruz.png"))); // NOI18N
        IconCerrar.setToolTipText("");
        IconCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(IconCerrar, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 103, 142));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        rSButtonMetro1.setText("Enviar correo");
        rSButtonMetro1.setColorHover(new java.awt.Color(101, 203, 255));
        rSButtonMetro1.setColorNormal(new java.awt.Color(53, 188, 255));
        rSButtonMetro1.setColorPressed(new java.awt.Color(0, 159, 239));
        rSButtonMetro1.setFocusable(false);
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
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 30, 37, 0);
        jPanel1.add(rSButtonMetro1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IcoUser.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 30, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 314;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 25);
        jPanel1.add(Usuario, gridBagConstraints);

        Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password.setMaximumSize(new java.awt.Dimension(8, 20));
        Password.setMinimumSize(new java.awt.Dimension(8, 20));
        Password.setPreferredSize(new java.awt.Dimension(8, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 312;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 25);
        jPanel1.add(Password, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCorreo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("su correo, es recomendable cambiarla desde el menu de Perfil.");
        jLabel1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 0, 25);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("*Ingresa el correo y nombre de usuario asociado a esta cuenta.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 0, 25);
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
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 0, 25);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Acontinuacion se le enviara una nueva contraseña provicional a");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 25);
        jPanel1.add(jLabel7, gridBagConstraints);

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
            rSButtonMetro1.setEnabled(false);
            usuario = Usuario.getText();
            nombre_profesor = met.EncontrarNombre(direUsu, usuario);
            Principal prin = new Principal();
            prin.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Ingreso Erroneo", "Verificar contraseña y usuario.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_rSButtonMetro1ActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        this.setVisible(false);
        InicioSeccion ini = new InicioSeccion();
        ini.setVisible(true);
    }//GEN-LAST:event_RegresarMouseClicked

    private void IconCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCerrarMouseClicked
        dispose();
        this.setVisible(false);
        InicioSeccion ini = new InicioSeccion();
        ini.setVisible(true);
    }//GEN-LAST:event_IconCerrarMouseClicked

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
    private javax.swing.JLabel IconCerrar;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Regresar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    // End of variables declaration//GEN-END:variables
}
