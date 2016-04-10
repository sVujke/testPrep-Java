/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forme;

import Kontroler.Kontroler;
import domen.Zadatak;
import domen.Zaposleni;
import gui.komponenete.TblModelZadatak;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vujke
 */
public class NoviZadatak extends javax.swing.JFrame {

    Kontroler kontroler;
    TblModelZadatak tbl;
    
    
    /**
     * Creates new form NoviZadatak
     */
    public NoviZadatak() {
        initComponents();
        kontroler = Kontroler.vratiInstancuKontrolera();
        ucitajZaposlene();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtSacuvaj = new javax.swing.JButton();
        jbtObrisi = new javax.swing.JButton();
        jtxtNaziv = new javax.swing.JTextField();
        jtxtSifra1 = new javax.swing.JTextField();
        jtxtOpis = new javax.swing.JTextField();
        jtxtDatum = new javax.swing.JTextField();
        jcbZaposleni = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sifra");

        jLabel2.setText("Naziv");

        jLabel3.setText("Opis");

        jLabel4.setText("Datum");

        jLabel5.setText("Zaposleni");

        jbtSacuvaj.setText("Sacuvaj");
        jbtSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSacuvajActionPerformed(evt);
            }
        });

        jbtObrisi.setText("Obrisi");
        jbtObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtObrisiActionPerformed(evt);
            }
        });

        jtxtNaziv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNazivActionPerformed(evt);
            }
        });

        jtxtSifra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSifra1ActionPerformed(evt);
            }
        });

        jtxtOpis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtOpisActionPerformed(evt);
            }
        });

        jtxtDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDatumActionPerformed(evt);
            }
        });

        jcbZaposleni.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbZaposleni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbZaposleniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtSacuvaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtNaziv)
                    .addComponent(jtxtSifra1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jtxtOpis, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jtxtDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jcbZaposleni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtSifra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtxtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtOpis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbZaposleni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jbtSacuvaj)
                .addGap(18, 18, 18)
                .addComponent(jbtObrisi)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtObrisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtObrisiActionPerformed

    private void jtxtNazivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNazivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNazivActionPerformed

    private void jtxtSifra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSifra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSifra1ActionPerformed

    private void jtxtOpisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtOpisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtOpisActionPerformed

    private void jtxtDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDatumActionPerformed

    private void jbtSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSacuvajActionPerformed
        // TODO add your handling code here:
       try {
        String sifra = jtxtSifra1.getText();
        String naziv = jtxtNaziv.getText();
        String opis = jtxtOpis.getText();
        
        String datumSTR = jtxtDatum.getText();
        DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
        
        
            Date datum = df.parse(datumSTR);
            Zaposleni zap = (Zaposleni) jcbZaposleni.getSelectedItem();
            //String sifraZap = zap.getSifra();
            
            Zadatak z = new Zadatak(sifra, datum, naziv, opis, zap);
            
            tbl.dodajRed(z);
        } catch (ParseException ex) {
            Logger.getLogger(NoviZadatak.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jbtSacuvajActionPerformed

    private void jcbZaposleniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbZaposleniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbZaposleniActionPerformed

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
            java.util.logging.Logger.getLogger(NoviZadatak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoviZadatak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoviZadatak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoviZadatak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoviZadatak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtObrisi;
    private javax.swing.JButton jbtSacuvaj;
    private javax.swing.JComboBox jcbZaposleni;
    private javax.swing.JTextField jtxtDatum;
    private javax.swing.JTextField jtxtNaziv;
    private javax.swing.JTextField jtxtOpis;
    private javax.swing.JTextField jtxtSifra1;
    // End of variables declaration//GEN-END:variables

    private void ucitajZaposlene()  {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            List<Zaposleni> zaposleni =  kontroler.vratiListuZaposlenih();
            
            jcbZaposleni.removeAllItems();
            
            for (Zaposleni zap : zaposleni) {
                jcbZaposleni.addItem(zap);
            }
        } catch (Exception ex) {
            Logger.getLogger(NoviZadatak.class.getName()).log(Level.SEVERE, null, ex);
            
            
        }
        
    }
    
    public void proslediTabelu(TblModelZadatak tbl){
        this.tbl = tbl;
    }
}


// U formi ne prosledjujem EXCEPTION
//nego ga hvatam da bih ispisao JOptionPane