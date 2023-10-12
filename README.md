# Posttest2_PBO
* NAMA  : Amalia Kartika Sari
* NIM   : 2209116013
* Kelas : A Sistem Informasi 2022
* Tema  : Penyuratan Akademik

## Studi Kasus
Pada kali ini saya mengambil tema Penyuratan Akademik untuk mengelola terkait surat akademik untuk meningkatkan efisiensi dalam pembuatan surat dan pengiriman surat ke penerima yang benar. semua data akan mudah dikelola melalui program ini, hal ini dapat membuat staff kampus menjadi lebih mudah dan meminimalkan kesalahan manusia.

## SS Ketentuan
1. membuat minimal 2 Package
   >
   <img width="120" alt="Screenshot 2023-10-12 215444" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/1570fb53-15a4-4e5e-a1b6-ace0b1bf2347">
   
   > Pada project rill ini terdapat dua package yaitu posttest2.main dan posttest2.surat. hal ini tentunya sejalan dengan ketentuan ketiga yaitu package posttest2.main adalah package utama dan posttest2.surat adalah package yang baru dibuat.

3. setiap entitas harus memiliki kelas
   > pada entitas posttest2.main
   >
   > <img width="101" alt="Screenshot 2023-10-12 220830" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/85082525-5744-4753-b51a-8d4ac53b6271">

   > pada entitas posttest2.surat
   >
   > <img width="114" alt="Screenshot 2023-10-12 220917" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/0128c442-4de8-46be-bba1-87393475de11">

5. access modifier, setter dan getter
   * pemohon
     > kelas ProgramStudi, atribut namaProgramStudi diberi access modifier private, yang berarti bahwa atribut ini hanya dapat diakses secara langsung oleh kelas ProgramStudi itu sendiri.
     > <img width="191" alt="Screenshot 2023-10-12 225748" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/69fc98ce-e43a-4c04-ae30-83c6230da9cb">

     > terdapat getter (metode getNamaProgramStudi()) yang digunakan untuk mengakses nilai atribut dari luar kelas. Tidak ada setter, yang berarti atribut ini tidak dapat diubah secara langsung dari luar kelas.
     ><img width="222" alt="Screenshot 2023-10-12 225755" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/118e9bd4-2b70-4cda-907e-1eddde39da1d">

     > 
   * penerima
     > kelas Penerima, atribut nama dan email diberi access modifier private, yang berarti bahwa atribut-atribut ini hanya dapat diakses secara langsung oleh kelas Penerima itu sendiri.
     > <img width="138" alt="Screenshot 2023-10-12 225852" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/070ec4fe-aca7-4c74-992d-5dd416b2e21e">

     > 
     > terdapat getter (metode getNama() dan getEmail()) yang digunakan untuk mengakses nilai atribut dari luar kelas. Terdapat juga setter (metode setNama() dan setEmail()) yang memungkinkan pengaturan nilai atribut dari luar kelas.
     ><img width="235" alt="Screenshot 2023-10-12 225900" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/2fa63512-ca96-4af3-b00e-8d86e164631e">

     > 
   * program studi
     > atribut namaProgramStudi diberi access modifier private, yang berarti bahwa atribut ini hanya dapat diakses secara langsung oleh kelas ProgramStudi itu sendiri.
     > <img width="201" alt="Screenshot 2023-10-12 225939" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/0a7ed4c8-5272-4740-95e9-0a9b24e15b3e">

     > 
     > terdapat getter (metode getNamaProgramStudi()) yang digunakan untuk mengakses nilai atribut dari luar kelas. Tidak ada setter, yang berarti atribut ini tidak dapat diubah secara langsung dari luar kelas.
     ><img width="276" alt="Screenshot 2023-10-12 225944" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/625345c2-2010-49f2-a7b5-0b489c229bff">

     > 
   * jenis surat
     > kelas JenisSurat, atribut namaJenisSurat diberi access modifier private, yang berarti bahwa atribut ini hanya dapat diakses secara langsung oleh kelas JenisSurat itu sendiri.
     ><img width="195" alt="Screenshot 2023-10-12 225958" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/73fa81bb-c658-4b8a-aa67-4aa6cd8c99c8">

     > 
     > terdapat getter (metode getNamaJenisSurat()) yang digunakan untuk mengakses nilai atribut dari luar kelas. Tidak ada setter, yang berarti atribut ini tidak dapat diubah secara langsung dari luar kelas.
     > <img width="261" alt="Screenshot 2023-10-12 230003" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/636b977a-accb-4cbd-ac9d-915169f91434">

     > 
   * utama
     > terdapat access modifier private tetapi tidak ada setter dan getter karena kelas ini tidak memiliki atribut yang perlu diakses atau diubah secara langsung dari luar kelas.
     > 
7. ArrayList
   * pemohon
     > Objek-objek Pemohon mewakili pemohon surat dengan atribut seperti nama pemohon, nomor mahasiswa, dan program studi. Dalam kode ini, setiap kali pengguna memilih opsi untuk menambahkan pemohon surat (case 1), objek Pemohon baru dibuat dan ditambahkan ke pemohonList.
     ><img width="585" alt="Screenshot 2023-10-12 230358" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/4c7bc9ac-9fa8-4723-94f7-207beb6fb53f">
<img width="281" alt="Screenshot 2023-10-12 230346" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/32e6f185-f1b5-4e95-af40-c8f01b994aee">

     > 
   * program studi
     > Objek-objek ProgramStudi mewakili daftar program studi yang mungkin ada. Dalam kode ini, setiap kali pengguna memilih opsi untuk menambahkan program studi (case 2), objek ProgramStudi baru dibuat dan ditambahkan ke programStudiList.
     ><img width="341" alt="Screenshot 2023-10-12 230449" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/dcbde88f-1985-4fb8-825d-1dccaa142c1a">

     > <img width="410" alt="Screenshot 2023-10-12 230441" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/e9cb876c-66e9-483e-b919-d9d58f2eaaeb">

   * jenis surat
     > Objek-objek JenisSurat mewakili jenis-jenis surat yang mungkin digunakan dalam sistem. Dalam kode ini, setiap kali pengguna memilih opsi untuk menambahkan jenis surat (case 3), objek JenisSurat baru dibuat dan ditambahkan ke jenisSuratList.
     > <img width="329" alt="Screenshot 2023-10-12 230520" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/b505a046-c466-495e-a423-39fd3b3e402d">

     > <img width="359" alt="Screenshot 2023-10-12 230529" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/8046f243-c627-41df-87fa-555a70d7d66c">

   * penerima
     > Objek-objek Penerima mewakili penerima surat dengan atribut seperti nama dan email. Dalam kode ini, setiap kali pengguna memilih opsi untuk menambahkan penerima surat (case 4), objek Penerima baru dibuat dan ditambahkan ke penerimaList.
     > <img width="294" alt="Screenshot 2023-10-12 230538" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/0e14022a-4e29-43b5-8eda-2184e868fb10">

     > <img width="383" alt="Screenshot 2023-10-12 230548" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/86d27a9b-8f28-4aa7-bebc-61f577013a54">



9. Final Class
    > Kelas Utama dinyatakan sebagai final. Ini berarti bahwa kelas Utama tidak dapat diwariskan (subclassed). Tidak ada kelas lain yang dapat meng-extend atau inherit dari kelas ini. Dalam konteks ini, Utama adalah kelas utama dalam program yang memiliki metode main. sedangkan kelas lain tidak bisa menjadi final class karena masih bersifat enherit
    > <img width="119" alt="Screenshot 2023-10-12 230843" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/afa816cf-ea55-4acb-9e0f-93a76a194575">

11. Final Property
    > Dalam kelas Pemohon, atribut-atribut namaPemohon, nomorMahasiswa, dan programStudi dinyatakan sebagai final. Ini berarti bahwa nilai-nilai atribut tersebut hanya dapat diinisialisasi sekali (saat objek dibuat) dan tidak dapat diubah setelahnya.
    > <img width="233" alt="image" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/e2ec4afc-ab5a-42df-93a6-c07a7f850205">


## Output

1. tampilan awal (pilihan menu)
   > <img width="205" alt="Screenshot 2023-10-12 231153" src="https://github.com/AmaliaKartika013/Posttest2_PBO/assets/147727344/9d540bf9-909b-4ed5-823b-d76321d8be90">

3. opsi 1
4. opsi 2
5. opsi 3
6. opsi 4
7. opsi 5
8. opsi 6
9. opsi 7
10. opsi 8
11. opsi 9
12. opsi 10
