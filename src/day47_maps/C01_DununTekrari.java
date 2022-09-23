package day47_maps;

import day46_maps.ReusablaeMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= ReusablaeMethods.mapOlustur();
        System.out.println(sinifListMap);

        //öğrenci listesini isim ve soyisim olarak yazdırın
        ReusablaeMethods.tumValueSiraliYazdir(sinifListMap);

        //kaç farklı branş varsa branşIsmi=branstakiOgrenciSayisi
        //şeklinde yazdırın
        ReusablaeMethods.bransOgrenciSayisiYazdir(sinifListMap);

    }
}
