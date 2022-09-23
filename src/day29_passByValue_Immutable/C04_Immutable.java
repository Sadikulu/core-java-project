package day29_passByValue_Immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable :diğiştirilemez
        mutable :değiştirilebilir

        en meşhur immutable class :String

         */
        String str="Yildiz Bank";
        System.out.println(str.toUpperCase());//YILDIZ BANK

        str.toLowerCase();
        System.out.println(str);//Yildiz Bank
        str.substring(3,5);//di, sout olmadığında azdırmaz
        System.out.println(str);//Yildiz Bank

        //java'da String gibi metin ifadelerde kullanabileceğimiz
        //mutable StringBuilder classı vardır
        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb);//Java Bank
        sb.reverse();
        System.out.println(sb);//knaB avaJ
        sb.append(".");
        System.out.println(sb);//knaB avaJ.
    }
}
