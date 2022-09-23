package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*wrapper class javanın hazır metodlarını kullanabilmemiz için
        primitive data türlerinin herbiri için açtığı classlardır.
        int-->Integer
        char-->Character
        diğer primitive data türleri aynı sadece baş harf büyük
         */

        String str="java ile hayat ne güzel";
        System.out.println(str.toUpperCase());

        boolean guzelMi=true;
        // güzelMi, boolean primitive olduğu için hazır meto bulunmuyor.

        Boolean buGüzelMi=true;
        buGüzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);


        String ogrNo="123456";
        // kullanıcıdan bir şifre isteyin
        //eğer şifre sadece rakamlardan oluşursa kabul etme
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir şifre giriniz");
        String sifre= scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen şifre="+sifre);
        System.out.println("integer şifre="+sifreSayi);

        /*wrapper claslar ilerde kullanabileceğimiz pek çok faydalı
        hazır metod içerir.*/

    }
}
