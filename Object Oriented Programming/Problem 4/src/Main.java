import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        do {
            System.out.println("\n*******APLIKASI HITUNG PAKET********");
            System.out.println("----------Input Data Paket----------");
            paketBarang paket = new paketBarang();
            System.out.print("Input panjang (cm): ");
            int panjang = input.nextInt();
            paket.setPanjang(panjang);
            System.out.print("Input lebar (cm)  : ");
            int lebar = input.nextInt();
            paket.setLebar(lebar);
            System.out.print("Input tinggi (cm) : ");
            int tinggi = input.nextInt();
            paket.setTinggi(tinggi);
            System.out.print("Input berat (Kg)  : ");
            int berat = input.nextInt();
            paket.setBerat(berat);
            System.out.println("-------------------------------------");


            System.out.println("\n------------Invoice Paket------------");
            paket.infoPaket();
            System.out.println("-------------------------------------");


            System.out.print("\nIngin memilih menu lain (y/t)? ");
            ulangi = input.next().charAt(0);

            System.out.println();
        }
        while (ulangi != 't');
        System.out.print("Aplikasi Hitung Ongkir Mati");
    }
}