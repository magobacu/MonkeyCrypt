/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import core.UtilLogic;
import javax.swing.JPanel;
import tools.CommTools;

/**
 *
 * @author Jonas
 */
public class MoCr_Frame_Tools extends javax.swing.JFrame {
    UtilLogic localUtils;
    /**
     * Creates new form MoCr_Frame_Tools
     */
    public MoCr_Frame_Tools() {
        initComponents();
        localUtils = new UtilLogic();
    }
 /*   
    public void renew(String a, int b) {
        CommTools.adjustCards(ToolsPanel, SubContainer);
<<<<<<< HEAD
        CommTools.adjustCards(TableSub, localUtils.initTable(a, b)); //Debugging
        CommTools.adjustCards(GraphSub, localUtils.initGraph(a, b)); //Debugging
=======
        CommTools.adjustCards(TableSub, localUtils.initTable("", b)); //Debugging
        CommTools.adjustCards(GraphSub, localUtils.initGraph("", b)); //Debugging
>>>>>>> 57273377f36dddbee16046a9934f4e666002ca4c
        this.setVisible(true);
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolsPanel = new javax.swing.JPanel();
        SubContainer = new javax.swing.JPanel();
        TableSub = new javax.swing.JPanel();
        GraphSub = new javax.swing.JPanel();

        ToolsPanel.setLayout(new java.awt.CardLayout());

        TableSub.setLayout(new java.awt.CardLayout());

        GraphSub.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout SubContainerLayout = new javax.swing.GroupLayout(SubContainer);
        SubContainer.setLayout(SubContainerLayout);
        SubContainerLayout.setHorizontalGroup(
            SubContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SubContainerLayout.createSequentialGroup()
                .addComponent(GraphSub, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SubContainerLayout.setVerticalGroup(
            SubContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubContainerLayout.createSequentialGroup()
                .addComponent(GraphSub, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TableSub, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ToolsPanel.add(SubContainer, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ToolsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ToolsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MoCr_Frame_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoCr_Frame_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoCr_Frame_Tools().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphSub;
    private javax.swing.JPanel SubContainer;
    private javax.swing.JPanel TableSub;
    private javax.swing.JPanel ToolsPanel;
    // End of variables declaration//GEN-END:variables
}
