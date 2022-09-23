package day07_IfStatement;

public class C03_BasitIfStatements {
    public static void main(String[] args) {
        /*bir if statement'te {} kullanılmazsa java ilk satırı
        şart ile baglar sonraki satirlar bagimsiz olur
        eger birden fazla satir if şartina baglanmis ise mutlaka {} kullnamaliyiz*/


        int sayi=23;
        if (sayi>0)
            System.out.println("sayi pozitif");//degere bagli
            System.out.println("pozitif kalacaktır");//her zaman calisir
        System.out.println("ucuncu satir");//her zaman calisir

        if (sayi%2==0)
            System.out.println("sayi cift");//degere bagli
            System.out.println("cift kalacaktır");//her zaman calisir

        if (sayi%5==0)
            System.out.println("sayi 5'in kati");//degere bagli

    }
}
