package day11_stringManupulations;

import java.util.Locale;

public class C04_contains {
    public static void main(String[] args) {
         //Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi
        // iceriyorsa tum cumleyi buyuk harf olarak,
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
        String cumle="Java büyük, dunya kucuk";
        cumle=cumle.toLowerCase();
        // requirements'de buyuk harf kucuk harf hassasiyeti
        // hakkında birsey soylenmemis
        // ikinci olarak her iki kelimeyi içerme durumu aciklanmamis
        //böyle durumda görevi bize verene sormak lazım

        //ikisinide içeriyorsa "karar ver büyük mü yazdırayım küçüm mü"

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver büyük mü yazdırayım küçüm mü");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
