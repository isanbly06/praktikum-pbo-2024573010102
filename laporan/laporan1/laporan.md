# Laporan Modul 2: Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** Ikhsan Salsabily  
**NIM:** 2024573010102  
**Kelas:** TI 2E

---

## 1. Abstrak
Laporan ini merangkum hasil praktikum Modul 2 tentang Dasar Pemrograman Java.
Tujuannya adalah untuk memahami dan mengimplementasikan konsep-konsep dasar seperti tipe data,
variabel, input/output, struktur kontrol percabangan (if-else dan switch), 
serta perulangan (for, while, dan do-while) melalui studi kasus.

---
## 2. Praktikum
### Praktikum 1 - Variabel dan Type Data
#### Dasar Teori
Java memiliki dua kategori tipe data: primitif dan referensi. Tipe data primitif mencakup byte, short,
int, long, float, double, boolean, dan char. Sementara itu, tipe data referensi mencakup String, Array,
Object, dan lainnya. Aturan penamaan variabel harus dimulai dengan huruf, garis bawah (_), atau tanda dolar ($), 
tidak boleh dimulai dengan angka, bersifat case sensitive, dan tidak boleh menggunakan keyword Java yang sudah ada.

#### Langkah Praktikum
1.Buat package baru bernama modul_2 di dalam folder src.

2.Buat file VariabelDemo.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk mendemonstrasikan variabel dan tipe data.

#### Screenshoot Hasil
1.Code program dan outputnya
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/variabeldemo.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/variabeldemo2.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputdemo.png)
#### Analisa dan Pembahasan
Pada praktikum ini, saya berhasil menuliskan berbagai jenis variabel dengan tipe data primitif dan referensi.
Kode berjalan sesuai harapan ketika dirun, menunjukkan nilai yang diinisialisasi pada setiap variabel. Praktikum ini membantu 
saya memahami perbedaan antara tipe data dan aturan penamaannya dalam Java.

### Praktikum 2 - input, Output dan Scanner
#### Dasar Teori
Untuk membaca input dari pengguna, kita menggunakan kelas Scanner yang berada di dalam package java.util.
Kelas Scanner menyediakan berbagai metode, seperti nextInt() untuk membaca integer, nextDouble() untuk double
nextLine() untuk string, dan nextBoolean() untuk boolean. Untuk menampilkan output kita
#### Langkah Praktikum
1.Buat file baru dengan nama InputOutputDemo.java.

2.Ketik dan jalankan kode untuk mencoba penggunaan Scanner untuk input dan output.
#### Screenshoot Hasil
1.Code program dan output
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/inputoutput.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputdemo.png)
#### Analisa dan Pembahasan
Pada percobaan kali saya berhasil membuat program yang dapat menerima input dari pengguna menggunakan kelas Scanner.
Saya menguji berbagai metode Scanner untuk membaca data berupa angka dan teks, dan program berhasil 
menampilkan kembali input tersebut.

### Praktikum 3 - Struktur Control: Percabangan
#### Dasar Teori
Struktur kontrol percabangan digunakan untuk membuat keputusan dalam program. Statement percabangan yang dipelajari meliputi if,
if-else, if-else-if, dan switch.
#### Langkah Praktikum
1.Buat file baru GradeDemo.java dan implementasikan program penentu grade.

2.Buat file MenuDemo.java dan implementasikan program menu dengan switch.

3.Buat file NestedIfDemo.java dan implementasikan program nested if untuk menentukan kategori usia.

4.Ketik dan jalankan kode untuk mencoba penggunaan if-else, if-else-if, dan switch.
#### Screenshoot Hasil
1.Code dan ouput program GradeDemo
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/grade.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputgrade.png)

2.Code dan output program MenuDemo
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/menudemo.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/menudemo2.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputmenu.png)

3.Code dan output program NestedIfDemo
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/nestedif.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputnestedif.png)

#### Analisa dan Pembahasan
Pada praktikum percabangan, saya berhasil mencoba untuk menjalankan program penentu grade, menu interaktif, dan penentu kategori usia.
Penggunaan if-else-if sangat efektif untuk rentang nilai, sedangkan switch lebih cocok untuk pilihan menu. Program nested if juga 
berjalan dengan baik dalam menentukan kondisi bersyarat.

### Praktikum 4 - Struktur Control: Perulangan
#### Dasar Teori
Perulangan (loop) berfungsi untuk mengulang eksekusi blok kode. Java menyediakan tiga jenis perulangan, yaitu for, while, dan do-while.
#### Langkah Praktikum
1.Buat file baru bernama ForLoopDemo.java dan implementasikan contoh perulangan for.

2.Buat file WhileLoopDemo.java dan implementasikan contoh perulangan while dan do-while.

3.Buat file NestedLoopDemo.java dan implementasikan contoh nested loop.

4.Ketik dan jalankan kode untuk mencoba penggunaan for, while, dan do-while.
#### Screenshoot Hasil
1.Code dan output program ForLoopDemo
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/forloop.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputfor.png)

2.Code dan ouput program WhileLoopDemo
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/whileloop.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/whileloop2.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputwhileloop.png)

3.Code dan output program NestedLoopDemo
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/nestedloop.png)
![teks yang ingin ditampilkan](/laporan/laporan1/gambar/outputnestedloop.png)

#### Analisa dan Pembahasan
Praktikum ini menunjukkan bagaimana perulangan dapat menyederhanakan kode. Perulangan for ideal untuk iterasi yang sudah diketahui jumlahnya,
sementara while dan do-while lebih fleksibel untuk kondisi yang tidak pasti. Penggunaan nested loop juga berhasil saya terapkan untuk membuat
pola atau struktur data yang kompleks.



---

## 3. Kesimpulan

Praktikum ini memberikan pemahaman yang kuat tentang dasar-dasar pemrograman Java. Saya dapat mengaplikasikan konsep variabel, tipe data,
input/output, serta struktur kontrol percabangan dan perulangan. Pengetahuan ini sangat penting sebagai fondasi awal untuk modul-modul selanjutnya.

---

## 5. Referensi
Java Tutorials - The Java™ Tutorials - https://docs.oracle.com/javase/tutorial/

Java Data Types - https://www.geeksforgeeks.org/java/java-data-types/

Java Control Flow Statements - https://dev.java/learn/language-basics/controlling-flow/

---
