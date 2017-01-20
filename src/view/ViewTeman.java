/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerTeman;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelTeman;
import util.Koneksi;

/**
 *
 * @author royani
 */
public class ViewTeman extends javax.swing.JPanel {

    ControllerTeman CT = new ControllerTeman();
    ModelTeman MT = new ModelTeman();
    Koneksi koneksi = new Koneksi();

    /**
     * Creates new form ViewTeman
     */
    public ViewTeman() {
        initComponents();
        tampilTeman();
    }

    private void tampilTeman() {
        koneksi.koneksiDatabase();

        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("ID");
        tabel.addColumn("Nama Teman");
        tabel.addColumn("Nomor Handphone");
        tabel.addColumn("Email");

        jTableTeman.setModel(tabel);
        try {
            String sql = "select * from tbl_teman";

            ResultSet res = koneksi.state.executeQuery(sql);
            while (res.next()) {
                tabel.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("nama"),
                    res.getString("nope"),
                    res.getString("email")
                });
                jTableTeman.setModel(tabel);

            }
        } catch (SQLException eer) {
            System.err.println("SQLException:" + eer.getMessage());
        }
    }

    private void tombolBaru() {
        jTextFieldNama.setEditable(true);
        jTextFieldHp.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jTextFieldNama.requestFocus();
        bersihJTextField();
    }

    private void tombolBatal() {
        jTextFieldNama.setEditable(false);
        jTextFieldHp.setEditable(false);
        jTextFieldEmail.setEditable(false);
        bersihJTextField();
        jButtonSimpan.setEnabled(false);
        jButtonBaru.setText("Baru");
    }
    
    private void bersihJTextField(){
        jTextFieldId.setText("");
        jTextFieldNama.setText("");
        jTextFieldHp.setText("");
        jTextFieldEmail.setText("");
    }
    
    private void tabelKlik(){
        jButtonHapus.setEnabled(true);
        jButtonUbah.setEnabled(true);
    }
    private void tabelUnKlik(){
        jButtonHapus.setEnabled(false);
        jButtonUbah.setEnabled(false);
        bersihJTextField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonBaru = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonBersih = new javax.swing.JButton();
        jButtonTutup = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTeman = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("id :");

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextFieldNama.setEditable(false);
        jTextFieldNama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama :");

        jTextFieldHp.setEditable(false);
        jTextFieldHp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("No. Hp :");

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email :");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButtonBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBaru.setText("Baru");
        jButtonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaruActionPerformed(evt);
            }
        });

        jButtonUbah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUbah.setText("Ubah");
        jButtonUbah.setEnabled(false);
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jButtonSimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.setEnabled(false);
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonHapus.setText("Hapus");
        jButtonHapus.setEnabled(false);
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonBersih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBersih.setText("Bersih");
        jButtonBersih.setEnabled(false);
        jButtonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBersihActionPerformed(evt);
            }
        });

        jButtonTutup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonTutup.setText("Tutup");
        jButtonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableTeman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableTeman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTemanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTeman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTutupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonTutupActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String nama = jTextFieldNama.getText();
        String nope = jTextFieldHp.getText();
        String email = jTextFieldEmail.getText();
        if(nama.equals("") || nope.equals("") || email.equals("")){
            JOptionPane.showMessageDialog(null, "masukkan data yang benar");
        }else{
            
        if (JOptionPane.showConfirmDialog(null, "ingin menyimpan?", "PERHATIAN",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                MT.setNama(nama);
                MT.setNope(nope);
                MT.setEmail(email);

                CT.simpanTeman(MT);

                tampilTeman();
                tombolBatal();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
            }
        } else {
        }
        }

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "INGIN MENGGANTI?", "PERHATIAN",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(jTextFieldId.getText());
                String nama = jTextFieldNama.getText();
                String nope = jTextFieldHp.getText();
                String email = jTextFieldEmail.getText();

                MT.setId(id);
                MT.setNama(nama);
                MT.setNope(nope);
                MT.setEmail(email);

                CT.ubahDataTeman(MT);
                
                tampilTeman();
                tabelUnKlik();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "ERROR jButtonUbahActionPerformed : "+e);
            }
        } else {
        }

    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(null, "INGGIN MENDELETE?", "PERHATIAN!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(jTextFieldId.getText());

                MT.setId(id);
                CT.hapusDataTeman(MT);

                tampilTeman();
                tabelUnKlik();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR jButtonHapusActionPerformed : " + e);
            }
        } else {
        }

    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jTableTemanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTemanMouseClicked
        // TODO add your handling code here:
        
        try {
            int baris = jTableTeman.getSelectedRow();
            jTextFieldId.setText(jTableTeman.getValueAt(baris, 0).toString());
            jTextFieldNama.setText(jTableTeman.getValueAt(baris, 1).toString());
            jTextFieldHp.setText(jTableTeman.getValueAt(baris, 2).toString());
            jTextFieldEmail.setText(jTableTeman.getValueAt(baris, 3).toString());
            tabelKlik();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }//GEN-LAST:event_jTableTemanMouseClicked

    private void jButtonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaruActionPerformed
        // TODO add your handling code here:
        String logic = jButtonBaru.getText();
        if (logic.equals("Baru")) {
            jButtonSimpan.setEnabled(true);
            jButtonBaru.setText("Batal");
            tombolBaru();
        } else {
            jButtonSimpan.setEnabled(false);
            jButtonBaru.setText("Baru");
            tombolBatal();
        }
    }//GEN-LAST:event_jButtonBaruActionPerformed

    private void jButtonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBersihActionPerformed
        // TODO add your handling code here:
        bersihJTextField();
    }//GEN-LAST:event_jButtonBersihActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaru;
    private javax.swing.JButton jButtonBersih;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTutup;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTeman;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHp;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}
