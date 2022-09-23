package day48_maps_TheEnd;

import day46_maps.ReusablaeMethods;

import java.util.Map;

public class C02_MapMethodları {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = ReusablaeMethods.mapOlustur();
        ReusablaeMethods.entryyazdir(sinifListMap);
        sinifListMap.clear();
        System.out.println("clear'dan sonra map : " + sinifListMap);
        sinifListMap = ReusablaeMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradığınız key yok"));
        System.out.println(sinifListMap.getOrDefault(110, "Aradığınız key yok"));
        System.out.println(sinifListMap.isEmpty());//false
        sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108, "Aysun, Can, Devops");
        ReusablaeMethods.entryyazdir(sinifListMap);

        /*
        sinifListMap'e key 106 yoksa value "Mevlut, Han, Tester"
        106 daha önceden varsa "eski değeri değiştirmek
        istediğinizden emin misiniz?" yazdıralım

        106 nın olduğunu kontrol için containskey daha mantıklı
        ama biz yeni öğrendiğimiz metod ile yapalım
        map.putIfAbsent(key,value) key varsa ekleme yapmaz
        bize o key ile kayıtlı olan value'yi döndürür
        ==>key daha önceden eklenmemişse eklemeyi yapar ve
        bize null döndürür
         */
        System.out.println(sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester"));
        if (sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester") == null) {
            System.out.println("Kayıt başarılı");
        } else {
            System.out.println("eski değeri değiştirmek istediğinizden emin misiniz?");
        }
        System.out.println(sinifListMap.putIfAbsent(109, "Mevlut, Han, Tester"));
        ReusablaeMethods.entryyazdir(sinifListMap);
        sinifListMap.remove(106);//106'yı silip vize sildiğini döndürür
        sinifListMap.remove(107, "Derya, Cem, Tester");//silerse true silmezse false döndürür
        ReusablaeMethods.entryyazdir(sinifListMap);
        sinifListMap.replace(105,"Erdal, Çiftçi, Tester");
        sinifListMap.put(109,"Cavidan, Eken, JDev");//ikisi aynı işlemi yaptı
        ReusablaeMethods.entryyazdir(sinifListMap);
        System.out.println(sinifListMap.size());


    }
}
