package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_OrtakElemanlariBulma {
    public static void main(String[] args) {
        //Soru 3:
        //iki String array olusturunuz ve bu array’lerdeki ortak
        // elemanlari Foreach loop kullanarak bulunuz. Sonucu
        // ekrana yazdiriniz.Ortak eleman yoksa ekrana
        // “Ortak eleman yok” yazdiriniz
        String[] arr1={"Ali","Veli","Can","Ayse"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        List<String> ortakIsimler=new ArrayList<>();

        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)) {
                    ortakIsimler.add(each1);
                }
            }
        }
        if (ortakIsimler.size()==0){
            System.out.println("Ortak eleman yok");
        }else{
            System.out.println("her iki arraydeki ortak isimler : "+ortakIsimler);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
