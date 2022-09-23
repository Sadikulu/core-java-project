package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10, 20, 30]
        //listedeki tüm elementleri index kullanmadan 3 arttırın
        for (Integer each:liste
             ) {
            System.out.print(each+3+" ");

        }
        System.out.println("");
        System.out.println(liste);
        /*
        java index yapısı olmayan collection'lardaki elementlere
        ulaşmak veya değiştirmek için iterator interface'sini
        oluşturmuştur

        Iterator interface olduğundan ondan obje üretmemiz mümkün değil
        bunun yerine bize Iterator döndüren liste.iterator metodunun
        kullanırız
         */

        Iterator it1=liste.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//30'dan sonra element kalmadığından next RTE verir
        //Iterator'da geri dönüş yok adım adım sona ulaştıktan sonra
        //başa dönmek isterseniz yeniden bir Iterator oluşturmak gerekir
        Iterator it2=liste.iterator();
        //yeni it2'yi kullanarak listenin tüm elementlerini silelim
        it2.next();
        it2.remove();
        System.out.println(liste);//[20,30]
        it2.next();
        it2.remove();
        System.out.println(liste);//[30]
        it2.next();
        it2.remove();
        System.out.println(liste);//[]iterator ile elementleri gezip remove
                                  //edersek liste kalıcı olarak değişti
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Yeniden liste : "+liste);//[10,20,30]
        Iterator it3 = liste.iterator();
        while (it3.hasNext()) {
            it3.next();
            it3.remove();
        }
        System.out.println("Loop'tan sonra liste : " + liste);//[]
        /*
        görüldüğü gibi iterator kullanarak yapabildiğim
        1-tüm collction elementlerini yazdırmak
        2-tüm collction elementlerini silmek
        bu da bize yetmedi
         */




    }
}
