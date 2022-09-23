package day27_staticKeyword;

public class C01 {
    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        class variable'de iki tür variable oluşturabiliriz
        static (class) variable
        instance (obje) variable
        staic variable'lar tüm class'tan kullanılabilirken
        instance variable'lar sadece static olmayan metodlardan
        direkt kullanılabilirken
        instance variable'lara static metoddan ulaşmak
        istersek obje oluşturmalıyız

        instance variable'lar obje variable olduğu için herhangi bir
        satırda instance variable'ın değeri ne olduğunu bulmak için
        obje oluşturulan satırdan itibaren kod incelenmelidir

        staic variable'lar class variable olduğu için her hangi bir
        satırd staic variable'ın değerini bulmak için classın
        başından itibaren kod inclenmelidir
         */

        C01 obj1=new C01();
        System.out.println("obj1 rakam değeri : "+obj1.rakam);//5
        System.out.println("obj1 sayi değeri : "+obj1.sayi);//10

        obj1.rakam+=1;
        sayi+=1;
        System.out.println("1 arttırdıktan sonra obj1 rakam değeri : "+obj1.rakam);//6
        System.out.println("1 arttırdıktan sonra obj1 sayi değeri : "+sayi);//11

        C01 obj2 = new C01();
        System.out.println("obj2 rakam değeri : "+obj2.rakam);//5
        System.out.println("obj2 rakam değeri : "+sayi);//11

        obj2.rakam++;
        obj2.sayi++;
        System.out.println("1 arttırdıktan sonra obj2 rakam değeri : "+obj2.rakam);//6
        System.out.println("1 arttırdıktan sonra obj2 sayi değeri : "+obj2.sayi);//12



    }
}
