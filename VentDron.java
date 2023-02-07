/*MARIA CAROLINA PANIZZA DE SOUZA
229053*/

package interfaz;
import sistema.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentDron extends javax.swing.JFrame implements Observer {
    private Sistema modelo;
    public VentDron(Sistema unModelo) {
        modelo = unModelo;
        modelo.addObserver(this);
        initComponents();
    }
    
    public VentDron(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaCamara = new javax.swing.JLabel();
        dronCamara = new javax.swing.JTextField();
        botonFunAgregar = new javax.swing.JButton();
        dronModelo = new javax.swing.JTextField();
        etiquetaModelo = new javax.swing.JLabel();
        etiquetaID = new javax.swing.JLabel();
        dronID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dronTabla = new javax.swing.JTable();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar dron");
        setBackground(new java.awt.Color(33, 39, 56));
        setPreferredSize(new java.awt.Dimension(860, 230));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 39, 56));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 270));

        etiquetaCamara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaCamara.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaCamara.setText("Tipo de Cámara:");

        dronCamara.setBackground(new java.awt.Color(33, 39, 56));
        dronCamara.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dronCamara.setForeground(new java.awt.Color(237, 242, 239));
        dronCamara.setCaretColor(new java.awt.Color(237, 242, 239));

        botonFunAgregar.setText("Agregar");
        botonFunAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFunAgregarActionPerformed(evt);
            }
        });

        dronModelo.setBackground(new java.awt.Color(33, 39, 56));
        dronModelo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dronModelo.setForeground(new java.awt.Color(237, 242, 239));
        dronModelo.setCaretColor(new java.awt.Color(237, 242, 239));
        dronModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dronModeloActionPerformed(evt);
            }
        });

        etiquetaModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaModelo.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaModelo.setText("Modelo:");

        etiquetaID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaID.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaID.setText("Identificación:");

        dronID.setBackground(new java.awt.Color(33, 39, 56));
        dronID.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dronID.setForeground(new java.awt.Color(237, 242, 239));
        dronID.setCaretColor(new java.awt.Color(237, 242, 239));
        dronID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dronIDActionPerformed(evt);
            }
        });

        dronTabla.setBackground(new java.awt.Color(229, 231, 145));
        dronTabla.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dronTabla.setForeground(new java.awt.Color(33, 39, 56));
        dronTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Modelo", "Cámara"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dronTabla.setGridColor(new java.awt.Color(33, 39, 56));
        dronTabla.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(dronTabla);

        titulo1.setBackground(new java.awt.Color(237, 242, 239));
        titulo1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        titulo1.setForeground(new java.awt.Color(33, 39, 56));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Registrar un nuevo dron");
        titulo1.setMaximumSize(new java.awt.Dimension(60, 30));
        titulo1.setMinimumSize(new java.awt.Dimension(60, 30));
        titulo1.setOpaque(true);
        titulo1.setPreferredSize(new java.awt.Dimension(60, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCamara, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dronCamara)
                            .addComponent(dronID)
                            .addComponent(dronModelo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonFunAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dronID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaID))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dronModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaModelo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dronCamara, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaCamara, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(botonFunAgregar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(875, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dronIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dronIDActionPerformed

    }//GEN-LAST:event_dronIDActionPerformed

    private void botonFunAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFunAgregarActionPerformed
        
        if((dronID.getText().isEmpty()) || (dronModelo.getText().isEmpty()) || (dronCamara.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            
        }else{
            String unID = dronID.getText();
            String unModelo = dronModelo.getText();
            try{
                Integer.parseInt(dronCamara.getText());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Camara debe ser un entero entre 1 - 6", "Error", JOptionPane.ERROR_MESSAGE);
            }
            int unaCamara = Integer.parseInt(dronCamara.getText());
            boolean esta = false;
            boolean enRango = false;
            //validar ID distinto y modelo de 1 a 6
            if((unaCamara < 7) && (unaCamara > 0)){
                enRango = true;
                esta = modelo.validarDronID(unID);
                if(esta){
                JOptionPane.showMessageDialog(null, "El dron ya fue registrado anteriormente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Camara debe ser un entero entre 1 - 6", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(!esta && enRango){
                JOptionPane.showMessageDialog(null, "Dron registrado correctamente.", "Registro", JOptionPane.INFORMATION_MESSAGE);
                Dron nuevoDron = new Dron();
                nuevoDron.setCamara(unaCamara);
                nuevoDron.setModelo(unModelo);
                nuevoDron.setId(unID);
                nuevoDron.setCantidadVuelos(0);
                modelo.agregarDron(nuevoDron);        
            }
        }
        actualizarTabla();
        dronID.setText("");
        dronModelo.setText("");
        dronCamara.setText("");
    }//GEN-LAST:event_botonFunAgregarActionPerformed

    private void dronModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dronModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dronModeloActionPerformed
    
    public void actualizarTabla(){
        DefaultTableModel datos = (DefaultTableModel)dronTabla.getModel();
        datos.setNumRows(0);
        listaDrones = modelo.getListaDrones();
        for(int i = 0; i < listaDrones.size(); i++){
            Object[] a = {listaDrones.get(i).getId(), listaDrones.get(i).getModelo(), listaDrones.get(i).getCamara()};
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
            java.util.logging.Logger.getLogger(VentDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentDron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentDron().setVisible(true);
            }
        });
    }
    
    @Override
    public void update (Observable Obj, Object arg){
        actualizarTabla();
    }
    
    ArrayList<Dron> listaDrones;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFunAgregar;
    private javax.swing.JTextField dronCamara;
    private javax.swing.JTextField dronID;
    private javax.swing.JTextField dronModelo;
    private javax.swing.JTable dronTabla;
    private javax.swing.JLabel etiquetaCamara;
    private javax.swing.JLabel etiquetaID;
    private javax.swing.JLabel etiquetaModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
