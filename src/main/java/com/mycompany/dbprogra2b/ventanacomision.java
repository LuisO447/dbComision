
package com.mycompany.dbprogra2b;

import datos.ClsConexion;
import java.sql.*;
import java.util.*;
import dominio.Clscomisiones;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis
 */
public class ventanacomision extends javax.swing.JFrame {
    
    
    
    private static final String SQL_SELECT = "select * from tb_comision where codigo =?";
    
    private static final String SQL_INSERT = "insert into tb_comision(nombre,enero,febrero,marzo,total,promedio) values (?,?,?,?,?,?)";
    
    private static final String SQL_UPDATE = "update tb_comision set nombre =?,enero=?,febrero=?,marzo=?,total=?,promedio=? where codigo=?";
    
    private static final String SQL_DELETE = "delete from tb_comision where codigo=?";
    
    
    
    
    int valor1 = 0;
    int valor2 = 0;
    int valor3 = 0;
    int sumaTotal = 0;
    double PromedioFinal = 0;
    
    
    
    
    //aca una public list
    
//     public List<Clscomisiones> seleccion (){
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//        Clscomisiones alumno = null;
//        List<Clscomisiones> alumnos = new ArrayList<Clscomisiones>();
//        
//        try {
//            conn = ClsConexion.getConnection();
//            stmt = conn.prepareStatement(SQL_SELECT);
//            rs = stmt.executeQuery();
//            
//            while(rs.next()){
//                int codigo = rs.getInt("codigo");
//                String nombre = rs.getString("nombre");
//                int enero = rs.getInt("enero");
//                int febrero = rs.getInt("febrero");
//                int marzo = rs.getInt("marzo");
//                int total = rs.getInt("total");
//                double promedio = rs.getDouble("promedio");
//                alumno = new Clscomisiones();
//                alumno.setCodigo(codigo);
//                alumno.setNombre(nombre);
//                alumno.setEnero(enero);
//                alumno.setFebrero(febrero);
//                alumno.setMarzo(marzo);
//                alumno.setTotal(total);
//                alumno.setPromedio(promedio);
//                alumnos.add(alumno);
//                
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        } finally{
//            ClsConexion.close(rs);
//            ClsConexion.close(stmt);
//            ClsConexion.close(conn);
//        }
//        
//        return alumnos;
//        
//    }
    
    /**
     * Creates new form ventanacomision
     */
    public ventanacomision() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEnero = new javax.swing.JTextField();
        txtFebrero = new javax.swing.JTextField();
        txtMarzo = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtPromedio = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtCodigomod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Comisiones");

        jLabel2.setText("Codigo: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Enero: ");

        jLabel5.setText("Febrero: ");

        jLabel6.setText("Marzo: ");

        jLabel7.setText("Total: ");

        jLabel8.setText("Promedio: ");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPromedioActionPerformed(evt);
            }
        });

        btnVer.setText("ver info");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtCodigomod.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnVer)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigomod))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtEnero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtFebrero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarzo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtPromedio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigomod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEnero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, txtNombre.getText());
            stmt.setInt(2, Integer.parseInt(txtEnero.getText()));
            stmt.setInt(3,Integer.parseInt(txtFebrero.getText()));
            stmt.setInt(4,Integer.parseInt(txtMarzo.getText()));
            //resuelto xd
            valor1 = Integer.parseInt(txtEnero.getText());
            valor2 = Integer.parseInt(txtFebrero.getText());
            valor3 = Integer.parseInt(txtMarzo.getText());
            
            sumaTotal = valor1+valor2+valor3;
            PromedioFinal = sumaTotal/3;
            
            stmt.setInt(5,sumaTotal);
            stmt.setDouble(6, PromedioFinal);
            
            rows = stmt.executeUpdate();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        
        
//        valor1 = Integer.parseInt(txtEnero.getText());
//        valor2 = Integer.parseInt(txtFebrero.getText());
//        valor3 = Integer.parseInt(txtMarzo.getText());
//        
//        sumaTotal = valor1+valor2+valor3;
//        
//        txtTotal.setText(""+sumaTotal);
        
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPromedioActionPerformed
        // TODO add your handling code here:
//        PromedioFinal = sumaTotal/3;
//        txtPromedio.setText(""+PromedioFinal);
    }//GEN-LAST:event_txtPromedioActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // aca es mostrar informacion      
//        List<Clscomisiones> todos = alJDBC.seleccion();
//        
//            for(Clscomisiones alumno : todos){
//                //System.out.println("Datos = "+alumno);
//                txtMostrartodo.setText("Datos: "+alumno);
//            }
        Connection con = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        
        try{
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            stmt.setString(1,txtCodigo.getText());
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                txtCodigo.setText(rs.getString("codigo"));
                txtNombre.setText(rs.getString("nombre"));
                txtEnero.setText(rs.getString("enero"));
                txtFebrero.setText(rs.getString("febrero"));
                txtMarzo.setText(rs.getString("marzo"));
                txtTotal.setText(rs.getString("total"));
                txtPromedio.setText(rs.getString("promedio"));
                
                
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe esa comision");
            }
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            
        }
        
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // aca es para modificar datos
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, txtNombre.getText());
            stmt.setInt(2, Integer.parseInt(txtEnero.getText()));
            stmt.setInt(3,Integer.parseInt(txtFebrero.getText()));
            stmt.setInt(4,Integer.parseInt(txtMarzo.getText()));
            
            valor1 = Integer.parseInt(txtEnero.getText());
            valor2 = Integer.parseInt(txtFebrero.getText());
            valor3 = Integer.parseInt(txtMarzo.getText());
            
            sumaTotal = valor1+valor2+valor3;
            PromedioFinal = sumaTotal/3;
            
            stmt.setInt(5,sumaTotal);
            stmt.setDouble(6, PromedioFinal);
            stmt.setInt(7,Integer.parseInt(txtCodigo.getText()));
            
            rows = stmt.executeUpdate();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Siuuu aca es para eliminar
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try{
            
            conn = ClsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            
            stmt.setInt(1,Integer.parseInt(txtCodigo.getText()));
            
            rows = stmt.executeUpdate();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            
            ClsConexion.close(stmt);
            ClsConexion.close(conn);
        }
        //Ya terminaste practicamente chaval
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanacomision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanacomision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanacomision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanacomision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanacomision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigomod;
    private javax.swing.JTextField txtEnero;
    private javax.swing.JTextField txtFebrero;
    private javax.swing.JTextField txtMarzo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPromedio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
