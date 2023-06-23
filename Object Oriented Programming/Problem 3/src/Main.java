import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Penjumlahan jumlah = new Penjumlahan();
        Pembagian bagi = new Pembagian();
        Pengurangan kurang = new Pengurangan();
        Perkalian kali = new Perkalian();
        char ulangi;
        do {
            System.out.println("\n******Kalkulator Sederhana*******");
            System.out.println("------------------------------------");
            System.out.println("1 - Penjumlahan");
            System.out.println("2 - Pengurangan");
            System.out.println("3 - Perkalian");
            System.out.println("4 - Pembagian");
            System.out.println("------------------------------------\n");

            double bil1;
            double bil2;

            System.out.print("Pilih Nomor Menu: ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1: //penjumlahan
                    System.out.print("Input angka pertama: ");
                    bil1 = input.nextDouble();
                    jumlah.setBil1(bil1);
                    System.out.print("Input angka kedua: ");
                    bil2 = input.nextDouble();
                    jumlah.setBil2(bil2);

                    System.out.print("Hasil Penjumlahan adalah ");
                    System.out.println(jumlah.hasilJumlah());
                    break;

                case 2: //pengurangan
                    System.out.print("Input angka pertama: ");
                    bil1 = input.nextDouble();
                    kurang.setBil1(bil1);
                    System.out.print("Input angka kedua: ");
                    bil2 = input.nextDouble();
                    kurang.setBil2(bil2);

                    System.out.print("Hasil Penjumlahan adalah ");
                    System.out.println(kurang.hasilKurang());
                    break;

                case 3://perkalian
                    System.out.print("Input angka pertama: ");
                    bil1 = input.nextDouble();
                    kali.setBil1(bil1);
                    System.out.print("Input angka kedua: ");
                    bil2 = input.nextDouble();
                    kali.setBil2(bil2);

                    System.out.print("Hasil Penjumlahan adalah ");
                    System.out.println(kali.hasilKali());
                    break;

                case 4://pembagian
                    System.out.print("Input angka pertama: ");
                    bil1 = input.nextDouble();
                    bagi.setBil1(bil1);
                    System.out.print("Input angka kedua: ");
                    bil2 = input.nextDouble();
                    bagi.setBil2(bil2);

                    System.out.print("Hasil Penjumlahan adalah ");
                    System.out.println(bagi.hasilBagi());
                    break;

                default:
                    System.out.println("pilih nomor sesuai menu di atas");
            }
            System.out.println();

            System.out.print("Ingin memilih menu lain (y/t)? ");
            ulangi = input.next().charAt(0);

            System.out.println();
        }
        while (ulangi != 't');
        System.out.print("Kalkulator Mati");
    }
}