package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //verilen bir arraydeki tekrar eden elementleri
        //silip tekrarsız arraya atayan bir code yazınız

        int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekarasizSet=new HashSet<>();
        for (int each:arr) {
            tekarasizSet.add(each);}
        System.out.println("Set : "+tekarasizSet);
        int[] tekrarsizArray = new int[tekarasizSet.size()];
        int i=0;
        for (int each:tekarasizSet) {
            tekrarsizArray[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(tekrarsizArray));
        arr=tekrarsizArray;
        System.out.println("Bizim arrayin son hali : " + Arrays.toString(arr));

    }
}
