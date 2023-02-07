/*MARIA CAROLINA PANIZZA DE SOUZA
229053*/

package interfaz;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import sistema.*;
import java.util.*;

public class IECarga extends javax.swing.JFrame implements Observer{
    private Sistema modelo;
    JButton[][] matrizBotones;
    private Carga[][][] areas;
    private int deposito;
    private int fila;
    private int columna;
    private boolean seleccion;
    
    public IECarga(Sistema unModelo) {
        modelo = unModelo;
        modelo.addObserver(this);
        deposito = 0;
        seleccion = false;
        areas = modelo.getAreas();
        initComponents();
        setMatriz();
        actualizarListas();
        panelIngreso.setVisible(true);
        panelEgreso.setVisible(false);
        ingCodigo.setVisible(true);
        ingCantidad.setVisible(true);
        refrescarMatriz(matrizBotones, areas[deposito]);
    }
    
    public void actualizarListas(){
        listaArticulos.setListData(modelo.getListaArticulos().toArray());
        listaFuncionarios.setListData(modelo.getListaFuncionarios().toArray());
    }
    
    public void colorBotonCargado(JButton unBoton){
        unBoton.setBackground(new Color(33,39,56));
        unBoton.setForeground(new Color(237,242,239));
    }
    
    public void colorBoton(JButton unBoton){
        unBoton.setBackground(new Color(51,60,91));
        unBoton.setForeground(new Color(237,242,239));
    }
    
    public void colorBotonSeleccionado(JButton unBoton){
        unBoton.setBackground(new Color(229,231,145));
        unBoton.setForeground(new Color(33,39,56));
    }
    
    public void colorBotonSeleccYCargado(JButton unBoton){
        unBoton.setBackground(new Color(252,150,150));
        unBoton.setForeground(new Color(33,39,56));
    }
    
    
    public void pantallaEgreso(){
        panelEgreso.setSize(360,374);
    }
    
    public void setMatriz(){
        panelEspacios.setSize(612, 374);
        matrizBotones = new JButton[12][10];
        int x = 1;
        int y = 1;
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 10; j++){
                matrizBotones[i][j] = new JButton();
                matrizBotones[i][j].setMargin(new Insets(-5, -5, -5, -5));
                colorBoton(matrizBotones[i][j]);
                matrizBotones[i][j].setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33,39,56), 1, true));
                matrizBotones[i][j].setBounds(x,y,60,30);
                x += 61;
                
                matrizBotones[i][j].setText( (i+1) + ":" + (j+1)); // texto ejemplo, a completar
                matrizBotones[i][j].addActionListener(new EspacioListener());
                panelEspacios.add(matrizBotones[i][j]);
            }
            x = 1;
            y += 31;
        }
    }
    
    private class EspacioListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            refrescarMatriz(matrizBotones, areas[deposito]);
            JButton cual = (JButton)e.getSource();
            String boton = cual.getText();
            String[] coordenadas = boton.split(":");
            fila = Integer.parseInt(coordenadas[0]) - 1;
            columna = Integer.parseInt(coordenadas[1]) - 1;
            seleccion = true;
            cambioPanel(areas[deposito], matrizBotones, fila, columna);
        }
    }
    
    public void refrescarMatriz(JButton[][] unaMatriz, Carga[][] unaMatDatos){
        for(int k = 0;k < unaMatriz.length; k++){
            for(int h = 0; h < unaMatriz[0].length; h++){
                if(unaMatDatos[k][h] == null){
                    colorBoton(unaMatriz[k][h]);
                }else{
                    colorBotonCargado(unaMatriz[k][h]);
                }
            }
        }
        colorBotonSeleccionado(unaMatriz[fila][columna]);
    }
    
    public void cambioPanel(Carga[][] unTablero,JButton[][] matBotones ,int i, int j){
        refrescarMatriz(matBotones, unTablero);
        if(unTablero[i][j] == null){
            panelIngreso.setVisible(true);
            panelEgreso.setVisible(false);
            ingCodigo.setVisible(true);
            ingCantidad.setVisible(true);
        }else{
            panelIngreso.setVisible(false);
            panelEgreso.setVisible(true);
            ingCodigo.setVisible(false);
            ingCantidad.setVisible(false);
            eArticulo.setText(unTablero[i][j].getArticulo().getNombre());
            eCantidad.setText(String.valueOf(unTablero[i][j].getCantidad()));
            eCodigo.setText(String.valueOf(unTablero[i][j].getCodigo()));
            eFuncionario.setText(unTablero[i][j].getFuncionario().getNombre());
            colorBotonSeleccYCargado(matBotones[i][j]);
        }
    }    
    
    public IECarga(){
        initComponents();
        setMatriz();
        deposito = 0;
        refrescarMatriz(matrizBotones, areas[deposito]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        panelEspacios = new javax.swing.JPanel();
        panelEgreso = new javax.swing.JPanel();
        titCantidad = new javax.swing.JLabel();
        titEgreso = new javax.swing.JLabel();
        titCodigo = new javax.swing.JLabel();
        titArticulo = new javax.swing.JLabel();
        titFuncionario = new javax.swing.JLabel();
        eCodigo = new javax.swing.JLabel();
        eArticulo = new javax.swing.JLabel();
        eCantidad = new javax.swing.JLabel();
        eFuncionario = new javax.swing.JLabel();
        botEgresar = new javax.swing.JButton();
        panelIngreso = new javax.swing.JPanel();
        ingCantidad = new javax.swing.JTextField();
        ingCodigo = new javax.swing.JTextField();
        botIngresar = new javax.swing.JButton();
        Ingreso = new javax.swing.JLabel();
        titCodigoIn = new javax.swing.JLabel();
        titArticuloIn = new javax.swing.JLabel();
        titFuncionarioIn = new javax.swing.JLabel();
        titCantidadIn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaArticulos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFuncionarios = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        bSiguiente = new javax.swing.JButton();
        bAnterior = new javax.swing.JButton();
        tituloDepo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso / Egreso de Carga");
        setBackground(new java.awt.Color(33, 39, 56));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 242, 239));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("5");
        jLabel2.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 50, 60, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 242, 239));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");
        jLabel3.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 110, 60, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 242, 239));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("2");
        jLabel4.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 50, 60, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 242, 239));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("3");
        jLabel5.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 50, 60, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 242, 239));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("4");
        jLabel6.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(250, 50, 60, 30);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 242, 239));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("6");
        jLabel7.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 50, 60, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(237, 242, 239));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("7");
        jLabel8.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel8.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 50, 60, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(237, 242, 239));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("8");
        jLabel9.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel9.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel9.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 50, 60, 30);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 242, 239));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("9");
        jLabel10.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel10.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel10.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 50, 60, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 242, 239));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("10");
        jLabel11.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel11.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel11.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(610, 50, 60, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 242, 239));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("1");
        jLabel12.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel12.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel12.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 50, 60, 30);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(237, 242, 239));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("1");
        jLabel13.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel13.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel13.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 80, 60, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(237, 242, 239));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("4");
        jLabel14.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel14.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel14.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 170, 60, 30);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 242, 239));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("3");
        jLabel15.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel15.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel15.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 140, 60, 30);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(237, 242, 239));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("8");
        jLabel16.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel16.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel16.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 290, 60, 30);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(237, 242, 239));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("7");
        jLabel17.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel17.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel17.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 260, 60, 30);

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(237, 242, 239));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("6");
        jLabel18.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel18.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel18.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 230, 60, 30);

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(237, 242, 239));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("5");
        jLabel19.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel19.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel19.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 200, 60, 30);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(237, 242, 239));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("11");
        jLabel20.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel20.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel20.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 380, 60, 30);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(237, 242, 239));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("10");
        jLabel22.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel22.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel22.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 350, 60, 30);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(237, 242, 239));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("9");
        jLabel23.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel23.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel23.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel23);
        jLabel23.setBounds(10, 320, 60, 30);

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(237, 242, 239));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("12");
        jLabel24.setMaximumSize(new java.awt.Dimension(60, 30));
        jLabel24.setMinimumSize(new java.awt.Dimension(60, 30));
        jLabel24.setPreferredSize(new java.awt.Dimension(60, 30));
        getContentPane().add(jLabel24);
        jLabel24.setBounds(10, 410, 60, 30);

        panelEspacios.setBackground(new java.awt.Color(33, 39, 56));
        panelEspacios.setMinimumSize(new java.awt.Dimension(600, 360));
        panelEspacios.setPreferredSize(new java.awt.Dimension(600, 360));

        javax.swing.GroupLayout panelEspaciosLayout = new javax.swing.GroupLayout(panelEspacios);
        panelEspacios.setLayout(panelEspaciosLayout);
        panelEspaciosLayout.setHorizontalGroup(
            panelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelEspaciosLayout.setVerticalGroup(
            panelEspaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(panelEspacios);
        panelEspacios.setBounds(70, 80, 600, 360);

        panelEgreso.setBackground(new java.awt.Color(51, 60, 91));

        titCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titCantidad.setForeground(new java.awt.Color(237, 242, 239));
        titCantidad.setText("Cantidad:");

        titEgreso.setBackground(new java.awt.Color(33, 39, 56));
        titEgreso.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        titEgreso.setForeground(new java.awt.Color(237, 242, 239));
        titEgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titEgreso.setText("Egresar Carga");
        titEgreso.setOpaque(true);

        titCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titCodigo.setForeground(new java.awt.Color(237, 242, 239));
        titCodigo.setText("Código:");

        titArticulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titArticulo.setForeground(new java.awt.Color(237, 242, 239));
        titArticulo.setText("Artículo:");

        titFuncionario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titFuncionario.setForeground(new java.awt.Color(237, 242, 239));
        titFuncionario.setText("Funcionario:");

        eCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        eCodigo.setForeground(new java.awt.Color(237, 242, 239));

        eArticulo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        eArticulo.setForeground(new java.awt.Color(237, 242, 239));

        eCantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        eCantidad.setForeground(new java.awt.Color(237, 242, 239));

        eFuncionario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        eFuncionario.setForeground(new java.awt.Color(237, 242, 239));

        botEgresar.setText("Egresar");
        botEgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botEgresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEgresoLayout = new javax.swing.GroupLayout(panelEgreso);
        panelEgreso.setLayout(panelEgresoLayout);
        panelEgresoLayout.setHorizontalGroup(
            panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEgresoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(titCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(eCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEgresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botEgresar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(titEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEgresoLayout.setVerticalGroup(
            panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titEgreso)
                .addGap(17, 17, 17)
                .addGroup(panelEgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEgresoLayout.createSequentialGroup()
                        .addComponent(titCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(titFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEgresoLayout.createSequentialGroup()
                        .addComponent(eCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(botEgresar)
                .addGap(19, 19, 19))
        );

        getContentPane().add(panelEgreso);
        panelEgreso.setBounds(700, 80, 360, 360);

        panelIngreso.setBackground(new java.awt.Color(51, 60, 91));
        panelIngreso.setToolTipText("");

        ingCantidad.setBackground(new java.awt.Color(33, 39, 56));
        ingCantidad.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        ingCantidad.setForeground(new java.awt.Color(237, 242, 239));
        ingCantidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ingCantidad.setBorder(null);
        ingCantidad.setCaretColor(new java.awt.Color(237, 242, 239));
        ingCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingCantidadActionPerformed(evt);
            }
        });

        ingCodigo.setBackground(new java.awt.Color(33, 39, 56));
        ingCodigo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        ingCodigo.setForeground(new java.awt.Color(237, 242, 239));
        ingCodigo.setBorder(null);
        ingCodigo.setCaretColor(new java.awt.Color(237, 242, 239));
        ingCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingCodigoActionPerformed(evt);
            }
        });

        botIngresar.setText("Ingresar");
        botIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIngresarActionPerformed(evt);
            }
        });

        Ingreso.setBackground(new java.awt.Color(33, 39, 56));
        Ingreso.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        Ingreso.setForeground(new java.awt.Color(237, 242, 239));
        Ingreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ingreso.setText("Ingresar Carga");
        Ingreso.setOpaque(true);

        titCodigoIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titCodigoIn.setForeground(new java.awt.Color(237, 242, 239));
        titCodigoIn.setText("Código:");

        titArticuloIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titArticuloIn.setForeground(new java.awt.Color(237, 242, 239));
        titArticuloIn.setText("Artículo:");

        titFuncionarioIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titFuncionarioIn.setForeground(new java.awt.Color(237, 242, 239));
        titFuncionarioIn.setText("Funcionario:");

        titCantidadIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        titCantidadIn.setForeground(new java.awt.Color(237, 242, 239));
        titCantidadIn.setText("Cantidad:");

        jScrollPane1.setBackground(new java.awt.Color(209, 214, 70));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(237, 242, 239));

        listaArticulos.setBackground(new java.awt.Color(33, 39, 56));
        listaArticulos.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        listaArticulos.setForeground(new java.awt.Color(237, 242, 239));
        listaArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaArticulos.setSelectionBackground(new java.awt.Color(229, 231, 145));
        listaArticulos.setSelectionForeground(new java.awt.Color(33, 39, 56));
        jScrollPane1.setViewportView(listaArticulos);

        jScrollPane2.setBackground(new java.awt.Color(209, 214, 70));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(237, 242, 239));
        jScrollPane2.setToolTipText("");

        listaFuncionarios.setBackground(new java.awt.Color(33, 39, 56));
        listaFuncionarios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        listaFuncionarios.setForeground(new java.awt.Color(237, 242, 239));
        listaFuncionarios.setToolTipText("");
        listaFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaFuncionarios.setSelectionBackground(new java.awt.Color(229, 231, 145));
        listaFuncionarios.setSelectionForeground(new java.awt.Color(33, 39, 56));
        jScrollPane2.setViewportView(listaFuncionarios);

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                        .addComponent(titArticuloIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIngresoLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(titFuncionarioIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(titCantidadIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(ingCantidad))
                    .addGroup(panelIngresoLayout.createSequentialGroup()
                        .addComponent(titCodigoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(ingCodigo)))
                .addContainerGap())
            .addComponent(Ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titArticuloIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titFuncionarioIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titCodigoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titCantidadIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(botIngresar)
                .addGap(19, 19, 19))
        );

        ingCantidad.getAccessibleContext().setAccessibleName("");
        ingCantidad.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(panelIngreso);
        panelIngreso.setBounds(700, 80, 360, 360);

        jPanel2.setBackground(new java.awt.Color(33, 39, 56));

        bSiguiente.setText(">>");
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });

        bAnterior.setText("<<");
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });

        tituloDepo.setBackground(new java.awt.Color(237, 242, 239));
        tituloDepo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 22)); // NOI18N
        tituloDepo.setForeground(new java.awt.Color(33, 39, 56));
        tituloDepo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDepo.setText("Área seleccionada : 'A'");
        tituloDepo.setMaximumSize(new java.awt.Dimension(60, 30));
        tituloDepo.setMinimumSize(new java.awt.Dimension(60, 30));
        tituloDepo.setOpaque(true);
        tituloDepo.setPreferredSize(new java.awt.Dimension(60, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(bAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                .addComponent(bSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(403, 403, 403))
            .addComponent(tituloDepo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloDepo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 420, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSiguiente)
                    .addComponent(bAnterior))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1080, 530);

        setSize(new java.awt.Dimension(1094, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarTitulo(int unDeposito){
        switch(unDeposito){
            case 0:
                tituloDepo.setText("Área seleccionada : 'A'");
                break;
            case 1:
                tituloDepo.setText("Área seleccionada : 'B'");
                break;
            case 2:
                tituloDepo.setText("Área seleccionada : 'C'");
                break;
            case 3:
                tituloDepo.setText("Área seleccionada : 'D'");
                break;
            case 4:
                tituloDepo.setText("Área seleccionada : 'E'");
                break;
        }
    }    
    
    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        if(deposito < 4){
            deposito++;
        }else{
            deposito = 0;
        }
        cambiarTitulo(deposito);
        cambioPanel(areas[deposito], matrizBotones, fila, columna);
    }//GEN-LAST:event_bSiguienteActionPerformed
    
    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        if(deposito > 0){
            deposito--;
        }else{
            deposito = 4;
        }
        cambiarTitulo(deposito);
        try{
            cambioPanel(areas[deposito], matrizBotones, fila, columna);
        }catch(NullPointerException e){
        }
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void botEgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botEgresarActionPerformed
        int aceptar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la carga?", "Egresar carga." ,JOptionPane.OK_CANCEL_OPTION);
        if(aceptar == 0){
            modelo.eliminarCarga(deposito, fila, columna);
            areas = modelo.getAreas();
            cambioPanel(areas[deposito], matrizBotones, fila, columna);
            refrescarMatriz(matrizBotones, areas[deposito]);
        }
    }//GEN-LAST:event_botEgresarActionPerformed

    private void botIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIngresarActionPerformed
        Articulo a = (Articulo)listaArticulos.getSelectedValue();
        Funcionario f = (Funcionario)listaFuncionarios.getSelectedValue();
        if((ingCantidad.getText().isEmpty()) || (ingCodigo.getText().isEmpty()) || (a == null) || (f == null) || (!seleccion)){
            JOptionPane.showMessageDialog(null, "Debe indicar: funcionario, articulo, código y carga", "Error: campos incompletos.", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                Integer.parseInt(ingCantidad.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "La cantidad debe ser numérica.", "Error de formato.", JOptionPane.ERROR_MESSAGE);
            }
            try{
                Integer.parseInt(ingCodigo.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El código de carga debe ser numérico.", "Error de formato.", JOptionPane.ERROR_MESSAGE);
            }
            
            int unaCantidad = Integer.parseInt(ingCantidad.getText());
            int unCodigo = Integer.parseInt(ingCodigo.getText());
            boolean esta = modelo.validarCodigoEnAreas(unCodigo);
            
            if(esta){
                JOptionPane.showMessageDialog(null, "El código de carga debe ser único.", "Error: código duplicado.", JOptionPane.ERROR_MESSAGE);
            }else{
                int aceptar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar esta carga?", "Ingresar carga." ,JOptionPane.OK_CANCEL_OPTION);
                if(aceptar == 0){
                    Carga unaCarga = new Carga();
                    unaCarga.setArticulo(a);
                    unaCarga.setCantidad(unaCantidad);
                    unaCarga.setFuncionario(f);
                    unaCarga.setCodigo(unCodigo);
                    modelo.setCarga(deposito, fila, columna, unaCarga);
                    areas = modelo.getAreas();
                    cambioPanel(areas[deposito], matrizBotones, fila, columna);
                    ingCantidad.setText("");
                    ingCodigo.setText("");
                }
            }
        }
    }//GEN-LAST:event_botIngresarActionPerformed

    private void ingCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingCodigoActionPerformed

    private void ingCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingCantidadActionPerformed

    
    
    @Override
    public void update (Observable Obj, Object arg){
        actualizarListas();
        areas = modelo.getAreas();
        cambiarTitulo(deposito);
        cambioPanel(areas[deposito], matrizBotones, fila, columna);
        refrescarMatriz(matrizBotones, areas[deposito]);
        
        
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
            java.util.logging.Logger.getLogger(IECarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IECarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IECarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IECarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IECarga().setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ingreso;
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton botEgresar;
    private javax.swing.JButton botIngresar;
    private javax.swing.JLabel eArticulo;
    private javax.swing.JLabel eCantidad;
    private javax.swing.JLabel eCodigo;
    private javax.swing.JLabel eFuncionario;
    private javax.swing.JTextField ingCantidad;
    private javax.swing.JTextField ingCodigo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaArticulos;
    private javax.swing.JList listaFuncionarios;
    private javax.swing.JPanel panelEgreso;
    private javax.swing.JPanel panelEspacios;
    private javax.swing.JPanel panelIngreso;
    private javax.swing.JLabel titArticulo;
    private javax.swing.JLabel titArticuloIn;
    private javax.swing.JLabel titCantidad;
    private javax.swing.JLabel titCantidadIn;
    private javax.swing.JLabel titCodigo;
    private javax.swing.JLabel titCodigoIn;
    private javax.swing.JLabel titEgreso;
    private javax.swing.JLabel titFuncionario;
    private javax.swing.JLabel titFuncionarioIn;
    private javax.swing.JLabel tituloDepo;
    // End of variables declaration//GEN-END:variables
}
