/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hurufijaiyah;

import java.awt.AlphaComposite;
import static java.awt.AlphaComposite.Clear;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Frame3 extends javax.swing.JFrame {
    
   String angka = "";
   String Angka = "";
   String jawaban = "";
   String Betul = "";
   String Benar="";
   String Salah="";
   String Soal[] = {""};
    private boolean playing;
   
    
    public Frame3() {
        initComponents();
        A.setText(""+Soal[0]);
        B.setText(""+Soal[0]);
        C.setText(""+Soal[0]);
        
         Toolkit tk = Toolkit.getDefaultToolkit();
       int xsize = (int) tk.getScreenSize().getWidth();
       int ysize = (int) tk.getScreenSize().getHeight();
       this.setSize(xsize, ysize);
    }
    public void Clear() 
    {
        GrupB.clearSelection();
    }

    /**
     * Creates new form Frame3
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupB = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        A = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        btnSelanjutnya = new javax.swing.JButton();
        btnCek = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setLayout(null);

        jPanel10.setMinimumSize(new java.awt.Dimension(510, 510));

        jLabel43.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\23.png")); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\17.png")); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\18.png")); // NOI18N

        GrupB.add(B);

        GrupB.add(C);
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });

        GrupB.add(A);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addGap(187, 187, 187))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(B)
                        .addGap(74, 74, 74)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(A)
                            .addComponent(C))))
                .addGap(120, 120, 120))
        );

        jPanel9.add(jPanel10);
        jPanel10.setBounds(840, 170, 510, 520);

        jLabel46.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\Ain.PNG")); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel9.add(jPanel11);
        jPanel11.setBounds(160, 180, 510, 520);

        btnSelanjutnya.setBackground(new java.awt.Color(255, 255, 153));
        btnSelanjutnya.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 48)); // NOI18N
        btnSelanjutnya.setForeground(new java.awt.Color(51, 102, 0));
        btnSelanjutnya.setText("Selanjutnya");
        btnSelanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelanjutnyaActionPerformed(evt);
            }
        });
        jPanel9.add(btnSelanjutnya);
        btnSelanjutnya.setBounds(870, 720, 460, 80);

        btnCek.setBackground(new java.awt.Color(255, 255, 153));
        btnCek.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 48)); // NOI18N
        btnCek.setForeground(new java.awt.Color(51, 102, 0));
        btnCek.setText("Cek Hasil");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        jPanel9.add(btnCek);
        btnCek.setBounds(170, 710, 460, 80);

        jLabel70.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\bgpo.png")); // NOI18N
        jLabel70.setText("jLabel6");
        jPanel9.add(jLabel70);
        jLabel70.setBounds(20, 20, 1440, 830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelanjutnyaActionPerformed
        Frame4 frame4 = new Frame4();
        frame4.setVisible(true);
    }//GEN-LAST:event_btnSelanjutnyaActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        Angka="";
        
        if(Angka==""){

            if(A.isSelected()){
                 Benar = "Alhamdulillah, kamu menjawab benarr.. hebat!!";
                 JOptionPane.showMessageDialog(null, Benar);
            }else{

                 Salah ="Maaf ya kamu masih salah.. coba lagi yuk!!";
            }

        }
        if(Angka==""){

            if(B.isSelected()){
                 Salah ="Maaf ya kamu masih salah.. coba lagi yuk!!";
                 JOptionPane.showMessageDialog(null, Salah);
            }else{

                Benar = "Alhamdulillah, kamu menjawab benarr.. hebat!!";
                 
            }

        }
        if(Angka==""){

            if(C.isSelected()){
                 Salah ="Maaf ya kamu masih salah.. coba lagi yuk!!";
                 JOptionPane.showMessageDialog(null, Salah);
            }else{

               Benar = "Alhamdulillah, kamu menjawab benarr.. hebat!!";
                 
            }
            Clear();

        }
       
        Clear();
    }//GEN-LAST:event_btnCekActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
         File file = new File("src//wav//'ain.wav");
        AudioInputStream audioStream = null;
       try {
           audioStream = AudioSystem.getAudioInputStream(file);
       } catch (UnsupportedAudioFileException ex) {
           Logger.getLogger(Frame2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Frame2.class.getName()).log(Level.SEVERE, null, ex);
       }
        Clip clip = null;
       try {
           clip = AudioSystem.getClip();
       } catch (LineUnavailableException ex) {
           Logger.getLogger(Frame2.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           clip.open(audioStream);
       } catch (LineUnavailableException ex) {
           Logger.getLogger(Frame2.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Frame2.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        clip.start();    
    }//GEN-LAST:event_jLabel46MouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CMouseClicked

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
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.ButtonGroup GrupB;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnSelanjutnya;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
