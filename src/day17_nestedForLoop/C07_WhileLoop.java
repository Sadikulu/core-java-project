package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20den 50 ye kadar çift sayıları yazdıralım
        int bas=10;
        int bitis=50;

        for (int i = bas; i <=bitis ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("\n");
        int temp=bas;
        while (temp<=bitis){
            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
    }
}
