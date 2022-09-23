package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /* verilen inputa göre yıldızlardan oluşan
        bir üçgen oluşturalım
         */
        int input=4;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
