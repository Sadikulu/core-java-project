package day15_overloading_ForLoop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5, 7);//12
        topla(5.2,3);//8.2
        topla(3.4,6.1);//9.5
        topla(5,6.2);//11.2
        topla(3,4,5);//12

    }
    /*java hangi metodun çalışacağına karar verirken optimizasyon
    yapar. eğer hiç casting(dönüştürme) yapmadan kullanacağı metod varsa onu
    kullanır. eğer hiç casting yapmadan kullanacağı bir metod yoksa
    en az casting yapacağı metodu tercih eder*/

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integerin toplamı: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integerin toplamı: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki doublenin toplamı: " + (sayi1 + sayi2));
    }
    public static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("üç integerin toplamı: " + (sayi1 + sayi2+sayi3));
    }
}
