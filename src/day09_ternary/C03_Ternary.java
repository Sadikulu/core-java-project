package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi isteyiniz
        //sayi pozitif ise sayiyi yazdirin
        //sayi sıfır veya negatif ise bir sayi daha isteyin ve ikisinin çarpımınmı yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        if (sayi>0){
            System.out.println(sayi);
        }else{
            System.out.println("lütfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);
        }
        // eger if-else içrisinde yeni kodlar varsa ternary ile
        // yapmamız mümkün olmaz

    }
}
