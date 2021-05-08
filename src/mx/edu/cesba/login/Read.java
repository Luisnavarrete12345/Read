/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.login;

import com.sun.glass.events.KeyEvent;
import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisn
 */
public class Read extends javax.swing.JFrame {
    conexion con= new conexion(); 
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;

    /**
     * Creates new form Read
     */
    public Read() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Menu2");
        this.setResizable(false);
        
        listar();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_phonenumber = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_hiredate = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        bnt_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("CONSULTA DE EMPLEADOS");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FirstName", "LastName", "Age", "Email", "PhoneNumber", "Salary", "HireDate"
            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        jLabel2.setText("ID");

        jLabel3.setText("FIRSTNAME");

        jLabel4.setText("LASTNAME");

        jLabel5.setText("AGE");

        jLabel6.setText("EMAIL");

        jLabel7.setText("PHONENUMBER");

        jLabel8.setText("SALARY");

        jLabel9.setText("HIREDATE");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });

        txt_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_firstnameKeyTyped(evt);
            }
        });

        txt_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lastnameKeyTyped(evt);
            }
        });

        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });
        txt_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ageKeyTyped(evt);
            }
        });

        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });

        txt_phonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phonenumberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phonenumberKeyTyped(evt);
            }
        });

        btn_agregar.setText("AGREGAR");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_return.setText("RETURN MENU");

        bnt_borrar.setForeground(new java.awt.Color(255, 0, 0));
        bnt_borrar.setText("BORRAR");

        btn_actualizar.setText("ACTUALIZAR");

        btn_consultar.setText("CONSULTAR");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Webp.net-resizeimage (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_hiredate)
                            .addComponent(txt_salary)
                            .addComponent(txt_phonenumber)
                            .addComponent(txt_email)
                            .addComponent(txt_age)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txt_firstname)
                            .addComponent(txt_lastname))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bnt_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_return)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_consultar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_hiredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_return)
                    .addComponent(bnt_borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_id.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        txt_age.setText("");
        txt_email.setText("");
        txt_phonenumber.setText("");
        txt_salary.setText("");
        txt_hiredate.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
          int age = Integer.parseInt(txt_age.getText());
String phone = txt_phonenumber.getText();
        int length = phone.length(); 
        int i=0;
       
          if (age <=17){
            getToolkit().beep();
           //evt.consume();
           i=i+0;
           JOptionPane.showMessageDialog(null, "DEBES SER MAYOR DE EDAD PARA INGRESAR!! VERIFICAR EDAD INGRESADA");
        
        }else i=i+1;
        if (length<10) {
            getToolkit().beep();
           //evt.consume();
            i=i+0;
           JOptionPane.showMessageDialog(null, "INGRESA 10 DIGITOS PARA TU TELEFONO");
        
            
        }else {i=i+1;
            
        } if (i>=2) {
            Agregar();
            limpiartable();
        }
      
          
   
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ageKeyTyped
        // TODO add your handling code here:  
        char solonumero = evt.getKeyChar();
        
        if (Character.isLetter(solonumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
        }
    }//GEN-LAST:event_txt_ageKeyTyped

    private void txt_firstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_firstnameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (Character.isLowerCase(c)) {
            
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
       if (Character.isDigit(c)) {
           
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "INGRESAR SOLO TEXTO!!");
           
        }
    }//GEN-LAST:event_txt_firstnameKeyTyped

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void txt_lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lastnameKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        
        if (Character.isLowerCase(c)) {
            
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
       if (Character.isDigit(c)) {
           
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "INGRESAR SOLO TEXTO!!");
       }
    }//GEN-LAST:event_txt_lastnameKeyTyped

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        
        if (Character.isLowerCase(c)) {
            
            String cad = (""+c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
       if (Character.isDigit(c)) {
           
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "INGRESAR SOLO TEXTO!!");
       }
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        // TODO add your handling code here:
        char solonumero = evt.getKeyChar();
        
        if (Character.isLetter(solonumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
        }
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_phonenumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phonenumberKeyTyped
        // TODO add your handling code here:
      
   char solonumero = evt.getKeyChar();
        
        if (Character.isLetter(solonumero)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
        }
        
    }//GEN-LAST:event_txt_phonenumberKeyTyped

    private void txt_phonenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phonenumberKeyPressed
        // TODO add your handling code here:
         String phone = txt_phonenumber.getText();
        int length = phone.length(); 
        
        char c = evt.getKeyChar();
        
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<= '9') {
            if (length<10) {
                 //getToolkit().beep();
           //evt.consume();
           //JOptionPane.showMessageDialog(null,"INGRESA 10 DIGITOS");
                txt_phonenumber.setEditable(true); 
                
            }else{
                txt_phonenumber.setEditable(false); 
            }
        }else{
            if (evt.getExtendedKeyCode()== KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()== KeyEvent.VK_DELETE) {
                txt_phonenumber.setEditable(true); 
            }
            else{
                txt_phonenumber.setEditable(false); 
            }
        }
    }//GEN-LAST:event_txt_phonenumberKeyPressed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
      // TODO add your handling code here:
         
    


    }//GEN-LAST:event_txt_ageActionPerformed

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
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Read.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Read().setVisible(true);
            }
        });
    }
    void listar(){
    String sql = "select * from employee";
        
        try{ 
            
            cn= con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] empleado = new Object[8];
            modelo = (DefaultTableModel) TablaDatos.getModel();
            
            while(rs.next()){ 
                empleado[0]= rs.getInt("ID");
                empleado[1]= rs.getString("firstname");     
                empleado[2]= rs.getString("lastname");
                empleado[3]= rs.getInt("age");
                empleado[4]= rs.getString("email");
                empleado[5]= rs.getInt("phonenumber");
                empleado[6]= rs.getDouble("salary"); 
                empleado[7]= rs.getString("hiredate");
                
                modelo.addRow(empleado); 
            }
            TablaDatos.setModel(modelo);
        }catch (Exception e){
            
         }           
            
        } 
    
    void Agregar(){
        int id= Integer.parseInt(txt_id.getText());
        
        String firstname = txt_firstname.getText();
        String lastname = txt_lastname.getText();
        int age = Integer.parseInt(txt_age.getText());
        String email = txt_email.getText();
        int phonenumber = Integer.parseInt(txt_phonenumber.getText());
        double salary = Double.parseDouble(txt_salary.getText());
        String hiredate = txt_hiredate.getText();
        
        try {
            
            String sql = "INSERT INTO employee (id, firstname, lastname, age, email, phonenumber, salary, hiredate) values ('" + id +"','" + firstname +"','" + lastname +"','" + age +"','" + email +"','" + phonenumber +"','" + salary +"','" + hiredate +"')";
                    
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
                    limpiartable();
                    
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATOS NO SE GUARDADOS CORRECTAMENTE");
            
         }
        }
    void limpiartable(){ 
        for(int i = 0; i<= TablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-i;
        }
    }
                            
                    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton bnt_borrar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hiredate;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_phonenumber;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}
