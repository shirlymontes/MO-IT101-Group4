/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeeSystem;


import Frames.loginFrame;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author PotChi
 */
public class userHome extends javax.swing.JFrame {

    /**
     * Creates new form userHome
     */
    public userHome() {
        initComponents();
        
        //============Displaying data in infoTable=========
        DefaultTableModel infoTableModel = (DefaultTableModel) infoTable.getModel();
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo", "root", "");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employeedata")) {
            while (rs.next()) {
                String ename = rs.getString("ename");
                String enumber = rs.getString("enumber");
                String position = rs.getString("position");
                String status = rs.getString("status");
                String phone = rs.getString("phone");
                String bday = rs.getString("bday");
                String address = rs.getString("address");
                String supervisor = rs.getString("supervisor");
                String sss = rs.getString("sss");
                String philhealth = rs.getString("philhealth");
                String pagibig = rs.getString("pagibig");
                String tin = rs.getString("tin");
                infoTableModel.addRow(new Object[] {ename, enumber, position, status, phone, bday, address, supervisor, sss, philhealth, pagibig, tin});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        //============Displaying data in attendanceTable=========
       // Retrieve the table model for the infoTable
        DefaultTableModel attendanceTableModel = (DefaultTableModel) attendanceTable.getModel();
       
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/workedhours", "root", "");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM workedhours")) {
            // Iterate through the result set and add rows to the infoTable
            while (rs.next()) {
                // Retrieve data from the result set
                String employeeNumber = rs.getString("employeeNumber");
                String lastName = rs.getString("lastName");
                String firstName = rs.getString("firstName");
                String hourlyPay = rs.getString("hourlyPay");
                
                // Add a row to the infoTableModel
                attendanceTableModel.addRow(new Object[] {employeeNumber, lastName, firstName, hourlyPay});
            }
        } catch (SQLException ex) {
              // Show error message if there's an SQL exception
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        
         // Add a ListSelectionListener to your attendanceTable
        attendanceTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                     // Get the selected row index if the selection is not adjusting
                    int selectedRow = attendanceTable.getSelectedRow();
                }
            }
        });
    
      
        //============Displaying data in tableSalaryInfo=========

    // Retrieve the table model for the tableSalaryInfo
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeesalary1", "root", "");
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM employeesalary")) {
        // Clear existing data from the table
        DefaultTableModel tblModel = (DefaultTableModel) tableSalaryInfo.getModel();
        tblModel.setRowCount(0); // Clear previous data

        // Iterate through the result set and add rows to the table
        while (rs.next()) {
            String id = String.valueOf(rs.getInt("employeeNumber"));
            String lastName = rs.getString("lastName");
            String firstName = rs.getString("firstName");
            String basicSalary = rs.getString("basicSalary");
            String riceSubsidy = rs.getString("riceSubsidy");
            String phoneAllowance = rs.getString("phoneAllowance");
            String clothingAllowance = rs.getString("clothingAllowance");
            String grossSemiRate = rs.getString("grossSemiRate");
            String hourlyRate = rs.getString("hourlyRate");

            // Add row data to the table model
            Object[] rowData = {id, lastName, firstName, basicSalary, riceSubsidy, phoneAllowance, clothingAllowance, grossSemiRate, hourlyRate};
            tblModel.addRow(rowData);
        }
    } catch (SQLException ex) {
         // Show error message if there's an SQL exception
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        tfEnum = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfBirthday = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfSupervisor = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfPhilhealth = new javax.swing.JTextField();
        tfPagibig = new javax.swing.JTextField();
        tfTin = new javax.swing.JTextField();
        tfSss = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        calculateHrsBtn = new javax.swing.JButton();
        totalhrs = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inField1 = new javax.swing.JTextField();
        outField1 = new javax.swing.JTextField();
        dateField1 = new javax.swing.JTextField();
        dateField2 = new javax.swing.JTextField();
        outField2 = new javax.swing.JTextField();
        inField3 = new javax.swing.JTextField();
        dateField3 = new javax.swing.JTextField();
        outField3 = new javax.swing.JTextField();
        inField4 = new javax.swing.JTextField();
        dateField4 = new javax.swing.JTextField();
        outField4 = new javax.swing.JTextField();
        inField2 = new javax.swing.JTextField();
        dateField5 = new javax.swing.JTextField();
        outField5 = new javax.swing.JTextField();
        inField6 = new javax.swing.JTextField();
        dateField6 = new javax.swing.JTextField();
        outField6 = new javax.swing.JTextField();
        inField7 = new javax.swing.JTextField();
        dateField7 = new javax.swing.JTextField();
        outField7 = new javax.swing.JTextField();
        inField5 = new javax.swing.JTextField();
        dateField9 = new javax.swing.JTextField();
        outField9 = new javax.swing.JTextField();
        inField10 = new javax.swing.JTextField();
        dateField10 = new javax.swing.JTextField();
        outField10 = new javax.swing.JTextField();
        inField8 = new javax.swing.JTextField();
        dateField8 = new javax.swing.JTextField();
        outField8 = new javax.swing.JTextField();
        inField9 = new javax.swing.JTextField();
        totalEarn = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfSemi = new javax.swing.JTextField();
        tfRice = new javax.swing.JTextField();
        tfClothing = new javax.swing.JTextField();
        tfPhoneAllowance = new javax.swing.JTextField();
        tfSssContri = new javax.swing.JTextField();
        tfPhilContri = new javax.swing.JTextField();
        tfPagibigContri = new javax.swing.JTextField();
        tfWithTax = new javax.swing.JTextField();
        tfNetSalary = new javax.swing.JTextField();
        tfGross = new javax.swing.JTextField();
        tfTotalDeduc = new javax.swing.JTextField();
        tfBasic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalaryInfo = new javax.swing.JTable();
        calculatePayrollBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(251, 133, 0));

        jTabbedPane1.setBackground(new java.awt.Color(2, 48, 71));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jTabbedPane1.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(142, 202, 230));
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));

        infoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE NAME", "EMPLOYEE NUMBER", "POSITION", "STATUS", "PHONE NUMBER", "BIRTHDAY", "ADDRESS", "IMMEDIATE SUPERVISOR", "SSS", "PHILHEALTH", "PAGIBIG", "TIN"
            }
        ));
        infoTable.setSelectionBackground(new java.awt.Color(2, 48, 71));
        infoTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        infoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(infoTable);

        tfEnum.setBackground(new java.awt.Color(249, 246, 246));
        tfEnum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfEnum.setForeground(new java.awt.Color(0, 0, 51));
        tfEnum.setToolTipText("");
        tfEnum.setAlignmentX(1.0F);
        tfEnum.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "EMPLOYEE NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfPosition.setBackground(new java.awt.Color(249, 246, 246));
        tfPosition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfPosition.setForeground(new java.awt.Color(0, 0, 51));
        tfPosition.setToolTipText("");
        tfPosition.setAlignmentX(1.0F);
        tfPosition.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "POSITION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfStatus.setBackground(new java.awt.Color(249, 246, 246));
        tfStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfStatus.setForeground(new java.awt.Color(0, 0, 51));
        tfStatus.setToolTipText("");
        tfStatus.setAlignmentX(1.0F);
        tfStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "STATUS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfName.setBackground(new java.awt.Color(249, 246, 246));
        tfName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfName.setForeground(new java.awt.Color(0, 0, 51));
        tfName.setToolTipText("");
        tfName.setAlignmentX(1.0F);
        tfName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "EMPLOYEE NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfBirthday.setBackground(new java.awt.Color(249, 246, 246));
        tfBirthday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfBirthday.setForeground(new java.awt.Color(0, 0, 51));
        tfBirthday.setToolTipText("");
        tfBirthday.setAlignmentX(1.0F);
        tfBirthday.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "BIRTHDAY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfAddress.setBackground(new java.awt.Color(249, 246, 246));
        tfAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfAddress.setForeground(new java.awt.Color(0, 0, 51));
        tfAddress.setToolTipText("");
        tfAddress.setAlignmentX(1.0F);
        tfAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "ADDRESS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfSupervisor.setBackground(new java.awt.Color(249, 246, 246));
        tfSupervisor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfSupervisor.setForeground(new java.awt.Color(0, 0, 51));
        tfSupervisor.setToolTipText("");
        tfSupervisor.setAlignmentX(1.0F);
        tfSupervisor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "IMMEDIATE SUPERVISOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfPhone.setBackground(new java.awt.Color(249, 246, 246));
        tfPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfPhone.setForeground(new java.awt.Color(0, 0, 51));
        tfPhone.setToolTipText("");
        tfPhone.setAlignmentX(1.0F);
        tfPhone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "PHONE NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfPhilhealth.setBackground(new java.awt.Color(249, 246, 246));
        tfPhilhealth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfPhilhealth.setForeground(new java.awt.Color(0, 0, 51));
        tfPhilhealth.setToolTipText("");
        tfPhilhealth.setAlignmentX(1.0F);
        tfPhilhealth.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "PHILHEALTH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfPagibig.setBackground(new java.awt.Color(249, 246, 246));
        tfPagibig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfPagibig.setForeground(new java.awt.Color(0, 0, 51));
        tfPagibig.setToolTipText("");
        tfPagibig.setAlignmentX(1.0F);
        tfPagibig.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "PAGIBIG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfTin.setBackground(new java.awt.Color(249, 246, 246));
        tfTin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTin.setForeground(new java.awt.Color(0, 0, 51));
        tfTin.setToolTipText("");
        tfTin.setAlignmentX(1.0F);
        tfTin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "TIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        tfSss.setBackground(new java.awt.Color(249, 246, 246));
        tfSss.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfSss.setForeground(new java.awt.Color(0, 0, 51));
        tfSss.setToolTipText("");
        tfSss.setAlignmentX(1.0F);
        tfSss.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "SSS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 12), new java.awt.Color(204, 0, 51))); // NOI18N

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(204, 255, 204));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(204, 255, 255));
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 153, 153));
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEnum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfSss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("EMPLOYEE", jPanel3);

        jPanel4.setBackground(new java.awt.Color(142, 202, 230));

        calculateHrsBtn.setBackground(new java.awt.Color(255, 204, 153));
        calculateHrsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        calculateHrsBtn.setText("CALCULATE");
        calculateHrsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateHrsBtnMouseClicked(evt);
            }
        });
        calculateHrsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateHrsBtnActionPerformed(evt);
            }
        });

        totalhrs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalhrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalhrs.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "TOTAL HOURS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 48, 73));
        jLabel7.setText("Date");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 48, 73));
        jLabel8.setText("Time In");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 48, 73));
        jLabel9.setText("Time Out");

        inField1.setForeground(new java.awt.Color(0, 48, 73));

        outField1.setForeground(new java.awt.Color(0, 48, 73));

        dateField1.setForeground(new java.awt.Color(0, 48, 73));

        dateField2.setForeground(new java.awt.Color(0, 48, 73));

        outField2.setForeground(new java.awt.Color(0, 48, 73));

        inField3.setForeground(new java.awt.Color(0, 48, 73));

        dateField3.setForeground(new java.awt.Color(0, 48, 73));

        outField3.setForeground(new java.awt.Color(0, 48, 73));

        inField4.setForeground(new java.awt.Color(0, 48, 73));

        dateField4.setForeground(new java.awt.Color(0, 48, 73));

        outField4.setForeground(new java.awt.Color(0, 48, 73));

        inField2.setForeground(new java.awt.Color(0, 48, 73));

        dateField5.setForeground(new java.awt.Color(0, 48, 73));

        outField5.setForeground(new java.awt.Color(0, 48, 73));

        inField6.setForeground(new java.awt.Color(0, 48, 73));

        dateField6.setForeground(new java.awt.Color(0, 48, 73));

        outField6.setForeground(new java.awt.Color(0, 48, 73));

        inField7.setForeground(new java.awt.Color(0, 48, 73));
        inField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inField7ActionPerformed(evt);
            }
        });

        dateField7.setForeground(new java.awt.Color(0, 48, 73));

        outField7.setForeground(new java.awt.Color(0, 48, 73));

        inField5.setForeground(new java.awt.Color(0, 48, 73));

        dateField9.setForeground(new java.awt.Color(0, 48, 73));

        outField9.setForeground(new java.awt.Color(0, 48, 73));

        inField10.setForeground(new java.awt.Color(0, 48, 73));

        dateField10.setForeground(new java.awt.Color(0, 48, 73));

        outField10.setForeground(new java.awt.Color(0, 48, 73));

        inField8.setForeground(new java.awt.Color(0, 48, 73));

        dateField8.setForeground(new java.awt.Color(0, 48, 73));

        outField8.setForeground(new java.awt.Color(0, 48, 73));

        inField9.setForeground(new java.awt.Color(0, 48, 73));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(dateField10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inField10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(outField10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(dateField8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inField8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outField8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(dateField9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inField9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outField9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(dateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(inField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(outField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(dateField4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inField4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(outField4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(dateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(dateField3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inField3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outField3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(dateField7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(inField7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(outField7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(dateField5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inField5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outField5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(dateField6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(outField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(outField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        totalEarn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalEarn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalEarn.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "TOTAL EARNINGS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM));

        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Number", "Last Name", "First Name", "Hourly Pay"
            }
        ));
        attendanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(attendanceTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalEarn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalhrs, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(calculateHrsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(totalhrs, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalEarn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(calculateHrsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ATTENDANCE", jPanel4);

        jPanel5.setBackground(new java.awt.Color(142, 202, 230));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setText("EARNINGS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("DEDUCTIONS");

        tfSemi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfSemi.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfSemi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Semi-Monthly Salary", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfSemi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSemiActionPerformed(evt);
            }
        });

        tfRice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfRice.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfRice.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Rice Subsidy", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfRice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRiceActionPerformed(evt);
            }
        });

        tfClothing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfClothing.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfClothing.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Clothing Allowance", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClothingActionPerformed(evt);
            }
        });

        tfPhoneAllowance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfPhoneAllowance.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfPhoneAllowance.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Phone Allowance", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfPhoneAllowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneAllowanceActionPerformed(evt);
            }
        });

        tfSssContri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfSssContri.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfSssContri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "SSS Contribution", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfSssContri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSssContriActionPerformed(evt);
            }
        });

        tfPhilContri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfPhilContri.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfPhilContri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "PhilHealth Contribution", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfPhilContri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhilContriActionPerformed(evt);
            }
        });

        tfPagibigContri.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfPagibigContri.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfPagibigContri.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "PAGIBIG Cotribution", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfPagibigContri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPagibigContriActionPerformed(evt);
            }
        });

        tfWithTax.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfWithTax.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfWithTax.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "WithHolding Tax", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfWithTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWithTaxActionPerformed(evt);
            }
        });

        tfNetSalary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfNetSalary.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfNetSalary.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Net Salary", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        tfNetSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNetSalaryActionPerformed(evt);
            }
        });

        tfGross.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfGross.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfGross.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Gross Monthly Salary", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        tfGross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGrossActionPerformed(evt);
            }
        });

        tfTotalDeduc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfTotalDeduc.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfTotalDeduc.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Total Deductions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        tfTotalDeduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalDeducActionPerformed(evt);
            }
        });

        tfBasic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tfBasic.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfBasic.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Basic Salary", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        tfBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBasicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRice, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPagibigContri, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSssContri, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWithTax, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhilContri, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTotalDeduc, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(tfGross)
                            .addComponent(tfBasic)
                            .addComponent(tfNetSalary))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSemi)
                            .addComponent(tfSssContri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPagibigContri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPhilContri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(tfGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tfTotalDeduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfWithTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfNetSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        tableSalaryInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Number", "Last Name", "First Name", "Basic Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance", "Gross Semi-monthly Rate", "Hourly Rate"
            }
        ));
        tableSalaryInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalaryInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSalaryInfo);

        calculatePayrollBtn.setBackground(new java.awt.Color(255, 255, 204));
        calculatePayrollBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        calculatePayrollBtn.setText("CALCULATE");
        calculatePayrollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatePayrollBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(calculatePayrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(calculatePayrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PAYROLL", jPanel5);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeeSystem/logo.png"))); // NOI18N

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoTableMouseClicked
        // Get the selected row index
        int rowIndex = infoTable.getSelectedRow();
        // Ensure a row is selected and it's a single click
        if (rowIndex >= 0 && evt.getClickCount() == 1) {
            // Retrieve data from the selected row
            String ename = infoTable.getValueAt(rowIndex, 0).toString();
            String enumber = infoTable.getValueAt(rowIndex, 1).toString();
            String position = infoTable.getValueAt(rowIndex, 2).toString();
            String status = infoTable.getValueAt(rowIndex, 3).toString();
            String phone = infoTable.getValueAt(rowIndex, 4).toString();
            String bday = infoTable.getValueAt(rowIndex, 5).toString();
            String address = infoTable.getValueAt(rowIndex, 6).toString();
            String supervisor = infoTable.getValueAt(rowIndex, 7).toString();
            String sss = infoTable.getValueAt(rowIndex, 8).toString();
            String philhealth = infoTable.getValueAt(rowIndex, 9).toString();
            String pagibig = infoTable.getValueAt(rowIndex, 10).toString();
            String tin = infoTable.getValueAt(rowIndex, 11).toString();
            // Set the retrieved data to text fields
            tfName.setText(ename);
            tfEnum.setText(enumber);
            tfPosition.setText(position);
            tfStatus.setText(status);
            tfPhone.setText(phone);
            tfBirthday.setText(bday);
            tfAddress.setText(address);
            tfSupervisor.setText(supervisor);
            tfSss.setText(sss);
            tfPhilhealth.setText(philhealth);
            tfPagibig.setText(pagibig);
            tfTin.setText(tin);
        }
    }//GEN-LAST:event_infoTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // Retrieve employee information from GUI components
        String ename = tfName.getText();
        String enumber = tfEnum.getText();
        String position = tfPosition.getText();
        String status = tfStatus.getText();
        String phone = tfPhone.getText();
        String bday = tfBirthday.getText();
        String address = tfAddress.getText();
        String supervisor = tfSupervisor.getText();
        String sss = tfSss.getText();
        String philhealth = tfPhilhealth.getText();
        String pagibig = tfPagibig.getText();
        String tin = tfTin.getText();

        //SQL query to update data in employeedata table
        String query = "UPDATE employeedata SET ename=?, position=?, status=?, phone=?, bday=?, address=?, supervisor=?, sss=?, philhealth=?, pagibig=?, tin=? WHERE enumber=?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo", "root", "");
            PreparedStatement pstmt = con.prepareStatement(query)) {

            // Set values for the parameters in the prepared statement
            pstmt.setString(1, ename);
            pstmt.setString(2, position);
            pstmt.setString(3, status);
            pstmt.setString(4, phone);
            pstmt.setString(5, bday);
            pstmt.setString(6, address);
            pstmt.setString(7, supervisor);
            pstmt.setString(8, sss);
            pstmt.setString(9, philhealth);
            pstmt.setString(10, pagibig);
            pstmt.setString(11, tin);
            pstmt.setString(12, enumber); // Set the enumber for the WHERE clause

            // Execute the update query
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                // If update is successful, show success message
                JOptionPane.showMessageDialog(null, "Employee data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // If the update was successful, update the corresponding row in the table model
                DefaultTableModel model = (DefaultTableModel) infoTable.getModel();
                int rowCount = model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    if (model.getValueAt(i, 1).equals(enumber)) { // Check if enumber matches
                        // Update values in the table model
                        model.setValueAt(ename, i, 0);
                        model.setValueAt(position, i, 2);
                        model.setValueAt(status, i, 3);
                        model.setValueAt(phone, i, 4);
                        model.setValueAt(bday, i, 5);
                        model.setValueAt(address, i, 6);
                        model.setValueAt(supervisor, i, 7);
                        model.setValueAt(sss, i, 8);
                        model.setValueAt(philhealth, i, 9);
                        model.setValueAt(pagibig, i, 10);
                        model.setValueAt(tin, i, 11);
                        break; // Exit loop after updating the row
                    }
                }
            } else {
                // If update fails, show error message
                JOptionPane.showMessageDialog(null, "Failed to update employee data", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            // Show error message if there's an SQL exception
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        // Retrieve employee information from GUI components
        String ename = tfName.getText();
        String enumber = tfEnum.getText();
        String position = tfPosition.getText();
        String status = tfStatus.getText();
        String phone = tfPhone.getText();
        String bday = tfBirthday.getText();
        String address = tfAddress.getText();
        String supervisor = tfSupervisor.getText();
        String sss = tfSss.getText();
        String philhealth = tfPhilhealth.getText();
        String pagibig = tfPagibig.getText();
        String tin = tfTin.getText();

        // Example SQL query to insert data into employeeinfo table
        String query = "INSERT INTO employeedata (ename, enumber, position, status, phone, bday, address, supervisor, sss, philhealth, pagibig, tin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo", "root", "");
            PreparedStatement pstmt = con.prepareStatement(query)) {

            pstmt.setString(1, ename);
            pstmt.setString(2, enumber);
            pstmt.setString(3, position);
            pstmt.setString(4, status);
            pstmt.setString(5, phone);
            pstmt.setString(6, bday);
            pstmt.setString(7, address);
            pstmt.setString(8, supervisor);
            pstmt.setString(9, sss);
            pstmt.setString(10, philhealth);
            pstmt.setString(11, pagibig);
            pstmt.setString(12, tin);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Employee added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Update the table in your GUI with the newly added data
                DefaultTableModel model = (DefaultTableModel) infoTable.getModel();
                model.addRow(new Object[] {ename, enumber, position, status, phone, bday, address, supervisor, sss, philhealth, pagibig, tin});
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add employee", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // Clears all text fields in the GUI form.
        tfName.setText("");
        tfEnum.setText("");
        tfPosition.setText("");
        tfStatus.setText("");
        tfPhone.setText("");
        tfBirthday.setText("");
        tfAddress.setText("");
        tfSupervisor.setText("");
        tfSss.setText("");
        tfPhilhealth.setText("");
        tfPagibig.setText("");
        tfTin.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // Get the selected row index
        int selectedRow = infoTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if no row is selected
        }

        // Extract the primary key or unique identifier from the selected row
        String enumber = infoTable.getValueAt(selectedRow, 1).toString(); // Assuming enumber is the primary key

        // Construct the SQL DELETE query
        String query = "DELETE FROM employeedata WHERE enumber=?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeinfo", "root", "");
            PreparedStatement pstmt = con.prepareStatement(query)) {

            // Set the enumber parameter for the DELETE query
            pstmt.setString(1, enumber);

            // Execute the DELETE query
            int rowsDeleted = pstmt.executeUpdate();

            // Check if the deletion was successful
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Employee data deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Remove the selected row from the infoTable
                DefaultTableModel model = (DefaultTableModel) infoTable.getModel();
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete employee data", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void calculateHrsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateHrsBtnMouseClicked

    }//GEN-LAST:event_calculateHrsBtnMouseClicked

    private void calculateHrsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateHrsBtnActionPerformed
        // Calculate total hours worked
        double totalHours = calculateTotalHours();

        // Retrieve the selected row from the attendance table
        int selectedRow = attendanceTable.getSelectedRow();

        // Check if a row is selected
        if (selectedRow != -1) {
            try {
                // Retrieve the hourly pay from the attendance table based on the selected row
                double hourlyPay = Double.parseDouble(attendanceTable.getValueAt(selectedRow, 3).toString());

                // Calculate total earnings based on total hours worked and hourly pay
                double totalEarnings = totalHours * hourlyPay;

                // Display the total hours in the totalhrs JTextField
                totalhrs.setText(String.valueOf(totalHours));

                // Display the total earnings in the totalEarn JTextField
                totalEarn.setText(String.valueOf(totalEarnings));
            } catch (NumberFormatException e) {
                // Handle the case where hourly pay cannot be parsed as a double
                e.printStackTrace();
            }
        } else {
            // Handle the case where no row is selected from the attendance table
            System.out.println("No row selected.");
        }
        }

        private double calculateTotalHours() {
            double totalHours = 0.0;

            // Iterate over the text fields containing time in and time out data

            for (int i = 1; i <= 10; i++) {
                JTextField timeInField = getTimeInField(i);
                JTextField timeOutField = getTimeOutField(i);

                // Get the time in and time out values from the text fields
                String timeIn = timeInField.getText().trim();
                String timeOut = timeOutField.getText().trim();

                // Calculate the difference between time in and time out
                double hoursWorked = calculateHoursWorked(timeIn, timeOut);

                // Add the hours worked to the total hours
                totalHours += hoursWorked;
            }

            return totalHours;
        }

        private double calculateHoursWorked(String timeIn, String timeOut) {
            double hoursWorked = 0.0;

            try {
                // Parse the time in and time out strings into LocalTime objects
                LocalTime startTime = LocalTime.parse(timeIn);
                LocalTime endTime = LocalTime.parse(timeOut);

                // Calculate the difference between the end time and start time
                hoursWorked = Duration.between(startTime, endTime).toHours();
            } catch (DateTimeParseException e) {
                // Handle invalid time format
                e.printStackTrace();
            }

            return hoursWorked;
        }

        // Helper method to get the JTextField for time in based on index
        private JTextField getTimeInField(int index) {
            switch (index) {
                case 1: return inField1;
                case 2: return inField2;
                case 3: return inField3;
                case 4: return inField4;
                case 5: return inField5;
                case 6: return inField6;
                case 7: return inField7;
                case 8: return inField8;
                case 9: return inField9;
                case 10: return inField10;
                default: return null; // Handle invalid index
            }
        }

        // Helper method to get the JTextField for time out based on index
        private JTextField getTimeOutField(int index) {
            switch (index) {
                case 1: return outField1;
                case 2: return outField2;
                case 3: return outField3;
                case 4: return outField4;
                case 5: return outField5;
                case 6: return outField6;
                case 7: return outField7;
                case 8: return outField8;
                case 9: return outField9;
                case 10: return outField10;
                default: return null; // Handle invalid index
            }
    }//GEN-LAST:event_calculateHrsBtnActionPerformed

    private void inField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inField7ActionPerformed

    private void attendanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceTableMouseClicked
        int selectedRow = attendanceTable.getSelectedRow();
        if (selectedRow != -1) { // If a row is selected
            // Extract employee data from the selected row
            String employeeNumber = attendanceTable.getValueAt(selectedRow, 0).toString();

            // Query the timesheet database to fetch attendance records for the selected employee
            List<String[]> attendanceRecords = fetchAttendanceRecords(employeeNumber);

            // Populate the text fields with the retrieved attendance data
            populateTextFields(attendanceRecords);
        }
        }

        private List<String[]> fetchAttendanceRecords(String employeeNumber) {
            List<String[]> attendanceRecords = new ArrayList<>();
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timesheet", "root", "");
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM attendancerecord WHERE employeeNumber = ?")) {
                stmt.setString(1, employeeNumber);
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        // Extract attendance record data from the result set
                        // and create a string array to hold the data
                        String[] recordData = new String[3]; // Assuming you have date, timeIn, and timeOut columns
                        recordData[0] = rs.getString("date");
                        recordData[1] = rs.getString("timeIn");
                        recordData[2] = rs.getString("timeOut");
                        // Add the record data to the list
                        attendanceRecords.add(recordData);
                    }
                }
            } catch (SQLException ex) {
                // Handle any SQL exceptions
                ex.printStackTrace();
            }
            return attendanceRecords;
        }

        private void populateTextFields(List<String[]> attendanceRecords) {
            // Populate the text fields with the attendance data retrieved from the database
            // Iterate over the attendanceRecords list and populate the text fields accordingly
            for (int i = 1; i <= 10; i++) {
                if (i <= attendanceRecords.size()) {
                    String[] recordData = attendanceRecords.get(i - 1);
                    String date = recordData[0];
                    String inTime = recordData[1];
                    String outTime = recordData[2];

                    // Populate the text fields based on the current index i
                    switch (i) {
                        case 1:
                        dateField1.setText(date);
                        inField1.setText(inTime);
                        outField1.setText(outTime);
                        break;
                        case 2:
                        dateField2.setText(date);
                        inField2.setText(inTime);
                        outField2.setText(outTime);
                        break;
                        case 3:
                        dateField3.setText(date);
                        inField3.setText(inTime);
                        outField3.setText(outTime);
                        break;
                        case 4:
                        dateField4.setText(date);
                        inField4.setText(inTime);
                        outField4.setText(outTime);
                        break;
                        case 5:
                        dateField5.setText(date);
                        inField5.setText(inTime);
                        outField5.setText(outTime);
                        break;
                        case 6:
                        dateField6.setText(date);
                        inField6.setText(inTime);
                        outField6.setText(outTime);
                        break;
                        case 7:
                        dateField7.setText(date);
                        inField7.setText(inTime);
                        outField7.setText(outTime);
                        break;
                        case 8:
                        dateField8.setText(date);
                        inField8.setText(inTime);
                        outField8.setText(outTime);
                        break;
                        case 9:
                        dateField9.setText(date);
                        inField9.setText(inTime);
                        outField9.setText(outTime);
                        break;
                        case 10:
                        dateField10.setText(date);
                        inField10.setText(inTime);
                        outField10.setText(outTime);
                        break;

                    }
                } else {
                    // Clear text fields if there are no attendance records for this index

                    switch (i) {
                        case 1:
                        dateField1.setText("");
                        inField1.setText("");
                        outField1.setText("");
                        break;
                        case 2:
                        dateField2.setText("");
                        inField2.setText("");
                        outField2.setText("");
                        break;
                        case 3:
                        dateField3.setText("");
                        inField3.setText("");
                        outField3.setText("");
                        break;
                        case 4:
                        dateField4.setText("");
                        inField4.setText("");
                        outField4.setText("");
                        break;
                        case 5:
                        dateField5.setText("");
                        inField5.setText("");
                        outField5.setText("");
                        break;
                        case 6:
                        dateField6.setText("");
                        inField6.setText("");
                        outField6.setText("");
                        break;
                        case 7:
                        dateField7.setText("");
                        inField7.setText("");
                        outField7.setText("");
                        break;
                        case 8:
                        dateField8.setText("");
                        inField8.setText("");
                        outField8.setText("");
                        break;
                        case 9:
                        dateField9.setText("");
                        inField9.setText("");
                        outField9.setText("");
                        break;
                        case 10:
                        dateField10.setText("");
                        inField10.setText("");
                        outField10.setText("");
                        break;

                    }
                }
            }
    }//GEN-LAST:event_attendanceTableMouseClicked

    private void tfSemiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSemiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSemiActionPerformed

    private void tfRiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRiceActionPerformed

    private void tfClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClothingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClothingActionPerformed

    private void tfPhoneAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneAllowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneAllowanceActionPerformed

    private void tfSssContriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSssContriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSssContriActionPerformed

    private void tfPhilContriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhilContriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhilContriActionPerformed

    private void tfPagibigContriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPagibigContriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPagibigContriActionPerformed

    private void tfWithTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWithTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWithTaxActionPerformed

    private void tfNetSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNetSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNetSalaryActionPerformed

    private void tfGrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGrossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGrossActionPerformed

    private void tfTotalDeducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalDeducActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalDeducActionPerformed

    private void tfBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBasicActionPerformed

    }//GEN-LAST:event_tfBasicActionPerformed

    private void tableSalaryInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalaryInfoMouseClicked
        /// Add a ListSelectionListener to tableSalaryInfo
        tableSalaryInfo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent e) {
                // Check if the selection is not adjusting (to avoid multiple events)
                if (!e.getValueIsAdjusting()) {
                    // Get the selected row index
                    int selectedRow = tableSalaryInfo.getSelectedRow();
                    if (selectedRow != -1) { // Ensure a row is selected
                        // Get the data from the selected row
                        String grossSemiRate = tableSalaryInfo.getValueAt(selectedRow, 7).toString();
                        String riceSubsidy = tableSalaryInfo.getValueAt(selectedRow, 4).toString();
                        String clothingAllowance = tableSalaryInfo.getValueAt(selectedRow, 6).toString();
                        String phoneAllowance = tableSalaryInfo.getValueAt(selectedRow, 5).toString();
                        String basicSalary = tableSalaryInfo.getValueAt(selectedRow, 3).toString();

                        // Set the values to the JTextFields
                        tfSemi.setText(grossSemiRate);
                        tfRice.setText(riceSubsidy);
                        tfClothing.setText(clothingAllowance);
                        tfPhoneAllowance.setText(phoneAllowance);
                        tfBasic.setText(basicSalary);

                        // Clear the text fields
                        tfSssContri.setText("");
                        tfPagibigContri.setText("");
                        tfPhilContri.setText("");
                        tfWithTax.setText("");
                        tfTotalDeduc.setText("");
                        tfNetSalary.setText("");
                    }
                }
            }
        });

        // Add DocumentListener to calculate total and update the Gross Salary
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTotal();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTotal();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTotal();
            }

            private void updateTotal() {
                try {
                    // Get the values from the JTextFields
                    String basicInput = tfBasic.getText().replaceAll(",", "");
                    String riceInput = tfRice.getText().replaceAll(",", "");
                    String clothingInput = tfClothing.getText().replaceAll(",", "");
                    String phoneAllowanceInput = tfPhoneAllowance.getText().replaceAll(",", "");

                    // Parse the cleaned input strings as doubles
                    double basicSalary = Double.parseDouble(basicInput);
                    double rice = Double.parseDouble(riceInput);
                    double clothing = Double.parseDouble(clothingInput);
                    double phoneAllowance = Double.parseDouble(phoneAllowanceInput);

                    // Calculate the total
                    double total = basicSalary + rice + clothing + phoneAllowance;

                    // Set the total to the Gross Salary text field
                    tfGross.setText(String.valueOf(total));
                } catch (NumberFormatException ex) {
                    // Handle invalid input (non-numeric values)
                    // You can display an error message or take other appropriate action here
                    tfGross.setText("Invalid input");
                }
            }
        };

        // Add the DocumentListener to each JTextField
        tfBasic.getDocument().addDocumentListener(documentListener);
        tfRice.getDocument().addDocumentListener(documentListener);
        tfClothing.getDocument().addDocumentListener(documentListener);
        tfPhoneAllowance.getDocument().addDocumentListener(documentListener);
    }//GEN-LAST:event_tableSalaryInfoMouseClicked

    private void calculatePayrollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatePayrollBtnActionPerformed
        try {
            // Get the values from text fields
            double basicSalary = Double.parseDouble(tfBasic.getText().replaceAll(",", ""));
            double riceSubsidy = Double.parseDouble(tfRice.getText().replaceAll(",", ""));
            double phoneAllowance = Double.parseDouble(tfPhoneAllowance.getText().replaceAll(",", ""));
            double clothingAllowance = Double.parseDouble(tfClothing.getText().replaceAll(",", ""));

            // Calculate total earnings
            double totalEarnings = basicSalary + riceSubsidy + phoneAllowance + clothingAllowance;

            // Calculate SSS contribution
            double sssContribution = calculateSssContribution(basicSalary);
            tfSssContri.setText(String.format("%.2f", sssContribution));

            // Calculate Pag-IBIG contribution
            double pagibigContribution = calculatePagibigContribution(basicSalary);
            tfPagibigContri.setText(String.format("%.2f", pagibigContribution));

            // Calculate PhilHealth contribution
            double philhealthContribution = calculatePhilhealthContribution(basicSalary);
            tfPhilContri.setText(String.format("%.2f", philhealthContribution));

            // Calculate withholding tax
            double withholdingTax = calculateWithholdingTax(totalEarnings);
            tfWithTax.setText(String.format("%.2f", withholdingTax));

            // Calculate total deductions
            double totalDeductions = sssContribution + pagibigContribution + philhealthContribution + withholdingTax;
            tfTotalDeduc.setText(String.format("%.2f", totalDeductions));

            // Calculate net earnings after deductions
            double netEarnings = totalEarnings - totalDeductions;

            // Calculate net salary
            double netSalary = netEarnings;
            tfNetSalary.setText(String.format("%.2f", netSalary));

        } catch (NumberFormatException e) {
            // Handle parsing errors
            System.err.println("Error: Invalid input format");
        }
        }

        // Method to calculate SSS contribution based on basic salary
        private double calculateSssContribution(double basicSalary) {
            if (basicSalary >= 12750 && basicSalary < 13250) {
                return 585.00;
            } else if (basicSalary >= 13250 && basicSalary < 13750) {
                return 607.50;
            } else if (basicSalary >= 13750 && basicSalary < 14250) {
                return 630.00;
            } else if (basicSalary >= 14250 && basicSalary < 14750) {
                return 652.50;
            } else if (basicSalary >= 14750 && basicSalary < 15250) {
                return 675.00;
            } else if (basicSalary >= 15250 && basicSalary < 15750) {
                return 697.50;
            } else if (basicSalary >= 15750 && basicSalary < 16250) {
                return 720.00;
            } else if (basicSalary >= 16250 && basicSalary < 16750) {
                return 742.50;
            } else if (basicSalary >= 16750 && basicSalary < 17250) {
                return 765.00;
            } else if (basicSalary >= 17250 && basicSalary < 17750) {
                return 787.50;
            } else if (basicSalary >= 17750 && basicSalary < 18250) {
                return 810.00;
            } else if (basicSalary >= 18250 && basicSalary < 18750) {
                return 832.50;
            } else if (basicSalary >= 18750 && basicSalary < 19250) {
                return 855.00;
            } else if (basicSalary >= 19250 && basicSalary < 19750) {
                return 877.50;
            } else if (basicSalary >= 19750 && basicSalary < 20250) {
                return 900.00;
            } else if (basicSalary >= 20250 && basicSalary < 20750) {
                return 922.50;
            } else if (basicSalary >= 20750 && basicSalary < 21250) {
                return 945.00;
            } else if (basicSalary >= 21250 && basicSalary < 21750) {
                return 967.50;
            } else if (basicSalary >= 21750 && basicSalary < 22250) {
                return 990.00;
            } else if (basicSalary >= 22250 && basicSalary < 22750) {
                return 1012.50;
            } else if (basicSalary >= 22750 && basicSalary < 23250) {
                return 1035.00;
            } else if (basicSalary >= 23250 && basicSalary < 23750) {
                return 1057.50;
            } else if (basicSalary >= 23750 && basicSalary < 24250) {
                return 1080.00;
            } else {
                return 1125.00; // Default contribution for over salary
            }
        }

        // Method to calculate Pag-IBIG contribution based on basic salary
        private double calculatePagibigContribution(double monthlyBasicSalary) {

            if (monthlyBasicSalary > 1500) {
                // Employee's Contribution Rate 2%
                double employeeContribution = 0.02 * monthlyBasicSalary;
                // Employer's Contribution Rate 2%
                double employerContribution = 0.02 * monthlyBasicSalary;
                // Total Contribution 4%
                double totalContribution = employeeContribution + employerContribution;
                // Limit the total contribution to 100
                return Math.min(totalContribution, 100.0);
            } else {
                return 0.0;
            }
        }

        private double calculatePhilhealthContribution(double monthlyBasicSalary) {
            if (monthlyBasicSalary <= 10000) {
                return 300.0; // Monthly Premium 300
            } else if (monthlyBasicSalary > 10000 && monthlyBasicSalary <= 59999.99) {
                // Premium Rate 3% - Monthly Premium - 300 up to 1,800
                return 0.03 * monthlyBasicSalary - 300;
            } else if (monthlyBasicSalary >= 60000) {
                // Premium Rate 3% - Monthly Premium 1,800
                return 1800.0;
            } else {
                // Handle other cases if needed
                return 0.0;
            }
        }

        // Method to calculate withholding tax based on total earnings
        private double calculateWithholdingTax(double monthlyRate) {
            if (monthlyRate <= 20832) {
                return 0.0; // No withholding tax
            } else if (monthlyRate > 20832 && monthlyRate <= 33333) {
                // Tax Rate 20% in excess of 20,833
                return 0.20 * (monthlyRate - 20832);
            } else if (monthlyRate > 33333 && monthlyRate <= 66667) {
                // Tax Rate 2,500 plus 25% in excess of 33,333
                return 2500 + 0.25 * (monthlyRate - 33333);
            } else if (monthlyRate > 66667 && monthlyRate <= 166667) {
                // Tax Rate 10,833 plus 30% in excess of 66,667
                return 10833 + 0.30 * (monthlyRate - 66667);
            } else if (monthlyRate > 166667 && monthlyRate <= 666667) {
                // tax Rate 40, 833.33 plus 32% in excess over 166667
                return 40833.3 + 0.32 * (monthlyRate - 166667);
            } else {

                return 0.0;
            }
    }//GEN-LAST:event_calculatePayrollBtnActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // Create an instance of the login frame
        loginFrame loginFrame = new loginFrame();

        // Hide the current frame
        this.setVisible(false);

        // Show the login frame
        loginFrame.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JButton calculateHrsBtn;
    private javax.swing.JButton calculatePayrollBtn;
    private javax.swing.JTextField dateField1;
    private javax.swing.JTextField dateField10;
    private javax.swing.JTextField dateField2;
    private javax.swing.JTextField dateField3;
    private javax.swing.JTextField dateField4;
    private javax.swing.JTextField dateField5;
    private javax.swing.JTextField dateField6;
    private javax.swing.JTextField dateField7;
    private javax.swing.JTextField dateField8;
    private javax.swing.JTextField dateField9;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField inField1;
    private javax.swing.JTextField inField10;
    private javax.swing.JTextField inField2;
    private javax.swing.JTextField inField3;
    private javax.swing.JTextField inField4;
    private javax.swing.JTextField inField5;
    private javax.swing.JTextField inField6;
    private javax.swing.JTextField inField7;
    private javax.swing.JTextField inField8;
    private javax.swing.JTextField inField9;
    private javax.swing.JTable infoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField outField1;
    private javax.swing.JTextField outField10;
    private javax.swing.JTextField outField2;
    private javax.swing.JTextField outField3;
    private javax.swing.JTextField outField4;
    private javax.swing.JTextField outField5;
    private javax.swing.JTextField outField6;
    private javax.swing.JTextField outField7;
    private javax.swing.JTextField outField8;
    private javax.swing.JTextField outField9;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTable tableSalaryInfo;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfBasic;
    private javax.swing.JTextField tfBirthday;
    private javax.swing.JTextField tfClothing;
    private javax.swing.JTextField tfEnum;
    private javax.swing.JTextField tfGross;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNetSalary;
    private javax.swing.JTextField tfPagibig;
    private javax.swing.JTextField tfPagibigContri;
    private javax.swing.JTextField tfPhilContri;
    private javax.swing.JTextField tfPhilhealth;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfPhoneAllowance;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfRice;
    private javax.swing.JTextField tfSemi;
    private javax.swing.JTextField tfSss;
    private javax.swing.JTextField tfSssContri;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfSupervisor;
    private javax.swing.JTextField tfTin;
    private javax.swing.JTextField tfTotalDeduc;
    private javax.swing.JTextField tfWithTax;
    private javax.swing.JTextField totalEarn;
    private javax.swing.JTextField totalhrs;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
