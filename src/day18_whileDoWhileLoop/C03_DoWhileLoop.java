package day18_whileDoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop da önce kontrol edip sonra işlem yaptığımız için

         */
        int sayi=7;
        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }
        //do-while loop ile çalıştığımızda du dezavantaj ortadan kalkar
        sayi=7;
        do {
            System.out.println(sayi);
        sayi++;
        }while (sayi<10);
    }
}
