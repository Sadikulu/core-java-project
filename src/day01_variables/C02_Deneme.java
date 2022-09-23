package day01_variables;

import java.util.Scanner;

public class C02_Deneme {
    public static void main(String[] args) {
        /*double turkiyeNufusu = 81.225;
        System.out.println("Türkiye Nüfüsu="+turkiyeNufusu);
        int koyNufusu= 81256371;
        System.out.println("Köy Nüfusu="+koyNufusu);
        char besinciHarf;
        besinciHarf= 'e';
        System.out.println("Beşinci Harf="+besinciHarf);
        String isminiz, soyIsminiz;
        isminiz="sadik";
        soyIsminiz="ulucay";
        System.out.println("isim="+isminiz);
        System.out.println("soyisim="+soyIsminiz);
        int sayi1,sayi2,toplam;
        sayi1=12;
        sayi2=15;
        toplam=sayi1+sayi2;
        System.out.println("toplam="+toplam);
        int sayi3;
        double sayi4,toplam1;
        sayi3= 15;
        sayi4=12.25;
        toplam1=sayi3+sayi4;
        System.out.println("toplam="+toplam1);
        char ilkAdim;
        ilkAdim='5';
        System.out.println("ilkadım="+ilkAdim);*/

        /*int sayi1=10;
        int sayi2=20;
        System.out.println("swap'tan önce sayi1:"+sayi1+",sayi2:"+sayi2);
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("swap'tan sonra sayi1:"+sayi1+",sayi2:"+sayi2);*/

        /*int sayi1=10;
        int sayi2=20;
        System.out.println("swap'tan önce sayi1:"+sayi1+",sayi2:"+sayi2);
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("swaptan sonra sayi1:"+sayi1+",sayi2:"+sayi2);*/

        Scanner scan=new Scanner(System.in);
        /*System.out.println("lütfen çemberin yarıçapını giriniz");
        double yaricap=scan.nextDouble();
        System.out.println("girdiğiniz yarıçap="+yaricap);
        System.out.println("çemberin çevresi="+2*3.14*yaricap);
        System.out.println("çemberin alani="+3.14*yaricap*yaricap);*/

        /*Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız");
        String isim=scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("isim-soyisim="+isim+" "+soyIsim);*/
        /*Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("ilk harf="+ilkHarf);*/


         //if-else ifadesi
        /*int sayi=20;
        if (sayi<20){
            System.out.println("sayi yirmiden küçüktür");
        }
        else if (sayi==20){
            System.out.println("sayi yirmiye eşittir");

        }else {
            System.out.println("sayi yirmiden büyüktür");
        }*/
        /*int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        if (sayi1>sayi2){
            System.out.println("büyük sayı="+sayi1);
        } else if (sayi2>sayi3) {
            System.out.println("büyük sayi="+sayi2);

        }else{
            System.out.println("büyük sayi="+sayi3);
        }*/
        /*int sayi1=25;
        int sayi2=20;
        int sayi3=22;
        int enBüyük=sayi1;

        if (enBüyük<sayi2){
            enBüyük=sayi2;
        }
        if (enBüyük<sayi3){
            enBüyük=sayi3;
        }
        System.out.println("en büyük="+enBüyük);*/

        //swich-case ifadesi
        /*char not='A';
        switch (not){
            case 'A':
                System.out.println("Mükemmel, Geçtiniz");
                break;
            case 'B':
                System.out.println("İyi, Geçtiniz");
                break;
            case 'C':
                System.out.println("Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef, Kaldınız");
                break;
            default:
                System.out.println("Geçerli Bir Not Giriniz");
        }*/

         //for döngüsü
        /*for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("döngü bitti");*/

        //büyük bir data türünü küçük bir data türüne çevirme
        /*int sayi1=1400;
        byte sayi2=(byte) sayi1;
        System.out.println(sayi2);*/

        //kullanıcıda aldığımız bir sayının basamaklar toplamını bulunuz
        /*System.out.println("lütfen dört basamklı bir tamsayı giriniz");
        int sayı= scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;
        rakam=sayı%10;
        rakamlarToplami+=rakam;
        sayı/=10;
        rakam=sayı%10;
        rakamlarToplami+=rakam;
        sayı/=10;
        rakam=sayı%10;
        rakamlarToplami+=rakam;
        sayı/=10;
        rakam=sayı%10;
        rakamlarToplami+=rakam;
        sayı/=10;
        System.out.println("rakamlar toplamı="+rakamlarToplami);*/








    }
}
