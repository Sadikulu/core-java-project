package lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp_02 {
    /*
    1) t->"logic"(t,u) ->"logic"
       bu yapıya "Lambda Expression" denir
    2) Functional_programing kapsamında "Lambda Expression"
       kullanılabilir ama önerilmez
       "Lambda Expression" yerine "Method Reference" tercih edilir
    3) "Method Reference" kullanımı "Class Name :: Method Name"
       Aynı zamanda kendi class'larımızı da kullanabiliriz
       Örneğin bir Animal class'ı var ve bu class "eat() metoduna sahip
       ==>"Animal :: eat şeklinde kullanırız
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdir(liste);
        System.out.println();
        ciftElemanlariYazdir(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKupuCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukMin(liste);
        System.out.println();
        tekrarsizBestenBuyukelemanlarinyarisi(liste);

    }

    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional ve
    // method reference)
    public static void listElemanlariniYazdir(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdir(List<Integer> list) {
        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak
// aynı satırda aralarında boşluk bırakarak yazdıran bir method
// oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını
    // hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        //1.yol
        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Math::addExact);
        System.out.println(toplam);
        //2.yol
        Integer toplam1 = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam1);
        //3.yol
        Integer toplam2 = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0, Integer::sum);
        System.out.println(toplam2);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını
    // hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupuCarpimi(List<Integer> list) {
        //1.yol
        Integer carpim = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println(carpim);
        //2.yol
        Integer carpim1 = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(Math::multiplyExact).get();
        System.out.println(carpim1);
    }

    //7) List elemanları arasından en büyük
    //değeri bulan bir method oluşturun.
    //1.yol
    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
        //2.yol
        Integer max1 = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max1);
    }

    //9) List elemanları arasından 7'den büyük, çift,
    // en küçük değeri bulan bir method oluşturun.
    //1.yol
    public static void yedidenBuyukMin(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.print(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı
    // değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    public static void tekrarsizBestenBuyukelemanlarinyarisi(List<Integer> list) {
        List<Double> sonuc = list.
                        stream().//Gerekli methodları kullanmamızı sağlar
                        distinct().//Tekarlı olanları almaz
                        filter(t-> t>5).//Koşula göre filtreleme yapar
                        map(Utils::yarisiniAl).//Her bir elemanın değerini değiştirmeye yarar
                        sorted(Comparator.reverseOrder()).//Sıralama yapar
                        collect(Collectors.toList());//Elamanları collection'a çevirir.
        System.out.println(sonuc);
    }
}

