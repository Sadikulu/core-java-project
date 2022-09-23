package techpro_calisma;

public class Day04_Ödevler {
    public static void main(String[] args) {
        /*1-byte veri tipinde bir değişken ouşturun ve short,int
        float ve double birer değişken oluşturup adım adım widening yapın.*/

        byte sayi1=12;
        short sayi2;
        sayi2=sayi1;
        System.out.println("sayi2 = " + sayi2);
        int sayi3;
        sayi3=sayi1;
        System.out.println("sayi3 = " + sayi3);
        float sayi4;
        sayi4=sayi1;
        System.out.println("sayi4 = " + sayi4);
        double sayi5;
        sayi5=sayi1;
        System.out.println("sayi5 = " + sayi5);

        /*2-int veri türünde bir değişken oluşturun ve adım adım
         narrowing yapın yazdırın*/
        int sayi6=5000000;
        short sayi7=(short) sayi6;
        System.out.println("sayi7 = " + sayi7);
        byte sayi8=(byte) sayi6;
        System.out.println("sayi8 = " + sayi8);

        /*3-float data türünde bir variable oluşturun ve yazdırın*/
        float sayi9=12.25f;
        System.out.println("sayi9 = " + sayi9);

        /*4-double 255,36 sayısını inte ve sonrada oluşturduğunuz
        inti byte çevirip yazdırın*/
        double sayi10=255.36;
        int sayi11=(int)sayi10;
        System.out.println("sayi11 = " + sayi11);
        byte sayi12=(byte)sayi11;
        System.out.println("sayi12 = " + sayi12);

        /*5-int 2 sayiyi birbirine böldürün ve sonucu yazdırın*/
        int sayi13=25;
        int sayi14=5;
        System.out.println("sayi15 = " + sayi13/sayi14);

        /*6-int bir sayıyı double bir sayıya bölün ve sonucu yazdırın*/
        int sayi16=32;
        double sayi17=3.5;
        System.out.println("sayi18="+sayi16/sayi17);

        /*7-farklı data türlerinde işlem yapıp sonuçlarını yazdırın*/
        char sayi19='s';
        double sayi20=25.12;
        System.out.println("sayi21 = " + (sayi19+sayi20));

    }
}
