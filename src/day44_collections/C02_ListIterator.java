package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println(liste);
        //sondan başa gitmek için önce sona gitmek lazım
        ListIterator li1=liste.listIterator();
        while (li1.hasNext()) {
            li1.next();
        }
        //bu loop bizi sona götürür
        while (li1.hasPrevious()){
            System.out.print(li1.previous()+" ");

        }

    }
}
