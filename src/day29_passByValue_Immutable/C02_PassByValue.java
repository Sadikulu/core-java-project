package day29_passByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element içeren array ve arraylist gibi yapılarda
        passbyvalue geçerlidir.

        eğer metodda array veya listin kendisi değiştirilirse passbyvalue
        özelliği sebebiyle java değişen değeri değil array veya listin
        orijinal değerini alır

        ancak array veya list değiştirilmeden sadece içindeki eleman
        değiştirilirse java obje değişmediği için(referans aynı)
        aynı array veya listi bize döndürür
        ancak içindeki eleman değişmiş olacaktır
         */

        /*
        verilen dört elemanlı bir array'i metoda gönderelim
        metod'da yeni üç elemanlı bir array atayıp bu yeni arraya
        rast gele 100'den küçük üç sayı atayalım
        metodda array'i yazdıralım main metod'da da metod call'den sonra
        yeniden metodu yazdıralım
         */
        int[] arr={3,5,8,10};
        arrayiDegistir(arr);
        System.out.println("metod call'den sonra main metod'da"+Arrays.toString(arr));
    }

    public static void arrayiDegistir(int[] arr) {
        arr=new int[3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println("metodun içinde Array"+ Arrays.toString(arr));

    }
}
