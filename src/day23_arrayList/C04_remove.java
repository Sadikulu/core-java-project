package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("İkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");
        /*
        remove metodu iki şekilde kullanılır
        1-objeyi yazıp silmesini istersek bize
        boolean sonuç döner
        2-index girersek o indexteki elemanı siler ve bize silinen
         elemanı döndürür
         */
        System.out.println(urunler);//[Nutella, İkram, Çekirdek, Çay]

        System.out.println(urunler.remove("İkram"));//true
        System.out.println(urunler);//[Nutella, Çekirdek, Çay]

        System.out.println(urunler.remove("Hobby"));//false
        System.out.println(urunler);//[Nutella,Çekirdek, Çay]

        //ikinci yöntemi index girelim
        System.out.println(urunler.remove(1));//Çekirdek
        System.out.println(urunler);//[Nutella,Çay]

        //olmayan bir indexi silmeye çalışırsak
        //System.out.println(urunler.remove(3));//IndexOutOfBoundsException


    }
}
