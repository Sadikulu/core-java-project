package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {
        //başlangıçtan noktasından sonra bitiş şartına yaklaşmıyorsak
        //sonsuz loop oluşur
        /*hata-1)
        for (int i = 0; i >-10 ; i++) {
            System.out.print(i); } */

        //eğer ilk değer için bile bitiş şartı sağlanmıyorsas
        //for loop çalışır ama loop body hiçbir zaman devreye girmez
        /*hata-2)
        for (int i = 0; i >5 ; i++) {
            System.out.println(i); } */

        //
    }
}
