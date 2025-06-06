# 📚 Sistem Informasi Perpustakaan Sederhana
Proyek ini merupakan aplikasi desktop berbasis Java yang dikembangkan menggunakan NetBeans IDE. Sistem ini dirancang untuk mempermudah pengelolaan perpustakaan, seperti pencatatan buku, anggota, dan transaksi peminjaman, dengan tampilan GUI yang ramah pengguna.

## ⚙️ Teknologi yang Digunakan
* Java SE (Swing untuk GUI)
* NetBeans IDE
* Maven (build automation melalui pom.xml)
* File .form dan .java untuk tampilan antarmuka berbasis drag-and-drop dan logika program
* File aset: Ikon-ikon seperti book.png, diskette.png, folder.png, dll.

## 🧩 Fitur Utama
### 🔐 Login Pengguna
* Sistem dilengkapi dengan otentikasi username dan password.
* Validasi input dan pesan kesalahan saat login gagal.

### 🏠 Beranda
Setelah login berhasil, pengguna akan diarahkan ke halaman utama untuk mengakses modul utama.

### 📚 Manajemen Buku
- Tambah, edit, hapus, dan cari buku berdasarkan ID, judul, atau genre.
- Menampilkan seluruh data buku dalam bentuk tabel.

### 👤 Manajemen Anggota
- Kelola data anggota (tambah, ubah, hapus) dengan status aktif atau blacklist.
- Pencarian berdasarkan nama anggota.

### 📖 Manajemen Peminjaman
- Catat dan kelola data peminjaman buku.
- Pencarian transaksi berdasarkan nama peminjam.
- Status peminjaman: Dipinjam atau Dikembalikan.

### 📊 Visual dan Antarmuka
- GUI dibangun menggunakan komponen Swing di NetBeans.
- Ikon grafis digunakan untuk mempercantik tampilan dan meningkatkan user experience.
