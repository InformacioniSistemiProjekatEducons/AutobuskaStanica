/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistem.autobuskastanica.forme;

import sistem.autobuskastanica.backendklase.Korisnik;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

/**
 *
 * @author Darko
 */
public class LoginForma extends javax.swing.JFrame {

    /**
     * Creates new form LoginForma
     */
    private LoginForma instanca = this;

    public LoginForma() {

        initComponents();

        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        String korisnickoImeLabelaText = "Korisničko Ime";
        String lozinkaLabelaText = "Lozinka";
        KorisnickoImeLabela.setText("");
        LozinkaLabela.setText("");
        LabelAnimacija.pokreni(KorisnickoImeLabela, korisnickoImeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(LozinkaLabela, lozinkaLabelaText, 100, 0, 250);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        KorisnickoImeLabela = new javax.swing.JLabel();
        KorisnickoImeLabela1 = new javax.swing.JLabel();
        KorisnickoImeTextField = new javax.swing.JTextField();
        LozinkaLabela = new javax.swing.JLabel();
        LozinkaLabela1 = new javax.swing.JLabel();
        LozinkaPasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTOBUSKA STANICA");
        setBackground(new java.awt.Color(44, 47, 51));
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setForeground(new java.awt.Color(114, 137, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo1.png"))); // NOI18N

        KorisnickoImeLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        KorisnickoImeLabela.setForeground(new java.awt.Color(114, 137, 218));
        KorisnickoImeLabela.setText("Korisničko Ime");

        KorisnickoImeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        KorisnickoImeLabela1.setForeground(new java.awt.Color(255, 51, 51));

        KorisnickoImeTextField.setBackground(new java.awt.Color(114, 137, 218));
        KorisnickoImeTextField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        KorisnickoImeTextField.setToolTipText("");
        KorisnickoImeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KorisnickoImeTextFieldActionPerformed(evt);
            }
        });

        LozinkaLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LozinkaLabela.setForeground(new java.awt.Color(114, 137, 218));
        LozinkaLabela.setText("Lozinka");

        LozinkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LozinkaLabela1.setForeground(new java.awt.Color(255, 51, 51));

        LozinkaPasswordField.setBackground(new java.awt.Color(114, 137, 218));
        LozinkaPasswordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LozinkaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LozinkaPasswordFieldActionPerformed(evt);
            }
        });

        LogInButton.setBackground(new java.awt.Color(114, 137, 218));
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(44, 47, 51));
        LogInButton.setText("Log in");
        LogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LozinkaLabela)
                            .addComponent(KorisnickoImeLabela, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LozinkaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(KorisnickoImeTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KorisnickoImeLabela1)
                                    .addComponent(LozinkaLabela1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(KorisnickoImeLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KorisnickoImeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KorisnickoImeLabela1))
                .addGap(18, 18, 18)
                .addComponent(LozinkaLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LozinkaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LozinkaLabela1))
                .addGap(18, 18, 18)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KorisnickoImeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KorisnickoImeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KorisnickoImeTextFieldActionPerformed

    private void LozinkaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LozinkaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LozinkaPasswordFieldActionPerformed

    private void LogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseClicked

        String korisnickoIme = KorisnickoImeTextField.getText();
        String lozinka = String.valueOf(LozinkaPasswordField.getPassword());

        //PROVERA DA LI JE KORISNICKO IME PRAZNO
        if (korisnickoIme.isEmpty()) {

            //ANIMACIJA U SLUCAJU DA JE KORISNICKO IME PRAZNO
            String label3Text = "Korisničko ime ne sme da ostane prazno";

            //LABELA 3 ANIMACIJA 1
            int labela3BrzinaAnimacije1 = 10;
            int labela3ZakasnjenjeAnimacije1 = 0;
            int labela3CeloTrajanjeAnimacije1 = labela3BrzinaAnimacije1 * label3Text.length() + labela3ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, label3Text, labela3BrzinaAnimacije1, 0, labela3ZakasnjenjeAnimacije1);

            //LABELA 3 ANIMACIJA 2
            int labela3BrzinaAnimacije2 = 10;
            int labela3ZakasnjenjeAnimacije2 = 3000;
            int labela3CeloTrajanjeAnimacije2 = labela3BrzinaAnimacije2 * label3Text.length() + labela3ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, label3Text, labela3BrzinaAnimacije2, 1, labela3CeloTrajanjeAnimacije2);

            return;

        }

        //PROVERA DA LI KORISNICKO IME POSTOJI
        if (!UcitaniPodaci.getListaKorisnickihImena().contains(korisnickoIme)) {

            //ANIMACIJA U SLUCAJU DA KORISNICKO IME NE POSTOJI
            String labela3Text = "Uneseno korisničko ime ne odgovara nijednom nalogu";

            //LABELA 3 ANIMACIJA 1
            int labela3BrzinaAnimacije1 = 10;
            int labela3ZakasnjenjeAnimacije1 = 0;
            int labela3CeloTrajanjeAnimacije1 = labela3BrzinaAnimacije1 * labela3Text.length() + labela3ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, labela3Text, labela3BrzinaAnimacije1, 0, labela3ZakasnjenjeAnimacije1);

            //LABELA 3 ANIMACIJA 2
            int labela3BrzinaAnimacije2 = 10;
            int labela3ZakasnjenjeAnimacije2 = 3000;
            int labela3CeloTrajanjeAnimacije2 = labela3BrzinaAnimacije2 * labela3Text.length() + labela3ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, labela3Text, labela3BrzinaAnimacije2, 1, labela3CeloTrajanjeAnimacije2);

            return;

        }

        //PROVERA DA LI JE LOZINKA PRAZNA
        if (lozinka.isEmpty()) {

            //ANIMACIJA U SLUCAJU DA JE LOZINKA PRAZNA
            String labela4Text = "Lozinka ne sme da ostane prazna";

            //LABELA 4 ANIMACIJA 1
            int labela4BrzinaAnimacije1 = 10;
            int labela4ZakasnjenjeAnimacije1 = 0;
            int labela4CeloTrajanjeAnimacije1 = labela4BrzinaAnimacije1 * labela4Text.length() + labela4ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(LozinkaLabela1, labela4Text, labela4BrzinaAnimacije1, 0, labela4ZakasnjenjeAnimacije1);

            //LABELA 4 ANIMACIJA 2
            int labela4BrzinaAnimacije2 = 10;
            int labela4ZakasnjenjeAnimacije2 = 3000;
            int labela4CeloTrajanjeAnimacije2 = labela4BrzinaAnimacije2 * labela4Text.length() + labela4ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(LozinkaLabela1, labela4Text, labela4BrzinaAnimacije2, 1, labela4CeloTrajanjeAnimacije2);

            return;

        }

        //PROVERA DA LI JE LOZINKA ISPRAVNA ZA UNESENO KORISNICKO IME
        if (!UcitaniPodaci.getKorisnikIzKorisnickogImena(korisnickoIme).getLozinka().equals(lozinka)) {

            //ANIMACIJA U SLUCAJU DA KORISNICKO IME NE POSTOJI
            String label4Text = "Unesena lozinka ne odgovara tom korisničkom imenu";

            //LABELA 4 ANIMACIJA 1
            int labela4BrzinaAnimacije1 = 10;
            int labela4ZakasnjenjeAnimacije1 = 0;
            int labela4CeloTrajanjeAnimacije1 = labela4BrzinaAnimacije1 * label4Text.length() + labela4ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(LozinkaLabela1, label4Text, labela4BrzinaAnimacije1, 0, labela4ZakasnjenjeAnimacije1);

            //LABELA 4 ANIMACIJA 2
            int labela4BrzinaAnimacije2 = 10;
            int labela4ZakasnjenjeAnimacije2 = 3000;
            int labela4CeloTrajanjeAnimacije2 = labela4BrzinaAnimacije2 * label4Text.length() + labela4ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(LozinkaLabela1, label4Text, labela4BrzinaAnimacije2, 1, labela4CeloTrajanjeAnimacije2);

            return;

        }

        Korisnik korisnik = UcitaniPodaci.getKorisnikIzKorisnickogImena(korisnickoIme);
        Zaposlen zaposlen = UcitaniPodaci.getZaposlenIzIDZaposlenog(korisnik.getIDZaposlenog());

        if (zaposlen.getStatus() == 1) {

            MenadzerForma menadzerForma = new MenadzerForma(zaposlen);
            menadzerForma.setLocation(instanca.getLocation());
            menadzerForma.setVisible(true);
            instanca.dispose();

        }

    }//GEN-LAST:event_LogInButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KorisnickoImeLabela;
    private javax.swing.JLabel KorisnickoImeLabela1;
    private javax.swing.JTextField KorisnickoImeTextField;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel LozinkaLabela;
    private javax.swing.JLabel LozinkaLabela1;
    private javax.swing.JPasswordField LozinkaPasswordField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
