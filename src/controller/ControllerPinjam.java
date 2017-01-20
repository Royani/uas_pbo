/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPinjam;
import util.Koneksi;

/**
 *
 * @author royani
 */
public class ControllerPinjam {

    Koneksi koneksi = new Koneksi();

    public void simpanPinjaman(ModelPinjam mp) {
        koneksi.koneksiDatabase();
        String querySimpanPinjaman = "insert into tbl_pinjam(namaTeman,barangDipinjam) values('" + mp.getNama() + "','" + mp.getBarang() + "')";
        try {
            koneksi.state.executeUpdate(querySimpanPinjaman);
            JOptionPane.showMessageDialog(null, "Data sukses");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Tidak sukses");
            System.err.println("error Controller teman : " + e);
        }
    }
    
    public void hapusDataPinjam(ModelPinjam mp){
        try {
            koneksi.koneksiDatabase();
            String queryHapusDataPinjam = "delete from tbl_pinjam where id=('"+mp.getId()+"')";
            koneksi.state.executeUpdate(queryHapusDataPinjam);
            JOptionPane.showMessageDialog(null, "Data sukses Dihapus..");
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Error : "+e);
            JOptionPane.showMessageDialog(null, "Data TIDAK sukses Dihapus");
        }
    }
    
    public void ubahDataPinjam(ModelPinjam mp){
        koneksi.koneksiDatabase();
         try {
            int id = mp.getId();
            String nama = mp.getNama();
            String barang = mp.getBarang();

            String queryUbahDataPinjam = "update tbl_pinjam "
                    + "set barangDipinjam=('"+ barang +"') where id=('" + id + "')";
            koneksi.state.executeUpdate(queryUbahDataPinjam);
            JOptionPane.showMessageDialog(null, "Data sukses Diupdate..");
        } catch (SQLException e) {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data TIDAK sukses Diubah");
        }
    }
}
