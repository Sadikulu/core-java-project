package day15_overloading_ForLoop;

public class C05_forLoop {
    public static void main(String[] args) {

        //1'den 5'e kadar olan tam sayıları topla
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam : " + toplam);

        //10 dahil 20 dahil aradaki sayıları topla
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;

        }
        System.out.println("10-20 arası toplam = " + toplam);

        //30 dahil 50 dahil aradaki çift sayılar topla
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;

        }
        System.out.println("30-50 arası çit sayıların toplamı = " + toplam);
        //2.yöntem
        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arası çift sayıların toplamı = " + toplam);

    //1500 ile 1600(sınırlar dahil) arasında 7 ile bölünen sayıların toplamı
        toplam=0;
        for (int i = 1500; i <=1600 ; i+=7) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500-1600 7 ile bölünen sayılarıntoplamı = " + toplam);


    }
}
