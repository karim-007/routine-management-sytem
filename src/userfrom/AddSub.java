
package userfrom;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AddSub extends javax.swing.JFrame {
    Connection conn=null;
    public AddSub(Connection conn) {
        this.conn=conn;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        codetxt = new javax.swing.JTextField();
        creadittxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subject Add");
        setBounds(new java.awt.Rectangle(400, 70, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setModalExclusionType(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Sub Name:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 90, 59, 17);

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Sub Code:");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 140, 59, 17);

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Sub Creadit:");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 190, 61, 17);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        btnSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSubmitKeyPressed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(230, 270, 66, 25);
        getContentPane().add(nametxt);
        nametxt.setBounds(170, 90, 90, 19);
        getContentPane().add(codetxt);
        codetxt.setBounds(170, 140, 90, 19);
        getContentPane().add(creadittxt);
        creadittxt.setBounds(170, 190, 90, 19);

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 0, 50, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-1", "1-2", "2-1", "2-2", "3-1", "3-2", "4-1", "4-2" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 230, 90, 24);

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Semister:");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 230, 60, 17);

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Add From", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(255, 255, 0))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 40, 280, 290);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/400.jpeg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        try{
            String sql="Insert into subjectList(subcode,subname,subcreadit,Condition,semister) values(?,?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,codetxt.getText());
            ps.setString(2,nametxt.getText());
            ps.setString(3,creadittxt.getText());
            ps.setString(4,"0");
            ps.setString(5,jComboBox1.getSelectedItem().toString());
            
            ps.executeUpdate();
            codetxt.setText("");
            nametxt.setText("");
            creadittxt.setText("");
            JOptionPane.showMessageDialog(null,"Sub Added");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSubmitKeyPressed(KeyEvent evt) {//GEN-FIRST:event_btnSubmitKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
            String sql="Insert into subjectList(subcode,subname,subcreadit,Condition) values(?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1,codetxt.getText());
            ps.setString(2,nametxt.getText());
            ps.setString(3,creadittxt.getText());
            ps.setString(4,"0");
            
            ps.executeUpdate();
            codetxt.setText("");
            nametxt.setText("");
            creadittxt.setText("");
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_btnSubmitKeyPressed

    private void jButton1KeyPressed(KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1KeyPressed

    /**
     * @param args the command line arguments
     */
    PreparedStatement ps=null;
    ResultSet rs=null;
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
            java.util.logging.Logger.getLogger(AddSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new AddSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField creadittxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nametxt;
    // End of variables declaration//GEN-END:variables
}
