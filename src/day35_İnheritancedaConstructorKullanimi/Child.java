package day35_İnheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child klubu";

    Child(){
        System.out.println("Child constructor çalıştı");
    }

    public static void main(String[] args) {
        //AGrandParent gp1=new AGrandParent();
        // bu objeyi oluşturmak için grandpa constructor çalışır
        //Parent veya Child constructor çalışmaz
        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        //child1 objesi için Child constructor çalışır
        /*
        javada bir classı kullanabilmek için  oclasstan obje
        oluşturru dolayısıyla o classın constructorını kullanırdık

        java inheritance de parent classlardaki özellikleri
        kullana bilmek için o classların constructorlarını
        otomatik çalıştıran bir yapı kurmuştur

        örneğin biz child classında
        child classında bir obje oluşturmak istediğimizde child cons.
        kullanırız java child constructorı gördüğünde önce parentın
        constructorı çalıştırmam lazım der. Buradan parent constructora
        gider Parent classında Parent constructorını görünce
        önce bunun parentinin yani Grandparent constructorı çalışması
        gerekir der Böylece extends keyword olmayan classa kadar gider
        ve oradan başlayarak tüm constructorları aşağı doğru çalıştırır
         */

    }
}
