package day21_Array;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen metod oluşturun
        String sinifListesi[]={"Ali Can","Nida Yücedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayiğit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String yeniSinifListesi[]=new String[sinifListesi.length+1];
        //eski listeden bir eleman fazla uzunlukta yeni array oluşturdum

        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //öncelikle eski listeden elemanları yeni listeye aktardım

        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
       // son index'e eklenecek yeni ismi atadık
        return yeniSinifListesi;
    }
}
