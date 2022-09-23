package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        //verilen bir inputu tersine çevirip bize döndüre
        // bir metod oluşturun

        String input="Hey gidi for loop günleri";
        String tersInput=tersineCevir(input);
        System.out.println(tersInput);

    }

    public static String tersineCevir(String input) {
        int sayi=1234;

        StringBuilder sb= new StringBuilder(""+sayi);
       // System.out.println(sb.reverse());
        return sb.reverse().toString();
    }
}
