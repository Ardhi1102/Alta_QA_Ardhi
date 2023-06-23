import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_6 {

    public static void draw(int sisi){
        int k = 0;
        for (int i=1; i<=sisi; i++){
            for(int j=1; j<=sisi; j++){
                k++;
                if(k %3 == 0){
                    System.out.print(" X ");
                }
                else if(k %2 == 0){
                    System.out.print(" Z ");
                }
                else{
                    System.out.print(" Y ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input sisi: ");
        int sisi = input.nextInt();

        draw(sisi);

    }
}