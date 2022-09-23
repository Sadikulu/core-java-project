package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /* eğer bir clasın içrisinde herhangi bir hesaplama yapıp
        bunuda kalıcı olarak saklamak istersek kodumuzu
        sade ve anlaşılır tutmak için işlemi
        bir metodda yapıp sunucunu main metoda döndürebiliriz
        bu durumda return type void olmayan bir metodun sonucunu
        main metodta bir variableye atama yaparsak
        programın geri kalanında bu yeni değeri kullanma
        şansımız olabilir*/

        //kullanıcıdan şehir ismini ve doğum tarihini alıp
        //buları programda kullanacağımız formatta bize döndüre metod oluşturun
        //şehir ismini programımızda büyük harf olarak
        // tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz
        String sehir = sehirAl();
        String tarih = tarihAl();
        System.out.println("girdiğiniz şehir: " + sehir);
        System.out.println("girdiğiniz tarih: " + tarih);

    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yil = scan.nextInt();
        if (yil > 1900 || yil < 2100) {
            tarih = yil + "-";
        } else {
            System.out.println("yıl için geçerli bir sayı yazmalısınız(1900-2100)");
        }
        System.out.println("kaçıncı ay olduğunu tamsayı olarak yazınız");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("ay no 1-12 arasında olmalıdır");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";
        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("lütfen ayın kaçıncı günü olduğunu tamsayı olarak giriniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("gün no olarak 1-31 arasında sayı girilmelidir");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;
        } else {
            tarih = tarih + gun;
        }
        return tarih;
    }


    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen şehir adı giriniz");
        String sehirAdi = scan.next().toUpperCase();
        return sehirAdi;
    }
}
