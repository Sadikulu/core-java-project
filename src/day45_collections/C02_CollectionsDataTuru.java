package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collection <Data türü> objects seçme durumunda collections
        farklı data türlerinden obje koymaya izin verir
        bu depolama açısından esneklik sağlar fakat işlem yaparken
        tüm objeleri objects tanımladığımızdan data türlerini
        casting yapmak gerekebilir
         */
        List<String> liste=new ArrayList();
        //liste.add(5);
        //liste.add('S');
        //liste.add(true);
        List<Object> list=new ArrayList();
        list.add(5);
        list.add('S');
        list.add(true);
        list.add("Ali");
        System.out.println(list);
        list.set(0,(Integer)list.get(0)+5);
        list.set(3,list.get(3)+" Can");
        list.set(2,!(Boolean)list.get(2));
        System.out.println(list);

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('S');
    }
}
