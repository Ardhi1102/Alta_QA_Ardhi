import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitSspaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Problem_7 {

    public static float cekMean(int[]n){
        float x=0;
        float r;
        for(int i:n){
            x+=i;
        }
        r=x/n.length;
        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah data yang akan dimasukkan: ");
        int bil = input.nextInt();
        int[] m = new int[bil];

        for(int i=0; i<m.length; i++) {
            System.out.print("Input data ke " + (i+1) + ": ");
            m[i] = input.nextInt();
        }
        System.out.print("Rata-Rata dari data tersebut adalah: " + cekMean(m));

    }
}