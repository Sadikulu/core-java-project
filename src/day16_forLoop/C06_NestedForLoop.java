package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*bazen tek değişken sorunu çözmeye yetmez
         *
         **
         ***
         ****
         *****
         */
        // üç tane yan yana yıldız yaz
        for (int i = 1; i <= 3; i++) {
            System.out.print("*" + " ");
        }
        // yan yana 4 tane * yazdır
        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            System.out.print("*" + " ");
        }
        System.out.println("");
        // bu tür durumlarda nested loop kullanmak gerekir
        //üstteki sorunun çözümü
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
