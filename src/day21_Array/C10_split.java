package day21_Array;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() bir array metodu değil String metodudur
        ama array döndürdüğü için bu konuda anlatılıyor

        split() ile herhangi bir stringi istediğimiz parçalara bölüp
        bir array haline döndürüyoruz
         */
        String str="Java, ne kadar guzel.";
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        String kelimelerNe[]=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe));

        String kelimelerE[]=str.split("e");
        System.out.println(Arrays.toString(kelimelerE));

        String karakterler[]=str.split("");
        System.out.println(Arrays.toString(karakterler));
    }
}
