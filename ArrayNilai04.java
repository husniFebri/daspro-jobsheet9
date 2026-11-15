import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        int i = 1;
        int lulus = 0;
        int gagal = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                System.out.println("Mahasiswa ke-" + i + ": " + nilai + " (LULUS)");
                lulus++;
            } else {
                gagal++;
            }
            i++;         
        }
        System.out.println("Jumlah mahasiswa lulus = " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = " + gagal);
    }
}
