/*
 *  Contact Manager Program is a phone-book kind of desktop application used for Adding a new record(All fields required),
 *  Deleting an unwanted record (SSN is required for Deletion), Updating few fields of record(SSN is required for Updation,
 *  Searching a record from the database( Program searches on any fields, if none specific field is given then it gives data of all persons)
 *  
 *  Written by AMAN SACHAN for CS6390.004, Assignment 4, Starting Oct 20, 2017.
 *  NetID: axs174330
 */
package contactmanager;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;
/**
 * @author AMAN
 */
/* SearchPage is JFrame which contains the aaplication logic and User Interface*/
public class SearchPage extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs1 = null, rs2 = null, rs3 = null, rs5 = null;
    PreparedStatement pst1 = null, pst2 = null, pst3 = null, pst4 = null, pst5 = null;

    /**
     * Creates new form SearchPage
     */
    public SearchPage() {
        initComponents();
        conn = ConnectDB.ConnectSql();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_fname = new javax.swing.JFormattedTextField();
        txt_mname = new javax.swing.JFormattedTextField();
        txt_lname = new javax.swing.JFormattedTextField();
        txt_ssn = new javax.swing.JFormattedTextField();
        txt_line = new javax.swing.JFormattedTextField();
        txt_salary = new javax.swing.JFormattedTextField();
        jb_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_person = new javax.swing.JTable();
        cb_dept = new javax.swing.JComboBox<>();
        cb_gender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jb_add = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_bdate = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_status = new javax.swing.JFormattedTextField();
        jb_delete = new javax.swing.JButton();
        jb_update = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_email = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JFormattedTextField();
        jb_clear = new javax.swing.JButton();
        txt_city = new javax.swing.JFormattedTextField();
        txt_state = new javax.swing.JFormattedTextField();
        txt_zip = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_country = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Contact Manager "); // NOI18N

        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fnameKeyTyped(evt);
            }
        });

        txt_mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mnameActionPerformed(evt);
            }
        });
        txt_mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mnameKeyTyped(evt);
            }
        });

        txt_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lnameKeyTyped(evt);
            }
        });

        txt_ssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ssnActionPerformed(evt);
            }
        });
        txt_ssn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ssnKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ssnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ssnKeyTyped(evt);
            }
        });

        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });
        txt_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salaryKeyTyped(evt);
            }
        });

        jb_search.setBackground(new java.awt.Color(0, 153, 255));
        jb_search.setText("Search ");
        jb_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchActionPerformed(evt);
            }
        });
        jb_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jb_searchKeyTyped(evt);
            }
        });

        tb_person.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "SSN", "Sex", "DOB", "Email", "Phone no.", "Address "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_person);

        cb_dept.setMaximumRowCount(10);
        cb_dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Research", "Administration", "Headquarters", "Software", "Hardware", "Sales" }));
        cb_dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_deptActionPerformed(evt);
            }
        });

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F" }));
        cb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_genderActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Middle Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("SSN*");

        jLabel5.setText("Address:-");

        jLabel6.setText("Gender");

        jLabel7.setText("Salary");

        jLabel8.setText("Department ");

        jb_add.setBackground(new java.awt.Color(51, 255, 51));
        jb_add.setText("Add");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });

        jLabel9.setText("DOB(YYYY-MM-DD) ");

        txt_bdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bdateActionPerformed(evt);
            }
        });
        txt_bdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bdateKeyTyped(evt);
            }
        });

        jLabel10.setText("Status : -  ");

        txt_status.setEditable(false);
        txt_status.setBorder(null);
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });

        jb_delete.setBackground(new java.awt.Color(255, 102, 102));
        jb_delete.setText("Delete");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });

        jb_update.setBackground(new java.awt.Color(204, 0, 204));
        jb_update.setText("Update ");
        jb_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_updateActionPerformed(evt);
            }
        });

        jLabel11.setText("Email");

        jLabel12.setText("Phone No.");

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });

        jb_clear.setBackground(new java.awt.Color(255, 255, 204));
        jb_clear.setText("Clear");
        jb_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clearActionPerformed(evt);
            }
        });

        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });

        txt_zip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_zipKeyTyped(evt);
            }
        });

        jLabel13.setText("Street");

        jLabel14.setText("City");

        jLabel15.setText("State");

        jLabel16.setText("Zip");

        jLabel17.setText("Country");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jb_search)
                .addGap(107, 107, 107)
                .addComponent(jb_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_zip, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addGap(10, 10, 10)
                                .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel15)
                                    .addGap(12, 12, 12)
                                    .addComponent(txt_state))
                                .addComponent(txt_line, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(334, 334, 334)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_mname, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_delete)
                                .addGap(145, 145, 145)
                                .addComponent(jb_update)
                                .addGap(168, 168, 168)
                                .addComponent(jb_clear)))))
                .addGap(111, 111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(txt_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txt_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txt_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cb_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_search)
                    .addComponent(jb_add)
                    .addComponent(jb_delete)
                    .addComponent(jb_update)
                    .addComponent(jb_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mnameActionPerformed

    /* jb_searchActionPerformed is JButton used for searching the data */
    private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchActionPerformed
        try {
            if (txt_fname.getText().equals("") && txt_mname.getText().equals("") && txt_lname.getText().equals("") && txt_ssn.getText().equals("") && cb_gender.getSelectedItem().equals("") && txt_bdate.getText().equals("") && txt_salary.getText().equals("") && cb_dept.getSelectedItem().equals("") && txt_email.getText().equals("") && txt_phone.getText().equals("") && txt_line.getText().equals("") && txt_city.getText().equals("") && txt_state.getText().equals("") && txt_zip.getText().equals("") && txt_country.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Write some parameters for Refined results");
            }
            CallableStatement cst1 = conn.prepareCall("{call Search (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}"); /*Calling a stored procedure named search */
            cst1.setString(1, "%" + txt_fname.getText() + "%"); /*Using wild card operators "%" to find First name  */
            cst1.setString(2, "%" + txt_mname.getText() + "%");
            cst1.setString(3, "%" + txt_lname.getText() + "%");
            cst1.setString(4, txt_ssn.getText() + "%");
            cst1.setString(5, (String) "%" + cb_gender.getSelectedItem() + "%");
            cst1.setString(6, "%" + txt_bdate.getText() + "%");
            cst1.setString(7, ("%" + txt_salary.getText() + "%"));
            cst1.setString(8, (String) "%" + cb_dept.getSelectedItem() + "%");
            cst1.setString(9, "%" + txt_email.getText() + "%");
            cst1.setString(10, "%" + txt_phone.getText() + "%");
            cst1.setString(11, "%" + txt_line.getText() + "%");
            cst1.setString(12, "%" + txt_city.getText() + "%");
            cst1.setString(13, "%" + txt_state.getText() + "%");
            cst1.setString(14, "%" + txt_zip.getText() + "%");
            cst1.setString(15, "%" + txt_country.getText() + "%");
            rs1 = cst1.executeQuery();
            boolean flag = true;
            while (rs1.next()) {
                String fname = rs1.getString(1);    /* Fetching data from result set */
                String mname = rs1.getString(2);
                String lname = rs1.getString(3);
                String ssn = rs1.getString(4);
                String gender = rs1.getString(5);
                String bdate = rs1.getString(6);
                String pemail = rs1.getString(9);
                String phone_no = rs1.getString(10);
                String paddress = rs1.getString(11) + "," + rs1.getString(12) + "," + rs1.getString(13) + "," + rs1.getString(14) + "," + rs1.getString(15);
                Object[] content1 = {fname, mname, lname, ssn, gender, bdate, pemail, phone_no, paddress};    /* Creaing Object to print data in Table */
                DefaultTableModel modle = (DefaultTableModel) tb_person.getModel();  /* Fetching the default table model */
                modle.addRow(content1);
                String t = "Data Found !!"; /* Prining Status  */
                txt_status.setText(t);
                flag = false; /* Flag to know weather data is found or not*/   
            }
            if (flag) { /* Checking if flag is true, means no data found then print resul on String  */
                String t = "Data Not Found !!";
                txt_status.setText(t);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Write some parameters to search");
        }
    }//GEN-LAST:event_jb_searchActionPerformed

    private void cb_deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_deptActionPerformed
    /* jb_addActionPerformed is JButton used for adding a new employee data */
    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed

        try {
            if (txt_fname.getText().length() != 0 || txt_lname.getText().length() != 0 || txt_bdate.getText().length() != 0 || txt_salary.getText().length() != 0) { /* Checking whether none of the text boxes are left blank*/
                if (Integer.parseInt(txt_salary.getText()) >= 0) { /* Checking Salary should be poitive */
                    if (checkEmail(txt_email.getText()) == true) { /* Checking the email format,whether it contains @ and .com/.edu etc parts */
                        if (txt_ssn.getText().length() == 9) { /* Checking the length of ssn is 9 or not */
                            String sql5 = "select ssn from person where ssn=?";
                            pst5 = conn.prepareStatement(sql5);
                            pst5.setString(1, txt_ssn.getText());
                            rs5 = pst5.executeQuery();
                            if (rs5.next() == false) {
                                CallableStatement cst = conn.prepareCall("{call InsertPerson (?,?,?,?,?,?,?,?)}"); /* Calling Stored Proc to Insert into Person */
                                cst.setString(1, txt_fname.getText());
                                cst.setString(2, txt_mname.getText());
                                cst.setString(3, txt_lname.getText());
                                cst.setString(4, txt_ssn.getText());
                                cst.setString(5, (String) cb_gender.getSelectedItem());
                                cst.setString(6, txt_bdate.getText());
                                //cst.setDouble(7, Double.parseDouble(txt_salary.getText()));
                                cst.setString(7, txt_salary.getText());
                                cst.setString(8, (String) cb_dept.getSelectedItem());
                                cst.executeUpdate();

                                CallableStatement cst2 = conn.prepareCall("{call InsertEmail (?,?)}"); /* Calling Stored Proc to Insert into Email */
                                cst2.setString(1, txt_email.getText());
                                cst2.setString(2, txt_ssn.getText());
                                cst2.executeUpdate();

                                CallableStatement cst3 = conn.prepareCall("{call InsertPhone (?,?)}"); /* Calling Stored Proc to Insert into Phone */
                                cst3.setString(1, txt_phone.getText());
                                cst3.setString(2, txt_ssn.getText());
                                cst3.executeUpdate();

                                CallableStatement cst4 = conn.prepareCall("{call InsertAddress (?,?,?,?,?,?)}"); /* Calling Stored Proc to Insert into Address */
                                cst4.setString(1, txt_line.getText());
                                cst4.setString(2, txt_city.getText());
                                cst4.setString(3, txt_state.getText());
                                cst4.setString(4, txt_zip.getText());
                                cst4.setString(5, txt_country.getText());
                                cst4.setString(6, txt_ssn.getText());
                                cst4.executeUpdate();

                                String t = "Data Added";
                                txt_status.setText(t);

                            } else {
                                String t = "Data already there,Try to Update !!";
                                txt_status.setText(t);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "SSN no should be 9 digits only !!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Email format not correct !!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Salary must be positive or format is not correct !!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No field should be left blank !!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jb_addActionPerformed
    /* txt_ssnKeyTyped is a Key Pressed event used for checking that SSN only enters Digits only */
    private void txt_ssnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ssnKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_ssnKeyTyped
    /* txt_fnameKeyTyped is a Key Pressed event used for checking that First name is only in a-z and A-Z  */
    private void txt_fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_fnameKeyTyped
    /* txt_mnameKeyTyped is a Key Pressed event used for checking that Middle name is only in a-z and A-Z  */
    private void txt_mnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mnameKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_mnameKeyTyped
    /* txt_lnameKeyTyped is a Key Pressed event used for checking that Last name is only in a-z and A-Z  */
    private void txt_lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lnameKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_lnameKeyTyped

    private void txt_bdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bdateKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_bdateKeyTyped

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_statusActionPerformed
    /* jb_deleteActionPerformed is JButton used for deleting a record of existing employee */
    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
        try {
            String sql1 = "select ssn from person where ssn=?"; /* For deletion SSN is must */
            pst1 = conn.prepareStatement(sql1);
            pst1.setString(1, txt_ssn.getText());
            rs1 = pst1.executeQuery();
            boolean flag = true;
            while (rs1.next()) { /* Iterating the Result set */
                CallableStatement cst3 = conn.prepareCall("{call DeleteEmail (?)}"); /* Calling stored Procedures to delete Email */
                cst3.setString(1, txt_ssn.getText());
                cst3.executeUpdate();

                CallableStatement cst4 = conn.prepareCall("{call DeleteAddress (?)}"); /* Calling stored Procedures to delete Address */
                cst4.setString(1, txt_ssn.getText());
                cst4.executeUpdate();

                CallableStatement cst5 = conn.prepareCall("{call DeletePhone (?)}"); /* Calling stored Procedures to delete Phone */
                cst5.setString(1, txt_ssn.getText());
                cst5.executeUpdate();

                CallableStatement cst6 = conn.prepareCall("{call DeletePerson (?)}"); /* Calling stored Procedures to delete Person */
                cst6.setString(1, txt_ssn.getText());
                cst6.executeUpdate();

                String t = "Data Deleted !!";
                txt_status.setText(t);
                flag = false;
            }
            if (flag) {
                String t = "No Data Found for Deletion !!";
                txt_status.setText(t);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jb_deleteActionPerformed

    private void txt_ssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ssnActionPerformed
    /* txt_salaryKeyTyped is a Key Pressed event used for checking that salary is integers or Decimal only  */
    private void txt_salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salaryKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || c == KeyEvent.VK_ASTERISK) { /* Checking that salary as only numbers only, no special characters */
            evt.consume();
        }
    }//GEN-LAST:event_txt_salaryKeyTyped
    /* jb_updateActionPerformed is JButton used for Updating a record of existing employee */
    private void jb_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_updateActionPerformed
        try {
            String sql1 = "select ssn from person where ssn=?"; /* For Updating the data, ssn is required */
            pst1 = conn.prepareStatement(sql1);
            pst1.setString(1, txt_ssn.getText());
            rs1 = pst1.executeQuery();
            boolean flag = true;
            while (rs1.next()) {
                if (txt_fname.getText().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateFname (?,?)}"); /* Calling stored Procs to update First name */
                    cst2.setString(1, txt_fname.getText());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }
                if (txt_mname.getText().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateMname (?,?)}"); /* Calling stored Procs to update Middle name */
                    cst2.setString(1, txt_mname.getText());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }
                if (txt_lname.getText().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateLname (?,?)}"); /* Calling stored Procs to update Last name */
                    cst2.setString(1, txt_lname.getText());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }
                if (cb_gender.getSelectedItem().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateGender (?,?)}"); /* Calling stored Procs to update Gender */
                    cst2.setString(1, (String) cb_gender.getSelectedItem());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }
                if (txt_bdate.getText().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateBdate (?,?)}"); /* Calling stored Procs to update Birthday date */
                    cst2.setString(1, txt_bdate.getText());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }
                if (txt_salary.getText().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateSalary (?,?)}"); /* Calling stored Procs to update Salary */
                    cst2.setString(1, txt_salary.getText());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }
                if (cb_dept.getSelectedItem().equals("")) {
                } else {
                    CallableStatement cst2 = conn.prepareCall("{call UpdateDept (?,?)}"); /* Calling stored Procs to update Department  */
                    cst2.setString(1, (String) cb_dept.getSelectedItem());
                    cst2.setString(2, txt_ssn.getText());
                    cst2.executeUpdate();
                }

                if (txt_phone.getText().equals("")) {
                } else {
                    CallableStatement cst3 = conn.prepareCall("{call UpdatePhone (?,?)}"); /* Calling stored Procs to update Phone */
                    cst3.setString(1, txt_phone.getText());
                    cst3.setString(2, txt_ssn.getText());
                    cst3.executeUpdate();
                }
                if (txt_line.getText().equals("")) {
                } else {
                    String sql4 = "update address set line= ? where pssn=?"; /* Updating address's line through prepared statement  */
                    pst4 = conn.prepareStatement(sql4);
                    pst4.setString(1, txt_line.getText());
                    pst4.setString(2, txt_ssn.getText());
                    pst4.executeUpdate();
                }
                if (txt_city.getText().equals("")) {
                } else {
                    String sql4 = "update address set city= ? where pssn=?"; /* Updating address's city through prepared statement  */
                    pst4 = conn.prepareStatement(sql4);
                    pst4.setString(1, txt_city.getText());
                    pst4.setString(2, txt_ssn.getText());
                    pst4.executeUpdate();
                }
                if (txt_state.getText().equals("")) {
                } else {
                    String sql4 = "update address set state= ? where pssn=?"; /* Updating address's state through prepared statement  */
                    pst4 = conn.prepareStatement(sql4);
                    pst4.setString(1, txt_state.getText());
                    pst4.setString(2, txt_ssn.getText());
                    pst4.executeUpdate();
                }
                if (txt_zip.getText().equals("")) {
                } else {
                    String sql4 = "update address set zip= ? where pssn=?"; /* Updating address's zip through prepared statement  */
                    pst4 = conn.prepareStatement(sql4);
                    pst4.setString(1, txt_zip.getText());
                    pst4.setString(2, txt_ssn.getText());
                    pst4.executeUpdate();
                }
                if (txt_country.getText().equals("")) {
                } else {
                    String sql4 = "update address set country= ? where pssn=?"; /* Updating address's country through prepared statement  */
                    pst4 = conn.prepareStatement(sql4);
                    pst4.setString(1, txt_country.getText());
                    pst4.setString(2, txt_ssn.getText());
                    pst4.executeUpdate();
                }
                if (txt_email.getText().equals("")) {
                } else {
                    CallableStatement cst5 = conn.prepareCall("{call UpdateEmail (?,?)}"); /* Calling stored Procs to update Email  */
                    cst5.setString(1, txt_email.getText());
                    cst5.setString(2, txt_ssn.getText());
                    cst5.executeUpdate();
                }
                String t = "Data Updated !!";
                txt_status.setText(t);
                flag = false;
            }
            if (flag) {
                String t = "No Data Found for Updation, Try Adding Data !!";
                txt_status.setText(t);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jb_updateActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // Not needed
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void jb_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_searchKeyTyped
        // Not needed
    }//GEN-LAST:event_jb_searchKeyTyped

    /* jb_clearActionPerformed is JButton used for clearing the Text Boxes and Table */
    private void jb_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clearActionPerformed
        txt_fname.setText("");
        txt_mname.setText("");
        txt_lname.setText("");
        txt_ssn.setText("");
        txt_status.setText("");
        txt_line.setText("");
        txt_city.setText("");
        txt_state.setText("");
        txt_country.setText("");
        txt_zip.setText("");
        txt_bdate.setText("");
        txt_email.setText("");
        txt_phone.setText("");
        txt_salary.setText("");
        DefaultTableModel modle = (DefaultTableModel) tb_person.getModel();
        modle.setRowCount(0);
    }//GEN-LAST:event_jb_clearActionPerformed

    private void cb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_genderActionPerformed

    private void txt_ssnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ssnKeyPressed

    }//GEN-LAST:event_txt_ssnKeyPressed

    private void txt_ssnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ssnKeyReleased

    }//GEN-LAST:event_txt_ssnKeyReleased

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed
    /* txt_zipKeyTyped is a Key Pressed event used for checking that Zip is integers only  */
    private void txt_zipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_zipKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) { /* Zip should only have numbers only */
            evt.consume();
        }
    }//GEN-LAST:event_txt_zipKeyTyped
    /* txt_phoneKeyTyped is a Key Pressed event used for checking that Phone no caotains 0-9 or + only  */
    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_bdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bdateActionPerformed
/* Method to check weather the email is in correct Email format or not */
    public boolean checkEmail(String email) {
        String ep = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ep);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
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
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_dept;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_clear;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_search;
    private javax.swing.JButton jb_update;
    private javax.swing.JTable tb_person;
    private javax.swing.JFormattedTextField txt_bdate;
    private javax.swing.JFormattedTextField txt_city;
    private javax.swing.JFormattedTextField txt_country;
    private javax.swing.JFormattedTextField txt_email;
    private javax.swing.JFormattedTextField txt_fname;
    private javax.swing.JFormattedTextField txt_line;
    private javax.swing.JFormattedTextField txt_lname;
    private javax.swing.JFormattedTextField txt_mname;
    private javax.swing.JFormattedTextField txt_phone;
    private javax.swing.JFormattedTextField txt_salary;
    private javax.swing.JFormattedTextField txt_ssn;
    private javax.swing.JFormattedTextField txt_state;
    private javax.swing.JFormattedTextField txt_status;
    private javax.swing.JFormattedTextField txt_zip;
    // End of variables declaration//GEN-END:variables
}
