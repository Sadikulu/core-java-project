package day47_maps;

import day46_maps.ReusablaeMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        java entry<K,V> map'in içrisinde bulunan herbir kaydı
        K=V şeklinde tutar
        dolayısıyla herhangi bir entry' ulaştığımızda
        hem key hem de value'ye ulaşabilir ve istediğimiz işlemleri
        yapabiliriz entry.getKey() bize key'i getirir
        entry.getValue() bize value'yu getirir
        entry.setValue() value'yu istedigimiz deger olarak update eder
         */
        Map<Integer,String> siniflistmap= ReusablaeMethods.mapOlustur();
        //map'in herbir elemanı alt alta yazdırın
        Set<Map.Entry<Integer,String>> sinifEntrySet=siniflistmap.entrySet();
        for (Map.Entry<Integer,String> each:sinifEntrySet) {
            System.out.println(each);
        }
        //map'in tüm elemanlarında varsa Tester kurs ismini QA olarak değiştirelim
        String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(siniflistmap);
    }
}
