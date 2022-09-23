package day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi=10;
        //System.out.println(sayiMethod);//sayimethod method1 de oluşturuldu
                                        //ve sadece orda geçerli

        for (int i = 0; i <20; i++) {
            System.out.println(i);
        }
        //System.out.println(i);// i loopta oluşmuş local variabledir
                             // sadece loopta kullanılır

        //static int sayiStatic=20; static keyvord sadece class levelde kullanılır
        //methodların içinde static variable tanımlanamaz

    }

    public static void method1(){
        //System.out.println(sayi); sayi main maetod'da oluşturulmuş local
        //bir variabledir sadece main metod'da geçerlidir

        int sayiMethod=20;

    }
}
