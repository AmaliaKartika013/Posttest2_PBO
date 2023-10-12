/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2.surat;

/**
 *
 * @author ASUS
 */
public class Pemohon {
    final private String namaPemohon;
    final private String nomorMahasiswa;
    final private String programStudi;
    

    public Pemohon(String namaPemohon, String nomorMahasiswa, String programStudi) {
        this.namaPemohon = namaPemohon;
        this.nomorMahasiswa = nomorMahasiswa;
        this.programStudi = programStudi;
    }
    

    public String getNamaPemohon() {
        return namaPemohon;
    }

    public String getNomorMahasiswa() {
        return nomorMahasiswa;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}


