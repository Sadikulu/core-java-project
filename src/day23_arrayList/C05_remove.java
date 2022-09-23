package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);
        System.out.println(sayilar);//[5,3,2,1]
        sayilar.remove(1);
        /*
        sayılardan oluşan bir list varsa java remove metodunda
        sayı yazdığımızda direkt index olarak kabul eder
         */
        System.out.println(sayilar);//[5,2,1]
        // illa 5'i silsin istiyorsam
        //silinecek objeyi bir variableye tanımlayabilirim
        Integer sil=5;
        sayilar.remove(sil);
        System.out.println(sayilar);//[2,1]

        //veya indexOf metodundan yardım alırım
        sayilar.remove(sayilar.indexOf(2));
        //2'yi silmek için 2'nin indexisini bulup onu remove'a yazabiliriz
        System.out.println(sayilar);//[1]



    }
}
