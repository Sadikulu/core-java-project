package day10_stringmanipulation;

import java.util.Locale;

public class C02_toLoverCase_toUpperCase {
    public static void main(String[] args) {
        String str="Beni psikopata baglamayin";
        System.out.println(str.toUpperCase());//normalde ing klavyede BENI PSIKOPATA BAGLAMAYIN yazar
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        /*eğer büyük küçük harf değişiminde local bir dili
        esas almak isterseniz bu metod kullanılabilir*/

    }
}
