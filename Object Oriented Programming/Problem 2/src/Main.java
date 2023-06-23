import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n******Hitung Volume*******");
        System.out.println("------------------------------------");
        System.out.println("1 - Kubus");
        System.out.println("2 - Balok");
        System.out.println("3 - Tabung");
        System.out.println("------------------------------------\n");

        System.out.print("Pilih Nomor Menu: ");
        int pilih = input.nextInt();

        switch (pilih){
            case 1: //Kubus
                System.out.print("Input sisi kubus: ");
                int sisiKubus = input.nextInt();

                kubus Kubus = new kubus(sisiKubus);
                System.out.print("Volume kubus adalah: ");
                Kubus.hitungVolumeKubus();
                break;

            case 2: //Balok
                System.out.print("Input panjang balok: ");
                int panjangBalok = input.nextInt();

                System.out.print("Input lebar balok: ");
                int lebarBalok = input.nextInt();

                System.out.print("Input tinggi balok: ");
                int tinggiBalok = input.nextInt();

                balok Balok = new balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.print("Volume balok adalah: ");
                Balok.hitungVolumeBalok();
                break;

            case 3://Tabung
                double phi = 3.14;

                System.out.print("Input jari - jari tabung: ");
                int jariTabung = input.nextInt();

                System.out.print("Input tinggi Tabung: ");
                int tinggiTabung = input.nextInt();

                tabung Tabung = new tabung(phi, jariTabung, tinggiTabung);
                System.out.print("Volume tabung adalah: ");
                Tabung.hitungVolumeTabung();
                break;

            default:
                System.out.println("pilih nomor sesuai menu di atas");
        }
    }
}