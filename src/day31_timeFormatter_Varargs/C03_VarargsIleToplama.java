package day31_timeFormatter_Varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        //verilen kaç int olursa olsun hepsini
        // toplayıp sonucu yazdıran bir metod oluşturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        tolpaYazdir(sayi1, sayi2, sayi3, sayi4+sayi5);
        tolpaYazdir(sayi1, sayi2, sayi3, sayi4);
        tolpaYazdir(sayi1, sayi2, sayi3);
        tolpaYazdir(sayi1, sayi2);
    }

    public static void tolpaYazdir(int... sayi) {
        /*
        int... sayi bu gösterim int variablelerden oluşan bir
        varargs demektir
        varargs array alt yapısını kullanır
         */
        int toplam=0;
        int adetSayi= sayi.length;
        for (int each:sayi) {
            toplam+=each;
        }
        System.out.println("Girilen " + adetSayi+" sayinin toplami : " + toplam);
    }
}
