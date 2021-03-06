/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import gui.utils.*;
import gui.types.*;
import java.awt.event.*;
import types.*;

/**
 *
 * @author colin
 */
public class ActivityManagement extends MSPanel {
    private Instructor a;
    private String courseID;

    /**
     * Creates new form LandingPageSysAdmin
     */
    public ActivityManagement(String courseID, Instructor a) {
	super("Activity Management");
	this.a = a;
	this.courseID = courseID;

        initComponents();
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activity_management_panel = new javax.swing.JPanel();
        create_activity_button = new javax.swing.JButton();
        modify_activity_button = new javax.swing.JButton();
        delete_activity_button = new javax.swing.JButton();

        activity_management_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Activity Management"));

        create_activity_button.setText("Create an Activity");
        create_activity_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_activity_buttonActionPerformed(evt);
            }
        });

        modify_activity_button.setText("Modify Existing Activity");
        modify_activity_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_activity_buttonActionPerformed(evt);
            }
        });

        delete_activity_button.setText("Delete Existing Activity");
        delete_activity_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_activity_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tasks_panelLayout = new javax.swing.GroupLayout(activity_management_panel);
        activity_management_panel.setLayout(tasks_panelLayout);
        tasks_panelLayout.setHorizontalGroup(
            tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_activity_button)
                    .addGroup(tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(modify_activity_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create_activity_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        tasks_panelLayout.setVerticalGroup(
            tasks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasks_panelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(create_activity_button)
                .addGap(18, 18, 18)
                .addComponent(modify_activity_button)
                .addGap(18, 18, 18)
                .addComponent(delete_activity_button)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activity_management_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activity_management_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void create_activity_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_create_activity_buttonActionPerformed
        // For Markus : Toggles here

        GUIUtils.getMasterFrame(this).movePage(new ActivityCreation(courseID));
    }//GEN-LAST:event_create_activity_buttonActionPerformed

    private void modify_activity_buttonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_modify_activity_buttonActionPerformed
               // For Markus : Toggles here

        GUIUtils.getMasterFrame(this).movePage(new ActivitySelection(MODIFY_ACTIVITY, courseID));
    }//GEN-LAST:event_modify_activity_buttonActionPerformed

    private void delete_activity_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_activity_buttonActionPerformed
        // For Markus : Toggles here
    	
        GUIUtils.getMasterFrame(this).movePage(new ActivitySelection(DELETE_ACTIVITY, courseID));
    }//GEN-LAST:event_delete_activity_buttonActionPerformed

    private static final int MODIFY_ACTIVITY = 1;
    private static final int DELETE_ACTIVITY = 2;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create_activity_button;
    private javax.swing.JButton delete_activity_button;
    private javax.swing.JButton modify_activity_button;
    private javax.swing.JPanel activity_management_panel;
    // End of variables declaration//GEN-END:variables
}
