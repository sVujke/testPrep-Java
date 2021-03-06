/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Predmet;
import domen.Prijava;
import domen.Student;
import gui.komponente.TblModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.Kontroler;

/**
 *
 * @author vujke
 */
public class Dodaj extends javax.swing.JPanel {
    
    Kontroler kontroler;
    TblModel tbl;
    /**
     * Creates new form Dodaj
     */
   
    
    public Dodaj(TblModel tbl){
        initComponents();
        kontroler = Kontroler.getInstance();
        this.tbl = tbl;
        ucitaj();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbPredmet = new javax.swing.JComboBox();
        jcbStudent = new javax.swing.JComboBox();
        jcbOcena = new javax.swing.JComboBox<>();
        jtxtDatum = new javax.swing.JTextField();
        jcbDodaj = new javax.swing.JButton();

        jcbOcena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10" }));

        jcbDodaj.setText("Dodaj");
        jcbDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtDatum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbPredmet, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbStudent, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbOcena, javax.swing.GroupLayout.Alignment.TRAILING, 0, 176, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jcbDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jcbPredmet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jcbStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jtxtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jcbOcena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jcbDodaj)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDodajActionPerformed
        try {
            // TODO add your handling code here:
            Predmet p = (Predmet) jcbPredmet.getSelectedItem();
            Student s = (Student) jcbStudent.getSelectedItem();
            String ocena = (String) jcbOcena.getSelectedItem();
            DateFormat df =new SimpleDateFormat("mm/dd/yyyy");
            
            Date datum = df.parse(jtxtDatum.getText());
            
            Prijava prijava = new Prijava(s, p, datum, ocena);
            tbl.ubaciUPrijave(prijava);
        } catch (ParseException ex) {
            Logger.getLogger(Dodaj.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(jcbOcena, "Datum nije dobar");
        }
    }//GEN-LAST:event_jcbDodajActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jcbDodaj;
    private javax.swing.JComboBox<String> jcbOcena;
    private javax.swing.JComboBox jcbPredmet;
    private javax.swing.JComboBox jcbStudent;
    private javax.swing.JTextField jtxtDatum;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        List<Predmet> predmeti = kontroler.vratiSvePredmete();
        List<Student> studenti = kontroler.vratiSveStudente();
        for (Object predmet : predmeti) {
            jcbPredmet.addItem(predmet);
        }
        
        for (Object stud : studenti) {
            jcbStudent.addItem(stud);
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
