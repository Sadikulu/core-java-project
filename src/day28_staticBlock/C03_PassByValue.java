package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        %25 indirimli fiyatı hesaolayıp bize dödüren bir metod oluşturun
         */
        double satisFiyati = 100;
        double indirimOrani=25;
        double indirimliFiyat = idirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat : " + indirimliFiyat);


    }

    public static double idirimliFiyatHesapla(double satisFiyati,double indirimOrani) {
        double indirimliFiyat = (satisFiyati * indirimOrani)/100;

        return indirimliFiyat;
    }
}
