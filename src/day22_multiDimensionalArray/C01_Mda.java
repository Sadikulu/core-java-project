package day22_multiDimensionalArray;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*tek katlı arraylerde arrayi direkt yazdıramıyoruz.
        çünki array non-primitive data türüdür ve her non-primitive
        direkt yazdırılamayabilir
        ancak arrayin içindeki
        elementleri direkt yazdırabiliriz.cünkü genelde primitive data türü ve String
        elemntler kullanılıyordu.

        multi arraylerde en dikkat edeceğimiz konu ulaşmak istediğmiz
        elementin bir array mi yoksa primitive data mı olduğudur
        */
        int sayilar[][]={{1,4,5},{3,4}};
        /*
        burada sayilar arrayini düşünürsek 2 tane inner array var
        sayilar[0]==>{1,2,4,5}
        ancak en içerdeki elementlere ulaşırsak direkt yazdırabiliriz
         */
        System.out.println(sayilar[0]);//[I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0]));//[1,2,4,5]
        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));//[[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 4, 5], [3, 4]]

        /*
        arrayi iki şekilde declare edebiliriz
        1-elemanları direkt yazabiliriz
        int[][] sayilar={{1,4,5},{3,4}};
        2- outtur ve inner arraylerin uzunlukları belirterek oluşturabiliriz
        int[][] sayilar=new int[3][4];
        ancak 2. yöntemle yaptığımızda inner arraylerin farklı uzunlukta
        olma ihtimali kalmaz bu örnek için outer array'in 3 tane inner
        array'i vardir her bir inner array'in ise 4 er elemani
        vardir eger inner arrayleri farkli uzunluklarda
        olusturmak istiyorsaniz mecburen 1. yontemi kullanmalisiniz
         */

    }
}
