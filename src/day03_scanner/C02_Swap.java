package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("swapten önce sayi1=" + sayi1 + ",sayi2=" + sayi2);
        int sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;
        System.out.println("swapten sonra sayi1=" + sayi1 + ",sayi2=" + sayi2);


    }
}
