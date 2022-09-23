package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {
    void motor();
    public void yakit();
    public abstract String aku();
    /*
    normal bir class'da olduğumuzu düşünürsek
    iki tane access modifier kullanma ihtimali olmaz

    aşağıdaki metod'da görüleceği gibi interface'de istisnai
    olarak body'si olan metodlar oluşturulabilir
    bu özellik java8'den sonra kullanılmaya başalanmıştır bu
    özellikten önce bir interface yeni bir metod eklememiz gerektiğinde
    eskiden beri bu interface implement eden tüm class'lara gidip
    yeni eklenen metodu override etmemiz gerekirdi

    bu özellik sayesinde başına static veye public keyword ekleyerek
    interface'de yeni ve body'si olan bie metod oluşturursak
    bu metodun başka child classlarda override edilme mecburiyeti olmaz
    ve eskiden implement etmiş class'ları değiştirmek gerekmez

    bu istisnai bir durumdur ve interface için oluşturulan
    genel kuralları bozmaz
    bu metodların body'si olsada bu metodlara concrete metod denmez
    ama override edilme mecburiyeti yoktur
    buradaki default kelimesi access modifier değil
    istisnai durumun belirtilmesi içindir
    o zaman niçin 2 (static ve default) keyword tanımlanmıştır
    bu iki farklı kelimenin amacı child classlardan bu metoda nasıl
    erişileceğini belirlemek içindir
    static keyword kullanılırsa child classlardan bu metoda erişmek
    için interfaceAdi.metodAdı yeterli olur

    default keyword kullanılırsa metoda ulaşmak için obje oluşturulmalıdır
     */
    public default void teker(){
        System.out.println("default...tüm arabaların tekiri vardır");
    }
    public static void direksiyon(){
        System.out.println("static...tüm arabaların direksiyonu vardır");
    }
}
