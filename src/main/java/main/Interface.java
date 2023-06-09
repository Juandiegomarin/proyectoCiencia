/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import serviciojson.JsonService;

import java.awt.*;
import java.io.IOException;

/**
 *
 * @author alberto
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonMedir = new javax.swing.JButton();
        introducirURL = new javax.swing.JTextField();
        Verde = new javax.swing.JLabel();
        Bytes = new javax.swing.JLabel();
        MasLimpio = new javax.swing.JLabel();
        C02 = new javax.swing.JLabel();
        Carbon1 = new javax.swing.JLabel();
        Carbon2 = new javax.swing.JLabel();
        Carbon3 = new javax.swing.JLabel();
        Carbon4 = new javax.swing.JLabel();
        Steve = new javax.swing.JLabel();
        Arbol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMedir.setText("jButton1");
        botonMedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedirActionPerformed(evt);
            }
        });
        jPanel1.add(botonMedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        introducirURL.setText("jTextField1");
        jPanel1.add(introducirURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        Verde.setText("jLabel1");
        jPanel1.add(Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, 20));

        Bytes.setText("jLabel2");
        jPanel1.add(Bytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, -1, -1));

        MasLimpio.setText("jLabel3");
        jPanel1.add(MasLimpio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, -1, -1));

        C02.setText("jLabel4");
        jPanel1.add(C02, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 620, -1, -1));

        Carbon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/1594080-charbon-amp_main_img-1.png"))); // NOI18N
        Carbon1.setText("jLabel1");
        jPanel1.add(Carbon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 320, 470, 190));

        Carbon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/1594080-charbon-amp_main_img-1.png"))); // NOI18N
        Carbon2.setText("jLabel3");
        jPanel1.add(Carbon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 550, 440, -1));

        Carbon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/1594080-charbon-amp_main_img-1.png"))); // NOI18N
        Carbon3.setText("jLabel4");
        jPanel1.add(Carbon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 380, 280));

        Carbon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/1594080-charbon-amp_main_img-1.png"))); // NOI18N
        Carbon4.setText("jLabel2");
        jPanel1.add(Carbon4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        Steve.setText("jLabel1");
        jPanel1.add(Steve, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 50, -1));

        Arbol.setText("jLabel1");
        jPanel1.add(Arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedirActionPerformed

       if (evt.getSource().equals(botonMedir)) {

            // se obtiene la url donde se hace la consulta
            final String urlBase = "https://api.websitecarbon.com/site?url=";
            // se obtiene la url que ha introducido el usuario
            String urlUsuario = introducirURL.getText();
            // obtener la url completa
            String urlCompleta = urlBase.concat(urlUsuario);
            // realizamos la conexion a la url para obtener los datos y guardarlo
            String fichero = "";
            try {
                fichero = conexion_http.ConexionHTTP.peticionHttpGet(urlCompleta);
            } catch (IOException ex) {
                System.out.println("La petición de datos no se ha podido realizar");
            }

            // convertir nuestro fichero a pojo
            Huella huella = new Huella();
            try {
                huella = (Huella) JsonService.stringToPojo(fichero, modelo.Huella.class);
            } catch (JsonProcessingException ex) {
                System.out.println("Los datos no se han podido transformar");
            }


            //Le damos funcionalidad al jlabel llamado verde
            if (huella.getCarbon() < 0.5) {
                Verde.setText("Verde");
            } else if (huella.getCarbon() > 0.5 && huella.getCarbon() < 1) {
                Verde.setText("Amarillo");
            } else if (huella.getCarbon() > 1) {
                Verde.setText("Rojo");
            }

            //Le damos funcionalidad al jlabel llamado Bytes
            Bytes.setText(String.valueOf(huella.getCarbon()));

            //Le damos funcionalidad al jlabel llamado MasLimpio
            MasLimpio.setText(String.valueOf(huella.getCarbon()));

            //Le damos funcionalidad al jlabel llamado C02
            C02.setText(String.valueOf(huella.getCarbon()));







        
    }//GEN-LAST:event_botonMedirActionPerformed



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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arbol;
    private javax.swing.JLabel Bytes;
    private javax.swing.JLabel C02;
    private javax.swing.JLabel Carbon1;
    private javax.swing.JLabel Carbon2;
    private javax.swing.JLabel Carbon3;
    private javax.swing.JLabel Carbon4;
    private javax.swing.JLabel MasLimpio;
    private javax.swing.JLabel Steve;
    private javax.swing.JLabel Verde;
    private javax.swing.JButton botonMedir;
    private javax.swing.JTextField introducirURL;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
