package day10_stringmanipulation;

public class C05_length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());// str'nin karakter sayısını verir 19
        System.out.println(str.charAt(str.length() - 1));// son karakteri verir "p"
        System.out.println(str.charAt(str.length() -3));//sondan üçüncü karakter "k"
        /*java'da null pointer(işaretleyici) bir değer değil,
        karşısına yazıldığı variablenin hiçbir değer almadığının işaretçisidir*/
        String str2="";// str2'ye bir değer atanmıştır bu değer hiçliktir
        System.out.println(str2.length());
        String str3=null;// str3'e bir değer atanmamıştır
                         // null değer atamamayı işaret etmektedir
        System.out.println(str3.length());// bir değer atanmadığı için
                                          //NullPointerException hatası verir

    }
}
