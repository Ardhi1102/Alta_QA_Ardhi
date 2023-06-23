import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_4 {
    private static boolean primeNumber(int bil){
        if (bil == 1){
            return false;
        }
        for(int i=2; i<bil; i++){
            if(bil % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input bilangan prima: ");
        int bil = input.nextInt();

        System.out.println(primeNumber(bil));
    }
}