package day15_overloading_ForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki, sayıyı çarpıp sonucu bize döndüren method
        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1, sayi2);
        System.out.println("sonuç: "+sonuc);
        
    }

    public static int carpGetir(int sayi1, int sayi2) {

        return sayi1*sayi2;
    }
}
