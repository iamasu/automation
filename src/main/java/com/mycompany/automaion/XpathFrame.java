package com.mycompany.automaion;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.openqa.selenium.WebDriver;

public class XpathFrame extends javax.swing.JFrame {

    private final MainFrame mainFrame;
    private final WebDriver driver;

    public XpathFrame(MainFrame mainFrame, WebDriver driver) {
        setBackground(MainFrame.COLOR);
        initComponents();
        this.mainFrame = mainFrame;
        this.driver = driver;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boyPanel = new javax.swing.JPanel();
        xpathPanel = new javax.swing.JPanel();
        xpathLabel = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoSpy");
        setAlwaysOnTop(true);

        boyPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        xpathLabel.setForeground(new java.awt.Color(255, 255, 255));
        xpathLabel.setText("Do you want store Xpath?");

        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setText("Cancel");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout xpathPanelLayout = new org.jdesktop.layout.GroupLayout(xpathPanel);
        xpathPanel.setLayout(xpathPanelLayout);
        xpathPanelLayout.setHorizontalGroup(
            xpathPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xpathPanelLayout.createSequentialGroup()
                .add(42, 42, 42)
                .add(xpathLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(yesButton)
                .add(29, 29, 29)
                .add(noButton)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        xpathPanelLayout.setVerticalGroup(
            xpathPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(xpathPanelLayout.createSequentialGroup()
                .add(34, 34, 34)
                .add(xpathPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xpathLabel)
                    .add(yesButton)
                    .add(noButton))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout boyPanelLayout = new org.jdesktop.layout.GroupLayout(boyPanel);
        boyPanel.setLayout(boyPanelLayout);
        boyPanelLayout.setHorizontalGroup(
            boyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boyPanelLayout.createSequentialGroup()
                .add(xpathPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        boyPanelLayout.setVerticalGroup(
            boyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, xpathPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, boyPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(boyPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        boyPanel.getAccessibleContext().setAccessibleName(" ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        // TODO add your handling code here:
        mainFrame.dispose();
        driver.close();
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        // TODO add your handling code here:
        JPanel panel = new JPanel();
        panel.add(new JLabel(new ImageIcon(MainFrame.IMAGE_4)));
        mainFrame.setPanel(panel);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String pgaeSource = driver.getPageSource();
                XpathCapture.xpath(pgaeSource);
                mainFrame.setPanel(getXpathPanel());
            }
        });
        t.start();
    }//GEN-LAST:event_yesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boyPanel;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel xpathLabel;
    private javax.swing.JPanel xpathPanel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables

    public JPanel getXpathPanel() {
        return boyPanel;
    }

}
