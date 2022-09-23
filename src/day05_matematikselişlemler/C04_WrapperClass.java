package day05_matematikselişlemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="java cok guzel";
        str.toUpperCase();

        int sayi=10;

        /*primitive data türlerinin yanında metod olmaz
        java bazı metodları kullanabilmemiz için her bir
        primitive data türü için bir wrapper class oluşturmuştur*/

        Integer sayi2=10;
        sayi2.byteValue();
    }
}
