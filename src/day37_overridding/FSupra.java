package day37_overridding;

public class FSupra extends EToyota {

    void yakit() {
        System.out.println("Supra benzin kullanır");
        /*
        private metodlar overridde edilemezler
        eğer child classta parent classtadi private metod ile
        aynı signuture'da bir metod oluşturursanız
        bu overridding metod olmaz
         */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu javaya bir görev verir
        java bu notasyonla birbirine bağlı olan iki metodu
        sürekli kontrol eder
        eğer parent class'taki overridden metodu silerseniz
        CTE verir

        @Override notasyonu kullanmak mecburi değildir
        eğer Overridding metod silinirse kodun CTE vermesini
        istersek @override notasyonu kullanmalıyız
         */

        System.out.println("Sıralı 6 silindir 2JZ motor kullanır");
    }
}
