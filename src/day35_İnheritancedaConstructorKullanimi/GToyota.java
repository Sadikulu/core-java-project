package day35_İnheritancedaConstructorKullanimi;

public class GToyota {

    GToyota(){
        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim){
        //extends olmadığı için super(); consructor call java kabul etmez
        System.out.println("GToyota parametreli cons");
    }
}
