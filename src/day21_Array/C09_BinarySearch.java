package day21_Array;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        /*
        binary search metodu sıralanmış arrayde aradığımız elementin
         indexini döndürür.Aradığımız element arrayde yoksa ?
         (Stringde indexof bize olmayan elemntler için -1 döndürüyordu)

         Aradığımız element arrayde yoksas hem olmadığını hemde olsaydı
         nerede olacağını bize döndürür
         olmadığını ifade içöin - kullanır olsaydı nerede olacağını belirtmek
         için index değil sıralama kullanır
         */
        int sayilar[]={3,7,15,4,27,10};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        //varsa index yoksa -sıra
        System.out.println(Arrays.binarySearch(sayilar,4));//1

        System.out.println(Arrays.binarySearch(sayilar,15));//4

        System.out.println(Arrays.binarySearch(sayilar,11));//-5

        System.out.println(Arrays.binarySearch(sayilar,6));//-3

        System.out.println(Arrays.binarySearch(sayilar,-100));//-1

    }
}
