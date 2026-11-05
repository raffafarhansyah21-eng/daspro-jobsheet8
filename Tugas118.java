import java.util.Scanner;

public class Tugas118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat n = ");
        int n = sc.nextInt();
        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
}