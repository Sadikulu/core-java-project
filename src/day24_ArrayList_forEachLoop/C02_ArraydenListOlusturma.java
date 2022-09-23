package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        içinde 200 tane 1000 küçük pozitif tam sayı olan bir
        list oluşturun kullanıcıdan bir sayi isteyip listede
        var olup olmadığını kullanıcıya yazalım
         */
        Random rnd=new Random();

        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        //System.out.println(sayiListesi);
        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);
        while (!bildiMi){
            System.out.println("lütfen bir sayı tahminide bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("tebrikler : "+tahminSayisi+" adet tahminde listeden bir sayı buldunuz");
                bildiMi=true;
            }else {
                System.out.println(tahminSayisi+" adet sayı söylediniz ama hiç biri listede yok");
                tahminSayisi++;
            }
        }
    }
}
