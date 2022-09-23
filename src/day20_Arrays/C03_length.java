package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        //ili şekilde array oluşturabiliriz
        int sayilar[] = {1, 2, 3};

        String harfler[] = new String[4];
        System.out.println("sayilar array'in uzunluğu : " + sayilar.length);//3
        //String length() metodunda parantez var array'de yok
        System.out.println("harfler array'in uzunluğu : " + harfler.length);//4
        System.out.println(Arrays.toString(harfler));//[null, null, null, null]

        // harfler array'in son elementini yazdıralım
        System.out.println(harfler[harfler.length - 1]);//null
        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException



    }
}