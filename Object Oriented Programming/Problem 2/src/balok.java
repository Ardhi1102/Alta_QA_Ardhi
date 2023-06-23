public class balok {
     int panjang;
     int alas;
     int tinggi;

    public balok(int panjang, int alas, int tinggi) {
        this.panjang = panjang;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void hitungVolumeBalok(){
        int volume = panjang * alas * tinggi;
        System.out.println(volume);
    }
}
