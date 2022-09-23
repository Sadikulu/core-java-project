package day12_stringManipulations;

public class C05_subString {
    public static void main(String[] args) {
        //kullanıcıda 4 harfli bir kelime isteyin ve tersten yazdırın
        String input = "Veli";
        String tersInput = input.substring(3)
                + input.substring(2, 3)
                + input.substring(1, 2)
                + input.substring(0, 1);
        System.out.println(tersInput);
    }
}
