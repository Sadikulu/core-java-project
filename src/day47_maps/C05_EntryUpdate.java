package day47_maps;

import day46_maps.ReusablaeMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        //soyismi can olanların bransını dataScience yapalım
        Map<Integer,String> sinifListMap= ReusablaeMethods.mapOlustur();
        Set<Map.Entry<Integer,String>> entrySeti=sinifListMap.entrySet();
       String entryvalue;
       String[] entryArr;
        for (Map.Entry<Integer,String> entry : entrySeti) {
            entryvalue=entry.getValue();
            entryArr=entryvalue.split(", ");
            if (entryArr[1].equals("Can")){
                entryArr[2]="DataScience";
                entry.setValue(entryArr[0]+", "+entryArr[1]+", "+entryArr[2]);
            }
        }
        System.out.println(sinifListMap);
    }
}
