/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest2.main;

import posttest2.surat.Penerima;
import posttest2.surat.Pemohon;
import posttest2.surat.ProgramStudi;
import posttest2.surat.JenisSurat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
final class Utama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Pemohon> pemohonList = new ArrayList<>();
        List<ProgramStudi> programStudiList = new ArrayList<>();
        List<JenisSurat> jenisSuratList = new ArrayList<>();
        List<Penerima> penerimaList = new ArrayList<>();

        int choice;
        boolean exit = false; // Tambahkan variabel exit
        
        while (!exit) {
            System.out.println("Sistem Penyuratan Akademik Kampus:");
            System.out.println("1. Tambah Pemohon Surat");
            System.out.println("2. Tambah Program Studi");
            System.out.println("3. Tambah Jenis Surat");
            System.out.println("4. Tambah Penerima");
            System.out.println("5. Tampilkan Pemohon");
            System.out.println("6. Tampilkan Program Studi");
            System.out.println("7. Tampilkan Jenis Surat");
            System.out.println("8. Tampilkan Penerima");
            System.out.println("9. Edit Data");
            System.out.println("10. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Pemohon Surat: ");
                    String namaPemohon = input.next();
                    System.out.print("Masukkan Nomor Mahasiswa: ");
                    String nomorMahasiswa = input.next();
                    System.out.print("Masukkan Nama Program Studi: ");
                    String nameProgramStudi = input.next();
                    Pemohon pemohonSurat = new Pemohon(namaPemohon, nomorMahasiswa, nameProgramStudi);
                    pemohonList.add(pemohonSurat);
                    System.out.println("Data Berhasil ditambahkan");
                    break;

                case 2:
                    System.out.print("Masukkan Nama Program Studi: ");
                    String namaProgramStudi = input.next();
                    ProgramStudi programStudi = new ProgramStudi(namaProgramStudi);
                    programStudiList.add(programStudi);
                    System.out.println("Data Berhasil ditambahkan");
                    break;

                case 3:
                    System.out.print("Masukkan Nama Jenis Surat: ");
                    String namaJenisSurat = input.next();
                    JenisSurat jenisSurat = new JenisSurat(namaJenisSurat);
                    jenisSuratList.add(jenisSurat);
                    System.out.println("Data Berhasil ditambahkan");
                    break;

                case 4:
                    System.out.print("Masukkan Nama Penerima: ");
                    String namaPenerima = input.next();
                    System.out.print("Masukkan Email: ");
                    String email = input.next();
                    Penerima penerima = new Penerima(namaPenerima, email);
                    penerimaList.add(penerima);
                    System.out.println("Data Berhasil ditambahkan");
                    break;

                case 5:
                    for (int i = 0; i < pemohonList.size(); i++) {
                        System.out.println( "Nama Pemohon: " + pemohonList.get(i).getNamaPemohon() + ", Nomor Mahasiswa:" + pemohonList.get(i).getNomorMahasiswa() + ", Program Studi : " + pemohonList.get(i).getProgramStudi());
                    }
                    break;

                case 6:
                    for (int i = 0; i < programStudiList.size(); i++) {
                        System.out.println("Nama Program Studi: " + programStudiList.get(i).getNamaProgramStudi());
                    }
                    break;

                case 7:
                    for (int i = 0; i < jenisSuratList.size(); i++) {
                        System.out.println("Nama Jenis Surat: " + jenisSuratList.get(i).getNamaJenisSurat());
                    }
                    break;

                case 8:
                    for (int i = 0; i < penerimaList.size(); i++) {
                        System.out.println("Nama Penerima: " + penerimaList.get(i).getNama() + ", Email:" + penerimaList.get(i).getEmail());
                    }
                    break;
                    
                case 9:
                    System.out.println("Pilih jenis data yang ingin diedit:");
                    System.out.println("1. Edit Pemohon");
                    System.out.println("2. Edit Program Studi");
                    System.out.println("3. Edit Jenis Surat");
                    System.out.println("4. Edit Penerima");
                    System.out.print("Pilihan: ");
                    int editChoice = input.nextInt();

                    switch (editChoice) {
                        case 1:
                            // Edit Pemohon
                            for (int i = 0; i < pemohonList.size(); i++) {
                                System.out.println( "Nama Pemohon: " + pemohonList.get(i).getNamaPemohon() + ", Nomor Mahasiswa:" + pemohonList.get(i).getNomorMahasiswa() + ", Program Studi : " + pemohonList.get(i).getProgramStudi());
                            }
                            System.out.print("Masukkan nomor pemohon yang ingin diedit: ");
                            int pemohonIndex = input.nextInt();
                            if (pemohonIndex >= 1 && pemohonIndex < pemohonList.size()) {
                                System.out.print("Masukkan Nama Pemohon Surat baru: ");
                                String newNamaPemohon = input.next();
                                System.out.print("Masukkan Nomor Mahasiswa baru: ");
                                String newNomorMahasiswa = input.next();
                                System.out.print("Masukkan Nama Program Studi baru: ");
                                String newNamaProgramStudi = input.next();
                                Pemohon editedPemohon = new Pemohon(newNamaPemohon, newNomorMahasiswa, newNamaProgramStudi);
                                pemohonList.set(pemohonIndex, editedPemohon);
                                System.out.println("Data Pemohon berhasil diedit.");
                            } else {
                                System.out.println("Nomor pemohon tidak valid.");
                            }
                            break;

                        case 2:
                            // Edit Program Studi
                            for (int i = 0; i < programStudiList.size(); i++) {
                                    System.out.println("Nama Program Studi: " + programStudiList.get(i).getNamaProgramStudi());
                                }
                            System.out.print("Masukkan nomor program studi yang ingin diedit: ");
                            int programStudiIndex = input.nextInt();
                            if (programStudiIndex >= 1 && programStudiIndex < programStudiList.size()) {
                                System.out.print("Masukkan Nama Program Studi baru: ");
                                String newNamaProgramStudi = input.next();
                                ProgramStudi editedProgramStudi = new ProgramStudi(newNamaProgramStudi);
                                programStudiList.set(programStudiIndex, editedProgramStudi);
                                System.out.println("Data Program Studi berhasil diedit.");
                            } else {
                                System.out.println("Nomor program studi tidak valid.");
                            }
                            break;

                        case 3:
                            // Edit Jenis Surat
                            for (int i = 0; i < jenisSuratList.size(); i++) {
                                System.out.println("Nama Jenis Surat: " + jenisSuratList.get(i).getNamaJenisSurat());
                            }
                            System.out.print("Masukkan nomor jenis surat yang ingin diedit: ");
                            int jenisSuratIndex = input.nextInt();
                            if (jenisSuratIndex >= 1 && jenisSuratIndex < jenisSuratList.size()) {
                                System.out.print("Masukkan Nama Jenis Surat baru: ");
                                String newNamaJenisSurat = input.next();
                                JenisSurat editedJenisSurat = new JenisSurat(newNamaJenisSurat);
                                jenisSuratList.set(jenisSuratIndex, editedJenisSurat);
                                System.out.println("Data Jenis Surat berhasil diedit.");
                            } else {
                                System.out.println("Nomor jenis surat tidak valid.");
                            }
                            break;

                        case 4:
                            // Edit Penerima
                            for (int i = 0; i < penerimaList.size(); i++) {
                                System.out.println("Nama Penerima: " + penerimaList.get(i).getNama() + ", Email:" + penerimaList.get(i).getEmail());
                            }
                            System.out.print("Masukkan nomor penerima yang ingin diedit: ");
                            int penerimaIndex = input.nextInt();
                            if (penerimaIndex >= 1 && penerimaIndex < penerimaList.size()) {
                                System.out.print("Masukkan Nama Penerima baru: ");
                                String newNamaPenerima = input.next();
                                System.out.print("Masukkan Email baru: ");
                                String newEmail = input.next();
                                Penerima editedPenerima = new Penerima(newNamaPenerima, newEmail);
                                penerimaList.set(penerimaIndex, editedPenerima);
                                System.out.println("Data Penerima berhasil diedit.");
                            } else {
                                System.out.println("Nomor penerima tidak valid.");
                            }
                            break;

                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }
                    break;
                    
                case 10:
                    System.out.println("Terima kasih! Keluar dari program.");
                    input.close();
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } 
    }
}





