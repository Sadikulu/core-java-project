package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hızlıdır?
        bunun için bir String oluşturup 1000 kere sonuna
        . yerleştirelim öncesinde ve sonrasında zamanı alıp
        aradaki farkı bulalım--- aynısını StringBuilder için yapalım
         */
        LocalTime baslangıc=LocalTime.now();
        String str="Ahhh Java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }
        LocalTime bitis=LocalTime.now();
        System.out.println(baslangıc);
        System.out.println(bitis);

        System.out.println("String zaman : "+(bitis.getNano()-baslangıc.getNano()));

        baslangıc=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhh Java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
        bitis=LocalTime.now();
        System.out.println(baslangıc);
        System.out.println(bitis);
        System.out.println("String Builder zaman : "+(bitis.getNano()-baslangıc.getNano()));



    }
}
