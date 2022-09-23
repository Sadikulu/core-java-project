package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati=100;
        System.out.println(inrimliFiyat(satisFiyati));//90
        System.out.println(satisFiyati);//100
        System.out.println(inrimliFiyat(satisFiyati));//90
        /*
        iki farklı metodda satiş fiyatı isminde variable olabilir java
        buna itiraz etmez çünkü scope'ları farklıdır
         */
    }
    public static double inrimliFiyat(double orjinalFiyat){
        //metodumuz %10 indirim yapıp yeni fiyatı maine döndürsün
        double satisFiyati=orjinalFiyat*0.9;
        return satisFiyati;
    }
}
