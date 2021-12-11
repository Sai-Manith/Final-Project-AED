/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;


import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bunty
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PatientTreatmentWorkRequest patientTreatmentWorkRequest;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, PatientTreatmentWorkRequest patientTreatmentWorkRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientTreatmentWorkRequest = patientTreatmentWorkRequest;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        submitJButton.setBackground(new java.awt.Color(0, 153, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(270, 170, 111, 36);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(193, 135, 39, 15);
        add(resultJTextField);
        resultJTextField.setBounds(242, 128, 160, 30);

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(10, 11, 81, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Lab Test Results");
        add(jLabel2);
        jLabel2.setBounds(230, 20, 195, 29);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lab2.gif"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-10, 0, 740, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String labResult = resultJTextField.getText().trim();
        if (labResult.equals("")) {
            JOptionPane.showMessageDialog(null, "Result is mandatory");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setLabResult(labResult);
                patientTreatmentWorkRequest.setStatus("Lab Test Completed");
                JOptionPane.showMessageDialog(null, "Result submitted successfully");
                resultJTextField.setText("");
                submitJButton.setEnabled(false);
            }

        }


    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
