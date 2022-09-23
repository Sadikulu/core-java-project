package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        bir sorunla karşılaşmayı beklediğiniz noktalarda
        if else ile sorunu yakalayıp onunla ilgili çözüm
        üretebilirsiniz
        ama sorunu her zaman if else ile çözemeyeceğimizden
        java try-catch blokları oluşturmuştur
         */
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {

            if (b == 0) {
                System.out.println("işlem yapılırken payda 0 oldu dikkat etmelisin");
            } else {
                System.out.println(a / b);
            }

            b--;
            sayac++;
        }
    }
}
