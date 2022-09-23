package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*verilen Stringi aşağıdaki gibi yazdıran
        bir program yazınız
        input=deniz;
        d
        de
        den
        deni
        deniz
         */
        String input="deniz";
        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));//ilk harf için substring(0,1) olmalı

            }
            System.out.println("");
        }
    }
}
