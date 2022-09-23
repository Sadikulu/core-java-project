package day29_passByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        bir list oluşturalım iki ayrı metod'dan birinde sadece elemanları değiştirelim
        diğernde yeni bir list atayıp aynı sayıda eleman ekleyelim
        ve her iki metod callden sonra kendi listemizi main metod
        içerisinde kontrol edelim
         */
        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        System.out.println("ilk başta list : " + list);//Ali,Veli,Can
        elemanlarıDeğiştir(list);
        System.out.println("elemanları değiştir metodundan sonra : " + list);//Oğuz,Murat,Fatih
        listDeğiştir(list);
        System.out.println("list değiştir metodundan sonra : " +list);//Oğuz,Murat,Fatih
    }

    public static void listDeğiştir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Çay");
        list.add("Çokokrem");
        System.out.println("List değiştir metodunda : " + list);//Nutella,Çay,Çokokrem
    }

    public static void elemanlarıDeğiştir(List<String> list) {
        list.set(0, "Oğuz");
        list.set(1, "Murat");
        list.set(2, "Fatih");
        System.out.println("eleman değiştir metodunda : " + list);//Oğuz,Murat,Fatih
    }
}
