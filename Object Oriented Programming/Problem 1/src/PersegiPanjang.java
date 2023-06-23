public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungKelilingPP(){
        int keliling = 2 * (panjang + lebar);
        System.out.println(keliling);
    }
    public void hitungLuasPP(){
        int luas = panjang * lebar;
        System.out.println(luas);
    }

}
