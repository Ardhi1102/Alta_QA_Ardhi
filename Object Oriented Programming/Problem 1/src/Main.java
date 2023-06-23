import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n******Hitung Keliling dan Luas*******");
        System.out.println("------------------------------------");
        System.out.println("1 - Persegi");
        System.out.println("2 - Persegi Panjang");
        System.out.println("3 - Segitiga");
        System.out.println("------------------------------------\n");

        System.out.print("Pilih Nomor Menu: ");
        int pilih = input.nextInt();

        switch (pilih){
            case 1: //persegi
                System.out.println("1 - Keliling");
                System.out.println("2 - Luas");

                System.out.println();
                System.out.print("Pilih Nomor Menu: ");
                int pilih2 = input.nextInt();

                System.out.print("input sisi persegi: ");
                int sisiPersegi = input.nextInt();
                persegi Persegi = new persegi(sisiPersegi);


                switch (pilih2){
                    case 1: //keliling
                        System.out.print("Keliling persegi adalah: ");
                        Persegi.hitungKelilingPersegi();
                        break;
                    case 2: //luas
                        System.out.print("Luas persegi adalah: ");
                        Persegi.hitungLuasPersegi();
                        break;
                }
            break;

            case 2: //PersegiPanjang
                System.out.println("1 - Keliling");
                System.out.println("2 - Luas\n");

                System.out.println();
                System.out.print("Pilih Nomor Menu: ");
                int pilih3 = input.nextInt();

                System.out.print("input panjang PP: ");
                int panjangPP = input.nextInt();
                System.out.print("input lebar PP: ");
                int lebarPP = input.nextInt();
                PersegiPanjang persegipanjang = new PersegiPanjang(panjangPP, lebarPP);


                switch (pilih3){
                    case 1: //keliling
                        System.out.print("Keliling PP adalah: ");
                        persegipanjang.hitungKelilingPP();
                        break;
                    case 2: //luas
                        System.out.print("Luas persegi adalah: ");
                        persegipanjang.hitungLuasPP();
                        break;
                }
            break;

            case 3:
                System.out.println("1 - Keliling");
                System.out.println("2 - Luas\n");

                System.out.println();
                System.out.print("Pilih Nomor Menu: ");
                int pilih4 = input.nextInt();

                System.out.print("input alas segitiga: ");
                int alasSegitiga = input.nextInt();
                 System.out.print("input tinggi segitiga: ");
                int tinggiSegitiga = input.nextInt();
                System.out.print("input sisi A segitiga: ");
                int sisiA = input.nextInt();
                System.out.print("input sisi B segitiga: ");
                int sisiB = input.nextInt();
                Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga,sisiA, sisiB);

                switch (pilih4){
                    case 1: //keliling
                        System.out.print("Keliling Segitiga adalah: ");
                        segitiga.hitungKelilingSegitiga();
                        break;
                    case 2: //luas
                        System.out.print("Luas Segitiga adalah: ");
                        segitiga.hitungLuasSegitiga();
                        break;
                }
            break;

            default:
                System.out.println("pilih nomor sesuai menu di atas");
        }
    }
}