public class tabung {
    double phi = 3.14;
    int jari;
    int tinggi;

    public tabung(double phi, int jari, int tinggi) {
        this.phi = phi;
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public void hitungVolumeTabung(){
        double volumeTabung = phi * (jari * jari) * tinggi;
        System.out.println(volumeTabung);
    }
}
