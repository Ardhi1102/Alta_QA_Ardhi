import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Alas: ");
        Float alas = input.nextFloat();

        System.out.print("Input Tinggi: ");
        Float tinggi = input.nextFloat();

        Float luas = alas * tinggi/2;
        System.out.println("Luas Segitiga adalah: " + luas);
    }
}