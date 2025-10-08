# Laporan Modul 2: Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** Ikhsan Salsabily  
**NIM:** 2024573010102   
**Kelas:** TI 2E

---

## 1. Abstrak
Laporan ini merangkum hasil praktikum Modul 3 tentang Dasar Pemrograman Java.
Tujuannya adalah untuk memahami dan mengimplementasikan konsep-konsep dasar seperti Array,
Method, String, Pengolahan Text melalui studi kasus.

---
## 2. Praktikum
### Praktikum 1.1 - Array satu Dimensi
#### Dasar Teori
Array adalah struktur data homogen yang digunakan untuk menyimpan sekumpulan nilai dengan tipe data yang sama.
Array di Java memiliki ukuran tetap dan elemen-elemen array dapat diakses melalui indeks yang dimulai dari 0.
#### Langkah Praktikum
1.Buat package baru bernama modul_3 di dalam folder src.

2.Buat ArraySatuDimensi.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk menjalankan program.

4.Tambahkan perulangan For untuk mencari nilai tertinggi dan terendah.
#### Screenshoot Hasil
![teks yang ingin ditampilkan](./gambar/array1.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputarray1.png)
#### Analisa dan Pembahasan
Pada program kita membuat sebuah array yang dapat menampung 5 siswa, kemudian memasukkan nilai untuk masing-masing siswa.
kemudian program akan menampilkan nilai tertinggi dan nilai terendah.

#### Latihan 1
![teks yang ingin ditampilkan](./gambar/latihan1.png)
![teks yang ingin ditampilkan](./gambar/latihan1lanjut.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputlatihan1.png)
#### Analisa dan Pembahasan
pada tugas latihan, program dapat menampung 10 data nilai mahasiswa, 
kemudian nilai tersebut akan dihitung nilai rata-ratanya, nilai tertinggi dan nilai terendah.

### Praktikum 1.2 - Array Dua Dimensi
#### Dasar Teori
Array dua dimensi (2D) atau matriks adalah array yang terdiri dari array lainnya.
Array 2D digunakan untuk merepresentasikan data dalam bentuk baris dan kolom, di mana akses elemen memerlukan dua indeks: indeks baris dan kolom. 
#### Langkah Praktikum
1.Buat package baru bernama modul_3 di dalam folder src.

2.Buat ArrayDuaDimensi.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk menjalankan program.

#### Screenshoot Hasil
![teks yang ingin ditampilkan](./gambar/array2.png)
![teks yang ingin ditampilkan](./gambar/array2lanjut.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputarray2.png)
#### Analisa dan Pembahasan
Pada program ini kita menginputkan nilai untuk tiga siswa per pelajaran, kemudian program akan menampilkna
nama, nilai per pelajaran dan rata rata nilai dalam bentuk tabel.

#### Latihan 2
![teks yang ingin ditampilkan](./gambar/latihan2.png)
![teks yang ingin ditampilkan](./gambar/latihan2,1.png)
![teks yang ingin ditampilkan](./gambar/latihan2,2.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputlatihan2.png)
![teks yang ingin ditampilkan](./gambar/outputlatihan2,1.png)
#### Analisa dan Pembahasan
Pada latihan ini kita disuruh untuk menambahkan beberapa fitu tambahan.

1.program dapat menghitung nilai tertinggi dari masing masing siswa(dari semua pelajaran).

2.program dapat menghitung nilai rata rata dari semua pelajaran.

### Praktikum 2.1 - Method Dasar
#### Dasar Teori
Method adalah blok kode yang dirancang untuk melaksanakan tugas tertentu. Ada dua jenis metode: metode void (tidak mengembalikan nilai)
dan metode yang mengembalikan nilai. Penggunaan metode membantu dalam mengorganisasi kode dan menghindari pengulangan (prinsip DRY - Don’t Repeat Yourself).
#### Langkah Praktikum
1.Buat package baru bernama modul_3 di dalam folder src.

2.Buat MethodDasar.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk menjalankan program.
#### Screenshoot Hasil
![teks yang ingin ditampilkan](./gambar/methoddasar.png)
![teks yang ingin ditampilkan](./gambar/methoddasar1.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputmethoddasar.png)
#### Analisa dan Pembahasan
Pada Program ini kita membuat method yang dapat dipanggil pada main program.
salah satunya adalah method aritmetika, validasi angka,tampilkanheader dan tampilkan hasil.

#### Latihan 3
![teks yang ingin ditampilkan](./gambar/latihan3.1.png)
![teks yang ingin ditampilkan](./gambar/latihan3.2.png)
![teks yang ingin ditampilkan](./gambar/latihan3.3.png)
Output:
![teks yang ingin ditampilkan](./gambar/outputlatihan3.png)
#### Analisa dan Pembahasan
Pada latihan kali ini kita harus menambahkan beberapa method baru diantaranya

1.program harus bisa melakukan validasi dengan pembagian nol.

2.program harus bisa melakukan operasi pangkat dan akar kuadrat.
Output:

### Praktikum 2.2 - Method dengan Array
#### Dasar Teori
metode digunakan untuk memproses array, seperti menghitung rata-rata nilai, mencari nilai maksimum dan minimum,
serta mengurutkan array. Metode memungkinkan kode untuk lebih modular dan dapat digunakan kembali (reusable), 
serta dapat menerima parameter berupa array dan mengembalikan nilai yang diproses.
#### Langkah Praktikum
1.Buat package baru bernama modul_3 di dalam folder src.

2.Buat ArrayMethod.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk menjalankan program.
#### Screenshoot Hasil
![teks yang ingin ditampilkan](./gambar/arraymtd1.png)
![teks yang ingin ditampilkan](./gambar/arraymtd2.png)
![teks yang ingin ditampilkan](./gambar/arraymtd3.png)
![teks yang ingin ditampilkan](./gambar/arraymtd4.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputarraymtd.png)
#### Analisa dan Pembahasan
Pada program kita membuat array dengan method, program akan dapat melakukan proses mencari nilai maksimun, minimum, rata rata 
dan dapat mengurutkan array serta array sebelum di urutkan.
#### Latihan 4
![teks yang ingin ditampilkan](./gambar/latihan4.1.png)
![teks yang ingin ditampilkan](./gambar/latihan4.2.png)
![teks yang ingin ditampilkan](./gambar/latihan4.3.png)
![teks yang ingin ditampilkan](./gambar/latihan4.4.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputlatihan4.png)
#### Analisa dan Pembahasan
Pada latihan kali ini kita harus menambahkan beberapa method baru diantaranya

1.program harus bisa mengurutkan array dan menetukan median

2.program harus bisa melakukan operasi untuk mencari nilai yg diinput pengguna


### Praktikum 3.1 - Manipulasi String Dasar
#### Dasar Teori
String di Java adalah objek yang tidak dapat diubah (immutable), yang mewakili urutan karakter. 
Java menyediakan berbagai metode built-in untuk manipulasi string, seperti length(), charAt(), toUpperCase(), toLowerCase(), dan contains()
#### Langkah Praktikum
1.Buat package baru bernama modul_3 di dalam folder src.

2.Buat StringDasar.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk menjalankan program.
#### Screenshoot Hasil
![teks yang ingin ditampilkan](./gambar/stringdsr1.png)
![teks yang ingin ditampilkan](./gambar/stringdsr2.png)
![teks yang ingin ditampilkan](./gambar/stringdsr3.png)
![teks yang ingin ditampilkan](./gambar/stringdsr4.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputstringdsr.png)
#### Analisa dan Pembahasan
Pada praktikum ini, manipulasi string digunakan untuk menghitung jumlah vokal dalam string, memeriksa apakah string merupakan palindrome, serta melakukan validasi dan pemformatan string.
kemudian program dapat melakukan operasi pencarian kata, menentukan upparcase,lowercase, dan seterusnya.
#### Latihan 5
![teks yang ingin ditampilkan](./gambar/latihan5.1.png)
![teks yang ingin ditampilkan](./gambar/latihan5.2.png)
![teks yang ingin ditampilkan](./gambar/latihan5.3.png)
![teks yang ingin ditampilkan](./gambar/latihan5.4.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputlatihan5.png)
#### Analisa dan Pembahasan
Pada latihan kali ini kita harus menambahkan beberapa code baru kedalam program.

1.program harus bisa menentukan jumlah konsonan dan vokal dari kalimat yang dimasukan.

2.program harus bisa menghitung jumlah string.

### Praktikum 3.2 - Pengolahan Data Text
#### Dasar Teori
Pengolahan data teks sering kali melibatkan pemisahan token (kata, nama) dari sebuah delimiter (misalnya,
koma atau spasi), serta pemformatan string ke format tertentu (misalnya, Title Case atau Username). Metode split() digunakan untuk memecah string berdasarkan pola tertentu.
#### Langkah Praktikum
1.Buat package baru bernama modul_3 di dalam folder src.

2.Buat Textprocessing.java di dalam package tersebut.

3.Ketik dan jalankan kode untuk menjalankan program.
#### Screenshoot Hasil
![teks yang ingin ditampilkan](./gambar/textproses1.png)
![teks yang ingin ditampilkan](./gambar/textproses2.png)
![teks yang ingin ditampilkan](./gambar/textproses3.png)
![teks yang ingin ditampilkan](./gambar/textproses4.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputtextproses.png)
#### Analisa dan Pembahasan
program ini memanfaatkan teknik pengurutan nama dan pemformatan string, serta dapat menentukan username.


#### Latihan 6
![teks yang ingin ditampilkan](./gambar/latihan6.1.png)
![teks yang ingin ditampilkan](./gambar/latihan6.2.png)
![teks yang ingin ditampilkan](./gambar/latihan6.3.png)
![teks yang ingin ditampilkan](./gambar/latihan6.4.png)

Output:
![teks yang ingin ditampilkan](./gambar/outputlatihan6.1.png)
![teks yang ingin ditampilkan](./gambar/outputlatihan6.2.png)
#### Analisa dan Pembahasan
Pada latihan kali ini kita harus menambahkan beberapa tugas baru.

1.program harus bisa menentukan validasi format nama (untuk memastikan nama tidak mengandung angka atau karakter khusus).

2.program harus bisa membuat email berdasrkan nama yang diinputkan pengguna.

---

## 3. Kesimpulan
Array Satu dan Dua Dimensi: Percobaan ini menunjukkan bagaimana array digunakan untuk menyimpan dan mengolah data, baik dalam format satu dimensi (seperti nilai ujian siswa) maupun dua dimensi (data tabular untuk nilai mata pelajaran).
Method Dasar dan Array Method: Penggunaan metode meningkatkan modularitas kode, memungkinkan pemisahan tugas tertentu, seperti operasi matematika dan manipulasi array (mencari nilai maksimum, rata-rata, dan pengurutan). Metode memperjelas struktur program dan membuat kode lebih rapi.
Manipulasi String: Praktikum ini mengajarkan cara memanipulasi string di Java menggunakan berbagai metode built-in, seperti menghitung vokal, memeriksa palindrome, dan membuat email dari input pengguna

---

## 5. Referensi
Java Tutorials - The Java™ Tutorials - https://docs.oracle.com/javase/tutorial/

Java Data Types - https://www.geeksforgeeks.org/java/java-data-types/

Java Control Flow Statements - https://dev.java/learn/language-basics/controlling-flow/

---
