package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler);
        /*
        list ile gelen sort metodunda sıralama özelliğini
        girmek gerekiyor. bunun yerine Collections clasından
        sort metodunu kullanıyoruz bu metod listemizi
        natural(String ise harf sırası rakam ise küçükten büyüğe) sıralar
         */



    }
}
