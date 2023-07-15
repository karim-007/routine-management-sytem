package userfrom;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Abdul Karim
 */
public class Main extends javax.swing.JFrame {
    Connection conn = null;
    public Main(Connection conn) {
        this.conn=conn;
        initComponents();  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Succes = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        userLable = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        btnAttatch = new javax.swing.JButton();
        photourl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboPos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        combo_main = new javax.swing.JComboBox<>();
        roomtxt = new javax.swing.JTextField();
        btnAddRoom = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnDeleteRoom = new javax.swing.JButton();
        btnAddSub = new javax.swing.JButton();
        ComboSubList = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnDeleteSub = new javax.swing.JButton();
        btnRoutine = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page");
        setBounds(new java.awt.Rectangle(400, 70, 0, 0));
        setMinimumSize(new java.awt.Dimension(400, 94));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        Succes.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        Succes.setForeground(new java.awt.Color(0, 0, 255));
        Succes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Succes.setText("Succesfully Acces!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Succes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Succes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        nameLable.setForeground(new java.awt.Color(0, 102, 51));

        userLable.setForeground(new java.awt.Color(0, 102, 51));

        jLabel1.setText("Name:");

        jLabel2.setText("Username:");

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/logout.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/update.png"))); // NOI18N
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/delete.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/clear.png"))); // NOI18N
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setText("Photo");
        image.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 102))));

        jDesktopPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnAttatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/attatch.png"))); // NOI18N
        btnAttatch.setText("Attatch");
        btnAttatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttatchActionPerformed(evt);
            }
        });

        jLabel6.setText("URL:");

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 2, 14), new java.awt.Color(153, 204, 255)), javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 255)))); // NOI18N

        jLabel3.setText("Pass:");

        passwordtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userfrom/Save-icon.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("User:");

        jLabel5.setText("Name:");

        usernametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("ID:");

        ComboPos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "................", "Admin", "Professor", "Assistant Professor", "Senior Lecturer", "Lecturer" }));

        jLabel9.setText("Pos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboPos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernametxt)
                    .addComponent(passwordtxt)
                    .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(idtxt))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nametxt, passwordtxt, usernametxt});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, nametxt, passwordtxt, usernametxt});

        jScrollPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jScrollPane2KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        combo_main.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Techer", "Administrator" }));
        combo_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_mainActionPerformed(evt);
            }
        });

        btnAddRoom.setText("Add Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });

        jLabel8.setText("Room:");

        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        btnAddSub.setText("Add Subject");
        btnAddSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubActionPerformed(evt);
            }
        });

        ComboSubList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..........." }));
        ComboSubList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSubListActionPerformed(evt);
            }
        });

        jLabel10.setText("Sub. List:");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));

        btnDeleteSub.setText("Delete Subject");
        btnDeleteSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSubActionPerformed(evt);
            }
        });

        btnRoutine.setText("Routine");
        btnRoutine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoutineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(photourl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(btnAttatch)))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(roomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteRoom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRoutine)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboSubList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAddSub)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDeleteSub)
                                        .addGap(61, 61, 61))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userLable, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLable, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAttatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(photourl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userLable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(roomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddRoom)
                                .addComponent(jLabel8)
                                .addComponent(btnDeleteRoom)
                                .addComponent(btnRoutine)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnupdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddSub)
                                    .addComponent(ComboSubList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(btnDeleteSub))
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int lock=0;
        String value=combo_main.getSelectedItem().toString();
        String us=usernametxt.getText();
        if(idtxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("ID can't be Empty");
        }
        else if(nametxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("Name can't be Empty");
        }else if(usernametxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("User name field can't be Empty");
        }else if(passwordtxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("Password Field can't be Empty");
        }else{
            try {
                String u= new String();
                String sql=new String();
                if(value.equals("Administrator")){
                    sql="select * from UserInfo";
                }else if(value.equals("Techer")){
                    sql="select * from techertb";
                }
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
              while(rs.next()){
                  if(rs.getString("usename").equals(usernametxt.getText()))
                  {
                      lock=1;
                      jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                      Succes.setText("User Name Alrady use");
                      passwordtxt.setText(u);
                  }
              }
          } catch (SQLException ex) {
              Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
          }finally{
            try {
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Data closing Problem try Again");
            }
        }
        }
        int rm=0;//data insert check
        if(lock==0){
            try{
                String sql=new String();
                if(value.equals("Administrator")){
                    sql="Insert into UserInfo (ID,name,usename,password,photo,Possition) values (?,?,?,?,?,?)";
                }else if(value.equals("Techer")){
                    sql="Insert into techertb (ID,name,usename,password,photo,Possition) values (?,?,?,?,?,?)";
                }

                ps=conn.prepareStatement(sql);
                
                ps.setString(1, idtxt.getText());
                ps.setString(2, nametxt.getText());
                ps.setString(3, usernametxt.getText());
                ps.setString(4, passwordtxt.getText());
                ps.setBytes(5,person_photo);
                ps.setString(6,ComboPos.getSelectedItem().toString());

                ps.execute();
                rm=1;
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("Data succesfully Save");


            }catch(Exception e){

            }
       }
        int ro=0;//table create check
        if(rm==1 && value.equals("Techer")){
            //String sql="CREATE TABLE "'"+room+"'" ("name" VARCHAR, "usename" VARCHAR, "password" VARCHAR, "photo" BLOB, "Position" VARCHAR)";
            String sql = "CREATE TABLE '"+us+"' "+
                "(Day VARCHAR, "+
                "p1 VARCHAR, "+
                "p2 VARCHAR, "+
                "p3 VARCHAR, "+
                "p4 VARCHAR, "+
                "p5 VARCHAR, "+
                "p6 VARCHAR);"
                ;
            try{
                ro=1;
                ps=conn.prepareStatement(sql);
                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("Table succesfully Add");

            }catch(Exception e){
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Table adding Problem try Again");
            }
        }
        if(ro==1){
            for(int i=1;i<=5;i++){
            try{
                String sql =new String();
                sql="Insert into '"+us+"' (Day,p1,p2,p3,p4,p5,p6) values (?,?,?,?,?,?,?)";

                ps=conn.prepareStatement(sql);
                if(i==1){
                    //sql="Insert into '"+us+"' (Day,p1,p2,p3,p4,p5,p6) values (sunday,0,0,0,0,0,0)";
                    ps.setString(1, "sunday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==2){
                    //sql="Insert into '"+us+"' (Day,p1,p2,p3,p4,p5,p6) values (monday,0,0,0,0,0,0)";
                    ps.setString(1, "monday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==3){
                    //sql="Insert into '"+us+"' (Day,p1,p2,p3,p4,p5,p6) values (tuesday,0,0,0,0,0,0)";
                    ps.setString(1, "tuesday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==4){
                    //sql="Insert into '"+us+"' (Day,p1,p2,p3,p4,p5,p6) values (wednesday,0,0,0,0,0,0)";
                    ps.setString(1, "wednesday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==5){
                    //sql="Insert into '"+us+"' (Day,p1,p2,p3,p4,p5,p6) values (thusday,0,0,0,0,0,0)";
                    ps.setString(1, "thusday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }
                
                //ps=conn.prepareStatement(sql);
                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("All succesfully add");


            }catch(Exception e){
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("value  adding Problem try Again");
            }
            }
            btnAttatch.setEnabled(false);
        }
        update_table();
        textclr();
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            int row =jTable1.getSelectedRow();
            String Table_click=(jTable1.getModel().getValueAt(row, 0).toString());
            String value=combo_main.getSelectedItem().toString();
            String sql=new String();
            
                if(value.equals("Administrator")){
                    sql="select * from UserInfo where ID='"+Table_click+"' ";
                }else if(value.equals("Techer")){
                    sql="select * from techertb where ID='"+Table_click+"' ";
                }
                
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            if(rs.next()){
                String add1 =rs.getString("name");
                nametxt.setText(add1);
                
                String add2 =rs.getString("usename");
                usernametxt.setText(add2);
                
                String add3 =rs.getString("password");
                passwordtxt.setText(add3);
                
                String add4 =rs.getString("ID");
                idtxt.setText(add4);
                String add5 =rs.getString("Possition");
                ComboPos.setSelectedItem(add5);
                
                byte[]imagedata =rs.getBytes("photo");
                format =new ImageIcon(imagedata);
                image.setIcon(format);
            }
            
        }catch(Exception e){
            
        }
        usernametxt.setEnabled(false);
        passwordtxt.setEnabled(false);
        btnAttatch.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String value=combo_main.getSelectedItem().toString();
        String us=usernametxt.getText();
        int result = JOptionPane.showConfirmDialog(null, "Are you sure?\nwant to delete", "delete", JOptionPane.YES_NO_OPTION);
      if(result==0){
        String sql=new String();
                if(value.equals("Administrator")){
                    sql="delete from UserInfo where usename=?";
                }else if(value.equals("Techer")){
                    sql="delete from techertb where usename=?";
                }
        try{
                

                ps=conn.prepareStatement(sql);
                ps.setString(1, usernametxt.getText());
                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("Data succesfully delete");
                textclr();


            }catch(Exception e){
                    
            }finally{
                try {
                    update_table();
                    rs.close();
                    ps.close();
                } catch (SQLException ex) {
                    jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    Succes.setText("Data closing Problem try Again");
                }
        }
        
        if(value.equals("Techer")){
                String sq="delete from '"+us+"'"; 
                try{
                    ps=conn.prepareStatement(sq);
                    ps.executeUpdate();
                } catch (Exception ex) {
                    jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    Succes.setText("Table clear Problem try Again");
                }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (Exception ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
        }
        btnAttatch.setEnabled(false);
      }  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        int lock=0;
        String value=combo_main.getSelectedItem().toString();
        String pos=ComboPos.getSelectedItem().toString();
        
        if(idtxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("ID can't be Empty");
        }
        else if(nametxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("Name can't be Empty");
        }else if(usernametxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("User name field can't be Empty");
        }else if(passwordtxt.getText().isEmpty()){
            lock=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("Password Field can't be Empty");
        }
        
        if(lock==0){
            
            try{
                String value0=idtxt.getText();
                String value1=nametxt.getText();
                String value2=usernametxt.getText();
                String value3=passwordtxt.getText();
                
                
                String sql=new String();
            
                if(value.equals("Administrator")){
                    sql="Update UserInfo set ID='"+value0+"' ,name='"+value1+"' ,usename='"+value2+"' ,password='"+value3+"',Possition='"+pos+"' where usename='"+value2+"' ";
                }else if(value.equals("Techer")){
                    sql="Update techertb set ID='"+value0+"' ,name='"+value1+"' ,usename='"+value2+"' ,password='"+value3+"',Possition='"+pos+"' where usename='"+value2+"' ";
                }
                
                //String sql="Update UserInfo set ID='"+value0+"' ,name='"+value1+"' ,usename='"+value2+"' ,password='"+value3+"' where name='"+value1+"' ";

                ps=conn.prepareStatement(sql);

                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("Data succesfully Update");


            }
            catch(Exception ex){
                   jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    Succes.setText("Data update problem");
            }/*try{
                String sql = "update techertb set photo='" + person_photo + "' where usename='" + add1 + "'";
                ps=conn.prepareStatement(sql);

                ps.executeUpdate();
            }catch(Exception ex){
                
            }*/
            finally{
                    update_table();
                    btnAttatch.setEnabled(false);
            }
       }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        textclr();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnAttatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttatchActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageIcon =new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
        
        image.setIcon(imageIcon);
        photourl.setText(filename);
        
        
        try {
            
            File photo =new File(filename);
            FileInputStream fis=new FileInputStream(photo);
            
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf =new byte[1024];
            
            try {
                for(int readNum; (readNum=fis.read(buf)) !=-1; ){
                    bos.write(buf,0,readNum);
                }
            } catch (IOException ex) {
                
            }
            person_photo=bos.toByteArray();
            
        } catch (FileNotFoundException ex) {
            
        }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (SQLException ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
    }//GEN-LAST:event_btnAttatchActionPerformed

    private void jScrollPane2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2KeyPressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
        if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP){
            
           try{
            int row =jTable1.getSelectedRow();
            String Table_click=(jTable1.getModel().getValueAt(row, 0).toString());
            
            //String u = "select * from techertb where ID='"+Table_click+"' ";
            
            String value=combo_main.getSelectedItem().toString();
            String sql=new String();
            
                if(value.equals("Administrator")){
                    sql="select * from UserInfo where ID='"+Table_click+"' ";
                }else if(value.equals("Techer")){
                    sql="select * from techertb where ID='"+Table_click+"' ";
                }
            
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            if(rs.next()){
                String add1 =rs.getString("ID");
                idtxt.setText(add1);
                
                String add2 =rs.getString("name");
                nametxt.setText(add2);
                
                String add3 =rs.getString("usename");
                usernametxt.setText(add3);
                
                String add4 =rs.getString("password");
                passwordtxt.setText(add4);
                
                byte[]imagedata =rs.getBytes("photo");
                //ImageIcon imageIcon =new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
        
                format =new ImageIcon(imagedata);
                image.setIcon(format);
            }
            
        }catch(Exception e){
            
        }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (SQLException ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
          btnAttatch.setEnabled(false);  
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void combo_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_mainActionPerformed
        update_table();
        textclr();
    }//GEN-LAST:event_combo_mainActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jScrollPane2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2KeyReleased

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        String room=roomtxt.getText();
        int r=0;//room text filed emty check
        if(roomtxt.getText().isEmpty()){
            r=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("First Enter the Room number");
        }else{
            try {
                  String sql="select * from roomlist";
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
              while(rs.next()){
                  if(rs.getString("roomno").equals(roomtxt.getText()))
                  {
                      r=1;
                      jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                      Succes.setText("Room Alrady Listed");
                  }
              }
          } catch (SQLException ex) {
              Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
          }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (SQLException ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
        }
        int rm=0;//room insert check
        if(r==0){
            try{
                ps=conn.prepareStatement("Insert into roomlist (roomno) values (?)");
                
                ps.setString(1, roomtxt.getText());

                ps.execute();
                rm=1;
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("Room succesfully Add");

            }catch(Exception e){
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Room adding Problem try Again");
            }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (Exception ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
        }
        int ro=0;//table create check
        if(rm==1){
            //String sql="CREATE TABLE "'"+room+"'" ("name" VARCHAR, "usename" VARCHAR, "password" VARCHAR, "photo" BLOB, "Position" VARCHAR)";
            String sql = "CREATE TABLE '"+room+"' "+
                "(Day VARCHAR, "+
                "p1 VARCHAR, "+
                "p2 VARCHAR, "+
                "p3 VARCHAR, "+
                "p4 VARCHAR, "+
                "p5 VARCHAR, "+
                "p6 VARCHAR);"
                ;
            try{
                ro=1;
                ps=conn.prepareStatement(sql);
                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText("Room table succesfully Add");

            }catch(Exception e){
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Room table Problem try Again");
            }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (SQLException ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
        }
        if(ro==1){
            for(int i=1;i<=5;i++){
            try{
                String sql =new String();
                sql="insert into '"+room+"' (Day,p1,p2,p3,p4,p5,p6) values (?,?,?,?,?,?,?)";

                ps=conn.prepareStatement(sql);
                if(i==1){
                    ps.setString(1, "sunday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==2){
                    ps.setString(1, "monday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==3){
                    ps.setString(1, "tuesday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==4){
                    ps.setString(1, "wednesday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }else if(i==5){
                    ps.setString(1, "thusday");
                    ps.setString(2, "0");
                    ps.setString(3, "0");
                    ps.setString(4, "0");
                    ps.setString(5, "0");
                    ps.setString(6, "0");
                    ps.setString(7, "0");
                }
                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText(room+" Room All thing succesfully add");


            }catch(Exception e){
                   jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    //Succes.setText("Room value inserting problem");
            }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (SQLException ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
            }
        }

            roomtxt.setText("");  
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        
      String room=roomtxt.getText();
      int result = JOptionPane.showConfirmDialog(null, "Are you sure?\nwant to delete", "delete", JOptionPane.YES_NO_OPTION);
      int r=0;//room text filed emty check
      if(result==0){  
        if(roomtxt.getText().isEmpty()){
            r=1;
            jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            Succes.setText("First Enter the Room number");
        }else{
            try {
                r=1;
                  String sql="select * from roomlist";
                ps=conn.prepareStatement(sql);
                rs=ps.executeQuery();
              while(rs.next()){
                  if(rs.getString("roomno").equals(roomtxt.getText()))
                  {
                      r=0;
                      break;
                  }
              }
          } catch (Exception ex) {
              
          }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (Exception ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
          if(r==1){
              jPanel2.setBackground(new java.awt.Color(255, 0, 0));
              Succes.setText(room+" Room not found");
              roomtxt.setText("");
          }
        }
        int rm=0;//room delete confirmation
        if(r==0){
            
               String sql="delete from roomlist where roomno=?";
            try{
                rm=1;
                ps=conn.prepareStatement(sql);
                ps.setString(1, roomtxt.getText());
                ps.execute();
                
                
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText(room +" Room succesfully delete");

            }catch(Exception e){
                rm=0;
                 jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Room delete Problem try Again"); 
            }finally{  
                roomtxt.setText("");
                try {
                    rs.close();
                    ps.close();
                } catch (SQLException ex) {
                    jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    Succes.setText("Data closing Problem try Again");
                }
            }
        }
        if(rm==1){
            String sql="delete from '"+room+"'";
                
                
                try{
                    ps=conn.prepareStatement(sql);
                    ps.executeUpdate();
                } catch (Exception ex) {
                    jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    Succes.setText("Table Drop Problem try Again");
                }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (Exception ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }
        }
        
      }
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void btnAddSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubActionPerformed
        //AddSub d=new AddSub(conn);
        //this.setVisible(false);
        new AddSub(conn).setVisible(true);
    }//GEN-LAST:event_btnAddSubActionPerformed

    private void btnDeleteSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSubActionPerformed
        String val=ComboSubList.getSelectedItem().toString();
        int result = JOptionPane.showConfirmDialog(null, "Are you sure?\nwant to delete", "delete", JOptionPane.YES_NO_OPTION);
        if(result==0){
            try{
                String sql="delete from subjectList where subcode=? ";

                ps=conn.prepareStatement(sql);
                ps.setString(1,val);
                ps.execute();
                jPanel2.setBackground(new java.awt.Color(0,102,51));
                Succes.setText(val+" Subject succesfully Delete");
            }catch(Exception e){
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Subject Deleting Problem");
            }finally{  
                try {
                    rs.close();
                    ps.close();
                } catch (SQLException ex) {
                    jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                    Succes.setText("Data closing Problem try Again");
                    }
                }
            //subList();
        }
    }//GEN-LAST:event_btnDeleteSubActionPerformed

    private void ComboSubListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSubListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSubListActionPerformed

    private void btnRoutineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoutineActionPerformed
        this.setVisible(false);
        String q=userLable.getText();
        String p=nameLable.getText();
        RoutineFrom r=new RoutineFrom(conn);
        r.get(p,q);
        r.setVisible(true);
        
        
    }//GEN-LAST:event_btnRoutineActionPerformed
    private void update_table(){
        //table update
        String u= new String();
        String value=combo_main.getSelectedItem().toString();
        try {
                if(value.equals("Techer")){
                    u = "select * from techertb";
                }else if(value.equals("Administrator")){
                    u = "select * from UserInfo";
                }
                ps=conn.prepareStatement(u);
                rs=ps.executeQuery();
             // while(rs.next()){
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    photourl.setText(q);
                //}
              
          } catch (SQLException ex) {
              
          }finally{
            try {
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                Succes.setText("Data closing Problem try Again");
            }
        }
    }
    private void subList(){
        //DefaultListModel DLM=new DefaultListModel();
        String sql = "select * from subjectList";
        //ComboSubList.getItem().toString();
        try {
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
           while(rs.next())
           {
               String val=rs.getString("subcode");
                ComboSubList.addItem(val);
                
            }
           //subList.setModel(getString(rs));
        } catch (SQLException ex) {
            
        }finally{  
                    try {
                        rs.close();
                        ps.close();
                    } catch (SQLException ex) {
                        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                        Succes.setText("Data closing Problem try Again");
                    }
            }   
    }
    private void textclr(){
        nametxt.setText(q);
        usernametxt.setText(q);
        passwordtxt.setText(q);
        idtxt.setText(q);
        photourl.setText(q);
        image.setIcon(null);
        usernametxt.setEnabled(true);
        passwordtxt.setEnabled(true);
        btnAttatch.setEnabled(true);
    }
    public void details(String p,String q){//receving name and user
        nameLable.setText(p);
        userLable.setText(q);
        update_table();
        subList();
        
    }
    String q=new String();//Always Empty string
    PreparedStatement ps=null;
    ResultSet rs=null;
    String filename=null;
    private ImageIcon format =null;
    int s=0;
    byte[] person_photo=null;
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPos;
    private javax.swing.JComboBox<String> ComboSubList;
    private javax.swing.JLabel Succes;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JButton btnAddSub;
    private javax.swing.JButton btnAttatch;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JButton btnDeleteSub;
    private javax.swing.JToggleButton btnRoutine;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> combo_main;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField photourl;
    private javax.swing.JTextField roomtxt;
    private javax.swing.JLabel userLable;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables

}
