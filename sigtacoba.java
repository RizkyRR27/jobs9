import java.util.Scanner;
import java.util.Arrays;

public class sigtacoba {
    public static void main(String[] args) {
        Scanner sig = new Scanner(System.in);

        // Login
        String email, password;
        System.out.println("Masukkan email: ");
        email = sig.nextLine();
        System.out.println("Masukkan password: ");
        password = sig.nextLine();

        // Cek login
        if (email.equals("iki@gmail.wkwkwk") && password.equals("bandung")) {
            System.out.println("Login berhasil, silakan pilih menu:");
            System.out.println("1. Ristok barang");
            System.out.println("2. Penambahan produk baru");
            System.out.println("3. Barang keluar");
            System.out.println("4. Keluar");

            int pilihan;

            // Inisialisasi array produk
            String[] produk = {"sapu", "gayung", "laptop", "CD", "kutang", "handuk"};
            int[] jumlahProduk = {0, 0, 0, 0, 0, 0};

            do {
                System.out.println("Pilih menu (1/2/3/4): ");
                pilihan = sig.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Masukkan kode barang yang ingin di-ristok: ");
                        String kodeBarang = sig.next();
                        System.out.println("Jumlah barang yang ingin di-ristok: ");
                        int jmlRistokBarang = sig.nextInt();

                        // Cari indeks produk berdasarkan kode
                        int index = -1;
                        for (int i = 0; i < produk.length; i++) {
                            if (kodeBarang.equals("b0" + i)) {
                                index = i;
                                break;
                            }
                        }

                        if (index != -1) {
                            jumlahProduk[index] += jmlRistokBarang;
                            System.out.println("Barang " + produk[index] + " dengan jumlah = " + jumlahProduk[index]);
                        } else {
                            System.out.println("Kode barang tidak valid.");
                        }
                        break;

                    case 2:
                        System.out.println("Masukkan produk baru yang ingin ditambahkan: ");
                        String produkTambahan = sig.next();
                        System.out.println("Masukkan jumlah yang ingin ditambahkan: ");
                        int jmlTambahBarang = sig.nextInt();

                        // Tambahkan produk baru ke array
                        produk = Arrays.copyOf(produk, produk.length + 1);
                        jumlahProduk = Arrays.copyOf(jumlahProduk, jumlahProduk.length + 1);
                        int newIndex = produk.length - 1;
                        produk[newIndex] = produkTambahan;
                        jumlahProduk[newIndex] = jmlTambahBarang;
                        System.out.println(produkTambahan + " berhasil ditambahkan sebanyak " + jmlTambahBarang);
                        break;

                    case 3:
                        System.out.println("Masukkan nama barang yang keluar: ");
                        String namaBarang = sig.next();
                        System.out.println("Jumlah barang yang keluar: ");
                        int jmlBarangKeluar = sig.nextInt();

                        // Cari indeks produk berdasarkan nama
                        int productIndex = -1;
                        for (int i = 0; i < produk.length; i++) {
                            if (namaBarang.equalsIgnoreCase(produk[i])) {
                                productIndex = i;
                                break;
                            }
                        }

                        if (productIndex != -1 && jumlahProduk[productIndex] >= jmlBarangKeluar) {
                            jumlahProduk[productIndex] -= jmlBarangKeluar;
                            System.out.println("Barang " + namaBarang + " dengan jumlah = " + jmlBarangKeluar + " keluar.");
                        } else {
                            System.out.println("Barang tidak ditemukan atau stok tidak mencukupi.");
                        }
                        break;

                    case 4:
                        System.out.println("Keluar dari program.");
                        System.out.println("Terima kasih, semoga berhasil di Jobsheet berikutnya!");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar (1/2/3/4).");
                }

            } while (pilihan != 4);
        } else {
            System.out.println("Login gagal. Email atau password salah.");
        }
    }
}
