package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java her zaman güzel");
        sb.delete(8,9);
        System.out.println(sb);//Java herzaman güzel

        sb.deleteCharAt(7);
        System.out.println(sb);//Java hezaman güzel

        //baştan baslayarak her loop'da ilk harfi silip kalanı yazdır

        int son=sb.length();

        for (int i = 0; i <son; i++) {
            sb.deleteCharAt((0));
            System.out.println(sb);

        }
    }
}
