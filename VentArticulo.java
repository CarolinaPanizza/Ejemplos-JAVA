/*MARIA CAROLINA PANIZZA DE SOUZA
229053*/

package interfaz;
import sistema.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class VentArticulo extends javax.swing.JFrame implements Observer{
    private Sistema modelo;
    ArrayList<Articulo> listaArticulos;
    
    public VentArticulo(Sistema unModelo) {
        modelo = unModelo;
        modelo.addObserver(this);
        initComponents();
    }
   
    public VentArticulo(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        botonArtAgregar = new javax.swing.JButton();
        artNombre = new javax.swing.JTextField();
        artDescrip = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        artTabla = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar articulo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(33, 39, 56));
        jPanel1.setLayout(null);

        etiquetaDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaDescripcion.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaDescripcion.setText("Descripcion: ");
        jPanel1.add(etiquetaDescripcion);
        etiquetaDescripcion.setBounds(20, 130, 110, 30);

        etiquetaNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaNombre.setText("Nombre:");
        jPanel1.add(etiquetaNombre);
        etiquetaNombre.setBounds(20, 90, 110, 30);

        botonArtAgregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        botonArtAgregar.setText("Agregar");
        botonArtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArtAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(botonArtAgregar);
        botonArtAgregar.setBounds(240, 210, 120, 26);

        artNombre.setBackground(new java.awt.Color(33, 39, 56));
        artNombre.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        artNombre.setForeground(new java.awt.Color(237, 242, 239));
        artNombre.setCaretColor(new java.awt.Color(237, 242, 239));
        artNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artNombreActionPerformed(evt);
            }
        });
        jPanel1.add(artNombre);
        artNombre.setBounds(130, 90, 230, 30);

        artDescrip.setBackground(new java.awt.Color(33, 39, 56));
        artDescrip.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        artDescrip.setForeground(new java.awt.Color(237, 242, 239));
        artDescrip.setCaretColor(new java.awt.Color(237, 242, 239));
        artDescrip.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(artDescrip);
        artDescrip.setBounds(130, 130, 230, 30);

        jScrollPane1.setBackground(new java.awt.Color(33, 39, 56));
        jScrollPane1.setForeground(new java.awt.Color(237, 242, 239));

        artTabla.setBackground(new java.awt.Color(229, 231, 145));
        artTabla.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        artTabla.setForeground(new java.awt.Color(33, 39, 56));
        artTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        artTabla.setGridColor(new java.awt.Color(33, 39, 56));
        artTabla.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(artTabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(380, 90, 460, 150);

        titulo.setBackground(new java.awt.Color(237, 242, 239));
        titulo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        titulo.setForeground(new java.awt.Color(33, 39, 56));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrar artículo nuevo");
        titulo.setMaximumSize(new java.awt.Dimension(60, 30));
        titulo.setMinimumSize(new java.awt.Dimension(60, 30));
        titulo.setOpaque(true);
        titulo.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel1.add(titulo);
        titulo.setBounds(0, 20, 860, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 270);

        setSize(new java.awt.Dimension(875, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void artNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artNombreActionPerformed
      
    }//GEN-LAST:event_artNombreActionPerformed

    private void botonArtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArtAgregarActionPerformed
        
        if((artNombre.getText().isEmpty()) || (artDescrip.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error. Campos incompletos.", JOptionPane.ERROR_MESSAGE);
        }else{
        
            String unNombre = artNombre.getText();
            String unaDescripcion = artDescrip.getText();
            boolean esta = modelo.articuloRepetido(unNombre);
            if(esta){
                JOptionPane.showMessageDialog(null, "El articulo ya existe. Ingrese otro articulo", "Error duplicado.", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Articulo cargado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
                Articulo unArticulo = new Articulo();
                unArticulo.setNombre(unNombre);
                unArticulo.setDescripcion(unaDescripcion);
                modelo.agregarArticulo(unArticulo);
                }
            }
            actualizarTabla();
            artNombre.setText("");
            artDescrip.setText("");
    }//GEN-LAST:event_botonArtAgregarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     
    }//GEN-LAST:event_formWindowClosing

    public void actualizarTabla(){
        DefaultTableModel datos = (DefaultTableModel)artTabla.getModel();
        datos.setNumRows(0);
        listaArticulos = modelo.getListaArticulos();
        for(int i = 0; i < listaArticulos.size(); i++){
            Object[] a = {listaArticulos.get(i).getNombre(), listaArticulos.get(i).getDescripcion()};
            datos.addRow(a);
        }
    }
    
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
            java.util.logging.Logger.getLogger(VentArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentArticulo().setVisible(true);
            }
        });
    }
    
    @Override
    public void update (Observable Obj, Object arg){
        actualizarTabla();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artDescrip;
    private javax.swing.JTextField artNombre;
    private javax.swing.JTable artTabla;
    private javax.swing.JButton botonArtAgregar;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
    
    

}
