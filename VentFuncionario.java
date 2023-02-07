/*MARIA CAROLINA PANIZZA DE SOUZA
229053*/

package interfaz;
import sistema.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class VentFuncionario extends javax.swing.JFrame implements Observer {
    private Sistema modelo;
    public VentFuncionario(Sistema unModelo) {
        modelo = unModelo;
        modelo.addObserver(this);
        initComponents();
    }

    public VentFuncionario(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        funNumero = new javax.swing.JTextField();
        funEdad = new javax.swing.JTextField();
        funNombre = new javax.swing.JTextField();
        botonFunAgregar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaEdad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        funTabla = new javax.swing.JTable();
        etiquetaNumero = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar funcionario");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(33, 39, 56));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 270));
        jPanel1.setLayout(null);

        funNumero.setBackground(new java.awt.Color(33, 39, 56));
        funNumero.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        funNumero.setForeground(new java.awt.Color(237, 242, 239));
        funNumero.setCaretColor(new java.awt.Color(237, 242, 239));
        jPanel1.add(funNumero);
        funNumero.setBounds(150, 160, 220, 30);

        funEdad.setBackground(new java.awt.Color(33, 39, 56));
        funEdad.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        funEdad.setForeground(new java.awt.Color(237, 242, 239));
        funEdad.setCaretColor(new java.awt.Color(237, 242, 239));
        jPanel1.add(funEdad);
        funEdad.setBounds(150, 120, 220, 30);

        funNombre.setBackground(new java.awt.Color(33, 39, 56));
        funNombre.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        funNombre.setForeground(new java.awt.Color(237, 242, 239));
        funNombre.setCaretColor(new java.awt.Color(237, 242, 239));
        funNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funNombreActionPerformed(evt);
            }
        });
        jPanel1.add(funNombre);
        funNombre.setBounds(150, 80, 220, 30);

        botonFunAgregar.setText("Agregar");
        botonFunAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFunAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(botonFunAgregar);
        botonFunAgregar.setBounds(270, 210, 100, 25);

        etiquetaNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaNombre.setText("Nombre:");
        jPanel1.add(etiquetaNombre);
        etiquetaNombre.setBounds(20, 80, 130, 30);

        etiquetaEdad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaEdad.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaEdad.setText("Edad:");
        jPanel1.add(etiquetaEdad);
        etiquetaEdad.setBounds(20, 120, 130, 30);

        funTabla.setBackground(new java.awt.Color(229, 231, 145));
        funTabla.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        funTabla.setForeground(new java.awt.Color(33, 39, 56));
        funTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Numero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        funTabla.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(funTabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(390, 80, 453, 150);

        etiquetaNumero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaNumero.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaNumero.setText("Nro Funcionario:");
        jPanel1.add(etiquetaNumero);
        etiquetaNumero.setBounds(20, 160, 130, 30);

        titulo1.setBackground(new java.awt.Color(237, 242, 239));
        titulo1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        titulo1.setForeground(new java.awt.Color(33, 39, 56));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Registrar un nuevo funcionario");
        titulo1.setMaximumSize(new java.awt.Dimension(60, 30));
        titulo1.setMinimumSize(new java.awt.Dimension(60, 30));
        titulo1.setOpaque(true);
        titulo1.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel1.add(titulo1);
        titulo1.setBounds(0, 20, 860, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 860, 270);

        setSize(new java.awt.Dimension(875, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void funNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funNombreActionPerformed

    }//GEN-LAST:event_funNombreActionPerformed

    private void botonFunAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFunAgregarActionPerformed
        if((funNombre.getText().isEmpty()) || (funEdad.getText().isEmpty()) || (funNumero.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.", "Error: campos incompletos.", JOptionPane.ERROR_MESSAGE);
        }else{
            String unNombre = funNombre.getText();
            try{
               Integer.parseInt(funEdad.getText()); 
            }catch (NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Edad debe ser numérico.", "Error de formato de dato.", JOptionPane.ERROR_MESSAGE);
            }
            try{
                Integer.parseInt(funNumero.getText());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Nro Funcionario debe ser numérico.", "Error de formato de dato.", JOptionPane.ERROR_MESSAGE);
            }
            int unaEdad  = Integer.parseInt(funEdad.getText());
            int unNumero = Integer.parseInt(funNumero.getText());
            boolean esta = modelo.validarFuncionario(unNumero);
            if(esta){
                JOptionPane.showMessageDialog(null, "El número de funcionario debe ser único.", "Error: funcionario duplicado.", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Funcionario cargardo correctamente.", "Registro exitoso.", JOptionPane.INFORMATION_MESSAGE);
                Funcionario unFuncionario = new Funcionario();
                unFuncionario.setNombre(unNombre);
                unFuncionario.setEdad(unaEdad);
                unFuncionario.setNumero(unNumero);
                modelo.agregarFuncionario(unFuncionario);
            }
        }
        actualizarTabla();
        funNombre.setText("");
        funEdad.setText("");
        funNumero.setText("");
    }//GEN-LAST:event_botonFunAgregarActionPerformed

    
    public void actualizarTabla(){
        DefaultTableModel datos = (DefaultTableModel)funTabla.getModel();
        datos.setNumRows(0);
        listaFuncionarios = modelo.getListaFuncionarios();
        for(int i = 0; i < listaFuncionarios.size(); i++){
            Object[] a = {listaFuncionarios.get(i).getNombre(), listaFuncionarios.get(i).getEdad(), listaFuncionarios.get(i).getNumero()};
            datos.addRow(a);
        }        
    }
    
    @Override
    public void update (Observable Obj, Object arg){
        actualizarTabla();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(VentFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFunAgregar;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNumero;
    private javax.swing.JTextField funEdad;
    private javax.swing.JTextField funNombre;
    private javax.swing.JTextField funNumero;
    private javax.swing.JTable funTabla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Funcionario> listaFuncionarios;

}
