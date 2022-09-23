package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();
        //arraydeki tüm elemanları inceleyip tek sayi olanları
        //liste atalım
        for (int each:arr   //gelecek dataların türü loop içinde ne isim verdiğim ve nerede aldığım
             ) {
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
