package day21_Array;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {
        int sayilar[]={5,7,1,5,4,7,9};
        // Arrayi Arrays clasını kullanarak natural
        // (yani sayi ise küçükten büyüğe harf ise harf sırası)
        // sıralı hale getirebiliriz
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
}
