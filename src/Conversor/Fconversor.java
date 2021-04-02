package Conversor;

public class Fconversor extends javax.swing.JFrame {

    OperConversor operar = new OperConversor();
    float Valini;
    double Valfin;
  
    
    public Fconversor() {
        initComponents();
    }
    
    public void entrada(){
        Valini = Float.parseFloat(valor.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        TipoValor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        ValorIni = new javax.swing.JComboBox<>();
        ValorFin = new javax.swing.JComboBox<>();
        jResult = new javax.swing.JTextField();
        jBConvertir = new javax.swing.JButton();
        jBterminar = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Convertidor");

        TipoValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Longitud", "Superficie", "Volumen", "Peso", "Velocidad", "Temperatura" }));
        TipoValor.setToolTipText("");
        TipoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoValorActionPerformed(evt);
            }
        });

        jLabel2.setText("Convertir");

        jLabel3.setText("De:");

        jLabel4.setText("A:");

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        jResult.setText("0");
        jResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResultActionPerformed(evt);
            }
        });

        jBConvertir.setText("Convertir");
        jBConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConvertirActionPerformed(evt);
            }
        });

        jBterminar.setText("Terminar");
        jBterminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBterminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TipoValor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valor)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ValorIni, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ValorFin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jResult, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBConvertir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBterminar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConvertir)
                    .addComponent(jBterminar))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBterminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBterminarActionPerformed
        //jResult.setText("0");
        //valor.setText("0");
        Bienvenida cerrar = new Bienvenida();
        cerrar.setVisible(false);
        cerrar.dispose();
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jBterminarActionPerformed

    private void jResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResultActionPerformed
       
        
    }//GEN-LAST:event_jResultActionPerformed

    private void TipoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoValorActionPerformed
        
        if(TipoValor.getSelectedItem().equals("Longitud")){
            
            ValorIni.removeAllItems();
            ValorFin.removeAllItems();
            
            ValorIni.addItem("Kilometros");
            ValorIni.addItem("Metros");
            ValorIni.addItem("Centimetros");
            ValorIni.addItem("Milimetros");
            ValorIni.addItem("Millas");
            ValorIni.addItem("Yardas");
            ValorIni.addItem("Pies");
            ValorIni.addItem("Pulgadas");
            
            ValorFin.addItem("Millas");
            ValorFin.addItem("Yardas");
            ValorFin.addItem("Pies");
            ValorFin.addItem("Pulgadas");
            ValorFin.addItem("Kilometros");
            ValorFin.addItem("Metros");
            ValorFin.addItem("Centimetros");
            ValorFin.addItem("Milimetros");
            
            
        } else if(TipoValor.getSelectedItem().equals("Superficie")){
            
            ValorIni.removeAllItems();
            ValorFin.removeAllItems();
            
            ValorIni.addItem("Km cuadrados");
            ValorIni.addItem("Hectareas");
            ValorIni.addItem("Metros cuadrados");
            ValorIni.addItem("Millas cuadradas");
            ValorIni.addItem("Acres");
            ValorIni.addItem("Pies cuadrados");
            ValorIni.addItem("Pulgada cuadrada");
            
            ValorFin.addItem("Millas cuadradas");
            ValorFin.addItem("Acres");
            ValorFin.addItem("Pies cuadrados");
            ValorFin.addItem("Pulgada cuadrada");
            ValorFin.addItem("Km cuadrados");
            ValorFin.addItem("Hectareas");
            ValorFin.addItem("Metros cuadrados");
             
        } else if(TipoValor.getSelectedItem().equals("Volumen")){
            
            ValorIni.removeAllItems();
            ValorFin.removeAllItems();
            
            ValorIni.addItem("Metro cubico");
            ValorIni.addItem("Litro");
            ValorIni.addItem("Centimetro cubico");
            ValorIni.addItem("Mililitro");
            ValorIni.addItem("Barril");
            ValorIni.addItem("Galon");
            ValorIni.addItem("Pinta");
            ValorIni.addItem("Onza liquida");
            
            ValorFin.addItem("Barril");
            ValorFin.addItem("Galon");
            ValorFin.addItem("Pinta");
            ValorFin.addItem("Onza liquida");
            ValorFin.addItem("Metro cubico");
            ValorFin.addItem("Litro");
            ValorFin.addItem("Centimetro cubico");
            ValorFin.addItem("Mililitro");
            
        } else if(TipoValor.getSelectedItem().equals("Peso")){
            
            ValorIni.removeAllItems();
            ValorFin.removeAllItems();
            
            ValorIni.addItem("Tonelada");
            ValorIni.addItem("Kilogramo");
            ValorIni.addItem("Gramo");
            ValorIni.addItem("Tonelada corta");
            ValorIni.addItem("Libra");
            ValorIni.addItem("Onza");
            
            ValorFin.addItem("Tonelada corta");
            ValorFin.addItem("Libra");
            ValorFin.addItem("Onza");
            ValorFin.addItem("Tonelada");
            ValorFin.addItem("Kilogramo");
            ValorFin.addItem("Gramo");
            
        } else if(TipoValor.getSelectedItem().equals("Velocidad")){
            
            ValorIni.removeAllItems();
            ValorFin.removeAllItems();
            
            ValorIni.addItem("Km/s");
            ValorIni.addItem("m/s");
            ValorIni.addItem("Km/hr");
            ValorIni.addItem("Milla/s");
            ValorIni.addItem("Milla/h");
            ValorIni.addItem("Pies/h");
            ValorIni.addItem("Nudo");
            
            ValorFin.addItem("Milla/s");
            ValorFin.addItem("Milla/h");
            ValorFin.addItem("Pies/h");
            ValorFin.addItem("Nudo");
            ValorFin.addItem("Km/s");
            ValorFin.addItem("m/s");
            ValorFin.addItem("Km/hr");
            
        } else if(TipoValor.getSelectedItem().equals("Temperatura")){
            
            ValorIni.removeAllItems();
            ValorFin.removeAllItems();
            
            ValorIni.addItem("Celcius");
            ValorIni.addItem("Fahrenheit");
            ValorIni.addItem("Kelvin");
                        
            ValorFin.addItem("Celcius");
            ValorFin.addItem("Fahrenheit");
            ValorFin.addItem("Kelvin");
        } 
    }//GEN-LAST:event_TipoValorActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        
    }//GEN-LAST:event_valorActionPerformed

    private void jBConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConvertirActionPerformed
        //km a
        if(ValorIni.getSelectedItem().equals("Kilometros") && ValorFin.getSelectedItem().equals("Millas")){
            entrada();
            operar.kilmilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        } 
        if(ValorIni.getSelectedItem().equals("Kilometros") && ValorFin.getSelectedItem().equals("Yardas")){
            entrada();
            operar.killyard(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Kilometros") && ValorFin.getSelectedItem().equals("Pies")){
            entrada();
            operar.killpie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Kilometros") && ValorFin.getSelectedItem().equals("Pulgadas")){
            entrada();
            operar.killpulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //metros a
        if (ValorIni.getSelectedItem().equals("Metros") && ValorFin.getSelectedItem().equals("Millas")){
            entrada();
            operar.metmilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metros") && ValorFin.getSelectedItem().equals("Yardas")){
            entrada();
            operar.metyard(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metros") && ValorFin.getSelectedItem().equals("Pies")){
            entrada();
            operar.metpie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metros") && ValorFin.getSelectedItem().equals("Pulgadas")){
            entrada();
            operar.metpulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        // cm a 
        if (ValorIni.getSelectedItem().equals("Centimetros") && ValorFin.getSelectedItem().equals("Millas")){
            entrada();
            operar.centmilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Centimetros") && ValorFin.getSelectedItem().equals("Yardas")){
            entrada();
            operar.centyard(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Centimetros") && ValorFin.getSelectedItem().equals("Pies")){
            entrada();
            operar.centpie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Centimetros") && ValorFin.getSelectedItem().equals("Pulgadas")){
            entrada();
            operar.centpulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //milimetros a
        if (ValorIni.getSelectedItem().equals("Milimetros") && ValorFin.getSelectedItem().equals("Millas")){
            entrada();
            operar.milmilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Milimetros") && ValorFin.getSelectedItem().equals("Yardas")){
            entrada();
            operar.milyard(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Milimetros") && ValorFin.getSelectedItem().equals("Pies")){
            entrada();
            operar.milpie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Milimetros") && ValorFin.getSelectedItem().equals("Pulgadas")){
            entrada();
            operar.milpulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //superficie
        // km2 a 
        if (ValorIni.getSelectedItem().equals("Km cuadrados") && ValorFin.getSelectedItem().equals("Millas cuadradas")){
            entrada();
            operar.kmctomilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km cuadrados") && ValorFin.getSelectedItem().equals("Acres")){
            entrada();
            operar.kmctoacres(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km cuadrados") && ValorFin.getSelectedItem().equals("Pies cuadrados")){
            entrada();
            operar.kmctopie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km cuadrados")&& ValorFin.getSelectedItem().equals("Pulgada cuadrada")){
            entrada();
            operar.kmctopulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //hectarea a
        if (ValorIni.getSelectedItem().equals("Hectareas") && ValorFin.getSelectedItem().equals("Millas cuadradas")){
            entrada();
            operar.hectomilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Hectareas") && ValorFin.getSelectedItem().equals("Acres")){
            entrada();
            operar.hectoacre(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Hectareas") && ValorFin.getSelectedItem().equals("Pies cuadrados")){
            entrada();
            operar.hectopie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Hectareas")&& ValorFin.getSelectedItem().equals("Pulgada cuadrada")){
            entrada();
            operar.hectopulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //metros2 a
        if (ValorIni.getSelectedItem().equals("Metros cuadrados") && ValorFin.getSelectedItem().equals("Millas cuadradas")){
            entrada();
            operar.metctomilla(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metros cuadrados") && ValorFin.getSelectedItem().equals("Acres")){
            entrada();
            operar.metctoacre(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metros cuadrados") && ValorFin.getSelectedItem().equals("Pies cuadrados")){
            entrada();
            operar.metctopie(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metros cuadrados")&& ValorFin.getSelectedItem().equals("Pulgada cuadrada")){
            entrada();
            operar.metctopulga(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        
        //volumen
        //metro3 a 
        if (ValorIni.getSelectedItem().equals("Metro cubico") && ValorFin.getSelectedItem().equals("Barril")){
            entrada();
            operar.metcubbarr(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metro cubico") && ValorFin.getSelectedItem().equals("Galon")){
            entrada();
            operar.metcubgal(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metro cubico") && ValorFin.getSelectedItem().equals("Pinta")){
            entrada();
            operar.metcubpinta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Metro cubico")&& ValorFin.getSelectedItem().equals("Onza liquida")){
            entrada();
            operar.metcubonza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        
        //Litro
        if (ValorIni.getSelectedItem().equals("Litro") && ValorFin.getSelectedItem().equals("Barril")){
            entrada();
            operar.litbarr(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Litro") && ValorFin.getSelectedItem().equals("Galon")){
            entrada();
            operar.litgal(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Litro") && ValorFin.getSelectedItem().equals("Pinta")){
            entrada();
            operar.litpinta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Litro")&& ValorFin.getSelectedItem().equals("Onza liquida")){
            entrada();
            operar.litbonza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //cm3 
        if (ValorIni.getSelectedItem().equals("Centimetro cubico") && ValorFin.getSelectedItem().equals("Barril")){
            entrada();
            operar.cm3barr(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Centimetro cubico") && ValorFin.getSelectedItem().equals("Galon")){
            entrada();
            operar.cm3gal(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Centimetro cubico") && ValorFin.getSelectedItem().equals("Pinta")){
            entrada();
            operar.cm3pinta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Centimetro cubico")&& ValorFin.getSelectedItem().equals("Onza liquida")){
            entrada();
            operar.cm3onza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //Mililitro
        if (ValorIni.getSelectedItem().equals("Mililitro") && ValorFin.getSelectedItem().equals("Barril")){
            entrada();
            operar.milibarr(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Mililitro") && ValorFin.getSelectedItem().equals("Galon")){
            entrada();
            operar.miligal(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Mililitro") && ValorFin.getSelectedItem().equals("Pinta")){
            entrada();
            operar.milipinta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Mililitro")&& ValorFin.getSelectedItem().equals("Onza liquida")){
            entrada();
            operar.milionza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //Peso
        //tonelada a
        if (ValorIni.getSelectedItem().equals("Tonelada") && ValorFin.getSelectedItem().equals("Tonelada corta")){
            entrada();
            operar.toneladacorta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Tonelada") && ValorFin.getSelectedItem().equals("Libra")){
            entrada();
            operar.tonlibra(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Tonelada") && ValorFin.getSelectedItem().equals("Onza")){
            entrada();
            operar.tononza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //kg a 
        if (ValorIni.getSelectedItem().equals("Kilogramo") && ValorFin.getSelectedItem().equals("Tonelada corta")){
            entrada();
            operar.kgcorta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Kilogramo") && ValorFin.getSelectedItem().equals("Libra")){
            entrada();
            operar.kglibra(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Kilogramo") && ValorFin.getSelectedItem().equals("Onza")){
            entrada();
            operar.kgonza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //GRamo a
        if (ValorIni.getSelectedItem().equals("Gramo") && ValorFin.getSelectedItem().equals("Tonelada corta")){
            entrada();
            operar.grcorta(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Gramo") && ValorFin.getSelectedItem().equals("Libra")){
            entrada();
            operar.grlibra(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Gramo") && ValorFin.getSelectedItem().equals("Onza")){
            entrada();
            operar.gronza(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //velocidad
        //km/s a 
        if (ValorIni.getSelectedItem().equals("Km/s") && ValorFin.getSelectedItem().equals("Milla/s")){
            entrada();
            operar.kmAmillas(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km/s") && ValorFin.getSelectedItem().equals("Milla/h")){
            entrada();
            operar.kmAmillah(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km/s") && ValorFin.getSelectedItem().equals("Pies/h")){
            entrada();
            operar.kmApies(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km/s") && ValorFin.getSelectedItem().equals("Nudo")){
            entrada();
            operar.kmAnudo(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //m/s
        if (ValorIni.getSelectedItem().equals("m/s") && ValorFin.getSelectedItem().equals("Milla/s")){
            entrada();
            operar.msAmillas(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("m/s") && ValorFin.getSelectedItem().equals("Milla/h")){
            entrada();
            operar.msAmillah(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("m/s") && ValorFin.getSelectedItem().equals("Pies/h")){
            entrada();
            operar.msApies(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("m/s") && ValorFin.getSelectedItem().equals("Nudo")){
            entrada();
            operar.msAnudos(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //km/h
        if (ValorIni.getSelectedItem().equals("Km/hr") && ValorFin.getSelectedItem().equals("Milla/s")){
            entrada();
            operar.kmhAmillas(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km/hr") && ValorFin.getSelectedItem().equals("Milla/h")){
            entrada();
            operar.kmhAmillah(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km/hr") && ValorFin.getSelectedItem().equals("Pies/h")){
            entrada();
            operar.kmhApies(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Km/hr") && ValorFin.getSelectedItem().equals("Nudo")){
            entrada();
            operar.kmhAnudo(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
  
        //temperatura
        //celcius
        if (ValorIni.getSelectedItem().equals("Celcius")&& ValorFin.getSelectedItem().equals("Celcius")){
            entrada();
            jResult.setText(String.valueOf(Valini));
        }
        if (ValorIni.getSelectedItem().equals("Celcius")&& ValorFin.getSelectedItem().equals("Fahrenheit")){
            entrada();
            operar.celfar(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Celcius")&& ValorFin.getSelectedItem().equals("Kelvin")){
            entrada();
            operar.celev(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //fahrenheit
        if (ValorIni.getSelectedItem().equals("Fahrenheit")&& ValorFin.getSelectedItem().equals("Fahrenheit")){
            entrada();
            jResult.setText(String.valueOf(Valini));
        }
        if (ValorIni.getSelectedItem().equals("Fahrenheit")&& ValorFin.getSelectedItem().equals("Celcius")){
            entrada();
            operar.farcel(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Fahrenheit")&& ValorFin.getSelectedItem().equals("Kelvin")){
            entrada();
            operar.farkev(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        //Kelvin
        if (ValorIni.getSelectedItem().equals("Kelvin")&& ValorFin.getSelectedItem().equals("Kelvin")){
            entrada();
            jResult.setText(String.valueOf(Valini));
        }
        if (ValorIni.getSelectedItem().equals("Kelvin")&& ValorFin.getSelectedItem().equals("Celcius")){
            entrada();
            operar.kevcel(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        if (ValorIni.getSelectedItem().equals("Kelvin")&& ValorFin.getSelectedItem().equals("Fahrenheit")){
            entrada();
            operar.kevfar(Valini);
            jResult.setText(String.valueOf(operar.result));
        }
        
        //inverso
        //millas a
        if(ValorIni.getSelectedItem().equals("Millas") && ValorFin.getSelectedItem().equals("Kilometros")){
            entrada();
            operar.kilmilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        } 
        if(ValorIni.getSelectedItem().equals("Millas") && ValorFin.getSelectedItem().equals("Metros")){
            entrada();
            operar.metmilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Millas") && ValorFin.getSelectedItem().equals("Centimetros")){
            entrada();
            operar.centmilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Millas") && ValorFin.getSelectedItem().equals("Milimetros")){
            entrada();
            operar.milmilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //yardas a
        if (ValorIni.getSelectedItem().equals("Yardas") && ValorFin.getSelectedItem().equals("Kilometros")){
            entrada();
            operar.killyard(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Yardas") && ValorFin.getSelectedItem().equals("Metros")){
            entrada();
            operar.metyard(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Yardas") && ValorFin.getSelectedItem().equals("Centimetros")){
            entrada();
            operar.centyard(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Yardas") && ValorFin.getSelectedItem().equals("Milimetros")){
            entrada();
            operar.milyard(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        // pies a 
        if (ValorIni.getSelectedItem().equals("Pies") && ValorFin.getSelectedItem().equals("Kilometros")){
            entrada();
            operar.killpie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies") && ValorFin.getSelectedItem().equals("Metros")){
            entrada();
            operar.metpie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies") && ValorFin.getSelectedItem().equals("Centimetros")){
            entrada();
            operar.centpie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies") && ValorFin.getSelectedItem().equals("Milimetros")){
            entrada();
            operar.milpie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //Pulgadas a
        if (ValorIni.getSelectedItem().equals("Pulgadas") && ValorFin.getSelectedItem().equals("Kilometros")){
            entrada();
            operar.killpulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pulgadas") && ValorFin.getSelectedItem().equals("Metros")){
            entrada();
            operar.metpulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pulgadas") && ValorFin.getSelectedItem().equals("Centimetros")){
            entrada();
            operar.centpulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pulgadas") && ValorFin.getSelectedItem().equals("Milimetros")){
            entrada();
            operar.milpulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //superficie
        // milla2 a 
        if (ValorIni.getSelectedItem().equals("Millas cuadradas") && ValorFin.getSelectedItem().equals("Km cuadrados")){
            entrada();
            operar.kmctomilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Millas cuadradas") && ValorFin.getSelectedItem().equals("Hectarea")){
            entrada();
            operar.hectomilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Millas cuadradas") && ValorFin.getSelectedItem().equals("Metros cuadrados")){
            entrada();
            operar.metctomilla(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
       
        //hectarea a
        if (ValorIni.getSelectedItem().equals("Acres") && ValorFin.getSelectedItem().equals("Km cuadrados")){
            entrada();
            operar.kmctoacres(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Acres") && ValorFin.getSelectedItem().equals("Hectarea")){
            entrada();
            operar.hectoacre(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Acres") && ValorFin.getSelectedItem().equals("Metros cuadrados")){
            entrada();
            operar.metctoacre(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
      
        //pies2 a
        if (ValorIni.getSelectedItem().equals("Pies cuadrados") && ValorFin.getSelectedItem().equals("Km cuadrados")){
            entrada();
            operar.kmctopie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies cuadrados") && ValorFin.getSelectedItem().equals("Hectareas")){
            entrada();
            operar.hectopie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies cuadrados") && ValorFin.getSelectedItem().equals("Metros cuadrados")){
            entrada();
            operar.metctopie(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        
        //pulgadas2 a
         if (ValorIni.getSelectedItem().equals("Pulgada cuadrada")&& ValorFin.getSelectedItem().equals("Km cuadrados")){
            entrada();
            operar.kmctopulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
         if (ValorIni.getSelectedItem().equals("Pulgada cuadrada")&& ValorFin.getSelectedItem().equals("Hectareas")){
            entrada();
            operar.hectopulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
         if (ValorIni.getSelectedItem().equals("Pulgada cuadrada")&& ValorFin.getSelectedItem().equals("Metros cuadrados")){
            entrada();
            operar.metctopulga(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        
        
        //volumen
        //barril a 
        if (ValorIni.getSelectedItem().equals("Barril") && ValorFin.getSelectedItem().equals("Metro cubico")){
            entrada();
            operar.metcubbarr(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Barril") && ValorFin.getSelectedItem().equals("Litro")){
            entrada();
            operar.litbarr(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Barril") && ValorFin.getSelectedItem().equals("Centimetro cubico")){
            entrada();
            operar.metcubbarr(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Barril")&& ValorFin.getSelectedItem().equals("Mililitro")){
            entrada();
            operar.milibarr(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        
        //Galon
        if (ValorIni.getSelectedItem().equals("Galon") && ValorFin.getSelectedItem().equals("Metro cubico")){
            entrada();
            operar.metcubgal(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Galon") && ValorFin.getSelectedItem().equals("Litro")){
            entrada();
            operar.litgal(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Galon") && ValorFin.getSelectedItem().equals("Centimetro cubico")){
            entrada();
            operar.cm3gal(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Galon")&& ValorFin.getSelectedItem().equals("Mililitro")){
            entrada();
            operar.miligal(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //cm3 
        if (ValorIni.getSelectedItem().equals("Pinta") && ValorFin.getSelectedItem().equals("Metro cubico")){
            entrada();
            operar.metcubpinta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pinta") && ValorFin.getSelectedItem().equals("Litro")){
            entrada();
            operar.litpinta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pinta") && ValorFin.getSelectedItem().equals("Centimetro cubico")){
            entrada();
            operar.cm3pinta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pinta")&& ValorFin.getSelectedItem().equals("Mililitro")){
            entrada();
            operar.milipinta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //onza
        if (ValorIni.getSelectedItem().equals("Onza liquida") && ValorFin.getSelectedItem().equals("Metro cubico")){
            entrada();
            operar.metcubonza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Onza liquida") && ValorFin.getSelectedItem().equals("Litro")){
            entrada();
            operar.litbonza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Onza liquida") && ValorFin.getSelectedItem().equals("Centimetro cubico")){
            entrada();
            operar.cm3onza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Onza liquida")&& ValorFin.getSelectedItem().equals("Mililitro")){
            entrada();
            operar.milionza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //Peso
        //tonelada a
        if (ValorIni.getSelectedItem().equals("Tonelada corta") && ValorFin.getSelectedItem().equals("Tonelada")){
            entrada();
            operar.toneladacorta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Tonelada corta") && ValorFin.getSelectedItem().equals("Kilogramo")){
            entrada();
            operar.kgcorta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Tonelada corta") && ValorFin.getSelectedItem().equals("Gramo")){
            entrada();
            operar.grcorta(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //libra a 
        if (ValorIni.getSelectedItem().equals("Libra") && ValorFin.getSelectedItem().equals("Tonelada")){
            entrada();
            operar.tonlibra(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Libra") && ValorFin.getSelectedItem().equals("Kilogramo")){
            entrada();
            operar.kglibra(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Libra") && ValorFin.getSelectedItem().equals("Gramo")){
            entrada();
            operar.grlibra(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //onza a
        if (ValorIni.getSelectedItem().equals("Onza") && ValorFin.getSelectedItem().equals("Tonelada")){
            entrada();
            operar.tononza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Onza") && ValorFin.getSelectedItem().equals("Kilogramo")){
            entrada();
            operar.kgonza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Onza") && ValorFin.getSelectedItem().equals("Gramo")){
            entrada();
            operar.gronza(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //velocidad
        //milla/s a 
        if (ValorIni.getSelectedItem().equals("Milla/s") && ValorFin.getSelectedItem().equals("Km/s")){
            entrada();
            operar.kmAmillas(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Milla/s") && ValorFin.getSelectedItem().equals("m/s")){
            entrada();
            operar.msAmillas(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Milla/s") && ValorFin.getSelectedItem().equals("Km/h")){
            entrada();
            operar.kmhAmillas(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        
        //milla/h
        if (ValorIni.getSelectedItem().equals("Milla/h") && ValorFin.getSelectedItem().equals("Km/s")){
            entrada();
            operar.kmAmillah(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Milla/h") && ValorFin.getSelectedItem().equals("m/s")){
            entrada();
            operar.msAmillah(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Milla/h") && ValorFin.getSelectedItem().equals("Km/h")){
            entrada();
            operar.kmhAmillah(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        
        //pie/s
        if (ValorIni.getSelectedItem().equals("Pies/h") && ValorFin.getSelectedItem().equals("Km/s")){
            entrada();
            operar.kmApies(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies/h") && ValorFin.getSelectedItem().equals("m/s")){
            entrada();
            operar.msApies(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Pies/h") && ValorFin.getSelectedItem().equals("Km/h")){
            entrada();
            operar.kmhApies(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        //nudo
        if (ValorIni.getSelectedItem().equals("Nudo") && ValorFin.getSelectedItem().equals("Km/s")){
            entrada();
            operar.kmAnudo(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Nudo") && ValorFin.getSelectedItem().equals("m/s")){
            entrada();
            operar.msAnudos(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        if (ValorIni.getSelectedItem().equals("Nudo") && ValorFin.getSelectedItem().equals("Km/h")){
            entrada();
            operar.kmhAnudo(Valini);
            jResult.setText(String.valueOf(operar.inverse));
        }
        
        
    }//GEN-LAST:event_jBConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(Fconversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fconversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fconversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fconversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fconversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoValor;
    private javax.swing.JComboBox<String> ValorFin;
    private javax.swing.JComboBox<String> ValorIni;
    private javax.swing.JButton jBConvertir;
    private javax.swing.JButton jBterminar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JTextField jResult;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
