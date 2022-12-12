/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HealthRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.vaccinate;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author karan
 */
public class HealthWorkAreaJPanel extends javax.swing.JPanel {
        
    private JPanel userProcessContainer;
    private HealthOrganization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    int approved = 0;
    int requested = 0;
    /**
     * Creates new form DistributionWorkAreaJPanel
     */
    public HealthWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HealthOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        lblValue.setText(account.getEmployee().getName());
        populateApproveTable();
        populateRequestedTable();
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
        tblRequested = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblApproved = new javax.swing.JTable();
        lblApproved = new javax.swing.JLabel();
        lblRequested = new javax.swing.JLabel();
        btnChart = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRequested.setBackground(new java.awt.Color(0, 204, 255));
        tblRequested.setForeground(new java.awt.Color(36, 47, 65));
        tblRequested.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person", "Distribution", "Status", "Date"
            }
        ));
        tblRequested.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane1.setViewportView(tblRequested);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 460, 180));

        tblApproved.setBackground(new java.awt.Color(0, 204, 255));
        tblApproved.setForeground(new java.awt.Color(36, 47, 65));
        tblApproved.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person", "Distribution", "Status", "Date"
            }
        ));
        tblApproved.setGridColor(new java.awt.Color(97, 212, 195));
        jScrollPane2.setViewportView(tblApproved);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 470, 180));

        lblApproved.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblApproved.setForeground(new java.awt.Color(255, 255, 255));
        lblApproved.setText("Approved List of Vaccine by person");
        add(lblApproved, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblRequested.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblRequested.setForeground(new java.awt.Color(255, 255, 255));
        lblRequested.setText("Requested List of Vaccines by person");
        add(lblRequested, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnChart.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnChart.setText("Generate PieChart");
        btnChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChartActionPerformed(evt);
            }
        });
        add(btnChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HEALTHWORKAREA.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 100, 850));

        lblText.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("Currently Logged in as:");
        add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        lblValue.setFont(new java.awt.Font("Optima", 1, 22)); // NOI18N
        lblValue.setForeground(new java.awt.Color(97, 212, 195));
        lblValue.setText("<value>");
        add(lblValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 230, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChartActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Approved", new Integer(tblApproved.getRowCount()));
        pieDataset.setValue("Requested",new Integer(tblRequested.getRowCount()));
        JFreeChart chart = ChartFactory.createPieChart("Chart", pieDataset,true , true , true);
        PiePlot P = (PiePlot) chart.getPlot();
        //P.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame = new ChartFrame("Pie Chart" , chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_btnChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApproved;
    private javax.swing.JLabel lblRequested;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTable tblApproved;
    private javax.swing.JTable tblRequested;
    // End of variables declaration//GEN-END:variables

    private void populateApproveTable() {
        DefaultTableModel model = (DefaultTableModel) tblApproved.getModel();
        model.setRowCount(0);
        
            System.out.println("Inside approved table");
        for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            approved++;
            Object[] row = new Object[4];
            System.out.println("Inside approved for");
            if(wr instanceof vaccinate){
                
            System.out.println("Inside approved if");
                if(wr.getStatus().equals("Approved")){
                    
            System.out.println("Inside approved if 2");
                row[0] = wr;
                row[1] = wr.getReceiver();
                row[2] = wr.getStatus();
                String Date = ((vaccinate) wr).getDate();
                row[3] = Date;
                model.addRow(row);
                }
            }
        }
    }

    private void populateRequestedTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequested.getModel();
        model.setRowCount(0);
        
            System.out.println("Inside requesed table");
        for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList()){
            requested++;
            System.out.println("Inside requested for");
            Object[] row = new Object[4];
            if(wr instanceof vaccinate){
                
            System.out.println("Inside requested if");
                if(wr.getStatus().equals("Requested")){
                    
            System.out.println("Inside requested if 2");
                row[0] = wr;
                row[1] = wr.getReceiver();
                row[2] = wr.getStatus();
                String Date = ((vaccinate) wr).getDate();
                row[3] = Date;
                model.addRow(row);
                }
            }
        }
    }
}
