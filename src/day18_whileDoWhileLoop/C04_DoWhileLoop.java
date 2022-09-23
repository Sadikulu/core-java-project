package day18_whileDoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan tam sayılar alın
        kullanıcı çift sayı girdiği müddetçe sayıları yazdırın
        tek sayı girdiğinde işlemi bitirin
         */

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        //whileloop ile yapalım
        //looplarda kullanacagımız variableleri looptan öne oluşturmalıyız
        // whileloop'da loop'tan önce oluşturduğumuz bu variableye
        // atayacağımız değeri iyi düşünmemiz gerekir
       /* while (sayi%2==0){
            System.out.println("lütfen bir sayı giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayı çift : "+sayi);
            }

        }*/

        //do-while ile
        //do-while loop'ta önceden oluşturulan variableye hangi değer
        //atandığının hiç bir önemi yok kodumuz her durumda çalışır
        /*
         do-while'nin dez avantajı ilk çalıştırma kontrol yapılmadan
         olduğu için loop'un badysinde yanlış bir işlem
         yapılmamasına dikkat etmek gerekir
         */
        do {
            System.out.println("lütfen bir sayı giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("girilen sayı çift : " + sayi);
            }
        }while (sayi%2==0);
    }
}
