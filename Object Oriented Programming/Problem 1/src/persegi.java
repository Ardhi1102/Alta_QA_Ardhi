public class persegi {
    int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }

    public void hitungLuasPersegi(){
        int luas = sisi * sisi;
        System.out.println(luas);
    }
    public void hitungKelilingPersegi(){
        int keliling = 4 * sisi;
        System.out.println(keliling);
    }
}
