public class kubus {
    int sisi;

    public kubus(int sisi) {
        this.sisi = sisi;
    }

    public void  hitungVolumeKubus(){
        int volume = sisi * sisi * sisi;
        System.out.println(volume);
    }

}
