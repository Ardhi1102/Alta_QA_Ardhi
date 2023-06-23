public class Segitiga {

    int alas;
    int tinggi;

    int a,b;

    public Segitiga(int alas, int tinggi, int a, int b) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.a = a;
        this.b = b;
    }

    public void hitungLuasSegitiga(){
        int luas = alas * tinggi / 2;
        System.out.println(luas);
    }

    public void hitungKelilingSegitiga(){
        int keliling = a + b + alas;
        System.out.println(keliling);

    }
}
