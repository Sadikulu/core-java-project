package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {
            /*
            try bloğu yapmaya çalıştığımız ama risk olduğunu
            düşündüğümüz işlemleri yazmak için kullanılır

            catch'den sonraki parantez karşılaşmayı bekleediğimiz
            exception türünü javaya söylemek için kullanılır

            catch bloğu java söylediğimiz exception(istisna)
            gerçekleşirse javanın yapmasını istediğimiz işlem

            catch bloğunun önündeki paranteze karşılaşmayı
            beklediğimiz exception'u yazabilir veya her türlü
            exception da devreye girmesini istiyorsak tüm exception'ların
            parenti olan Exception yazabiliriz
             */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }

            b--;
            sayac++;
        }
    }
}
