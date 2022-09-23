package lambda_functional_programing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp_01 {
    public static void main(String[] args) {
     /*
     1)Lambda (Functional Programming) Java8 ile kullanılmaya başlanmıştır
     2)Functional Programming'de "Ne yapılacak"(What to do) üzerine
     yoğunlaşılır. Structured programming "Nasıl yapılacak"(How to do) üzerine
     yoğunlaşır
     3) Functional Programming, Arrays ve Collections ile kullanılır.
     4)"entrySet() metodu ile Map, Set'e dönüştürülerek Functional
     Programming'de kullanılabilir



      */
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
        //1) Ardışık list elementlerini aynı satırda aralarında
        // boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupuCarpimi(liste);
        System.out.println();
        getMaxEleman(liste);
        System.out.println();
        getMaxEleman01(liste);
        System.out.println();
        getMinEleman(liste);
        System.out.println();
        yedidenBuyukMin(liste);
        System.out.println();
        yedidenBuyukMin1(liste);
        System.out.println();
        yedidenBuyukMin2(liste);
        System.out.println();
        tekrarsizBestenBuyukelemanlarinyarisi(liste);



    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (int w : list
        ) {
            System.out.print(w + " ");
        }
    }

    //1) Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
        //stream() metodu collectiondan elementleri akışa dahil etmek
        // için ve metodlara ulaşamak için kullanılır
    }

    //2)Çift sayı olan list elemanlarını aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2)Çift sayı olan list elemanlarını aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda
    // aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //elemanların değerleri değişecekse map() metodu kullanılır
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak
    // aynı satırda aralarında boşluk bırakarak yazdıran bir method
    // oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını
    // hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        Integer toplam=list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını
    // hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupuCarpimi(List<Integer> list) {
        Integer carpim=list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t*t*t).reduce(1,(t,u)-> t*u);
        System.out.print(carpim);
    }

    //7) List elemanları arasından en büyük
    //değeri bulan bir method oluşturun.
    //1.yol
    public static void getMaxEleman(List<Integer> list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.print(max);
    }
    //2.yol
    public static void getMaxEleman01(List<Integer> list){
        Integer max=list.stream().distinct().sorted().reduce(list.get(0),(t,u)->u);
        System.out.print(max);
    }

//Ödev
    //8)List elemanları arasından en küçük
    // değeri bulan bir method oluşturun.(2 Yol ile)
    public static void getMinEleman(List<Integer> list){
        Integer min=list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.print(min);
        System.out.println();
        Integer min2=list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(list.get(0),(t,u)->u);
        System.out.print("min2: " + min2);
    }

    //9) List elemanları arasından 7'den büyük, çift,
    // en küçük değeri bulan bir method oluşturun.
    //1.yol
    public static void yedidenBuyukMin(List<Integer> list) {
        Integer min=list.stream().distinct().filter(t -> t>7 ).filter(t->t% 2 == 0).reduce(list.get(0),(t,u)->t<u?t:u);
        System.out.print(min);
    }
    //2.yol
    public static void yedidenBuyukMin1(List<Integer> list) {
        Integer min=list.stream().distinct().filter(t -> t>7 && t% 2 == 0).sorted(Comparator.reverseOrder()).reduce(list.get(0),(t, u)->u);
        System.out.print(min);
    }
    //3.yol
    public static void yedidenBuyukMin2(List<Integer> list) {
        Integer min=list.stream().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst().get();
        System.out.print(min);
    }

    //10) Ters sıralama ile tekrarsız ve 5'ten
    // büyük elemanların yarı değerlerini
    // (elamanın ikiye bölüm sonucunu) bulan bir
    // method oluşturun.
    public static void tekrarsizBestenBuyukelemanlarinyarisi(List<Integer> list) {
        List<Double> sonuc=list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);
    }
}