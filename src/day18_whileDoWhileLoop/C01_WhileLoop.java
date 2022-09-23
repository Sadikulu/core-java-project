package day18_whileDoWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
       /*Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        while (temp<=sonHarf){
            String buyult=(temp+"").toUpperCase();
            System.out.print(buyult+" ");
            temp++;
        }
    }
}
