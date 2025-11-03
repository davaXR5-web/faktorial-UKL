import java.util.Scanner;

public class f1aktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Penghitung Faktorial ===");
        System.out.print("Masukkan sebuah bilangan bulat positif: ");
        if (input.hasNextInt()) {
            int bilangan = input.nextInt();
            long faktorial = 1;
            if (bilangan == 0) {
                System.out.println("Faktorial dari 0 adalah 1.");
            } else {
                for (int i = 1; i <= bilangan; i++) {
                    faktorial = faktorial * i;
                }
                System.out.println("\n-------------------------------------");
                System.out.println("Faktorial dari " + bilangan + " (" + bilangan + "!) adalah: " + faktorial);
                System.out.println("-------------------------------------");
            }
        }

        input.close();
    }
}