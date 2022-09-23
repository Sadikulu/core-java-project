package day41_abstrackClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class HA160 extends FMercedes {

    /*
    abstract parent silsilesinden glen ilk concrete class
    parenti olan tüm classlardaki abstract metodları concrete
    hale dönüştürmek(override etmek) zorundadır

    bu kuralın istisnası parent class'lardan herhangi birinde
    concrete hale dönüştürülmüş abstract metodlardır
     */
    public static void main(String[] args) {
        HA160 arb1 = new HA160();
        //concrete bir classtan istediğimiz objeyi üretebiliriz

        FMercedes arb2 = new FMercedes();
        //mercedes de concrete

        //EToyota arb3 = new EToyota();
        EToyota arb4=new GCorolla();
        //abstract classlar constructor barındırır ama obje üretemezler
        //toyota classı abstract class olduğundan obje üretilemez

        /*
        List<String> list1 = new List<>();
        List<String> list2 = new ArrayList<>();
        abstract bir classın özelliklerini taşıyan bir obje
        oluşturmak istediğim,zde data türünü istediğimiz
        abstract class constructor'ı ise child'i olan concrete
        bir classtan seceriz
         */


    }
}
