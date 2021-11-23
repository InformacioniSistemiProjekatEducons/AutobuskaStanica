/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistem.autobuskastanica.forme;

import java.io.FileWriter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import sistem.autobuskastanica.backendklase.FajlMenadzer;
import sistem.autobuskastanica.backendklase.Korisnik;
import sistem.autobuskastanica.backendklase.LabelAnimacija;
import sistem.autobuskastanica.backendklase.Metode;
import sistem.autobuskastanica.backendklase.Status;
import sistem.autobuskastanica.backendklase.StatusZaposlenog;
import sistem.autobuskastanica.backendklase.UcitaniPodaci;
import sistem.autobuskastanica.backendklase.Zaposlen;

/**
 *
 * @author danij
 */
public class UnosenjeForma extends javax.swing.JFrame {

    /**
     * Creates new form UnosenjeForma
     */
    private UnosenjeForma instanca = this;

    public UnosenjeForma() {

        initComponents();

        pocetneAnimacije();

        //U slucaju da je ovo unosenje prvog zaposlenog, postavlja se da to moze biti samo menadzer
        if (UcitaniPodaci.getKorisnici().size() == 0) {
            StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"MENADZER"}));
        }

    }

    private void pocetneAnimacije() {

        String imeLabelaText = "Ime";
        String prezimeLabelaText = "Prezime";
        String korisnickoImeLabelaText = "Korisničko Ime";
        String lozinkaLabelaText = "Lozinka";
        String statusLabelaText = "Status";
        ImeLabela.setText("");
        PrezimeLabela.setText("");
        KorisnickoImeLabela.setText("");
        LozinkaLabela.setText("");
        StatusLabela.setText("");
        LabelAnimacija.pokreni(ImeLabela, imeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(PrezimeLabela, prezimeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(KorisnickoImeLabela, korisnickoImeLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(LozinkaLabela, lozinkaLabelaText, 100, 0, 250);
        LabelAnimacija.pokreni(StatusLabela, statusLabelaText, 100, 0, 250);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        ime4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ImeLabela = new javax.swing.JLabel();
        ImeLabela1 = new javax.swing.JLabel();
        ImeTextField = new javax.swing.JTextField();
        PrezimeLabela = new javax.swing.JLabel();
        PrezimeLabela1 = new javax.swing.JLabel();
        PrezimeTextField = new javax.swing.JTextField();
        KorisnickoImeLabela = new javax.swing.JLabel();
        KorisnickoImeLabela1 = new javax.swing.JLabel();
        KorisnickoImeTextField = new javax.swing.JTextField();
        LozinkaLabela = new javax.swing.JLabel();
        LozinkaLabela1 = new javax.swing.JLabel();
        LozinkaTextField = new javax.swing.JTextField();
        StatusLabela = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        DodajButton = new javax.swing.JButton();
        OcistiButton = new javax.swing.JButton();
        UspesnoUnosenjeLabela = new javax.swing.JLabel();

        jLabel9.setBackground(new java.awt.Color(114, 137, 218));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(114, 137, 218));
        jLabel9.setText("Ime");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTOBUSKA STANICA");
        setMaximumSize(new java.awt.Dimension(1000, 650));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setSize(new java.awt.Dimension(1000, 650));

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        ImeLabela.setBackground(new java.awt.Color(114, 137, 218));
        ImeLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ImeLabela.setForeground(new java.awt.Color(114, 137, 218));
        ImeLabela.setText("Ime");

        ImeLabela1.setBackground(new java.awt.Color(114, 137, 218));
        ImeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ImeLabela1.setForeground(new java.awt.Color(255, 51, 51));

        ImeTextField.setBackground(new java.awt.Color(114, 137, 218));

        PrezimeLabela.setBackground(new java.awt.Color(114, 137, 218));
        PrezimeLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        PrezimeLabela.setForeground(new java.awt.Color(114, 137, 218));
        PrezimeLabela.setText("Prezime");

        PrezimeLabela1.setBackground(new java.awt.Color(114, 137, 218));
        PrezimeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        PrezimeLabela1.setForeground(new java.awt.Color(255, 51, 51));

        PrezimeTextField.setBackground(new java.awt.Color(114, 137, 218));

        KorisnickoImeLabela.setBackground(new java.awt.Color(114, 137, 218));
        KorisnickoImeLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        KorisnickoImeLabela.setForeground(new java.awt.Color(114, 137, 218));
        KorisnickoImeLabela.setText("Korisničko Ime");

        KorisnickoImeLabela1.setBackground(new java.awt.Color(114, 137, 218));
        KorisnickoImeLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        KorisnickoImeLabela1.setForeground(new java.awt.Color(255, 51, 51));

        KorisnickoImeTextField.setBackground(new java.awt.Color(114, 137, 218));

        LozinkaLabela.setBackground(new java.awt.Color(114, 137, 218));
        LozinkaLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LozinkaLabela.setForeground(new java.awt.Color(114, 137, 218));
        LozinkaLabela.setText("Lozinka");

        LozinkaLabela1.setBackground(new java.awt.Color(114, 137, 218));
        LozinkaLabela1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        LozinkaLabela1.setForeground(new java.awt.Color(255, 51, 51));

        LozinkaTextField.setBackground(new java.awt.Color(114, 137, 218));

        StatusLabela.setBackground(new java.awt.Color(114, 137, 218));
        StatusLabela.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StatusLabela.setForeground(new java.awt.Color(114, 137, 218));
        StatusLabela.setText("Status");

        StatusComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RADNIK", "MENADZER" }));

        DodajButton.setBackground(new java.awt.Color(114, 137, 218));
        DodajButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DodajButton.setForeground(new java.awt.Color(44, 47, 51));
        DodajButton.setText("Dodaj");
        DodajButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajButtonActionPerformed(evt);
            }
        });

        OcistiButton.setBackground(new java.awt.Color(114, 137, 218));
        OcistiButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OcistiButton.setForeground(new java.awt.Color(44, 47, 51));
        OcistiButton.setText("Ocisti");
        OcistiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcistiButtonActionPerformed(evt);
            }
        });

        UspesnoUnosenjeLabela.setBackground(new java.awt.Color(114, 137, 218));
        UspesnoUnosenjeLabela.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        UspesnoUnosenjeLabela.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UspesnoUnosenjeLabela)
                    .addComponent(LozinkaLabela)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StatusLabela)
                            .addComponent(LozinkaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(KorisnickoImeLabela)
                            .addComponent(KorisnickoImeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(PrezimeLabela)
                            .addComponent(PrezimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(ImeLabela)
                            .addComponent(ImeTextField)
                            .addComponent(StatusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImeLabela1)
                            .addComponent(PrezimeLabela1)
                            .addComponent(KorisnickoImeLabela1)
                            .addComponent(LozinkaLabela1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(OcistiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(ImeLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImeLabela1))
                .addGap(18, 18, 18)
                .addComponent(PrezimeLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrezimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrezimeLabela1))
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
                    .addComponent(LozinkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LozinkaLabela1))
                .addGap(18, 18, 18)
                .addComponent(StatusLabela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DodajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OcistiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UspesnoUnosenjeLabela)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajButtonActionPerformed

        FajlMenadzer.napraviPocetneFajlove();
        UcitaniPodaci.ucitajKorisnike(); //TODO: OBRISI

        //Kopiranje svih vrednosti sa forme u promenljive
        int IDZaposlenog = UcitaniPodaci.getPrviSlobodanIDZaposlenog();
        String ime = ImeTextField.getText();
        String prezime = PrezimeTextField.getText();
        String korisnickoIme = KorisnickoImeTextField.getText();
        String lozinka = LozinkaTextField.getText();
        String datumZasnivanjaRadnogOdnosa = Metode.getDatumStringDDMMGGGG();
        String datumPrestankaRadnogOdnosa = "-";
        String vreme = Metode.getVremeString();
        int status = Metode.statusIntIzStringa((String) StatusComboBox.getSelectedItem());

        String neispravnoPoljeText = "Polje nije validno";

        //Provera imena
        if (ime.isBlank() || !Metode.daLiJeStringLegalanZaUpis(ime)) {

            //Animacija u slucaju da je ime neispravno
            //ImeLabela1 animacija 1
            int ImeLabela1BrzinaAnimacije1 = 10;
            int ImeLabela1ZakasnjenjeAnimacije1 = 0;
            int ImeLabela1CeloTrajanjeAnimacije1 = ImeLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + ImeLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(ImeLabela1, neispravnoPoljeText, ImeLabela1BrzinaAnimacije1, 0, ImeLabela1ZakasnjenjeAnimacije1);

            //ImeLabela1 ANIMACIJA 2
            int ImeLabela1BrzinaAnimacije2 = 10;
            int ImeLabela1ZakasnjenjeAnimacije2 = ImeLabela1CeloTrajanjeAnimacije1 + 3000;
            int ImeLabela1CeloTrajanjeAnimacije2 = ImeLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + ImeLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(ImeLabela1, neispravnoPoljeText, ImeLabela1BrzinaAnimacije2, 1, ImeLabela1ZakasnjenjeAnimacije2);

            return;

        }

        //Provera prezimena
        if (prezime.isBlank() || !Metode.daLiJeStringLegalanZaUpis(prezime)) {

            //Animacija u slucaju da je prezime neispravno
            //PrezimeLabela1 animacija 1
            int PrezimeLabela1BrzinaAnimacije1 = 10;
            int PrezimeLabela1ZakasnjenjeAnimacije1 = 0;
            int PrezimeLabela1CeloTrajanjeAnimacije1 = PrezimeLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + PrezimeLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(PrezimeLabela1, neispravnoPoljeText, PrezimeLabela1BrzinaAnimacije1, 0, PrezimeLabela1ZakasnjenjeAnimacije1);

            //PrezimeLabela1 ANIMACIJA 2
            int PrezimeLabela1BrzinaAnimacije2 = 10;
            int PrezimeLabela1ZakasnjenjeAnimacije2 = PrezimeLabela1CeloTrajanjeAnimacije1 + 3000;
            int PrezimeLabela1CeloTrajanjeAnimacije2 = PrezimeLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + PrezimeLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(PrezimeLabela1, neispravnoPoljeText, PrezimeLabela1BrzinaAnimacije2, 1, PrezimeLabela1ZakasnjenjeAnimacije2);

            return;

        }

        //Provera korisnickog imena
        if (korisnickoIme.isBlank() || !Metode.daLiJeStringLegalanZaUpis(korisnickoIme)) {

            //Animacija u slucaju da je korisnicko ime neispravno
            //KorisnickoImeLabela1 animacija 1
            int KorisnickoImeLabela1BrzinaAnimacije1 = 10;
            int KorisnickoImeLabela1ZakasnjenjeAnimacije1 = 0;
            int KorisnickoImeLabela1CeloTrajanjeAnimacije1 = KorisnickoImeLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + KorisnickoImeLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, neispravnoPoljeText, KorisnickoImeLabela1BrzinaAnimacije1, 0, KorisnickoImeLabela1ZakasnjenjeAnimacije1);

            //KorisnickoImeLabela1 ANIMACIJA 2
            int KorisnickoImeLabela1BrzinaAnimacije2 = 10;
            int KorisnickoImeLabela1ZakasnjenjeAnimacije2 = KorisnickoImeLabela1CeloTrajanjeAnimacije1 + 3000;
            int KorisnickoImeLabela1CeloTrajanjeAnimacije2 = KorisnickoImeLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + KorisnickoImeLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, neispravnoPoljeText, KorisnickoImeLabela1BrzinaAnimacije2, 1, KorisnickoImeLabela1ZakasnjenjeAnimacije2);

            return;

        }
        if (UcitaniPodaci.getListaKorisnickihImena().contains(korisnickoIme)) {

            //Animacija u slucaju da je korisnicko zauzeto
            neispravnoPoljeText = "Ovo korisničko ime je već u upotrebi";

            //KorisnickoImeLabela1 animacija 1
            int KorisnickoImeLabela1BrzinaAnimacije1 = 10;
            int KorisnickoImeLabela1ZakasnjenjeAnimacije1 = 0;
            int KorisnickoImeLabela1CeloTrajanjeAnimacije1 = KorisnickoImeLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + KorisnickoImeLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, neispravnoPoljeText, KorisnickoImeLabela1BrzinaAnimacije1, 0, KorisnickoImeLabela1ZakasnjenjeAnimacije1);

            //KorisnickoImeLabela1 ANIMACIJA 2
            int KorisnickoImeLabela1BrzinaAnimacije2 = 10;
            int KorisnickoImeLabela1ZakasnjenjeAnimacije2 = KorisnickoImeLabela1CeloTrajanjeAnimacije1 + 3000;
            int KorisnickoImeLabela1CeloTrajanjeAnimacije2 = KorisnickoImeLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + KorisnickoImeLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(KorisnickoImeLabela1, neispravnoPoljeText, KorisnickoImeLabela1BrzinaAnimacije2, 1, KorisnickoImeLabela1ZakasnjenjeAnimacije2);

            return;

        }

        //Provera lozinke
        if (lozinka.isBlank() || !Metode.daLiJeStringLegalanZaUpis(lozinka)) {

            //Animacija u slucaju da je lozinka neispravna
            //LozinkaLabela1 animacija 1
            int LozinkaLabela1BrzinaAnimacije1 = 10;
            int LozinkaLabela1ZakasnjenjeAnimacije1 = 0;
            int LozinkaLabela1CeloTrajanjeAnimacije1 = LozinkaLabela1BrzinaAnimacije1 * neispravnoPoljeText.length() + LozinkaLabela1ZakasnjenjeAnimacije1;
            LabelAnimacija.pokreni(LozinkaLabela1, neispravnoPoljeText, LozinkaLabela1BrzinaAnimacije1, 0, LozinkaLabela1ZakasnjenjeAnimacije1);

            //LozinkaLabela1 ANIMACIJA 2
            int LozinkaLabela1BrzinaAnimacije2 = 10;
            int LozinkaLabela1ZakasnjenjeAnimacije2 = LozinkaLabela1CeloTrajanjeAnimacije1 + 3000;
            int LozinkaLabela1CeloTrajanjeAnimacije2 = LozinkaLabela1BrzinaAnimacije2 * neispravnoPoljeText.length() + LozinkaLabela1ZakasnjenjeAnimacije2;
            LabelAnimacija.pokreni(LozinkaLabela1, neispravnoPoljeText, LozinkaLabela1BrzinaAnimacije2, 1, LozinkaLabela1ZakasnjenjeAnimacije2);

            return;

        }

        Korisnik korisnik = new Korisnik(IDZaposlenog, korisnickoIme, lozinka);
        FajlMenadzer.pisiFajl(Korisnik.imeFajla, korisnik.uString());
        UcitaniPodaci.ucitajKorisnike();

        Zaposlen zaposlen = new Zaposlen(IDZaposlenog, ime, prezime, datumZasnivanjaRadnogOdnosa, datumPrestankaRadnogOdnosa, status);
        FajlMenadzer.pisiFajl(Zaposlen.imeFajla, zaposlen.uString());
        UcitaniPodaci.ucitajZaposlene();

        StatusZaposlenog statusZaposlenog = new StatusZaposlenog(IDZaposlenog, datumZasnivanjaRadnogOdnosa, vreme, status);
        FajlMenadzer.pisiFajl(statusZaposlenog.imeFajla, statusZaposlenog.uString());
        UcitaniPodaci.ucitajStatuseZaposlenih();

        //Animacija za uspesno unosenje
        String uspesnoUnosenjeText = "Unošenje korisnika je uspelo!";
        //UspesnoUnosenjeLabela animacija 1
        int UspesnoUnosenjeLabelaBrzinaAnimacije1 = 10;
        int UspesnoUnosenjeLabelaZakasnjenjeAnimacije1 = 0;
        int UspesnoUnosenjeLabelaCeloTrajanjeAnimacije1 = UspesnoUnosenjeLabelaBrzinaAnimacije1 * uspesnoUnosenjeText.length() + UspesnoUnosenjeLabelaZakasnjenjeAnimacije1;
        LabelAnimacija.pokreni(UspesnoUnosenjeLabela, uspesnoUnosenjeText, UspesnoUnosenjeLabelaBrzinaAnimacije1, 0, UspesnoUnosenjeLabelaZakasnjenjeAnimacije1);

        //UspesnoUnosenjeLabela ANIMACIJA 2
        int UspesnoUnosenjeLabelaBrzinaAnimacije2 = 10;
        int UspesnoUnosenjeLabelaZakasnjenjeAnimacije2 = UspesnoUnosenjeLabelaCeloTrajanjeAnimacije1 + 3000;
        int UspesnoUnosenjeLabelaCeloTrajanjeAnimacije2 = UspesnoUnosenjeLabelaBrzinaAnimacije2 * uspesnoUnosenjeText.length() + UspesnoUnosenjeLabelaZakasnjenjeAnimacije2;
        LabelAnimacija.pokreni(UspesnoUnosenjeLabela, uspesnoUnosenjeText, UspesnoUnosenjeLabelaBrzinaAnimacije2, 1, UspesnoUnosenjeLabelaZakasnjenjeAnimacije2);

        //Prelaz na Login formu u slucaju da je ovo bilo unosenje prvog korisnika
        if (UcitaniPodaci.getKorisnici().size() == 1) {

            Timer timer = new Timer();

            TimerTask timerTask = new TimerTask() {
                public void run() {

                    LoginForma loginForma = new LoginForma();
                    loginForma.setLocation(instanca.getLocation());
                    loginForma.setVisible(true);
                    instanca.dispose();

                }
            };
            timer.schedule(timerTask, UspesnoUnosenjeLabelaCeloTrajanjeAnimacije2);

        }

    }//GEN-LAST:event_DodajButtonActionPerformed

    private void OcistiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcistiButtonActionPerformed

        ImeTextField.setText("");
        PrezimeTextField.setText("");
        KorisnickoImeTextField.setText("");
        LozinkaTextField.setText("");
        StatusComboBox.setSelectedIndex(0);

    }//GEN-LAST:event_OcistiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosenjeForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosenjeForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DodajButton;
    private javax.swing.JLabel ImeLabela;
    private javax.swing.JLabel ImeLabela1;
    private javax.swing.JTextField ImeTextField;
    private javax.swing.JLabel KorisnickoImeLabela;
    private javax.swing.JLabel KorisnickoImeLabela1;
    private javax.swing.JTextField KorisnickoImeTextField;
    private javax.swing.JLabel LozinkaLabela;
    private javax.swing.JLabel LozinkaLabela1;
    private javax.swing.JTextField LozinkaTextField;
    private javax.swing.JButton OcistiButton;
    private javax.swing.JLabel PrezimeLabela;
    private javax.swing.JLabel PrezimeLabela1;
    private javax.swing.JTextField PrezimeTextField;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel StatusLabela;
    private javax.swing.JLabel UspesnoUnosenjeLabela;
    private javax.swing.JTextField ime4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
