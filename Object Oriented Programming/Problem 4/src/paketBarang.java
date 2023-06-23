public class paketBarang extends ongkosKirim {

    public double hargaKirim() {
        double vol = dimensiPaket();
        double hargaPaket = 0;
        if (vol >= 5 || this.berat >=1){
            double hargaFix = this.berat * 5000;
            return hargaFix;
        }
        return hargaPaket;
    }

    public void infoPaket(){
        double biayaKirim = hargaKirim();

        if (biayaKirim > 0) {
            System.out.println("Berat Paket         : " + this.berat + " Kg");
            System.out.println("Volume Paket        : " + dimensiPaket() + " Cm^3");
            System.out.println("Ongkos kirim paket  : Rp " + hargaKirim());
        }
        else {
            System.out.println("Barang tidak sesuai kriteria, silahkan cek ulang");
        }
    }
}
