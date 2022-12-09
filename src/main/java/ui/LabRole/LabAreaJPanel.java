/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.LabRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.appointment;
import java.awt.Color;
//import java.net.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Session;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karan
 */
public class LabAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private LabOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form LabAreaJPanel
     */
    public LabAreaJPanel(JPanel userProcessContainer, UserAccount account, LabOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        txtSubmitResult = new javax.swing.JTextField();
        lblQ1 = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        lblQ3 = new javax.swing.JLabel();
        lblQ4 = new javax.swing.JLabel();
        vitalYesRadio = new javax.swing.JRadioButton();
        vitalNoRadio = new javax.swing.JRadioButton();
        dosageYesRadio = new javax.swing.JRadioButton();
        coldYesRadio = new javax.swing.JRadioButton();
        tempYesRadio = new javax.swing.JRadioButton();
        dosageNoRadio = new javax.swing.JRadioButton();
        coldNoRadio = new javax.swing.JRadioButton();
        tempNoRadio = new javax.swing.JRadioButton();
        lblVital = new javax.swing.JLabel();
        lblDosage = new javax.swing.JLabel();
        lblCold = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        barVital = new javax.swing.JProgressBar();
        barDosage = new javax.swing.JProgressBar();
        barCold = new javax.swing.JProgressBar();
        barTemperature = new javax.swing.JProgressBar();
        lblFinal = new javax.swing.JLabel();
        barFinal = new javax.swing.JProgressBar();
        lblResult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnGenerateReport = new javax.swing.JButton();
        lblTo = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaReport = new javax.swing.JTextArea();
        lblReport = new javax.swing.JLabel();
        btnSendReport = new javax.swing.JButton();
        separatorLine = new javax.swing.JSeparator();
        separatorLine1 = new javax.swing.JSeparator();
        separatorLine2 = new javax.swing.JSeparator();
        lblTitle = new javax.swing.JLabel();
        lblQ5 = new javax.swing.JLabel();
        lblQ6 = new javax.swing.JLabel();
        pulseYesRadio = new javax.swing.JRadioButton();
        pulseNoRadio1 = new javax.swing.JRadioButton();
        bpYesRadio2 = new javax.swing.JRadioButton();
        bpNoRadio2 = new javax.swing.JRadioButton();
        lblBloodPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        barPulse = new javax.swing.JProgressBar();
        barBloodPressure = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(0, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 204, 255));
        jTable1.setForeground(new java.awt.Color(36, 47, 65));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Sender Email", "Receiver", "Status", "Result"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 480, 100));

        btnSubmit.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnSubmit.setText("Submit Result to Doctor");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        txtSubmitResult.setBackground(new java.awt.Color(0, 204, 255));
        txtSubmitResult.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtSubmitResult.setForeground(new java.awt.Color(255, 255, 255));
        txtSubmitResult.setBorder(null);
        txtSubmitResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubmitResultActionPerformed(evt);
            }
        });
        add(txtSubmitResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 220, -1));

        lblQ1.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQ1.setForeground(new java.awt.Color(255, 255, 255));
        lblQ1.setText("Are the Vital Signs of the person completely normal? ");
        add(lblQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblQ2.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQ2.setForeground(new java.awt.Color(255, 255, 255));
        lblQ2.setText("Has the patient completed both the doses?");
        add(lblQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 360, -1));

        lblQ3.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQ3.setForeground(new java.awt.Color(255, 255, 255));
        lblQ3.setText("Does the patient have cold, cough?");
        add(lblQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 360, -1));

        lblQ4.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQ4.setForeground(new java.awt.Color(255, 255, 255));
        lblQ4.setText("Does the patient have a normal temperature? ");
        add(lblQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 360, -1));

        vitalYesRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        vitalYesRadio.setForeground(new java.awt.Color(255, 255, 255));
        vitalYesRadio.setText("Yes");
        vitalYesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalYesRadioActionPerformed(evt);
            }
        });
        add(vitalYesRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        vitalNoRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        vitalNoRadio.setForeground(new java.awt.Color(255, 255, 255));
        vitalNoRadio.setText("No");
        vitalNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalNoRadioActionPerformed(evt);
            }
        });
        add(vitalNoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        dosageYesRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        dosageYesRadio.setForeground(new java.awt.Color(255, 255, 255));
        dosageYesRadio.setText("Yes");
        dosageYesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageYesRadioActionPerformed(evt);
            }
        });
        add(dosageYesRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        coldYesRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        coldYesRadio.setForeground(new java.awt.Color(255, 255, 255));
        coldYesRadio.setText("Yes");
        coldYesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coldYesRadioActionPerformed(evt);
            }
        });
        add(coldYesRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        tempYesRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        tempYesRadio.setForeground(new java.awt.Color(255, 255, 255));
        tempYesRadio.setText("Yes");
        tempYesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempYesRadioActionPerformed(evt);
            }
        });
        add(tempYesRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, -1, -1));

        dosageNoRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        dosageNoRadio.setForeground(new java.awt.Color(255, 255, 255));
        dosageNoRadio.setText("No");
        dosageNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageNoRadioActionPerformed(evt);
            }
        });
        add(dosageNoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        coldNoRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        coldNoRadio.setForeground(new java.awt.Color(255, 255, 255));
        coldNoRadio.setText("No");
        coldNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coldNoRadioActionPerformed(evt);
            }
        });
        add(coldNoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        tempNoRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        tempNoRadio.setForeground(new java.awt.Color(255, 255, 255));
        tempNoRadio.setText("No");
        tempNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempNoRadioActionPerformed(evt);
            }
        });
        add(tempNoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 170, -1, -1));

        lblVital.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblVital.setForeground(new java.awt.Color(255, 255, 255));
        lblVital.setText("Vital Signs: ");
        add(lblVital, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        lblDosage.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblDosage.setForeground(new java.awt.Color(255, 255, 255));
        lblDosage.setText("Dosage: ");
        add(lblDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        lblCold.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblCold.setForeground(new java.awt.Color(255, 255, 255));
        lblCold.setText("Cold/cough: ");
        add(lblCold, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        lblTemperature.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblTemperature.setForeground(new java.awt.Color(255, 255, 255));
        lblTemperature.setText("Temperature: ");
        add(lblTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        barVital.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barVital.setForeground(new java.awt.Color(0, 255, 51));
        barVital.setBorder(null);
        add(barVital, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 20));

        barDosage.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barDosage.setForeground(new java.awt.Color(0, 255, 51));
        barDosage.setBorder(null);
        add(barDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        barCold.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barCold.setForeground(new java.awt.Color(0, 255, 51));
        barCold.setBorder(null);
        add(barCold, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        barTemperature.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barTemperature.setForeground(new java.awt.Color(0, 255, 51));
        barTemperature.setBorder(null);
        add(barTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        lblFinal.setFont(new java.awt.Font("Optima", 1, 16)); // NOI18N
        lblFinal.setForeground(new java.awt.Color(255, 255, 255));
        lblFinal.setText("Final Report : ");
        add(lblFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        barFinal.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barFinal.setForeground(new java.awt.Color(0, 255, 51));
        barFinal.setBorder(null);
        add(barFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 308, -1));

        lblResult.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 255, 255));
        lblResult.setText("Result : ");
        add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, 20));

        txtResult.setBackground(new java.awt.Color(0, 204, 255));
        txtResult.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtResult.setForeground(new java.awt.Color(255, 255, 255));
        txtResult.setBorder(null);
        add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 296, 20));

        btnGenerateReport.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnGenerateReport.setText("Generate Report Result");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });
        add(btnGenerateReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        lblTo.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblTo.setForeground(new java.awt.Color(255, 255, 255));
        lblTo.setText("To: ");
        add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        txtTo.setBackground(new java.awt.Color(0, 204, 255));
        txtTo.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtTo.setForeground(new java.awt.Color(255, 255, 255));
        txtTo.setBorder(null);
        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });
        add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 290, -1));

        txtareaReport.setBackground(new java.awt.Color(0, 204, 255));
        txtareaReport.setColumns(20);
        txtareaReport.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        txtareaReport.setForeground(new java.awt.Color(255, 255, 255));
        txtareaReport.setRows(5);
        txtareaReport.setBorder(null);
        jScrollPane2.setViewportView(txtareaReport);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 657, 280, 130));

        lblReport.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblReport.setForeground(new java.awt.Color(255, 255, 255));
        lblReport.setText("Comments about report:");
        add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, -1, -1));

        btnSendReport.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnSendReport.setText("Send Report to Person");
        btnSendReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReportActionPerformed(evt);
            }
        });
        add(btnSendReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 810, -1, -1));

        separatorLine.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 220, -1));

        separatorLine1.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine1.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine1.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 220, 10));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        separatorLine2.setMinimumSize(new java.awt.Dimension(1, 12));
        separatorLine2.setPreferredSize(new java.awt.Dimension(1, 12));
        add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 220, 10));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LABWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));

        lblQ5.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQ5.setForeground(new java.awt.Color(255, 255, 255));
        lblQ5.setText("Does the patient have a heartbeat/pulse?");
        add(lblQ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 360, -1));

        lblQ6.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblQ6.setForeground(new java.awt.Color(255, 255, 255));
        lblQ6.setText("Does the patient have a normal blood pressure?");
        add(lblQ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 360, -1));

        pulseYesRadio.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        pulseYesRadio.setForeground(new java.awt.Color(255, 255, 255));
        pulseYesRadio.setText("Yes");
        pulseYesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseYesRadioActionPerformed(evt);
            }
        });
        add(pulseYesRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, -1, -1));

        pulseNoRadio1.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        pulseNoRadio1.setForeground(new java.awt.Color(255, 255, 255));
        pulseNoRadio1.setText("No");
        pulseNoRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseNoRadio1ActionPerformed(evt);
            }
        });
        add(pulseNoRadio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 200, -1, -1));

        bpYesRadio2.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        bpYesRadio2.setForeground(new java.awt.Color(255, 255, 255));
        bpYesRadio2.setText("Yes");
        bpYesRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpYesRadio2ActionPerformed(evt);
            }
        });
        add(bpYesRadio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 230, -1, -1));

        bpNoRadio2.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        bpNoRadio2.setForeground(new java.awt.Color(255, 255, 255));
        bpNoRadio2.setText("No");
        bpNoRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpNoRadio2ActionPerformed(evt);
            }
        });
        add(bpNoRadio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 230, -1, -1));

        lblBloodPressure.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblBloodPressure.setForeground(new java.awt.Color(255, 255, 255));
        lblBloodPressure.setText("Blood Pressure:");
        add(lblBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 110, -1));

        lblPulse.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblPulse.setForeground(new java.awt.Color(255, 255, 255));
        lblPulse.setText("Pulse:");
        add(lblPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        barPulse.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barPulse.setForeground(new java.awt.Color(0, 255, 51));
        barPulse.setBorder(null);
        add(barPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        barBloodPressure.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        barBloodPressure.setForeground(new java.awt.Color(0, 255, 51));
        barBloodPressure.setBorder(null);
        add(barBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!txtSubmitResult.getText().equals(txtResult.getText())){
            JOptionPane.showMessageDialog(this, "Please input valid report");
            return;
        }
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        appointment request = (appointment)jTable1.getValueAt(selectedRow, 0);
     System.out.println("1");
        request.setTestResult(txtSubmitResult.getText());
        System.out.println(txtSubmitResult.getText());
        System.out.println("2");
        JOptionPane.showMessageDialog(this, "Request tested");
        populateTable();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void vitalYesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalYesRadioActionPerformed
        // TODO add your handling code here:
        if(vitalNoRadio.isSelected()){
            vitalNoRadio.setSelected(false);
        }
        int internalvalue = 100;
        barVital.setValue(internalvalue);
        
       
    }//GEN-LAST:event_vitalYesRadioActionPerformed

    private void dosageNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageNoRadioActionPerformed
        // TODO add your handling code here:
        if(dosageYesRadio.isSelected()){
            dosageYesRadio.setSelected(false);
        }
        int value = 0;
        barDosage.setValue(value);
    }//GEN-LAST:event_dosageNoRadioActionPerformed

    private void vitalNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalNoRadioActionPerformed
        if(vitalYesRadio.isSelected()){
            vitalYesRadio.setSelected(false);
        }
        int value = 0;
        barVital.setValue(value);

        
    }//GEN-LAST:event_vitalNoRadioActionPerformed

    private void dosageYesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageYesRadioActionPerformed
        // TODO add your handling code here:
        if(dosageNoRadio.isSelected()){
            dosageNoRadio.setSelected(false);
        }
        int internalvalue = 100;
        barDosage.setValue(internalvalue);
        
    }//GEN-LAST:event_dosageYesRadioActionPerformed

    private void coldYesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coldYesRadioActionPerformed
        // TODO add your handling code here:
        if(coldNoRadio.isSelected()){
            coldNoRadio.setSelected(false);
        }
        int internalvalue = 100;
        barCold.setValue(internalvalue);
        
        
    }//GEN-LAST:event_coldYesRadioActionPerformed

    private void coldNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coldNoRadioActionPerformed
        // TODO add your handling code here:
         if(coldYesRadio.isSelected()){
            coldYesRadio.setSelected(false);
        }
        int value = 0;
        barCold.setValue(value);
    }//GEN-LAST:event_coldNoRadioActionPerformed

    private void tempYesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempYesRadioActionPerformed
        // TODO add your handling code here:
        if(tempNoRadio.isSelected()){
            tempNoRadio.setSelected(false);
        }
        int internalvalue = 100;
        barTemperature.setValue(internalvalue);
        
    }//GEN-LAST:event_tempYesRadioActionPerformed

    private void tempNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempNoRadioActionPerformed
        // TODO add your handling code here:
         if(tempYesRadio.isSelected()){
            tempYesRadio.setSelected(false);
        }
        int value = 0;
        barTemperature.setValue(value);
    }//GEN-LAST:event_tempNoRadioActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        // TODO add your handling code here:
        int vitals = barVital.getValue()/6;
        int cold = barCold.getValue()/6;
        int dosage = barDosage.getValue()/6;
        int temp = barTemperature.getValue()/6;
        int pulse = barPulse.getValue()/6;
        int bp = barBloodPressure.getValue()/6;
        
        int finalResult = vitals + cold + dosage + temp + pulse + bp;
        
        barFinal.setValue(finalResult);
        if(finalResult == 100){
            barFinal.setStringPainted(true);
            barFinal.setForeground(Color.white);
            barFinal.setBackground(Color.green);
           
            
            txtResult.setText("Approved !");
        } else if(finalResult >= 50 && finalResult < 100){
            barFinal.setForeground(Color.YELLOW);
            txtResult.setText("Needs Monitoring");
        }else if (finalResult < 50){
            barFinal.setForeground(Color.RED);
            txtResult.setText("Danger!");
        }
        
    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void txtSubmitResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubmitResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubmitResultActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void btnSendReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReportActionPerformed
        // TODO add your handling code here:
        String toEmail = txtTo.getText();
        String fromEmail = "nuccfall2021@gmail.com";
        String fromEmailPassword = "nuccnucc";
        String subject = "Report from NUCC";
        
        Properties props = new Properties();
        props.put("mail.smtp.user","username"); 
        props.put("mail.smtp.host", "smtp.gmail.com"); 
        props.put("mail.smtp.port", "25"); 
        props.put("mail.debug", "true"); 
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable","true"); 
        props.put("mail.smtp.EnableSSL.enable","true");

        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
        props.setProperty("mail.smtp.socketFactory.fallback", "false");   
        props.setProperty("mail.smtp.port", "465");   
        props.setProperty("mail.smtp.socketFactory.port", "465");
        
        Session session = Session.getDefaultInstance(props , new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail , fromEmailPassword);
            }
        });
        populateTable();
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(txtareaReport.getText());
            Transport.send(message);
        }catch(Exception e){
            System.out.print(e);
        }
        
    }//GEN-LAST:event_btnSendReportActionPerformed

    private void pulseYesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseYesRadioActionPerformed
        // TODO add your handling code here:
        if(pulseNoRadio1.isSelected()){
            pulseNoRadio1.setSelected(false);
        }
        int internalvalue = 100;
        barPulse.setValue(internalvalue);
    }//GEN-LAST:event_pulseYesRadioActionPerformed

    private void pulseNoRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseNoRadio1ActionPerformed
        // TODO add your handling code here:
        if(pulseYesRadio.isSelected()){
            pulseYesRadio.setSelected(false);
        }
        int internalvalue = 0;
        barPulse.setValue(internalvalue);
    }//GEN-LAST:event_pulseNoRadio1ActionPerformed

    private void bpYesRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpYesRadio2ActionPerformed
        // TODO add your handling code here:
        if(bpNoRadio2.isSelected()){
            bpNoRadio2.setSelected(false);
        }
        int internalvalue = 100;
        barBloodPressure.setValue(internalvalue);
    }//GEN-LAST:event_bpYesRadio2ActionPerformed

    private void bpNoRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpNoRadio2ActionPerformed
        // TODO add your handling code here:
        if(bpYesRadio2.isSelected()){
            bpYesRadio2.setSelected(false);
        }
        int internalvalue = 0;
        barBloodPressure.setValue(internalvalue);
    }//GEN-LAST:event_bpNoRadio2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barBloodPressure;
    private javax.swing.JProgressBar barCold;
    private javax.swing.JProgressBar barDosage;
    private javax.swing.JProgressBar barFinal;
    private javax.swing.JProgressBar barPulse;
    private javax.swing.JProgressBar barTemperature;
    private javax.swing.JProgressBar barVital;
    private javax.swing.JRadioButton bpNoRadio2;
    private javax.swing.JRadioButton bpYesRadio2;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnSendReport;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JRadioButton coldNoRadio;
    private javax.swing.JRadioButton coldYesRadio;
    private javax.swing.JRadioButton dosageNoRadio;
    private javax.swing.JRadioButton dosageYesRadio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCold;
    private javax.swing.JLabel lblDosage;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblQ5;
    private javax.swing.JLabel lblQ6;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblVital;
    private javax.swing.JRadioButton pulseNoRadio1;
    private javax.swing.JRadioButton pulseYesRadio;
    private javax.swing.JSeparator separatorLine;
    private javax.swing.JSeparator separatorLine1;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JRadioButton tempNoRadio;
    private javax.swing.JRadioButton tempYesRadio;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSubmitResult;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextArea txtareaReport;
    private javax.swing.JRadioButton vitalNoRadio;
    private javax.swing.JRadioButton vitalYesRadio;
    // End of variables declaration//GEN-END:variables
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            if(request instanceof appointment){
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            String email = ((appointment) request).getEmail();
            row[2] = email;
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            String result = ((appointment) request).getTestResult();
            row[5] = result;
            
            
            model.addRow(row);
        }
        }
    }
}
