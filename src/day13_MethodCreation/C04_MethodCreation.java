package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        //input olarak verilen iki int' toplayıp sonucunu yazdıran
        //bir metod oluşturun
        int input1=15;
        int input2=2;

        //metod 4 adımda oluşturulur
        //1. adım metod call
        //2. adım argıment eklenmesi gerekiyorsa ekleyelim
        //eğer metodun return type void'den farlı olacaksas
        //bir variable oluşturup metod call'u assign edelim
        toplam(input1,input2);
        int a=carpma(input1,input2);
        System.out.println("çıkarma : "+cikarma(input1,input2));
        double b=bölme(input1,input2);
        System.out.println("bölme = " + b);
        System.out.println(carpma(input1,input2));
        System.out.println(a);


    }

    private static double bölme(double input1, double input2) {
        return (input1/ input2);

    }

    public static int carpma(int input1, int input2) {
        return (input1*input2);


    }

    public static void toplam(int input1, int input2) {
        //3.adım metod declarasyonunda değiştirilmesi gereken
        //bölümleri değiştir(acces modifier,return type vb....)
        //4.adım eğer return type void dışında bir şeyse
        // return keywordu ve dönecek değeri hesaplamalıyız
        System.out.println("Girilen iki sayının toplamı : "+(input1+input2));
    }
    public static double cikarma(double input1, double input2){
        return (input1-input2);
    }


}
