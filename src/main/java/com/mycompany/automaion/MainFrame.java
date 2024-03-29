package com.mycompany.automaion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainFrame extends javax.swing.JFrame {

    private WebDriver driver;
    public static final Color COLOR = new Color(0, 57, 23);//(32, 89, 89);
    public static final String DRIVER_CLASSPATH = "chromedriver.exe";
    public static final String IMAGE_1 = "D:\\icon\\image2.PNG";
    public static final String IMAGE_2 = "D:\\icon\\image2.PNG";
    public static final String IMAGE_3 = "D:\\icon\\image3.GIF";
    public static final String IMAGE_4 = "D:\\icon\\image3.GIF";
    private int with = 600;
    private int height = 300;

    public MainFrame() {
        System.out.println(getClass().getClassLoader().getResource(DRIVER_CLASSPATH).getFile());
        System.setProperty("webdriver.chrome.driver", getClass().getClassLoader().getResource(DRIVER_CLASSPATH).getFile());
        setTitle("");
        setIconImage(new ImageIcon(IMAGE_1).getImage());
        setResizable(true);
        setUndecorated(false);
        setBackground(COLOR);
        setMaximumSize(new Dimension(with, height));
        setMinimumSize(new Dimension(with, height));
        initComponents();
        header.setIcon(new ImageIcon(IMAGE_2));
        pack();
        setLocationRelativeTo(null);
        with = getWidth();
        height = getHeight();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutPanel = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        urlLabel = new javax.swing.JLabel();
        url = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoSpy");
        setAlwaysOnTop(true);

        urlLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        urlLabel.setText("Enter URL");
        urlLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout bodyLayout = new org.jdesktop.layout.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .add(urlLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(url, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(goButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cancelButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .add(bodyLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(urlLabel)
                    .add(url, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(goButton)
                    .add(cancelButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layoutPanelLayout = new org.jdesktop.layout.GroupLayout(layoutPanel);
        layoutPanel.setLayout(layoutPanelLayout);
        layoutPanelLayout.setHorizontalGroup(
            layoutPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layoutPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .add(layoutPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(header, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(body, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(66, 66, 66))
        );
        layoutPanelLayout.setVerticalGroup(
            layoutPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layoutPanelLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(header, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(body, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layoutPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layoutPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        MainFrame spyGUI = this;
        if (url.getText().length() != 0) {
            setPanel(IMAGE_3);
            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        driver = new ChromeDriver();
                        OpenBrowser.main(driver, url.getText());
                        setPanel((new XpathFrame(spyGUI, driver).getXpathPanel()));
                    } catch (Exception e) {
                        JPanel panel = new JPanel();
                        panel.add(new JLabel("Invalid URL"));
                        setPanel(panel);
                    }
                }
            });
            t.start();
        }
    }//GEN-LAST:event_goButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    @Override
    public void dispose() {
        super.dispose();
        System.exit(0);
    }

    public void setPanel(JPanel panel) {
        panel.setBackground(COLOR);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        body.removeAll();
        body.setMaximumSize(new Dimension(with - 100, height));
        body.setMinimumSize(new Dimension(with - 100, height));
        body.setBackground(COLOR);
        body.setBorder(new EmptyBorder(0, 0, 0, 0));
        body.setLayout(new BorderLayout());
        body.add(panel, BorderLayout.CENTER);
        body.revalidate();
        body.repaint();
    }

    public void setPanel(String imagePath) {
        body.removeAll();
        body.setMaximumSize(new Dimension(with - 100, height));
        body.setMinimumSize(new Dimension(with - 100, height));
        body.setBackground(COLOR);
        body.setLayout(new FlowLayout(FlowLayout.CENTER));
        body.add(new JLabel(new ImageIcon(imagePath)));
        body.revalidate();
        body.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton goButton;
    private javax.swing.JLabel header;
    private javax.swing.JPanel layoutPanel;
    private javax.swing.JTextField url;
    private javax.swing.JLabel urlLabel;
    // End of variables declaration//GEN-END:variables

}
