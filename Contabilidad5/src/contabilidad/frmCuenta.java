package contabilidad;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/*
 * @author Victor Hugo De La Presilla Vega
 * No. de control: 18141028.
 * Ingeniería en Sistemas Computacionales.
 */
public class frmCuenta extends javax.swing.JFrame {
   CCuenta cuenta[]=new CCuenta[14];
   private int limite=0;
    public frmCuenta() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cuenta = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_tipocuenta = new javax.swing.JLabel();
        lblsalida = new javax.swing.JLabel();
        txt_cvecuenta = new javax.swing.JTextField();
        txt_tipocuenta = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_saldo = new javax.swing.JTextField();
        jcb_tipo = new javax.swing.JComboBox();
        btn_crear = new javax.swing.JButton();
        btn_datos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_salida = new javax.swing.JTextArea();
        checarbalance = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        lbl_cuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cuenta.setForeground(new java.awt.Color(255, 153, 153));
        lbl_cuenta.setText("Clave de Cuenta");

        lblsaldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsaldo.setForeground(new java.awt.Color(255, 153, 153));
        lblsaldo.setText("Saldo");

        lbl_nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 153, 153));
        lbl_nombre.setText("Nombre / Descripción");

        lbl_tipocuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_tipocuenta.setForeground(new java.awt.Color(255, 153, 153));
        lbl_tipocuenta.setText("Tipo de cuenta");

        lblsalida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblsalida.setForeground(new java.awt.Color(255, 153, 153));
        lblsalida.setText("Errores:");

        txt_cvecuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_cvecuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cvecuentaActionPerformed(evt);
            }
        });

        txt_tipocuenta.setEditable(false);
        txt_tipocuenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_tipocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipocuentaActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        txt_saldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_saldoActionPerformed(evt);
            }
        });

        jcb_tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcb_tipo.setForeground(new java.awt.Color(255, 0, 0));
        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Pasivo", "Capital" }));
        jcb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tipoActionPerformed(evt);
            }
        });

        btn_crear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_crear.setText("Crear");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        btn_datos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_datos.setText("Ver datos");
        btn_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datosActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CUENTAS T'S.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sistema de contabilidad Zorros A.C ");
        jLabel7.setFocusable(false);

        jta_salida.setColumns(20);
        jta_salida.setRows(5);
        jScrollPane1.setViewportView(jta_salida);

        checarbalance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        checarbalance.setText("Checar Balance");
        checarbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarbalanceActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jEditorPane1);

        jButton1.setFont(new java.awt.Font("Unispace", 0, 13)); // NOI18N
        jButton1.setText("ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("asiento contable");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_tipocuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_cvecuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipocuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_saldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(checarbalance))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btn_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblsalida, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cuenta)
                            .addComponent(txt_cvecuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipocuenta)
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblsalida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(39, 39, 39)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(checarbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btn_limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_crear))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        String salida="";
        txt_cvecuenta.setText("");
        txt_nombre.setText("");
        txt_tipocuenta.setText("");
        txt_saldo.setText("");
        jta_salida.setText(salida);
        limite=0;
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void checarbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarbalanceActionPerformed
        /*Recorrer el arreglo activo = capital
        recorrido mostrar datos*/
        int posicion=0;
        String salida="";
        double tactivo=0, tpasivo=0, tcapital=0;
        while (posicion<14){
            if (cuenta[posicion].getTipo_cuenta().equals("Activo")){
                tactivo+=+cuenta[posicion].getSaldo();
                salida+=" "+ cuenta[posicion].toString();
            }

            if (cuenta[posicion].getTipo_cuenta().equals("Pasivo")){
                tpasivo+=+cuenta[posicion].getSaldo();
                salida+=" "+cuenta[posicion].toString();
            }

            if (cuenta[posicion].getTipo_cuenta().equals("Capital")){

                tcapital+=+cuenta[posicion].getSaldo();
                salida+=" "+cuenta[posicion].toString();
            }
            posicion++;
        }
        salida+=salida+"\n*Activo :"+tactivo+"\n";
        salida+=salida+"*Pasivo :"+tpasivo+"\n";
        salida+=salida+"*Capital :"+tcapital+"\n";

        /*activo = pasivo mas capital*/
        if (tactivo==(tpasivo+tcapital)){
            salida+="\nSu balance cuadra correctamente. \n";
        }else{
            salida+="\nEl balance NO cuadra.\n";
        }
        jta_salida.setText(salida);
    }//GEN-LAST:event_checarbalanceActionPerformed

    private void btn_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datosActionPerformed
        int posicion=-1;
        while ((posicion<0) || (posicion >14)){
            posicion = Integer.parseInt(JOptionPane.showInputDialog("posicion"));
        }
        String salida="";
        txt_cvecuenta.setText(cuenta[posicion].getCve_cuenta());
        txt_nombre.setText(cuenta[posicion].getNombre());
        txt_tipocuenta.setText(cuenta[posicion].getTipo_cuenta());
        txt_saldo.setText(cuenta[posicion].getSaldo()+" ");
        jta_salida.setText(salida);
    }//GEN-LAST:event_btn_datosActionPerformed

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        String tipo = txt_tipocuenta.getText();
        if (tipo.equals("Activo")){
            cuenta[limite]=new CActivo(); /*Variable limite aumenta*/
            cuenta[limite].setCve_cuenta(txt_cvecuenta.getText());
            cuenta[limite].setNombre(txt_nombre.getText());
            cuenta[limite].setTipo_cuenta(txt_tipocuenta.getText());

            cuenta[limite].setSaldo(Double.parseDouble(txt_saldo.getText()));
            lblsalida.setText("Objeto creado: "+(limite+1));

        }
        if (tipo.equals("Pasivo")){
            cuenta[limite]=new CPasivo();
            cuenta[limite].setCve_cuenta(txt_cvecuenta.getText());
            cuenta[limite].setNombre(txt_nombre.getText());
            cuenta[limite].setTipo_cuenta(txt_tipocuenta.getText());

            cuenta[limite].setSaldo(Double.parseDouble(txt_saldo.getText()));
            lblsalida.setText("Objeto creado: "+(limite+1));

        }
        if (tipo.equals("Capital")){
            cuenta[limite]=new CCapital();
            cuenta[limite].setCve_cuenta(txt_cvecuenta.getText());
            cuenta[limite].setNombre(txt_nombre.getText());
            cuenta[limite].setTipo_cuenta(txt_tipocuenta.getText());

            cuenta[limite].setSaldo(Double.parseDouble(txt_saldo.getText()));
            lblsalida.setText("Objeto creado: "+(limite+1));
        }

        String salida="";
        if (limite==13){
            for (int i=0; i<14;i++){
                salida+=i+"  "+cuenta[i].getClass()+"  "+cuenta[i].getNombre()+ "\n";
                /*Se determina que clase era, Pasivo, Activo o Capital (Clasifica*/
                }
            }
            jta_salida.setText(salida);
            limite++;
            
            
    }//GEN-LAST:event_btn_crearActionPerformed

    private void jcb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tipoActionPerformed
        txt_tipocuenta.setText(jcb_tipo.getSelectedItem()+"");
    }//GEN-LAST:event_jcb_tipoActionPerformed

    private void txt_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_saldoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_tipocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipocuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipocuentaActionPerformed

    private void txt_cvecuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cvecuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cvecuentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jta_salida.setText("");
      CCuenta orden=new CCuenta();
      String[] nOrden = orden.orden(limite, cuenta);
      String salida="";
      salida+="\t ****Cuentas Ordenadas*****\n";
      for(int i=0;i<limite;i++){
          salida+="Clave de Cuenta"+cuenta[i].getCve_cuenta()+"Nombre"+nOrden[i]+"Tipo de Cuenta"+cuenta[i].getTipo_cuenta()+"Saldo"+cuenta[i].getSaldo()+"\n";
      }
      jta_salida.setText(salida);        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /*String resta, cuent, cuental, monto, salida="";
        int l=0;
        double montol = 0, total=0;
        do{
               cuental=JOptionPane.showInputDialog("Clave de cuenta para descontar");
               cuent=JOptionPane.showInputDialog("Clave de cuenta para agrregar");
               monto=(JOptionPane.showInputDialog("Ingrese el monto al que se le descontara la cuenta con clave:"+cuental));
               montol= Double.parseDouble(monto);
               for(int i=1;i<14;i++){
                   if(cuent.equals(cuenta[i].getCve_cuenta())){
                       salida+="Clave de Cuenta: "+cuenta[i].getCve_cuenta()+"\nNombre: "+cuenta[i].getNombre()+"\nTipo: "+cuenta[i].getTipo_cuenta()+"\nsaldo: "+cuenta[i].getSaldo();
                       cuenta[i].debe(montol);
                       salida+="\nEl resultado de: "+cuenta[i].getNombre()+"es de: "+cuenta[i].getSaldo();
      
                   }
               }
               for(int j=0;j<=14;j++){
                   if(cuental.equals(cuenta[j].getCve_cuenta())){
                       salida+="Clave de Cuenta: "+cuenta[j].getCve_cuenta()+"\nNombre: "+cuenta[j].getNombre()+"\nTipo: "+cuenta[j].getTipo_cuenta()+"\nsaldo: "+cuenta[j].getSaldo();
                       cuenta[j].debe(montol);
                       salida+="\nEl resultado de: "+cuenta[j].getNombre()+"es de: "+cuenta[j].getSaldo();     
                   }
               }
               jta_salida.setText(salida);
            String re = JOptionPane.showInputDialog("Quiere realizar otro asiento contable?");
               re.toUpperCase();
        }while(re.equalsIgnoreCase("SI"));
        */
        double cantidad=0;
        String mov="";     
        int movs=0;
        String Mdebe="";
        String Mhab="";     
        movs = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos movimientos deseas hacer?"));
       int ix=0;
       do{
                    Mdebe=JOptionPane.showInputDialog("Ingresa la cuenta para debe: ");
                    cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad :"));
                        for (int j=0; j<14; j++){
                           if ( cuenta[j].getCve_cuenta().equals(Mdebe)){
                                cuenta[j].debe(cantidad);
                           }
                      ix++;     
                        }
                    Mhab=JOptionPane.showInputDialog("Ingresa la cuenta para haber: ");
                    cantidad=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad :"));
                     for (int j=0; j<14; j++){
                           if ( cuenta[j].getCve_cuenta().equals(Mhab)){
                               cuenta[j].haber(cantidad);
                           }
                        }
                     ix++;
        }while (ix<movs);
    }//GEN-LAST:event_jButton2ActionPerformed

     /* @param args the command line arguments
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
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_datos;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton checarbalance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcb_tipo;
    private javax.swing.JTextArea jta_salida;
    private javax.swing.JLabel lbl_cuenta;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_tipocuenta;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JLabel lblsalida;
    private javax.swing.JTextField txt_cvecuenta;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_tipocuenta;
    // End of variables declaration//GEN-END:variables
}

