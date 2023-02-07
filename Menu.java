# Gestion-Drones---Obligatorio-2
package interfaz;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import sistema.*;

public class Menu extends javax.swing.JFrame{
    private Sistema modelo;
    
    public Menu(Sistema unModelo) {
        modelo = unModelo;
        initComponents();
    }
    
    public Menu(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        registrarArticulo = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        ingCarga = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        verArticulos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de drones");
        setResizable(false);
        setSize(new java.awt.Dimension(400, 456));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(33, 39, 56));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 242, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ PRINCIPAL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 70, 400, 20);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir);
        botonSalir.setBounds(160, 340, 90, 25);

        jLabel3.setBackground(new java.awt.Color(33, 39, 56));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 242, 239));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestión de Drones");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 10, 400, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 410);

        menuBar.setBackground(new java.awt.Color(33, 39, 56));
        menuBar.setForeground(new java.awt.Color(237, 242, 239));

        fileMenu.setForeground(new java.awt.Color(237, 242, 239));
        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        registrarArticulo.setMnemonic('o');
        registrarArticulo.setText("Registrar artículo");
        registrarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarArticuloActionPerformed(evt);
            }
        });
        fileMenu.add(registrarArticulo);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Registrar funcionario");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Registrar dron");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Terminar");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setForeground(new java.awt.Color(237, 242, 239));
        editMenu.setMnemonic('e');
        editMenu.setText("Cargas / Vuelos");

        ingCarga.setMnemonic('t');
        ingCarga.setText("Ingreso / Egreso manual de carga");
        ingCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingCargaActionPerformed(evt);
            }
        });
        editMenu.add(ingCarga);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Registrar vuelo de dron");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setForeground(new java.awt.Color(237, 242, 239));
        helpMenu.setMnemonic('h');
        helpMenu.setText("Estadísticas");

        verArticulos.setMnemonic('c');
        verArticulos.setText("Emisión de estadísticas");
        verArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verArticulosActionPerformed(evt);
            }
        });
        helpMenu.add(verArticulos);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(416, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        try{
            FileOutputStream ff = new FileOutputStream("archivo");
            BufferedOutputStream b = new BufferedOutputStream(ff);
            ObjectOutputStream so = new ObjectOutputStream(b);
            so.writeObject(modelo);
            so.close();
        }catch(IOException e){
            System.out.println("error serializacion");
        }
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void registrarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarArticuloActionPerformed
        VentArticulo vArt = new VentArticulo(modelo);
        vArt.setVisible(true);
        vArt.actualizarTabla();

    }//GEN-LAST:event_registrarArticuloActionPerformed

    private void verArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verArticulosActionPerformed
        VentEstadisticas vEstadisticas = new VentEstadisticas(modelo);
        vEstadisticas.setVisible(true);
    }//GEN-LAST:event_verArticulosActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        VentFuncionario vFun = new VentFuncionario(modelo);
        vFun.setVisible(true);
        vFun.actualizarTabla();
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        VentDron vDron = new VentDron(modelo);
        vDron.setVisible(true);
        vDron.actualizarTabla();        
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void ingCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingCargaActionPerformed
        IECarga vIng = new IECarga(modelo);
        vIng.setVisible(true);
    }//GEN-LAST:event_ingCargaActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        RegistroVuelo vRegVuelo = new RegistroVuelo(modelo); 
        vRegVuelo.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            FileOutputStream ff = new FileOutputStream("archivo");
            BufferedOutputStream b = new BufferedOutputStream(ff);
            ObjectOutputStream so = new ObjectOutputStream(b);
            so.writeObject(modelo);
            so.close();
        }catch(IOException e){
            System.out.println("error serializacion");
        }
    }//GEN-LAST:event_formWindowClosing

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        try{
            FileOutputStream ff = new FileOutputStream("archivo");
            BufferedOutputStream b = new BufferedOutputStream(ff);
            ObjectOutputStream so = new ObjectOutputStream(b);
            so.writeObject(modelo);
            so.close();
        }catch(IOException e){
            System.out.println("error serializacion");
        }
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem ingCarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registrarArticulo;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem verArticulos;
    // End of variables declaration//GEN-END:variables

}
