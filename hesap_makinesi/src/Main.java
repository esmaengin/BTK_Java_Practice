public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        int sonuc = dortIslem.Topla(3, 4);
        System.out.println(sonuc);

        int sonuc2 = dortIslem.Cikar(7, 2);
        System.out.println(sonuc2);

        int sonuc3 = dortIslem.Carp(3, 6);
        System.out.println(sonuc3);

        int sonuc4 = dortIslem.Bolme(8, 2);
        System.out.println(sonuc4);
    }
}
