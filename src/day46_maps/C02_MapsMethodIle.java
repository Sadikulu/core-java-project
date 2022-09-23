package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= ReusablaeMethods.mapOlustur();

        //value'leri sıra numaralı olarak yazdırın
        ReusablaeMethods.tumValueSiraliYazdir(ogrenciMap);

        //isim ve soyisimlerin birlikte olacağı bir liste oluşturun
        List<String> sinifIsimSoyisimList=ReusablaeMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim ve soyisim listesi : "+sinifIsimSoyisimList);


    }
}
