package day19_Scope;

public class C02_StaticVariables {
    static int  staticSayi=10;
    String isim="Mehmet";

    static int degersizStataicVar;
    int degersizInstanceVariable;
    /*
    class leveldeki variablelere değer atamasak da java kabul ediyor

     */

    public static void main(String[] args) {
        /*
        bir variable static oluşturulduysa objeler için değil class
        için geçerlidir
         */
        System.out.println(staticSayi);//10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);//20
        /*
        instance bir variablenin değerini bulmak için objenin oluşturulmasından
        itibaren istenen satıra kadar kodu takip etmeliyiz

        static variable'da ise classın en başından başlayarak
        istenen satira kadar kodu tekip edip
        static variable'in son degerini bulmamiz gerekir
         */
    }
    public static void staticMethod(){
        System.out.println(staticSayi);//10

    }
    public void staticOlmayanMethod(){
        System.out.println(staticSayi);//12
        /*
        static variableler class içerisinde her yerden ulaşılabir
        static olsun veya olmasın tüm metodlar static variableleri
        görebilir ve değiştirebilir farklı metodlarda static variablenin
        hangi değeri alacağını bilmek istiyorssak classın başından
        itibaren kodun çalışmasını takip etmeliyiz
        metod ne zaman çağırılırsa o anki static variable değerini
         metodda kullanabiliriz
         */
        staticSayi=20;
    }
}
