import java.util.Scanner;

public class Tugas318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbaik = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("--- Toko " + i + " ---");
            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah barang yang dibeli pelanggan " + j + ": ");
                int barangPelanggan = sc.nextInt();
                totalBarangToko += barangPelanggan; // Akumulasi barang per toko
            }

            totalBarangSeluruhToko += totalBarangToko; // Akumulasi seluruh toko

            System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            // Mencari toko dengan barang terbanyak (jika sama, pilih nomor lebih kecil menggunakan operator >)
            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbaik = i;
            }
        }

        System.out.println("========================================");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        sc.close();
    }
}
 