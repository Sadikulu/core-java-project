package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        bu yöntemde data hiding değil daha anlaşılır
        bir kod amaçlanmıştır
         */

    }
}
