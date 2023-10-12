/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2.surat;
/**
 *
 * @author ASUS
 */
public class Penerima {
    private String nama;
    private String email;

    public Penerima(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }
    
    public final void displayData() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

  

