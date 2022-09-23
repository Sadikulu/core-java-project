package day04_datacasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
       /* float sayi1=3.14f;
        double sayi2=sayi1;
        System.out.println("sayi2 = " + sayi2);*/

        //dar veri türündeki bir değeri geniş data türündeki bir varialeye
        //otomatik olarak assing(atama) yapar

        byte sayi1=23;
        short sayi2=55;
        int sayi3=sayi1+sayi2;
        double sayi4=sayi1*sayi2;
        //sayi4=sayi2/sayi1;//2 yazar çünkü sayi1ve sayi2 tam sayi
        sayi4=(double)sayi2/sayi1;//sayi2 double oldu
        System.out.println("sayi4 = " + sayi4);

    }
}
