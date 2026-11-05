import java.util.Scanner;

public class Rectangle18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris = ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom = ");
        int kolom = sc.nextInt();

        for (int j = 1;j <= kolom; j++) {
            System.out.print("*");
        }

        sc.close();
    }
}