package day46_maps;

import java.util.*;

public class C01_Maps {
    public static <Maps> void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");
        System.out.println(sinifList);
        System.out.println(sinifList.keySet());//[101,102,103,104]
        System.out.println(sinifList.values());//[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size());//4
        //tüm öğrencilerin isim ve soyisimlerini alt alta yazdırın
        Collection<String> tumValueColl=sinifList.values();
        String[] eachArr;
        int sira=1;
        for (String each:tumValueColl) {
            //buradaki each bize herbir öğrenciye ait
            //aynı yapıdaki isim, soyisim, branş bilgilerini içeren
            //Stringler getiriyor
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
        }

        //mapta bulunan öğrencilerin isim ve soyisimlerini
        //birleştirerek bir sınıf listesi oluşturun
        List<String> sinifIsimSoyisimList = new ArrayList<>();
        for (String each:tumValueColl) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);
        }
        System.out.println(sinifIsimSoyisimList);


    }
}
