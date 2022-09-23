package day19_Scope;

public class C01_InstanceVariebles {
    /*
    clas içerisinde her yerde kullanmak istediğiniz variableleri
    class level'de(classın içinde ama metodların dışında)
    genellikle class level variable'ler classın başında oluşturulur(şart değil)

     class level'daki variableler için 2 scope vardır
     1- static variables (class variable de denir)
     2- instance (static olmayan) variables (obje variable de denir)
     */
    int instSayi=20;// static olmayıp class levelde olduğu için instance variabledir


    public static void main(String[] args) {
        int sayi=10;
        /*System.out.println(instSayi);
        instance variable static olmadığı için statik olan main metod'da
        direkt kullanamayız. instance variablelerin diğer adı object variabledir
        dolayısıyla obje oluşturursanız instance variable'ları her yerde kullanabiliriz
        */
        C01_InstanceVariebles obje1=new C01_InstanceVariebles();
        System.out.println("obje1 değişmeden önce : "+obje1.instSayi);//20
        obje1.instSayi=30;
        System.out.println("obje1 değiştikten sonra : "+obje1.instSayi);//30

        C01_InstanceVariebles obje2=new C01_InstanceVariebles();
        System.out.println("obje2 değişmeden önce : "+obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("obje2 değiştikten sonra : "+obje2.instSayi);//25
        C01_InstanceVariebles obje3=new C01_InstanceVariebles();
        System.out.println("obje3 değişmeden önce : "+obje3.instSayi);
        /*
        her obje oluştuğunda intance (obje) variable'sinin ilk atanan değerini alır
         */


    }

    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        bir metodun içinde oluşturulan variable sadece o metodun içinde
        kullanılabilir(local variables)
         */
       /* instSayi
       instance variablelere main metod dışındaki static metodlardanda
       ulaşamayız obje oluşturursak ulaşabiliriz
        */
        C01_InstanceVariebles obje4=new C01_InstanceVariebles();
        System.out.println(obje4.instSayi);
    }

    public void staticOlmayanMethod(){
        System.out.println(instSayi);
        /*
        instance variable'ler clas içrisindeki
        static olmayan metodlarda direkt kullanılabilir
         */

    }
}
