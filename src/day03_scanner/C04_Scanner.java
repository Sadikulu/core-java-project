package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcı ismini isteyin
        //girilen isim
        //isminiz=ismail   şeklinde yazdırın

        // insanların dünyasından kodlarmızın bulundupu classa
        //değer almak için Scanner clasını kullanırız.

        //1- Scanner objesi oluştur
        Scanner scan=new Scanner(System.in);

        //2- kullanıcıya ne istediğimizi söyleyin
        System.out.println("lütfen isminizi giriniz");

        /*3-oluşturduğumuz scan objesi ile kullanıcının girdiği değeri
        alıp uygun bir variableye atayalım.*/

        String kullanıcıIsmi=scan.next();
        System.out.println("isminiz="+kullanıcıIsmi);



    }
}
