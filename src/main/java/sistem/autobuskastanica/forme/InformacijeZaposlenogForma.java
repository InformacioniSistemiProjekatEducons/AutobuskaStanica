/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistem.autobuskastanica.forme;

import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.StatusZaposlenog;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

/**
 *
 * @author danij
 */
public class InformacijeZaposlenogForma extends javax.swing.JFrame {

    /**
     * Creates new form InformacijeZaposlenog
     */
    private Zaposlen oKomeJeForma, vlasnikForme;
    private InformacijeZaposlenogForma instanca;

    public InformacijeZaposlenogForma() {

        instanca = this;

        initComponents();

        ucitajTabelu();

        pocetneAnimacije();

    }

    public InformacijeZaposlenogForma(Zaposlen oKomeJeForma, Zaposlen vlasnikForme) {

        instanca = this;

        initComponents();

        this.oKomeJeForma = oKomeJeForma;
        this.vlasnikForme = vlasnikForme;

        ucitajTabelu();

        pocetneAnimacije();

    }

    private void pocetneAnimacije() {

        if (vlasnikForme == null) {
            return;
        }

        String Labela1Text = "ID: " + oKomeJeForma.getID() + " " + oKomeJeForma.getIme() + " " + oKomeJeForma.getPrezime();
        Labela1.setText("");
        LabelAnimacija.pokreni(Labela1, Labela1Text, 25, 0, 250);

    }

    private void ucitajTabelu() {

        if (oKomeJeForma == null) {
            return;
        }

        UcitaniPodaci.ucitajKorisnike();
        UcitaniPodaci.ucitajZaposlene();
        UcitaniPodaci.ucitajStatuse();
        UcitaniPodaci.ucitajStatuseZaposlenih();

        DefaultTableModel defaultTableModel = (DefaultTableModel) Tabela.getModel();
        defaultTableModel.setRowCount(0);

        for (StatusZaposlenog statusZaposlenog : UcitaniPodaci.getStatusiZaposlenog(oKomeJeForma)) {

            Vector<Object> redPodaci = new Vector<>();
            redPodaci.add(statusZaposlenog.getDatum());
            redPodaci.add(statusZaposlenog.getVreme());
            redPodaci.add(Metode.statusStringIzInta(statusZaposlenog.getIDStatusa()));

            defaultTableModel.addRow(redPodaci);

        }

        //Centriranje teksta u celijama
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        Tabela.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        Tabela.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        Tabela.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

        //Centriranje teksta u headeru tabele
        TableCellRenderer rendererFromHeader = Tabela.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        Tabela.setModel(defaultTableModel);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Labela1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        BackLabela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        Labela1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        Labela1.setForeground(new java.awt.Color(114, 137, 218));
        Labela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labela1.setText("ID: 0 Ime Prezime");

        Tabela.setBackground(new java.awt.Color(114, 137, 218));
        Tabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datum", "Vreme", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setMaximumSize(new java.awt.Dimension(800, 300));
        Tabela.setMinimumSize(new java.awt.Dimension(800, 300));
        Tabela.setRowHeight(40);
        Tabela.setShowGrid(true);
        jScrollPane1.setViewportView(Tabela);

        BackLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        BackLabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackLabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackLabelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackLabelaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Labela1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackLabela)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackLabela)
                .addGap(18, 18, 18)
                .addComponent(Labela1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackLabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelaMouseEntered

        BackLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png")));

    }//GEN-LAST:event_BackLabelaMouseEntered

    private void BackLabelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelaMouseExited

        BackLabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png")));

    }//GEN-LAST:event_BackLabelaMouseExited

    private void BackLabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackLabelaMouseClicked

        MenadzerForma menadzerForma = new MenadzerForma(vlasnikForme);
        menadzerForma.setLocation(instanca.getLocation());
        menadzerForma.setVisible(true);
        instanca.dispose();

    }//GEN-LAST:event_BackLabelaMouseClicked

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
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacijeZaposlenogForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacijeZaposlenogForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabela;
    private javax.swing.JLabel Labela1;
    private javax.swing.JTable Tabela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
