package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("İkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");
        System.out.println(urunler.indexOf("İkram"));//1
        System.out.println(urunler);//[Nutella, İkram, Çekirdek, Çay]
        /*
        indexOf() metodu bize bilgi döndüren bir metoddur
        listemizi değiştirmez
         */
        System.out.println(urunler.lastIndexOf("İkram"));//1
        /*
        indexOf metodu ürünü aramaya 0. indexten
        lastIndexOf metodu ise son indexten başlar

        arama bitip ürün bulundupunda ikiside bulunan
        ürünün indexini verir

         */
        urunler.add("İkram");
        System.out.println(urunler);//[Nutella, İkram, Çekirdek, Çay, İkram]
        System.out.println(urunler.indexOf("İkram"));//1
        System.out.println(urunler.lastIndexOf("İkram"));//4
        System.out.println(urunler.indexOf("Tutku"));//-1
        System.out.println(urunler.lastIndexOf("Tutku"));//-1


    }
}
