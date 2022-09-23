package day19_Scope;

public class C03_ClassVariables {
    public static void main(String[] args) {
        /*
        farklı bir classta çalışırken her hangi bir class adını
        yazıp noktaya basarsak adını yazdığımız classtaki tüm static class üyelerini
        görebilir ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStataicVar);//0
        /*
        class level variblelere değer atayıp atamamak bize kalmıştır
        istersek değer atarız istemezsek atamayız
        eğer değer atamışsak java atadığımız o değeri kabul eder
        değer atamazsak o zaman java bu variablelere default bir değer ataması yapar
        int --> 0
        String --> null
        boolean --> false
        char --> '' (hiçlik)
         */

        /*
        başka clastaki instance variablelere obje oluşturarak ulaşabiliriz
         */
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        //bu metod içinde staticSayi=20 oldu
        System.out.println(obje1.isim);//Mehmet
        System.out.println(obje1.degersizInstanceVariable);//0

        System.out.println(C02_StaticVariables.staticSayi);//20

        /*
        farklı bir clastan C02 clasından metod ve variableleri kullandığımda
        C02 clasının tamamı değil sadece benim çağırdığım class üyeleri çalışır
         */

    }
}
