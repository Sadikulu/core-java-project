package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println("listenin boyutu : "+sayilar1.size());//3
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);//[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println(sayilar1);//[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("listenin yeni boyutu : "+sayilar1.size());//8

        sayilar1.set(2,8);
        System.out.println(sayilar1);//[5, 3, 8, 2, 5, 3, 2, 2]
        System.out.println(sayilar1.set(0,12));//5
        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2]
/*
set metodu istenen indexteki eski elemanı silip yerine
yeni elemanı set eder(atar)

eğer eski eleman silmek istemiyorsak
add(index,değer); metodunu kullanırız

set() metodu sildiği eski elemanı bize döndürür
 System.out.println(sayilar1.set(0,12));//5
 */
    }
}
