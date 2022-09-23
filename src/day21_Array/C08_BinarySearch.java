package day21_Array;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        binarysearch javada eleman aramanın kısa yoludur
        ancak binarysearchün çalışması için önce arrayin sıralı
        hale getirilmesi gerekir. Eğer sıralama yapmadan binarysearch
        yaparsanız sonucu bulmaya bilir veya yanlış bulabilir
         */
        String harfler[]={"Y","B","D","G","O","A"};
        String arananHarf="Y";
        Arrays.binarySearch(harfler,arananHarf);
        System.out.println(Arrays.binarySearch(harfler,arananHarf));


        //binarySearch bize aradığımız elemanın index'ini döndürür

       //Array sıralı olmadığı için arama sonucunu doğru bulamaya
        //bilir emin olmak için önce sort yapmalıyız
        Arrays.sort(harfler);
        Arrays.binarySearch(harfler,arananHarf);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println( C03_Contains.contains(harfler,arananHarf));
    }
}
