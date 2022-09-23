package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;
        /*
        System.out.println(str);
        Değer ataması yapmadan bir variable'yi kullanmaya çalışırsanız
        java compile time'da bunu fark eder ve izin vermez
         */
        str=null;
        //System.out.println(str.length());
        //NullPointerException

        Object obj ="Java Java Java";
        Integer sayi=(Integer) obj;//ClassCastException
        /*
        String str2 ="Hava Civa";
        Integer sayi2=str2;
        java bazı casting işlemlerine compile time'da izin vermez

        ancak bazen syntax uygun olabilir
        bu durumda java kodun çalışmasına itiraz etmez
        */
        Thread.sleep(5000);

    }
}
