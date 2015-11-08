/*
 * The MIT License
 *
 * Copyright 2015 William John Holden.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.wjholden.copyrunhere;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author William John Holden
 */
public class CopyRunHereGUI extends javax.swing.JFrame {
    
    private List<String> nodes;
    private List<String> commands;
    private Map<String, NetworkDevice> network;

    /**
     * Creates new form CopyRunHereGUI
     */
    public CopyRunHereGUI() {
        initComponents();
    }
    
    private void updateNodes() {
        List<String> newNodes = new ArrayList<>(Arrays.asList(nodesTextArea.getText().split("\n")));
        nodes = newNodes;
        nodeComboBox.removeAllItems();
        for (String s : nodes) {
            nodeComboBox.addItem(s);
        }
        nodeComboBox.setSelectedIndex(-1);
    }
    
    private void updateCommands() {
        List<String> newCommands = new ArrayList<>(Arrays.asList(commandTextArea.getText().split("\n")));
        commands = newCommands;
        commandComboBox.removeAllItems();
        for (String s : commands) {
            commandComboBox.addItem(s);
        }
        commandComboBox.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openTargetFileChooser = new javax.swing.JFileChooser();
        saveTargetFileChooser = new javax.swing.JFileChooser();
        openCommandFileChooser = new javax.swing.JFileChooser();
        saveCommandFileChooser = new javax.swing.JFileChooser();
        authKeyFileChooser = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nodeComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        commandComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        configTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        openNodesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nodesTextArea = new javax.swing.JTextArea();
        saveNodesButton = new javax.swing.JButton();
        commitNodesButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        openCommandButton = new javax.swing.JButton();
        saveCommandButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        commandTextArea = new javax.swing.JTextArea();
        commitCommandButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CopyRunHere");

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(jTabbedPane1.getFont());
        jTabbedPane1.setName(""); // NOI18N

        jLabel3.setText("Node");

        jLabel4.setText("Command");

        jButton1.setText("Refresh view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Poll all nodes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        configTextArea.setColumns(20);
        configTextArea.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        configTextArea.setRows(5);
        jScrollPane5.setViewportView(configTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nodeComboBox, 0, 541, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(commandComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nodeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(commandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        openNodesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wjholden/copyrunhere/Open16.gif"))); // NOI18N
        openNodesButton.setText("Browse...");
        openNodesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openNodesButtonActionPerformed(evt);
            }
        });

        nodesTextArea.setColumns(20);
        nodesTextArea.setRows(5);
        jScrollPane1.setViewportView(nodesTextArea);

        saveNodesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wjholden/copyrunhere/Save16.gif"))); // NOI18N
        saveNodesButton.setText("Save");
        saveNodesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNodesButtonActionPerformed(evt);
            }
        });

        commitNodesButton.setText("Commit to Main");
        commitNodesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitNodesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(openNodesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveNodesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(commitNodesButton)
                        .addGap(0, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openNodesButton)
                    .addComponent(saveNodesButton)
                    .addComponent(commitNodesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Nodes", jPanel2);

        openCommandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wjholden/copyrunhere/Open16.gif"))); // NOI18N
        openCommandButton.setText("Browse...");
        openCommandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCommandButtonActionPerformed(evt);
            }
        });

        saveCommandButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wjholden/copyrunhere/Save16.gif"))); // NOI18N
        saveCommandButton.setText("Save");
        saveCommandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCommandButtonActionPerformed(evt);
            }
        });

        commandTextArea.setColumns(20);
        commandTextArea.setRows(5);
        commandTextArea.setText("show tech-support");
        jScrollPane2.setViewportView(commandTextArea);

        commitCommandButton.setText("Commit to Main");
        commitCommandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitCommandButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(openCommandButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveCommandButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(commitCommandButton)
                        .addGap(0, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openCommandButton)
                    .addComponent(saveCommandButton)
                    .addComponent(commitCommandButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Commands", jPanel3);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        usernameTextField.setColumns(16);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Authentication", jPanel4);

        jTextPane1.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jTextPane1.setText("The MIT License (MIT)\n\nCopyright (c) 2015 William John Holden <wjholden@gmail.com>\n\nPermission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:\n\nThe above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.\n\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.");
        jScrollPane3.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("License", jPanel6);

        jTextPane2.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jTextPane2.setText("CopyRunHere uses and ships with several open-source dependencies. These programs are listed below with their licenses, versions, websites, and links to the source code. These libraries were not modified for use with this program.\n\nSSHJ\nLicense:        Apache 2\nVersion:        0.14.0\nProject Page:   https://github.com/hierynomus/sshj\nSource Code:    https://github.com/hierynomus/sshj/archive/v0.14.0.zip\n\nSLF4J\nLicense:        MIT\nVersion:        1.7.12\nProject Page:   http://www.slf4j.org/\nSource Code:    http://www.slf4j.org/dist/slf4j-1.7.12.zip\n\nBouncyCastle\nLicense:        MIT\nVersion:        1.53\nProject Page:   https://www.bouncycastle.org/\nSource Code:    https://www.bouncycastle.org/download/bcpkix-jdk15on-153.zip");
        jScrollPane4.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Open Source", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openNodesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openNodesButtonActionPerformed
        readFromFile(openTargetFileChooser, nodesTextArea);
        updateNodes();
    }//GEN-LAST:event_openNodesButtonActionPerformed

    private void readFromFile(final JFileChooser src, final JTextArea dst) {
        // copied from https://netbeans.org/kb/docs/java/gui-filechooser.html
        int returnVal = src.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = src.getSelectedFile();
            try {
                dst.read(new FileReader(file.getAbsolutePath()), null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }
    
    private void writeToFile(final JFileChooser dst, final JTextArea src) {
        int returnVal = dst.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = dst.getSelectedFile();
            try {
                src.write(new FileWriter(file.getAbsolutePath()));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }
    
    private void openCommandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCommandButtonActionPerformed
        readFromFile(openCommandFileChooser, commandTextArea);
        updateCommands();
    }//GEN-LAST:event_openCommandButtonActionPerformed

    private void saveNodesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNodesButtonActionPerformed
        writeToFile(saveTargetFileChooser, nodesTextArea);
    }//GEN-LAST:event_saveNodesButtonActionPerformed

    private void saveCommandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCommandButtonActionPerformed
        writeToFile(saveCommandFileChooser, commandTextArea);
    }//GEN-LAST:event_saveCommandButtonActionPerformed

    private void commitNodesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitNodesButtonActionPerformed
        updateNodes();
    }//GEN-LAST:event_commitNodesButtonActionPerformed

    private void commitCommandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitCommandButtonActionPerformed
        updateCommands();
    }//GEN-LAST:event_commitCommandButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (usernameTextField.getText().length() == 0 || 
                passwordTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Username or password is empty", null, JOptionPane.ERROR_MESSAGE);
        }
        
        network = new HashMap<>();
        for (String node : nodes) {
            try {
                NetworkDevice device = new SecureShellNetworkDevice(node,
                    usernameTextField.getText(), passwordTextField.getText());
                device.setCommands(commands);
                Thread thread = new Thread(device);
                thread.start();
                network.put(node, device);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateResult();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateResult() {
        if (network == null || 
                nodeComboBox.getSelectedIndex() == -1 || 
                commandComboBox.getSelectedIndex() == -1) {
            configTextArea.setText(null);
            return;
        }
        
        String node = nodeComboBox.getSelectedItem().toString();
        NetworkDevice device;
        if (network.containsKey(node)) {
            device = network.get(node);
        } else {
            return;
        }
        String command = commandComboBox.getSelectedItem().toString();
        if (device.getConfig().containsKey(command)) {
            configTextArea.setText(device.getConfig().get(command));
            configTextArea.setCaretPosition(0);
        }
    }
    
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
            java.util.logging.Logger.getLogger(CopyRunHereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CopyRunHereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CopyRunHereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CopyRunHereGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CopyRunHereGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser authKeyFileChooser;
    private javax.swing.JComboBox commandComboBox;
    private javax.swing.JTextArea commandTextArea;
    private javax.swing.JButton commitCommandButton;
    private javax.swing.JButton commitNodesButton;
    private javax.swing.JTextArea configTextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JComboBox nodeComboBox;
    private javax.swing.JTextArea nodesTextArea;
    private javax.swing.JButton openCommandButton;
    private javax.swing.JFileChooser openCommandFileChooser;
    private javax.swing.JButton openNodesButton;
    private javax.swing.JFileChooser openTargetFileChooser;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton saveCommandButton;
    private javax.swing.JFileChooser saveCommandFileChooser;
    private javax.swing.JButton saveNodesButton;
    private javax.swing.JFileChooser saveTargetFileChooser;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}