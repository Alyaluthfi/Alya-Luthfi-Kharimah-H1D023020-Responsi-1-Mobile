## Identitas Diri
Nama: Alya Luthfi Kharimah <br> 
NIM: H1D023020 <br> 
Shift Lama: C <br> 
Shift Baru: F


## Demo Aplikasi 
![Demo Aplikasi](AlyaLuthfi_DemoAplikasi_Responsi-1-Mobile.gif)

## Penjelasan Alur Aplikasi AJ Auxerre
Secara singkat, alurnya sebagai berikut: <br>
View (Activity) → ViewModel → Repository → API (Postman)

## Penjelasan langkah - langkahnya: 
**1. Pemicu dari UI (View)** <br>
Alur dimulai saat pengguna menekan tombol "Team Squad" di `MainActivity`  atau saat layar `TeamSquadActivity` pertama kali dimuat. <br><br>
**2. Meminta data ke ViewModel** <br>
`TeamSquadActivity` akan memberi tau `ViewModel` untuk mengambil data. <br><br>
**3. Mengambil data dari repository** <br>
`SquadViewModel`  tidak mengambil data langsung dari internet. Ia akan memintanya dari `Repository`. <br><br>
**4. Pemanggilan ke API (Remote data source)** <br>
`Repository` memutuskan untuk mengambil data baru dari internet. Ia memanggil endpoint API menggunakan library seperti `Retrofit`. <br><br>
**5. Data kembali dari API** <br>
API mengirimkan kembali data JSON. Library `Retrofit/Gson` secara otomatis mem-parsing (mengubah) data JSON itu menjadi objek model Kotlin (misalnya, `List<Player>` dari data `"squad": [...]`). <br><br>
**6. Data kembali ke ViewModel** <br>
`Repository` menerima objek `List<Player>` ini dan meneruskannya ke `SquadViewModel`, yang kemudian menyimpannya (misalnya dalam `LiveData`). <br><br>
**7. Penyajian di layar (View)** <br>
`TeamSquadActivity` mengamati (`observe`) LiveData di `ViewModel`. Ketika data baru masuk, `Activity` akan diberi tahu, lalu mengambil `List<Player>` dan memberikannya ke `PlayerAdapter` untuk ditampilkan di `RecyclerView`.



