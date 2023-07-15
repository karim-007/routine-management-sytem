package userfrom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

/**
 *
 * @author Abdul Karim
 */
public class Subchoice extends javax.swing.JFrame {

    Connection conn = null;
    public Subchoice(Connection conn){
        this.conn=conn;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        subList = new javax.swing.JList<>();
        choice1txt = new javax.swing.JTextField();
        choice2txt = new javax.swing.JTextField();
        choice3txt = new javax.swing.JTextField();
        choice4txt = new javax.swing.JTextField();
        choice5txt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDrop = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        userLable = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        succesMessage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        submitList = new javax.swing.JList<>();
        btnSubmitDrop = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subject Chooice");
        setBounds(new java.awt.Rectangle(400, 70, 0, 0));
        setMinimumSize(new java.awt.Dimension(600, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(subList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(221, 110, 75, 252);

        choice1txt.setEditable(false);
        choice1txt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(choice1txt);
        choice1txt.setBounds(110, 130, 90, 25);

        choice2txt.setEditable(false);
        choice2txt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(choice2txt);
        choice2txt.setBounds(110, 160, 90, 25);

        choice3txt.setEditable(false);
        choice3txt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(choice3txt);
        choice3txt.setBounds(110, 190, 90, 25);

        choice4txt.setEditable(false);
        choice4txt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(choice4txt);
        choice4txt.setBounds(110, 220, 90, 25);

        choice5txt.setEditable(false);
        choice5txt.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(choice5txt);
        choice5txt.setBounds(110, 250, 90, 25);

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(308, 257, 54, 25);

        btnsubmit.setBackground(new java.awt.Color(204, 204, 255));
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit);
        btnsubmit.setBounds(133, 300, 70, 25);

        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Choice1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 140, 50, 15);

        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Choice2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 170, 60, 15);

        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Choice3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 200, 60, 15);

        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("Choice4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 230, 60, 15);

        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Choice5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 260, 50, 15);

        btnDrop.setBackground(new java.awt.Color(204, 204, 255));
        btnDrop.setText("Drop");
        btnDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrop);
        btnDrop.setBounds(308, 293, 57, 25);

        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(75, 30, 50, 15);

        nameLable.setForeground(new java.awt.Color(204, 204, 0));
        getContentPane().add(nameLable);
        nameLable.setBounds(137, 30, 98, 15);

        jLabel8.setForeground(new java.awt.Color(204, 204, 0));
        jLabel8.setText("user:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(247, 30, 30, 15);

        userLable.setForeground(new java.awt.Color(204, 204, 0));
        getContentPane().add(userLable);
        userLable.setBounds(284, 30, 78, 15);

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/Go-back-icon (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(12, 30, 32, 26);

        succesMessage.setBackground(new java.awt.Color(0, 102, 51));
        succesMessage.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        succesMessage.setForeground(new java.awt.Color(255, 255, 0));
        succesMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(succesMessage);
        succesMessage.setBounds(0, 0, 637, 24);

        submitList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(submitList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(414, 110, 73, 252);

        btnSubmitDrop.setBackground(new java.awt.Color(204, 204, 255));
        btnSubmitDrop.setText("Drop");
        btnSubmitDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitDropActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmitDrop);
        btnSubmitDrop.setBounds(499, 256, 57, 25);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Available Sub");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(221, 77, 75, 16);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Submitted List");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 80, 90, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/programing-code-footage-011357463_prevstill - Copy.jpeg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-10, -5, 600, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String c1=choice1txt.getText();
        String c2=choice2txt.getText();
        String c3=choice3txt.getText();
        String c4=choice4txt.getText();
        String c5=choice5txt.getText();
        succesMessage.setText("");
        
            String s=(String)subList.getSelectedValue();
            String sql = "select * from subjectList";
        int v=0;
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
           while(rs.next())
           {
               if(rs.getString("Condition").equals("0") && rs.getString("subcode").equals(s)){
                   v=1;
               }else if(rs.getString("Condition").equals("1") && rs.getString("subcode").equals(s)){
                   succesMessage.setText("Subject Already taken other");
               }
                
            }
        } catch (Exception ex) {
             succesMessage.setText("Subject Available Check Problem");
        }finally{
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
                succesMessage.setText("Closing problem");
            }
            
        }
        if(v==1){
            if(choice1txt.getText().isEmpty()){
                choice1txt.setText(s);
            }else if(choice2txt.getText().isEmpty() && (c1 == null ? s != null : !c1.equals(s))){
                choice2txt.setText(s);

            }else if(choice3txt.getText().isEmpty() && !c1.equals(s) && !c2.equals(s)){
                choice3txt.setText(s);
            }else if(choice4txt.getText().isEmpty() && !c1.equals(s) && !c2.equals(s) && !c3.equals(s)){
                choice4txt.setText(s);

            }else if(choice5txt.getText().isEmpty() && (c1 == null ? s != null : !c1.equals(s)) && (c2 == null ? s != null : !c2.equals(s)) && (c3 == null ? s != null : !c3.equals(s)) && (c4 == null ? s != null : !c4.equals(s))){
                choice5txt.setText(s);

            }
        }   
            
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropActionPerformed
        
        if(!choice5txt.getText().isEmpty()){
            choice5txt.setText(new String());
        }else if(!choice4txt.getText().isEmpty()){
                choice4txt.setText(new String());
        }else if(!choice3txt.getText().isEmpty()){
                choice3txt.setText(new String());
        }else if(!choice2txt.getText().isEmpty()){
                choice2txt.setText(new String());
        }else if(!choice1txt.getText().isEmpty()){
                choice1txt.setText(new String());
        }
        
    }//GEN-LAST:event_btnDropActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        this.setVisible(false);
        
        Techerpage t=new Techerpage();
        t.setVisible(true);
        t.details(nameLable.getText(),userLable.getText());
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
                            /*choice insert*/
        
                String val1=new String();
                String val2=new String();
                String val3=new String();
                String val4=new String();
                String val5=new String();
                String user=userLable.getText();
                String c1=choice1txt.getText();
                String c2=choice2txt.getText();
                String c3=choice3txt.getText();
                String c4=choice4txt.getText();
                String c5=choice5txt.getText();
         int flage=0;                   
        if(choice1txt.getText().isEmpty()){
                succesMessage.setText("Add Subject first");
                flage=1;
            }else if(choice2txt.getText().isEmpty()){
                flage=1;
                succesMessage.setText("Minimum two subject add");
            }
        int f=0;
        if(flage==0){
        try{
            if(!choice1txt.getText().isEmpty() && !choice2txt.getText().isEmpty() && !choice3txt.getText().isEmpty() && !choice4txt.getText().isEmpty() && !choice5txt.getText().isEmpty()){
                String sql="Insert into subchoice (usename,c1,c2,c3,c4,c5) values(?,?,?,?,?,?)";
                ps=conn.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, c1);
                ps.setString(3, c2);
                ps.setString(4, c3);
                ps.setString(5, c4);
                ps.setString(6, c5);
            }else if(!choice1txt.getText().isEmpty() && !choice2txt.getText().isEmpty() && !choice3txt.getText().isEmpty() && !choice4txt.getText().isEmpty()){
                String sql="Insert into subchoice (usename,c1,c2,c3,c4,c5) values(?,?,?,?,?,?)";
                ps=conn.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, c1);
                ps.setString(3, c2);
                ps.setString(4, c3);
                ps.setString(5, c4);
                ps.setString(6, "0");
                
            }else if(!choice1txt.getText().isEmpty() && !choice2txt.getText().isEmpty() && !choice3txt.getText().isEmpty()){
                String sql="Insert into subchoice (usename,c1,c2,c3,c4,c5) values(?,?,?,?,?,?)";
                ps=conn.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, c1);
                ps.setString(3, c2);
                ps.setString(4, c3);
                ps.setString(5, "0");
                ps.setString(6, "0");
                
            }else if(!choice1txt.getText().isEmpty() && !choice2txt.getText().isEmpty()){
                String sql="Insert into subchoice (usename,c1,c2,c3,c4,c5) values(?,?,?,?,?,?)";
                ps=conn.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, c1);
                ps.setString(3, c2);
                ps.setString(4, "0");
                ps.setString(5, "0");
                ps.setString(6, "0");
                
            }
            ps.executeUpdate();
            f=1;
                //jPanel2.setBackground(new java.awt.Color(0,102,51));
                succesMessage.setText("Subject SuccesFully Submit");
        }catch(Exception e)
                {
                    succesMessage.setText("Subject Submition Fail");
                }
        finally{
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
                succesMessage.setText("Closing problem");
            }
            
        }  
            /*choice check*/
        int f1=0;
        if(f==1){        
            try{
                String sql="select * from subchoice";
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
                while(rs.next()){
                    if(rs.getString("usename").equals(userLable.getText()))
                    {
                        val1=rs.getString("c1");
                        val2=rs.getString("c2");
                        val3=rs.getString("c3");
                        val4=rs.getString("c4");
                        val4=rs.getString("c5");
                        f1=1;
                    }
                }
            }catch(Exception e){
                succesMessage.setText("value get problem");
            }finally{
                try {
                    ps.close();
                    rs.close();
                } catch (Exception ex) {
                    succesMessage.setText("Closing problem");
                }
            }
        }    
            /*choiced subject disable*/
          if(f1==1){  
            try {
                String temp="1";
                
                if(val1.length()>1){
                    String sql1="Update subjectList set Condition='"+temp+"' where subcode='"+val1+"'";
                    ps=conn.prepareStatement(sql1);
                    ps.executeUpdate();
                }
                if(val2.length()>1){
                    String sql2="Update subjectList set Condition='"+temp+"' where subcode='"+val2+"'";
                    ps=conn.prepareStatement(sql2);
                    ps.executeUpdate();
                }
                if(val3.length()>1){
                    String sql3="Update subjectList set Condition='"+temp+"' where subcode='"+val3+"'";
                    ps=conn.prepareStatement(sql3);
                    ps.executeUpdate();
                }
                if(val4.length()>1){
                    String sql4="Update subjectList set Condition='"+temp+"' where subcode='"+val4+"'";
                    ps=conn.prepareStatement(sql4);
                    ps.executeUpdate();
                }
                if(val5.length()>1){
                    String sql5="Update subjectList set Condition='"+temp+"' where subcode='"+val5+"'";
                    ps=conn.prepareStatement(sql5);
                    ps.executeUpdate();
                }
                succesMessage.setText("updated subject condition");
            }catch(Exception e){
                succesMessage.setText("condition update  problem");
            }finally{
                try {
                    ps.close();
                    rs.close();
                } catch (Exception ex) {
                    succesMessage.setText("Closing problem");
                }
            }
          }   
      list2();
      List();
      choice1txt.setText(new String());
      choice2txt.setText(new String());
      choice3txt.setText(new String());
      choice4txt.setText(new String());
      choice5txt.setText(new String());
      
    }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnSubmitDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitDropActionPerformed
        String val=(String)submitList.getSelectedValue();
        
            /*geting data*/
        int c=0;
        try{
            String sql="select *from subchoice";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                if(rs.getString("usename").equals(userLable.getText())){
                    if(rs.getString("c1").equals(val)){
                        c=1;
                    }else if(rs.getString("c2").equals(val)){
                        c=2;
                    }else if(rs.getString("c3").equals(val)){
                        c=3;
                    }else if(rs.getString("c4").equals(val)){
                        c=4;
                    }else if(rs.getString("c5").equals(val)){
                        c=5;
                    }
                }
            }
        }catch(Exception e){
           succesMessage.setText("getting Problem"); 
        }finally{
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
                succesMessage.setText("Closing problem");
            }
        }
        
                /*matching data*/
        int x=0;
        try{
            String sql=new String();
            String s="0";
            if(c==1){
                sql="Update subchoice set c1='"+s+"' where usename='"+userLable.getText()+"'";
                ps=conn.prepareStatement(sql);
                ps.executeUpdate();
                x=1;
            }else if(c==2){
                sql="Update subchoice set c2='"+s+"' where usename='"+userLable.getText()+"'";
                ps=conn.prepareStatement(sql);
                ps.executeUpdate();x=1;
            }else if(c==3){
                sql="Update subchoice set c3='"+s+"' where usename='"+userLable.getText()+"'";
                ps=conn.prepareStatement(sql);
                ps.executeUpdate();x=1;
            }else if(c==4){
                sql="Update subchoice set c4='"+s+"' where usename='"+userLable.getText()+"'";
                ps=conn.prepareStatement(sql);
                ps.executeUpdate();x=1;
            }else if(c==5){
                sql="Update subchoice set c5='"+s+"' where usename='"+userLable.getText()+"'";
                ps=conn.prepareStatement(sql);
                ps.executeUpdate();x=1;
            }
            
            
            //succesMessage.setText("data update succesfully"); 
        }catch(Exception e){
            succesMessage.setText("data update problem"); 
        }finally{
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
                succesMessage.setText("Closing problem");
            }
        }
        
        /*condition subject enable*/
        if(x==1){
            try{
                String temp="0";
                String sql="Update subjectList set Condition='"+temp+"' where subcode='"+val+"'";
                ps=conn.prepareStatement(sql);
                ps.executeUpdate();
                succesMessage.setText("Condition udate succesfully"); 
            }catch(Exception e){
                //succesMessage.setText("Condition udate problem"); 
            }finally{
                try {
                    ps.close();
                    rs.close();
                } catch (SQLException ex) {
                    succesMessage.setText("Closing problem");
                }
            }
        }  
    List();
    list2();    
    }//GEN-LAST:event_btnSubmitDropActionPerformed
    
    private void List(){
        DefaultListModel DLM=new DefaultListModel();
        
            /*All subject list*/
        try {
            String sql = "select * from subjectList";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
           while(rs.next())
           {
               if(rs.getString("Condition").equals("0")){
                    String val=rs.getString("subcode");
                    DLM.addElement(val);
               }
            }
           subList.setModel(DLM);
        } catch (SQLException ex) {
            
        }finally{
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                succesMessage.setText("Closing problem");
            }
        }
        
       
    }
    private void list2(){
         /*submitted subject list*/
        
        DefaultListModel DLM2=new DefaultListModel();
        String p=userLable.getText();
        try {
            String sql = "select * from subchoice";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
           while(rs.next())
           {
               if(rs.getString("usename").equals(p)){ 
               
                    DLM2.addElement(rs.getString("c1"));
                    DLM2.addElement(rs.getString("c2"));
                    DLM2.addElement(rs.getString("c3"));
                    DLM2.addElement(rs.getString("c4"));
                    DLM2.addElement(rs.getString("c5"));
               } 
            }
           submitList.setModel(DLM2);
        } catch (SQLException ex) {
            
        }finally{
            try {
                ps.close();
                rs.close();
            } catch (SQLException ex) {
                succesMessage.setText("Closing problem");
            }
        }
    }
    public void detail(String p,String q){//receving name and user
        nameLable.setText(p);
        userLable.setText(q);
        List();
        list2();
    }
    
    PreparedStatement ps=null;
    ResultSet rs=null;
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
            java.util.logging.Logger.getLogger(Subchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subchoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Subchoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDrop;
    private javax.swing.JButton btnSubmitDrop;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JTextField choice1txt;
    private javax.swing.JTextField choice2txt;
    private javax.swing.JTextField choice3txt;
    private javax.swing.JTextField choice4txt;
    private javax.swing.JTextField choice5txt;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLable;
    private javax.swing.JList<String> subList;
    private javax.swing.JList<String> submitList;
    private javax.swing.JLabel succesMessage;
    private javax.swing.JLabel userLable;
    // End of variables declaration//GEN-END:variables
}
