package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        /*
        verilen bir String'deki kullanılan harfleri ve kullanılan
        harflerin tekrar sayisini H=20 şeklinde yazdırın
         */
        String str="Heeeeellllooooo Woooorrrrllllllddddd";
        //space'leri saymaması için onları silelim
        str=str.replaceAll("\\W","");
        String[] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //harfleri key, kullanım adedi value yaparak bir map oluştur
        Map<String,Integer> harfKullanimSayilariMap=new HashMap<>();
        int harfKullanimSayisi;
        for (String each:harflerArr) {
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each,1);
            }else {
             harfKullanimSayisi=harfKullanimSayilariMap.get(each);
             harfKullanimSayilariMap.put(each,++harfKullanimSayisi);
            }
        }
        System.out.println(harfKullanimSayilariMap);
    }
}
