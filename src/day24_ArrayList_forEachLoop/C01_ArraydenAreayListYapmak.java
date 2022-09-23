package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenAreayListYapmak {
    public static void main(String[] args) {
        String[] arr={"Ismail","Nurullah","Fatih"};
        /*
        uzun listeler oluşturmamız ferektiğinde
        tek tek eklemek yerine array oluşturup bunları
        liste çevirmek daha pratik olur
         1-loop ile arraydeki tüm elemanları liste atabiliriz
         2-array.asList() kullanabiliriz
         ancak bu metodun 2 tane kötü yan etkisi vardır
         -Arrays class'i kullanildigi icin array ozellikleri gecerli olur
          dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
          bu sekilde olusturulan list'lerde kullanilamaz
         -kaynak olan array ile ürün olan list özdeşleştirilir
         birinde yapılan değişiklik otomatik olarak diğerinede işlenir
         */

      List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail,Nurullah,Fatih]

          //1.yan etki
         //sinifList.add("Erdi");//UnsupportedOperationException
        // sinifList.remove(1);//UnsupportedOperationException

        //2.yan etki
        arr[1]="Emre";
        System.out.println("değişim sonrası array : "+Arrays.toString(arr));
        System.out.println("arrayi değiştirince list : "+sinifList);

        sinifList.set(0,"Utku");
        System.out.println("listi değiştirince list : "+sinifList);
        System.out.println("listi değiştirince array : "+Arrays.toString(arr));



    }
}
