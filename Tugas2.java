import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = input.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                System.out.println("Menu tersedia: " + menu[i] + " | Harga: Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Maaf, menu \"" + cariMenu + "\" tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] daftarPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            while (true) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String pilihanMenu = input.nextLine();

                int indeksDitemukan = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pilihanMenu)) {
                        indeksDitemukan = j;
                        break;
                    }
                }

                if (indeksDitemukan != -1) {
                    daftarPesanan[i] = menu[indeksDitemukan];
                    hargaPesanan[i] = harga[indeksDitemukan];
                    totalBiaya += harga[indeksDitemukan];
                    break; 
                } else {
                    System.out.println("Menu tidak valid/tidak tersedia! Silakan masukkan ulang sesuai daftar.");
                }
            }
        }

        for (int i = 0; i < daftarPesanan.length; i++) {
            System.out.println((i + 1) + ". " + daftarPesanan[i] + "\t: Rp " + hargaPesanan[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Total Biaya\t: Rp " + totalBiaya);

    }
}