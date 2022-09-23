package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedListListDataTuru {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();

        List<String> ll2=new LinkedList();

        Queue<String> ll3=new LinkedList();

        Deque<String> ll4=new LinkedList();

        ll2.add("Berk");
        ll2.add("Döne");
        ll2.add("Enes");
        ll2.add("Ayşe");
        System.out.println(ll2);//[Berk,Döne,Enes,Ayşe]
        System.out.println(ll2.remove(3));//Ayşe
        //eğer listemiz integer elemntlerden oluşuyorsa
        //direkt sayı yazarsak index olarak kabul eder
        //bir variable'ye atama yapar ve rmove'de o variable
        //ismni yazarsak obje olarak kabul eder ve siler
        System.out.println(ll2.remove("Kemal"));//false
        ll2.set(1,"Serap");
        ll1.add("Berk");
        ll1.add("İsmail");
        System.out.println(ll1);//[Berk,İsmail]
        ll2.retainAll(ll1);//ll2'deki tüm elementleri ll1 ile karşılaştırır
                           //ll1'de olmayanları siler
        System.out.println(ll2);//[Berk]

        System.out.println(ll2.hashCode());//2066939 referans


    }
}
