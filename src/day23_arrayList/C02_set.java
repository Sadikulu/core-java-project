package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimizde ürünlerin bulunduğu bir liste var
        ürün listesindeki istenen sıradaki ürünü istediğimiz
        yeni ürün ile değiştirip eski ürünü var olan eski ürünler
        listesine ekleyelim
         */
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("İkram");
        urunler.add("Çekirdek");
        urunler.add("Çay");
        List<String> eskiUrunler=new ArrayList<>();
        //listedeki ikramın yerine biskrem koyalım
        //ikramıda eski ürünler listesine ekleyelim
        String yeniUrun="Biskrem";
        String silinecekUrun="İkram";
        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("ürünler listesi : "+ urunler);
        System.out.println("eski ürünler listesi : "+eskiUrunler);



        yeniUrun="Kahve";
        silinecekUrun="Çay";
        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);
        eskiUrunler.add(silinenUrun);
        System.out.println("ürünler listesi : "+ urunler);
        System.out.println("eski ürünler listesi : "+eskiUrunler);

    }
}
