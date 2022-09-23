package day47_maps;

import day46_maps.ReusablaeMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
       map.contains(key)==> verdiğimiz keyin map'te olup olmadığını
       boolean olarak döndürür
       map.contains(value)==> bir bütün olarak value'nin map'te olup
       olmadığını döndürür
       önemli not= map.contains(value)==> valuenin içindeki bir parçayı
       bulmada işe yaramaz
       eğer value içindeki bir parçayı aratmak istiyorsak
       map üzerinde manipulation yapmamız lazım
       map.get(key) verilen key'e ait değeri döndürür
      */
        Map<Integer,String> sinifListeMap= ReusablaeMethods.mapOlustur();
        System.out.println(sinifListeMap.containsKey(104));//true
        System.out.println(sinifListeMap.containsKey(114));//false
        System.out.println(sinifListeMap.containsValue("Ali, Can, JDev"));
        System.out.println(sinifListeMap.containsValue("JDev"));//false
        //verilen map'te JDev değerlerini JavaDeveloper olarak değiştirelim
        //map'lerde replace tüm value 'yi değiştirmek istersek kullanılabilir
        //kısmi değişikliklerde kullanılamaz
        ReusablaeMethods.tumValueSiraliYazdir(sinifListeMap);
        /*
        mapi güncelleme yapmak için key, yenideğeri mape eklemeliyiz
        örneğin key 101 için value Ali, Can, JDev
        güncelleme için sinifListeMap.put(101,"Ali, Can, JavaDeveloper)
        bunu yapabilmek için herbir key'e ve ona ait value'ye ihtiyacım var
         */
        Set<Integer> keySeti=sinifListeMap.keySet();
        String eachValue;
        for (Integer each:keySeti
             ) {
            eachValue=sinifListeMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifListeMap.put(each, eachValue);
            /*
            biz key'lerin tamamını alıp her bir key'in value'sini getirdik
            value üzerinden değişiklik yapıp yeni halini put(key, yeniDeğer)
            ile map'e koyduk
             */
        }
        System.out.println(sinifListeMap);
    }
}
