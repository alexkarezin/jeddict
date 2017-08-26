/**
 * Copyright [2016] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.db.modeler.properties.uniqueconstraint;

import java.util.ArrayList;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang.StringUtils.EMPTY;
import org.netbeans.db.modeler.core.widget.table.TableWidget;
import org.netbeans.db.modeler.properties.tablemember.TableMemberPanel;
import org.netbeans.db.modeler.spec.DBTable;
import org.netbeans.jpa.modeler.spec.UniqueConstraint;
import org.netbeans.modeler.properties.EntityComponent;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;

public class UniqueConstraintPanel extends EntityComponent<UniqueConstraint> {

    private UniqueConstraint uniqueConstraint;
    private final Set<UniqueConstraint> uniqueConstraints;
    private final TableWidget<? extends DBTable> tableWidget;

    public UniqueConstraintPanel(TableWidget<? extends DBTable> tableWidget) {
        this.tableWidget = tableWidget;
        uniqueConstraints = tableWidget.getBaseElementSpec().getUniqueConstraints();
    }

    @Override
    public void postConstruct() {
        initComponents();
    }

    @Override
    public void init() {
        ((TableMemberPanel) classMemberPanel).init();
        pack();
    }
    

    @Override
    public void createEntity(Class<? extends Entity> entityWrapperType) {
        this.setTitle("Create UniqueConstraint");
        if (entityWrapperType == RowValue.class) {
            this.setEntity(new RowValue(new Object[3]));
        }
        uniqueConstraint = new UniqueConstraint();
        ((TableMemberPanel)classMemberPanel).setTableWidget(tableWidget);
        ((TableMemberPanel) classMemberPanel).setValue(uniqueConstraint.getColumnName());
        nameTextField.setText(EMPTY);
    }

    @Override
    public void updateEntity(Entity<UniqueConstraint> entityValue) {
        this.setTitle("Update UniqueConstraint");
        if (entityValue.getClass() == RowValue.class) {
            this.setEntity(entityValue);
            Object[] row = ((RowValue) entityValue).getRow();
            uniqueConstraint = (UniqueConstraint) row[0];
            ((TableMemberPanel)classMemberPanel).setTableWidget(tableWidget);
            ((TableMemberPanel) classMemberPanel).setValue(uniqueConstraint.getColumnName());
            nameTextField.setText(uniqueConstraint.getName());
        }
        
    }

    /**
     * This method is called from within the uniqueConstraint to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootLayeredPane = new javax.swing.JLayeredPane();
        classMemberPanel = new org.netbeans.db.modeler.properties.tablemember.TableMemberPanel("Unique Constraint Columns");
        action_jLayeredPane = new javax.swing.JLayeredPane();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout classMemberPanelLayout = new javax.swing.GroupLayout(classMemberPanel);
        classMemberPanel.setLayout(classMemberPanelLayout);
        classMemberPanelLayout.setHorizontalGroup(
            classMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        classMemberPanelLayout.setVerticalGroup(
            classMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        org.openide.awt.Mnemonics.setLocalizedText(save_Button, org.openide.util.NbBundle.getMessage(UniqueConstraintPanel.class, "UniqueConstraintPanel.save_Button.text")); // NOI18N
        save_Button.setToolTipText(org.openide.util.NbBundle.getMessage(UniqueConstraintPanel.class, "UniqueConstraintPanel.save_Button.toolTipText")); // NOI18N
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });
        action_jLayeredPane.add(save_Button);
        save_Button.setBounds(0, 0, 70, 30);

        org.openide.awt.Mnemonics.setLocalizedText(cancel_Button, org.openide.util.NbBundle.getMessage(UniqueConstraintPanel.class, "UniqueConstraintPanel.cancel_Button.text")); // NOI18N
        cancel_Button.setToolTipText(org.openide.util.NbBundle.getMessage(UniqueConstraintPanel.class, "UniqueConstraintPanel.cancel_Button.toolTipText")); // NOI18N
        cancel_Button.setPreferredSize(new java.awt.Dimension(60, 23));
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });
        action_jLayeredPane.add(cancel_Button);
        cancel_Button.setBounds(80, 0, 70, 30);

        nameTextField.setText(org.openide.util.NbBundle.getMessage(UniqueConstraintPanel.class, "UniqueConstraintPanel.nameTextField.text")); // NOI18N
        nameTextField.setToolTipText("");

        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(UniqueConstraintPanel.class, "UniqueConstraintPanel.nameLabel.text")); // NOI18N

        rootLayeredPane.setLayer(classMemberPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        rootLayeredPane.setLayer(action_jLayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        rootLayeredPane.setLayer(nameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        rootLayeredPane.setLayer(nameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout rootLayeredPaneLayout = new javax.swing.GroupLayout(rootLayeredPane);
        rootLayeredPane.setLayout(rootLayeredPaneLayout);
        rootLayeredPaneLayout.setHorizontalGroup(
            rootLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(action_jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(classMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rootLayeredPaneLayout.setVerticalGroup(
            rootLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootLayeredPaneLayout.createSequentialGroup()
                .addComponent(classMemberPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rootLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(action_jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rootLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameLabel))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootLayeredPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootLayeredPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

      private boolean validateField() {
//        if (uniqueConstraints.contains(new UniqueConstraint(nameTextField.getText()))){
//            JOptionPane.showMessageDialog(this, "UniqueConstraint with same name already exist : " + uniqueConstraint.getName(), "Duplicate UniqueConstraint", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return false;
//        }
        return true;
    }
      
    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        if (!validateField()) {
            return;
        }
        uniqueConstraint.setColumnName(new ArrayList<>(
                ((TableMemberPanel) classMemberPanel).getValue().getColumns().stream()
                .map(c -> c.getProperty())
                .collect(toList())
        ));
        uniqueConstraint.setName(nameTextField.getText());

        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            row[0] = uniqueConstraint;
            row[1] = uniqueConstraint.getName();
            row[2] = uniqueConstraint.toString();
        }
        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane action_jLayeredPane;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JPanel classMemberPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLayeredPane rootLayeredPane;
    private javax.swing.JButton save_Button;
    // End of variables declaration//GEN-END:variables

}
