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
public class Frame6 extends javax.swing.JFrame {
    String angka = "";
   String Angka = "";
   String jawaban = "";
   String Betul = "";
   String Benar="";
   String Salah="";
   String Soal[] = {""};
   
    
    public Frame6() {
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
     * Creates new form Frame6
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
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        B = new javax.swing.JRadioButton();
        A = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        btnCek = new javax.swing.JButton();
        btnSelanjutnya = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel21.setLayout(null);

        jPanel22.setMinimumSize(new java.awt.Dimension(510, 510));

        jLabel58.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\12.png")); // NOI18N

        jLabel59.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\11.png")); // NOI18N

        jLabel60.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\13.png")); // NOI18N

        GrupB.add(B);

        GrupB.add(A);

        GrupB.add(C);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(A)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel58)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addGap(187, 187, 187))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(B)
                        .addGap(64, 64, 64)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(A))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(C)))
                .addGap(120, 120, 120))
        );

        jPanel21.add(jPanel22);
        jPanel22.setBounds(840, 170, 510, 520);

        jLabel61.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\Hijaiyyah\\syin.png")); // NOI18N
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel21.add(jPanel23);
        jPanel23.setBounds(160, 180, 510, 520);

        btnCek.setBackground(new java.awt.Color(255, 255, 153));
        btnCek.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 48)); // NOI18N
        btnCek.setForeground(new java.awt.Color(51, 102, 0));
        btnCek.setText("Cek Hasil");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        jPanel21.add(btnCek);
        btnCek.setBounds(190, 720, 460, 80);

        btnSelanjutnya.setBackground(new java.awt.Color(255, 255, 153));
        btnSelanjutnya.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 48)); // NOI18N
        btnSelanjutnya.setForeground(new java.awt.Color(51, 102, 0));
        btnSelanjutnya.setText("Selesai");
        btnSelanjutnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelanjutnyaActionPerformed(evt);
            }
        });
        jPanel21.add(btnSelanjutnya);
        btnSelanjutnya.setBounds(870, 720, 460, 80);

        jLabel73.setIcon(new javax.swing.ImageIcon("E:\\Kuliah IF UNJANI 2020\\Semester 4\\Pemrograman Objek 2\\Tubes\\hurufIjaiyah\\bgpo.png")); // NOI18N
        jLabel73.setText("jLabel6");
        jPanel21.add(jLabel73);
        jLabel73.setBounds(0, 0, 1440, 830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1474, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        Angka="";
        
        if(Angka==""){

            if(A.isSelected()){
               Benar = "Alhamdulillah, kamu menjawab benarr.. hebat!!";
                JOptionPane.showMessageDialog(null, Benar);
            }else{

                Salah +=1;
            }

        }
        if(Angka==""){

            if(C.isSelected()){
                Salah ="Maaf ya kamu masih salah.. coba lagi yuk!!";
                JOptionPane.showMessageDialog(null, Salah);
            }else{

                Benar = "Alhamdulillah, kamu menjawab benarr.. hebat!!";

            }

        }
        if(Angka==""){

            if(B.isSelected()){
               Salah ="Maaf ya kamu masih salah.. coba lagi yuk!!";
               JOptionPane.showMessageDialog(null, Salah);


            }else{

                 Benar = "Alhamdulillah, kamu menjawab benarr.. hebat!!";

            }
            Clear();

        }
        
        Clear();
    }//GEN-LAST:event_btnCekActionPerformed

    private void btnSelanjutnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelanjutnyaActionPerformed
        NewJFrame newjframe = new NewJFrame();
        newjframe.setVisible(true);
    }//GEN-LAST:event_btnSelanjutnyaActionPerformed

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
         File file = new File("src//wav//Syin.wav");
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
    }//GEN-LAST:event_jLabel61MouseClicked

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
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame6().setVisible(true);
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
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    // End of variables declaration//GEN-END:variables
}
