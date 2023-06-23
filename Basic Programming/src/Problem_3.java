import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Bilangan: ");
        int bil = input.nextInt();

        System.out.print("Faktor Bilangan dari " + bil + " adalah: ");
        for(int i=1; i<=bil; i++){
            if(bil%i==0){
                System.out.print(i + " ");

            }
        }
    }
}