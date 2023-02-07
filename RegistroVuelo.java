/*MARIA CAROLINA PANIZZA DE SOUZA
229053*/

package interfaz;
import java.awt.*;
import sistema.*;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class RegistroVuelo extends javax.swing.JFrame{
    private Sistema modelo;
    private String ruta;
    private int[] codigosVuelo = new int[10];
    private boolean vueloExitoso;
    private String areaVuelo;
    private int filaVuelo;
    private int coordDepo;
    private int[] filaManual;
    private Carga[] filaSistema;
    private int iguales;
    private int dif;
    private String nombreArchivo;
    
    public RegistroVuelo(Sistema unModelo) {
        modelo = unModelo;
        cambiarIdioma();
        initComponents();
        selectorArchivos.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt","txt");
        selectorArchivos.setFileFilter(filtro);
        filaManual = new int[10];
        tablaResultados.setValueAt("Archivo",0,0);
        tablaResultados.setValueAt("Manual",1,0);
        tablaResultados.getColumnModel().getColumn(0).setCellRenderer(new Render("gray"));
        
    }
    
    public RegistroVuelo() {
        cambiarIdioma();
        initComponents();
        selectorArchivos.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt","txt");
        selectorArchivos.setFileFilter(filtro);
    }
    
    public void cambiarIdioma(){
        UIManager.put("FileChooser.openDialogTitleText", "Abrir");
        UIManager.put("FileChooser.lookInLabelText", "Mirar en");
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.fileNameLabelText", "Archivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir");
        UIManager.put("FileChooser.cancelButtonToolTipText","Cancelar");
        UIManager.put("FileChooser.fileNameHeaderText","Archivo");
        UIManager.put("FileChooser.upFolderToolTipText", "Subir");
        UIManager.put("FileChooser.homeFolderToolTipText","Escritorio");
        UIManager.put("FileChooser.newFolderToolTipText","Crear");
        UIManager.put("FileChooser.listViewButtonToolTipText","Lista");
        UIManager.put("FileChooser.newFolderButtonText","Crear carpeta");
        UIManager.put("FileChooser.renameFileButtonText", "Renombrar");
        UIManager.put("FileChooser.deleteFileButtonText", "Borrar");
        UIManager.put("FileChooser.filterLabelText", "Tipo");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalle");
        UIManager.put("FileChooser.fileSizeHeaderText","Tamaño");
        UIManager.put("FileChooser.fileTypeHeaderText","Tipo");
        UIManager.put("FileChooser.fileDateHeaderText", "Fecha modificación");
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tituloDepo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        eFila = new javax.swing.JLabel();
        etiquetaCoincidencias = new javax.swing.JLabel();
        eArea2 = new javax.swing.JLabel();
        etiquetaDiferencias = new javax.swing.JLabel();
        eModelo = new javax.swing.JLabel();
        selectorArchivos = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de vuelo");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(33, 39, 56));

        tituloDepo.setBackground(new java.awt.Color(237, 242, 239));
        tituloDepo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        tituloDepo.setForeground(new java.awt.Color(33, 39, 56));
        tituloDepo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDepo.setText("Registro de vuelo");
        tituloDepo.setMaximumSize(new java.awt.Dimension(60, 30));
        tituloDepo.setMinimumSize(new java.awt.Dimension(60, 30));
        tituloDepo.setOpaque(true);
        tituloDepo.setPreferredSize(new java.awt.Dimension(60, 30));

        jScrollPane1.setBackground(new java.awt.Color(33, 39, 56));
        jScrollPane1.setForeground(new java.awt.Color(237, 242, 239));

        tablaResultados.setBackground(new java.awt.Color(229, 231, 145));
        tablaResultados.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tablaResultados.setForeground(new java.awt.Color(33, 39, 56));
        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "De", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaResultados.setGridColor(new java.awt.Color(33, 39, 56));
        tablaResultados.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tablaResultados);

        eFila.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eFila.setForeground(new java.awt.Color(237, 242, 239));
        eFila.setText("Fila: ");

        etiquetaCoincidencias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaCoincidencias.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaCoincidencias.setText("Total coincidencias: ");

        eArea2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eArea2.setForeground(new java.awt.Color(237, 242, 239));
        eArea2.setText("Área:");

        etiquetaDiferencias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etiquetaDiferencias.setForeground(new java.awt.Color(237, 242, 239));
        etiquetaDiferencias.setText("Total diferencias: ");

        eModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eModelo.setForeground(new java.awt.Color(237, 242, 239));
        eModelo.setText("Modelo:");

        selectorArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorArchivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tituloDepo, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaDiferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(eArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(selectorArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(eFila, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(209, 209, 209)
                                                .addComponent(eModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(selectorArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eFila, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCoincidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDiferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(766, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectorArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorArchivosActionPerformed
        ruta = selectorArchivos.getSelectedFile().getAbsolutePath();
        nombreArchivo = selectorArchivos.getSelectedFile().getName();
        vueloExitoso = false;
        ArchivoLectura arch = new ArchivoLectura(ruta);         //Lectura de archivo
        arch.hayMasLineas();
        String dronID = arch.linea();                           //Lee el id del Dron       
                                                                 
        int pos = modelo.buscarDronPorID(dronID);               //Chequeo que exista el dron con ese id.
        if(pos == -1){
            JOptionPane.showMessageDialog(null, "El Dron no se encuentra registrado.","Error.", JOptionPane.ERROR_MESSAGE);
            arch.cerrar();
        }else{
            arch.hayMasLineas();
            String[] datoLectura = arch.linea().split("#");     //Separo la linea por #            
            areaVuelo = datoLectura[0];                         //Tomo codigo de area
            filaVuelo = Integer.parseInt(datoLectura[1]);       //Tomo numero de fila
            int cont = 0;
            
            //Contar las filas de codigo
            while(arch.hayMasLineas()){
                if(cont<10){
                    codigosVuelo[cont] = Integer.parseInt(arch.linea());
                }
                cont++;
            }
            arch.cerrar();                                      //cierro el archivo
            
            if(cont == 10){
                vueloExitoso = true;
            }
                            
            eFila.setText("Fila: "+ filaVuelo);                 //Seteo las etiquetas de la ventana
            eArea2.setText("Área: "+areaVuelo);
            etiquetaCoincidencias.setText("Total coincidencias: ");
            etiquetaDiferencias.setText("Total diferencias: ");
            eModelo.setText("Modelo: "+dronID);

            if(vueloExitoso){                                   //Si el vuelo es exitoso, proceso los datos y muestro en pantalla
                JOptionPane.showMessageDialog(null, "Archivo cargado correctamente.", "Vuelo exitoso", JOptionPane.INFORMATION_MESSAGE);
                coordDepo = coordenadaArea(areaVuelo);
                filaSistema = modelo.getAreas()[coordDepo][filaVuelo - 1];
                dif = 0;
                for (int i = 0; i < 10; i++){
                    if(filaSistema[i] == null){
                        filaManual[i] = 0;
                    }else{
                        filaManual[i] = filaSistema[i].getCodigo();
                    }
                    if(filaManual[i] != codigosVuelo[i]){
                        dif++;
                    }
                }
                iguales = 10 - dif;
                etiquetaCoincidencias.setText("Total coincidencias: " + iguales);
                etiquetaDiferencias.setText("Total diferencias: "+dif);
            }else{                                              //Si el vuelo no es exitoso, reseteo valores
                JOptionPane.showMessageDialog(null, "Vuelo no exitoso. Cantidad de lineas de carga: "+cont, "Vuelo no exitoso", JOptionPane.ERROR_MESSAGE);
                for (int i = 0; i < 10; i++){
                    codigosVuelo[i] = 0;
                    filaManual[i] = 0;
                    dif = -1;
                    iguales = -1;
                }
            }
            
            Vuelo unVuelo = new Vuelo();                        //Cargar datos vuelo 
            unVuelo.setArea(areaVuelo);
            unVuelo.setNombreArchivo(nombreArchivo);
            unVuelo.setDiferencias(dif);
            unVuelo.setExitoso(vueloExitoso);
            unVuelo.setLineas(cont);
            unVuelo.setFila(filaVuelo);
            if(pos != -1){
                modelo.agregarUnVuelo(unVuelo, pos);            //Agrego el vuelo al ArrayList del Dron correspondiente
            }
            cargarTabla();                                      //Cargo la tabla
        }
        
    }//GEN-LAST:event_selectorArchivosActionPerformed
    
    public int coordenadaArea(String unArea){
        int coord = 7;
        int aux = 7;
        switch(unArea.toUpperCase()){
            case "A":
                aux = 0;
                break;
            case "B":
                aux = 1;
                break;
            case "C":
                aux = 2;
                break;
            case "D":
                aux = 3;
                break;
            case "E":
                aux = 4;
                break;
        }
        if(aux < 5){
            coord = aux;
        }
        return coord;
    }
    
    public void cargarTabla(){
        DefaultTableModel model = (DefaultTableModel)tablaResultados.getModel();
        model.setRowCount(2);
        model.setColumnCount(11);
        tablaResultados.getColumnModel().getColumn(0).setCellRenderer(new Render("gray"));
        for(int i = 0; i < 10; i++){
            if(vueloExitoso){
               tablaResultados.setValueAt(codigosVuelo[i],0,i+1);
               tablaResultados.setValueAt(filaManual[i],1,i+1);
               if(codigosVuelo[i] != filaManual[i]){
                   tablaResultados.getColumnModel().getColumn(i+1).setCellRenderer(new Render("red"));
               }else{
                   tablaResultados.getColumnModel().getColumn(i+1).setCellRenderer(new Render("green"));
               }   
            }else{
               tablaResultados.setValueAt(null,0,i+1);
               tablaResultados.setValueAt(null,1,i+1);
            }
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
            java.util.logging.Logger.getLogger(RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVuelo().setVisible(true);
            }
        });
    }

    private class Render extends DefaultTableCellRenderer {

        private String color;

        public Render(String unColor) {
            color = unColor;
        }

        public Component getTableCellRendererComponent(JTable tabla, Object objeto, boolean seleccionado, boolean enfoque, int unaFila, int unaColumna) {
            super.getTableCellRendererComponent(tabla, objeto, seleccionado, enfoque, unaFila, unaColumna);
            this.setBorder(new BevelBorder(BevelBorder.LOWERED));
            this.setHorizontalAlignment(CENTER);
            if (this.color.equals("gray")) {
                this.setBackground(Color.LIGHT_GRAY);
            }else if(this.color.equals("green")) {
                this.setBackground(Color.GREEN);
            }else{
                if(this.color.equals("red")) {
                    this.setBackground(Color.RED);
                }
            }
            return this;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eArea2;
    private javax.swing.JLabel eFila;
    private javax.swing.JLabel eModelo;
    private javax.swing.JLabel etiquetaCoincidencias;
    private javax.swing.JLabel etiquetaDiferencias;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFileChooser selectorArchivos;
    private javax.swing.JTable tablaResultados;
    private javax.swing.JLabel tituloDepo;
    // End of variables declaration//GEN-END:variables

}
