/*MARIA CAROLINA PANIZZA DE SOUZA
229053*/
package interfaz;
import sistema.*;
import java.util.*;

public class VentEstadisticas extends javax.swing.JFrame implements Observer {
    private Sistema modelo;
    public VentEstadisticas(Sistema unModelo) {
        modelo = unModelo;
        modelo.addObserver(this);
        initComponents();
        etiquetaSeleccion.setText("Dron seleccionado: ");
        actualizarListas(modelo);
    }
    
    public void actualizarListas(Sistema unModelo){
        listaDronesConVuelo.setListData(unModelo.dronesConVuelos().toArray());
        listaDronesSinVuelo.setListData(unModelo.dronesSinVuelos().toArray());
    }
    
    public VentEstadisticas(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tituloDepo = new javax.swing.JLabel();
        eFila = new javax.swing.JLabel();
        etiquetaCoincidencias = new javax.swing.JLabel();
        eArea2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDronesSinVuelo = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDronesConVuelo = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        datosVuelo = new javax.swing.JList();
        etiquetaSeleccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(33, 39, 56));

        tituloDepo.setBackground(new java.awt.Color(237, 242, 239));
        tituloDepo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        tituloDepo.setForeground(new java.awt.Color(33, 39, 56));
        tituloDepo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDepo.setText("Emisión de estadísticas");
        tituloDepo.setMaximumSize(new java.awt.Dimension(60, 30));
        tituloDepo.setMinimumSize(new java.awt.Dimension(60, 30));
        tituloDepo.setOpaque(true);
        tituloDepo.setPreferredSize(new java.awt.Dimension(60, 30));

        eFila.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eFila.setForeground(new java.awt.Color(237, 242, 239));
        eFila.setText("Drones sin vuelos:");

        etiquetaCoincidencias.setBackground(new java.awt.Color(237, 242, 239));
        etiquetaCoincidencias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaCoincidencias.setForeground(new java.awt.Color(33, 39, 56));
        etiquetaCoincidencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCoincidencias.setText("Estadísticas de vuelo:");
        etiquetaCoincidencias.setOpaque(true);

        eArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eArea2.setForeground(new java.awt.Color(237, 242, 239));
        eArea2.setText("Drones con vuelos:");

        jScrollPane1.setBackground(new java.awt.Color(209, 214, 70));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(237, 242, 239));

        listaDronesSinVuelo.setBackground(new java.awt.Color(33, 39, 56));
        listaDronesSinVuelo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        listaDronesSinVuelo.setForeground(new java.awt.Color(237, 242, 239));
        listaDronesSinVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaDronesSinVuelo.setSelectionBackground(new java.awt.Color(229, 231, 145));
        listaDronesSinVuelo.setSelectionForeground(new java.awt.Color(33, 39, 56));
        jScrollPane1.setViewportView(listaDronesSinVuelo);

        jScrollPane2.setBackground(new java.awt.Color(209, 214, 70));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(237, 242, 239));

        listaDronesConVuelo.setBackground(new java.awt.Color(33, 39, 56));
        listaDronesConVuelo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        listaDronesConVuelo.setForeground(new java.awt.Color(237, 242, 239));
        listaDronesConVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaDronesConVuelo.setSelectionBackground(new java.awt.Color(229, 231, 145));
        listaDronesConVuelo.setSelectionForeground(new java.awt.Color(33, 39, 56));
        listaDronesConVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDronesConVueloMouseClicked(evt);
            }
        });
        listaDronesConVuelo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDronesConVueloValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaDronesConVuelo);

        jScrollPane4.setBackground(new java.awt.Color(209, 214, 70));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(237, 242, 239));

        datosVuelo.setBackground(new java.awt.Color(33, 39, 56));
        datosVuelo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        datosVuelo.setForeground(new java.awt.Color(237, 242, 239));
        datosVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        datosVuelo.setSelectionBackground(new java.awt.Color(229, 231, 145));
        datosVuelo.setSelectionForeground(new java.awt.Color(33, 39, 56));
        jScrollPane4.setViewportView(datosVuelo);

        etiquetaSeleccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaSeleccion.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaSeleccion.setText("Dron seleccionado: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloDepo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaSeleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(eFila, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addComponent(etiquetaCoincidencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloDepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eFila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(etiquetaCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(595, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listaDronesConVueloValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDronesConVueloValueChanged
    }//GEN-LAST:event_listaDronesConVueloValueChanged

    private void listaDronesConVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDronesConVueloMouseClicked
        Dron d = (Dron)listaDronesConVuelo.getSelectedValue();
        datosVuelo.setListData(d.getListaVuelos().toArray());
        etiquetaSeleccion.setText("Dron seleccionado: "+d.getId());
    }//GEN-LAST:event_listaDronesConVueloMouseClicked

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
            java.util.logging.Logger.getLogger(VentEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentEstadisticas().setVisible(true);
            }
        });
    }
    
    @Override 
    public void update (Observable Obj, Object arg){
        actualizarListas(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList datosVuelo;
    private javax.swing.JLabel eArea2;
    private javax.swing.JLabel eFila;
    private javax.swing.JLabel etiquetaCoincidencias;
    private javax.swing.JLabel etiquetaSeleccion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaDronesConVuelo;
    private javax.swing.JList listaDronesSinVuelo;
    private javax.swing.JLabel tituloDepo;
    // End of variables declaration//GEN-END:variables
}
