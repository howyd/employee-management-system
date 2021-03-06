/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMS1;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Howard
 */
public class SaveLoadOpenNewPanel extends javax.swing.JPanel {

    /**
     * Creates new form SaveLoadPanel
     */
    private String mode;

    public SaveLoadOpenNewPanel() {
        initComponents();
        SLLabel.setText("Open Existing Database?");
    }

    public void setSave() {
        SLLabel.setText("Save Employees To File");
        SLButton.setText("Save");
        FileNameField.setText("");
        FileNameField.requestFocus();
        mode = "save";
    }

    public void setLoad() {
        SLLabel.setText("Load Employees From File");
        SLButton.setText("Load");
        FileNameField.setText("");
        FileNameField.requestFocus();
        mode = "load";
    }
    
    public void setOpen() {
        SLLabel.setText("Open Employees File");
        SLButton.setText("Open");
        FileNameField.setText("");
        FileNameField.requestFocus();
        mode = "open";
    }
    
    public JTextField getFileNameField() {
        return FileNameField;
    }

    public String getFileName() {
        return FileNameField.getText();
    }

    public JButton getButton() {
        return SLButton;
    }

    public String getMode() {
        return mode;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileNameField = new javax.swing.JTextField();
        SLButton = new javax.swing.JButton();
        SLLabel = new javax.swing.JLabel();
        txtLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));

        FileNameField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        FileNameField.setText("UntitledFile");
        FileNameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FileNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FileNameFieldKeyTyped(evt);
            }
        });

        SLButton.setText("Save");

        SLLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SLLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SLLabel.setText("Save Employees To File");

        txtLabel.setText(".txt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SLLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(SLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(FileNameField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLabel)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SLLabel)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLabel))
                .addGap(18, 18, 18)
                .addComponent(SLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FileNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FileNameFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FileNameFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FileNameField;
    private javax.swing.JButton SLButton;
    private javax.swing.JLabel SLLabel;
    private javax.swing.JLabel txtLabel;
    // End of variables declaration//GEN-END:variables
}
