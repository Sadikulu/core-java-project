package day05_matematikselişlemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=sayi1+1;//sayi2=11
        sayi2+=5;//16 yazar
        /* pre veya post increment sadece ++ ve -- için geçerli
        bu iki işlem önce veya sonra yazılmasına göre farklı iki işlev gerçekleştirir.
        */

        int sayi3=sayi2++;//1-sayi2 değeri sayi3' atanacak
                          //2-sayi2 bir arttırılacak
        /* ++ veya -- variableden sonra olursa buna post increment denir
        bu durumda yapılan iki işlemden artırma veya azaltmaişlemi sonradır.
         */
        System.out.println("sayi3 = " + sayi3);//17 olması gerek ama yanlış 16
        System.out.println("sayi2 = " + sayi2);//17

        int sayi4=++sayi1;//1-sayi1 değeri bir arttırılacak
                          //2-sayi1 değerisayi3' atanacak
        /*eğer ++ veya -- variableden önce ise buna pre increment denir
        bu durumda yapaılan iki işlemden öncelikle olan artırma
        veya azaltmadır
         */
        System.out.println("sayi4 = " + sayi4);//11
        System.out.println("sayi1 = " + sayi1);//11
    }
}
