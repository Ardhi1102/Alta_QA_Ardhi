import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_5 {

    public static boolean palindrome(String cekPal){
        String save = "";

        for(int i=cekPal.length() - 1; i>=0; i--) {
            save = save + cekPal.charAt(i);
            }

        System.out.println("dibaca dari belakang: " + save);

        return save.equals(cekPal);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input kata: ");
        String cekPal = input.nextLine();


        System.out.println(palindrome(cekPal));

    }
}