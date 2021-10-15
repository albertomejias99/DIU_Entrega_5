/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diu_entrega_5;

import com.mycompany.utilspractica5.UtilsPractica5;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author alber
 */
public class JFrame extends javax.swing.JFrame {

    private int jFrameWidth;
    private int jFrameHeight;
    private boolean rojo=false;
    private boolean verde=false;
    private boolean azul=false;
    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        this.jFrameWidth = this.getPreferredSize().width;
        this.jFrameHeight = this.getPreferredSize().height;
        buttonsPanel.setLocation(this.jFrameWidth/2-buttonsPanel.getPreferredSize().width/2, this.jFrameHeight/2-buttonsPanel.getPreferredSize().height/2);
        initButtons();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        posButtonGroup = new javax.swing.ButtonGroup();
        buttonsPanel = new javax.swing.JPanel();
        todosCb = new javax.swing.JCheckBox();
        rojoCb = new javax.swing.JCheckBox();
        verdeCb = new javax.swing.JCheckBox();
        azulCb = new javax.swing.JCheckBox();
        arrIzqRb = new javax.swing.JRadioButton();
        arrDerRb = new javax.swing.JRadioButton();
        abIzqRb = new javax.swing.JRadioButton();
        abDerRb = new javax.swing.JRadioButton();
        lienzo1 = new com.mycompany.diu_entrega_5.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(992, 558));
        getContentPane().setLayout(null);

        todosCb.setText("Todos");
        todosCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosCbActionPerformed(evt);
            }
        });

        rojoCb.setText("Rojo");
        rojoCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rojoCbActionPerformed(evt);
            }
        });

        verdeCb.setText("Verde");
        verdeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeCbActionPerformed(evt);
            }
        });

        azulCb.setText("Azul");
        azulCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azulCbActionPerformed(evt);
            }
        });

        posButtonGroup.add(arrIzqRb);
        arrIzqRb.setText("Arriba Izq");
        arrIzqRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrIzqRbActionPerformed(evt);
            }
        });

        posButtonGroup.add(arrDerRb);
        arrDerRb.setText("Arriba Der");
        arrDerRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrDerRbActionPerformed(evt);
            }
        });

        posButtonGroup.add(abIzqRb);
        abIzqRb.setText("Abajo Izq");
        abIzqRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abIzqRbActionPerformed(evt);
            }
        });

        posButtonGroup.add(abDerRb);
        abDerRb.setText("Abajo Der");
        abDerRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abDerRbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(rojoCb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(arrDerRb))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(todosCb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arrIzqRb))
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(azulCb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abDerRb))
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addComponent(verdeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(abIzqRb)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todosCb)
                    .addComponent(arrIzqRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rojoCb)
                    .addComponent(arrDerRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verdeCb)
                    .addComponent(abIzqRb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azulCb)
                    .addComponent(abDerRb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(buttonsPanel);
        buttonsPanel.setBounds(390, 40, 164, 98);

        lienzo1.setPreferredSize(new java.awt.Dimension(250, 250));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo1);
        lienzo1.setBounds(0, 0, 250, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abIzqRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abIzqRbActionPerformed
        lienzo1.setLocation(0,this.jFrameHeight - lienzo1.getHeight());
    }//GEN-LAST:event_abIzqRbActionPerformed

    private void todosCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosCbActionPerformed
        if(todosCb.isSelected()){
            rojoCb.setSelected(true);
            verdeCb.setSelected(true);
            azulCb.setSelected(true);
            rojo = true;
            verde = true;
            azul = true;
        }
        System.out.println("Rojo: "+ rojo +" "+ "Verde: "+ verde +" "+ "Azul: "+ azul);
        lienzo1.setImagen(UtilsPractica5.seleccionarComponentes(lienzo1.getImagen(),rojo, verde, azul));
    }//GEN-LAST:event_todosCbActionPerformed

    private void rojoCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rojoCbActionPerformed
        if(!rojoCb.isSelected()){
            rojo = false;
            todosCb.setSelected(false);
        } else {
            rojo = true;
        }
        System.out.println("Rojo: "+ rojo +" "+ "Verde: "+ verde +" "+ "Azul: "+ azul);
        lienzo1.setImagen(UtilsPractica5.seleccionarComponentes(lienzo1.getImagen(),rojo, verde, azul));
    }//GEN-LAST:event_rojoCbActionPerformed

    private void verdeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeCbActionPerformed
        if(!verdeCb.isSelected()){
            verde = false;
            todosCb.setSelected(false);
        } else {
            verde = true;
        }
        System.out.println("Rojo: "+ rojo +" "+ "Verde: "+ verde +" "+ "Azul: "+ azul);
        lienzo1.setImagen(UtilsPractica5.seleccionarComponentes(lienzo1.getImagen(),rojo, verde, azul));
    }//GEN-LAST:event_verdeCbActionPerformed

    private void azulCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azulCbActionPerformed
        if(!azulCb.isSelected()){
            azul = false;
            todosCb.setSelected(false);
        } else {
            azul = true;
        }
        System.out.println("Rojo: "+ rojo +" "+ "Verde: "+ verde +" "+ "Azul: "+ azul);
        lienzo1.setImagen(UtilsPractica5.seleccionarComponentes(lienzo1.getImagen(),rojo, verde, azul));
    }//GEN-LAST:event_azulCbActionPerformed

    private void arrIzqRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrIzqRbActionPerformed
        lienzo1.setLocation(0,0);
    }//GEN-LAST:event_arrIzqRbActionPerformed

    private void arrDerRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrDerRbActionPerformed
        lienzo1.setLocation(this.jFrameWidth-lienzo1.getWidth(),0);
    }//GEN-LAST:event_arrDerRbActionPerformed

    private void abDerRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abDerRbActionPerformed
        lienzo1.setLocation(this.jFrameWidth-lienzo1.getWidth(),this.jFrameHeight - lienzo1.getHeight());
    }//GEN-LAST:event_abDerRbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abDerRb;
    private javax.swing.JRadioButton abIzqRb;
    private javax.swing.JRadioButton arrDerRb;
    private javax.swing.JRadioButton arrIzqRb;
    private javax.swing.JCheckBox azulCb;
    private javax.swing.JPanel buttonsPanel;
    private com.mycompany.diu_entrega_5.Lienzo lienzo1;
    private javax.swing.ButtonGroup posButtonGroup;
    private javax.swing.JCheckBox rojoCb;
    private javax.swing.JCheckBox todosCb;
    private javax.swing.JCheckBox verdeCb;
    // End of variables declaration//GEN-END:variables

    private void initButtons() {
        arrIzqRb.setSelected(true);
        todosCb.setSelected(true);
        rojoCb.setSelected(true);
        verdeCb.setSelected(true);
        azulCb.setSelected(true);
        rojo = true;
        verde = true;
        azul = true;
    }
}