package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
      /*
      Soru 2) Verilen bir array’deki tekrar eden elementleri
      tek bir defa barındıran
      yeni bir array olarak donduren bir method olusturun
       */
        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};
        int[] uniqueArray=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] uniqueArrayOlustur(int[] arr) {
    Arrays.sort(arr);
    List<Integer> benzersizlist=new ArrayList<>();
    //yanındaki elemente eşit olmayanları listeye ekliyor
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1]){
                benzersizlist.add(arr[i]);
            }
        }
        //son elementi kontrol edip yoksa listeye ekliyoruz
        if (!benzersizlist.contains(arr[arr.length-1])){
            benzersizlist.add(arr[arr.length-1]);
        }
        //benzersiz listenin boyutunda bir array oluşturduk
        int[] tekrarsizArr=new int[benzersizlist.size()];
        //listi yeni arraya aktardık
        for (int i = 0; i <tekrarsizArr.length; i++) {
            tekrarsizArr[i]=benzersizlist.get(i);
        }
       return tekrarsizArr;
    }
}
