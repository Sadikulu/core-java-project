package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        //  Soru 6) Kullanicidan bir sifre girmesini isteyin.
        //  Asagidaki sartlari sagliyorsa
        //  "Sifre basari ile tanimlandi", sartlari saglamazsa
        //  "Islem basarisiz, Lutfen yeni bir sifre girin" yazdirin
        //ve başarılı şifre girinceye kadar şifre girmesini isteyin
        //  Ilk harf buyuk harf olmali
        //  Son harf kucuk harf olmali
        //  Sifre bosluk icermemeli
        //  Sifre uzunlugu en az 8 karakter olmali
        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;

        while (!sifreBasariliMi){
            //kullanıcıda bir sifre alalım
            System.out.println("lütfen bir sifre giriniz");
            sifre=scan.nextLine();
            //4 kontrolü yapalaım her geçen kontrol için kontrol bir artsın
            //ilk harf kontrol
            if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
                kontrol++;
            }else{
                System.out.println("Ilk harf buyuk harf olmali");
            }
            //son harf kontrol
            if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else{
                System.out.println("Son harf kucuk harf olmali");
            }
            // boşluk kontrolu
            if (sifre.contains(" ")){
                System.out.println("sifre bosluk içermemeli");
            }else{
                kontrol++;
            }
            //sifre uzunluk kontrolü
            if (sifre.length()>=8){
                kontrol++;
            }else{
                System.out.println("sifre en az 8 karakter olmalı");
            }
            if (kontrol==4){//tüm kontrollerden geçti
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi=true;
            }else{//sifre başarısız
                //tekrar başadönecek
                //kontrol variablesi sıfırlanmalı
                kontrol=0;
            }
        }
    }
}
