import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int hargaTiket=50000, jumlahTiket;
    double totalPenjualan=0;
    String namaPelanggan;

    do {
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }

        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        jumlahTiket = sc.nextInt();
        sc.nextLine();
        
        if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan lagi.\n");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 4 && jumlahTiket <= 10) {
                totalHarga *=0.9; // diskon 10%
                System.out.println("Diskon 10% diterapkan.");
            } else if (jumlahTiket > 10) {
                totalHarga *=0.85; // diskon 15%
                System.out.println("Diskon 15% diterapkan.");
            }

            System.out.println("Total harga untuk " + namaPelanggan + ": Rp " + totalHarga + "\n");

            totalPenjualan += totalHarga; 
        } while (true);

        System.out.println("\nTotal penjualan tiket hari ini: Rp " + totalPenjualan);
    } 
    }

