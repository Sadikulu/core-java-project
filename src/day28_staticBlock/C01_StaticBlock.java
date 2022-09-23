package day28_staticBlock;

public class C01_StaticBlock {
    static int sayi;
    static {
        /*
        static blok class üyelerinin tamamından önce çalışır
        (main metod'dan da önce)

        static blok class oluşturulduğunda çalışır genelliklede
        class ile ilgili ön ayarlamalar veya static variable
        değer atamak için kullanılır

        static blokların class içerisinde nerede olduğu önemli değildir
        önce static bloklar çalışır
        birden fazla static blok varsa yukarıdan aşağı doğru çalışır
         */
        System.out.println("static blok çalıştı");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("Main metod çalıştı");
        System.out.println(sayi);

    }
    static {
        System.out.println("Main metod altındaki static blok çalıştı");
    }
}
