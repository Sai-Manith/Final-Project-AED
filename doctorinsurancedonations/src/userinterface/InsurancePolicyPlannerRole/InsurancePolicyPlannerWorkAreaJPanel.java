/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsurancePolicyPlannerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Insurance.Insurance;
import Business.Organization.InsurancePolicyPlannerOrganization;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rajesh
 */
public class InsurancePolicyPlannerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private UserAccount usrAcnt;
    private InsurancePolicyPlannerOrganization insrPlcyPlnrOrg;
    private InsuranceCompanyEnterprise insrCmpEnt;

    /**
     * Creates new form InsurancePolicyPlannerJPanel
     */
    public InsurancePolicyPlannerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, InsurancePolicyPlannerOrganization insurancePolicyPlannerOrganization, Enterprise enterprise) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.usrAcnt = usrAcnt;
        this.insrPlcyPlnrOrg = insurancePolicyPlannerOrganization;
        this.insrCmpEnt = (InsuranceCompanyEnterprise) enterprise;

        pplTbl();
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
        plcyNmTxt = new javax.swing.JTextField();
        plcyCvgTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        plcyTCTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plcysJTable = new javax.swing.JTable();
        crtPlcyBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mnthPrmTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Create a New Policy");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Policy Name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Policy Coverage (in %): ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Policy Terms & Condition: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Policy Planner Work Area");

        plcysJTable.setBackground(new java.awt.Color(0, 153, 255));
        plcysJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Policy Name", "Policy Coverage %", "Monthly Premium", "Policy T&C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(plcysJTable);

        crtPlcyBtn.setBackground(new java.awt.Color(0, 153, 255));
        crtPlcyBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        crtPlcyBtn.setText("Create Policy");
        crtPlcyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crtPlcyBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Monthly Premium(USD):");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/policy.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(plcyNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(plcyCvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mnthPrmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(plcyTCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(crtPlcyBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(plcyNmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(plcyCvgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mnthPrmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(plcyTCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crtPlcyBtn)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void crtPlcyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crtPlcyBtnActionPerformed
        String policyName = plcyNmTxt.getText().trim();
        String poliCoverageTxt = plcyCvgTxt.getText().trim();
        String monthlyPremiumTxt = mnthPrmTxt.getText().trim();
        String policyTC = plcyTCTxt.getText().trim();
        if (policyName.equals("")) {
            JOptionPane.showMessageDialog(null, "Policy Name is mandatory");
            return;
        }

        if (poliCoverageTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Policy Coverage is mandatory");
            return;
        }

        if (monthlyPremiumTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Monthly Premium is mandatory");
            return;
        }

        if (policyTC.equals("")) {
            JOptionPane.showMessageDialog(null, "Policy TC is mandatory");
            return;
        }

        double policyCoverage = 0;
        try {
            policyCoverage = Double.parseDouble(poliCoverageTxt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter numeric values for insurance coverage");

            return;
        }

        double monthlyPremium = 0;
        try {
            monthlyPremium = Double.parseDouble(monthlyPremiumTxt);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please enter numeric values for monthly premium");
        }

        List<Insurance> plcys = insrCmpEnt.getInsPlcyDir().getPolicies();
        for (Insurance insurance : plcys) {
            if (policyName.equalsIgnoreCase(insurance.getPlcyNm())) {
                JOptionPane.showMessageDialog(null, "Policy already exists, please provide some other policy name");
                return;
            }
        }
        Insurance insr = new Insurance(policyName, insrCmpEnt.getName(), policyCoverage);
        insr.setPlcyTC(policyTC);
        insr.setMonthlyPrm(monthlyPremium);

        // InsuranceCompanyEnterprise insuranceCompanyEnterprise = insuranceCompanyEnterprise;
        insrCmpEnt.getInsPlcyDir().getPolicies().add(insr);
        JOptionPane.showMessageDialog(null, "Policy Added Successfully");
        System.out.println("Policy Added Successfully:" + insrCmpEnt.getInsPlcyDir().getPolicies());
        pplTbl();
        plcyNmTxt.setText("");
        mnthPrmTxt.setText("");
        plcyCvgTxt.setText("");
        plcyTCTxt.setText("");

    }//GEN-LAST:event_crtPlcyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crtPlcyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mnthPrmTxt;
    private javax.swing.JTextField plcyCvgTxt;
    private javax.swing.JTextField plcyNmTxt;
    private javax.swing.JTextField plcyTCTxt;
    private javax.swing.JTable plcysJTable;
    // End of variables declaration//GEN-END:variables

    private void pplTbl() {
//        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        DefaultTableModel model = (DefaultTableModel) plcysJTable.getModel();
        model.setRowCount(0);
        List<Insurance> plcys = insrCmpEnt.getInsPlcyDir().getPolicies();
        for (Insurance insurancePolicy : plcys) {
            Object[] row = new Object[4];
            row[0] = insurancePolicy;
            row[1] = insurancePolicy.getCvrg();
            row[2] = insurancePolicy.getMonthlyPrm();
            row[3] = insurancePolicy.getPlcyTC();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        plcysJTable.setRowSorter(sorter);
    }
}
