package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan sembol [] di
        arraylist de ise <> diamond(elmas) kullanırız
         */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);//[]
        // bir liste eleman eklemek için
        isimler.add("Başak");
        System.out.println(isimler.add("Ayşe"));//true döner
        /*
        Stringde bir metod çalıştırdığımızda assing yapmazsak
        String değişmiyordu
        String isim="Süleyman";
        isim.toUpperCase();//SULEYMAN
        sout(isim)//Süleyman
         */

        System.out.println(isimler);//[Başak,Ayşe]

        /*
        listin tek kötü tarafı array alt yapısını kullanıdğı için
        elemanları birer birer eklemek zorunda olmamızdır
         */


    }
}
