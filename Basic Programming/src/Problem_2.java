import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Nilai: ");
        Float nilai = input.nextFloat();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Nilai Huruf: A");
        }
        else if (nilai >= 65 && nilai <= 79) {
            System.out.println("Nilai Huruf: B+");
        }
        else if (nilai >= 50 && nilai <= 64) {
            System.out.println("Nilai Huruf: B");
        }
        else if (nilai >= 35 && nilai <= 49) {
            System.out.println("Nilai Huruf: C");
        }
        else if (nilai >= 0 && nilai <= 34) {
            System.out.println("Nilai Huruf: D");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}