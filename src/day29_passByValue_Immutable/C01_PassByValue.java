package day29_passByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 elemanlı bir Array oluşturalım ayrı bir metodta
        bu Arrayın 2. ve 4. elemanlarını 100Den küçük
        rastgele bir sayi ile değiştirelimve yeni halini yazdıralım
         */
        int[] arr={5,7,8,10};
        elemanDegistir(arr);
        System.out.println("main metodun içinde diğer metod çalıştıktan sonra : "+Arrays.toString(arr));
    }

    public static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println("metodun içinde : "+Arrays.toString(arr));
    }
}
