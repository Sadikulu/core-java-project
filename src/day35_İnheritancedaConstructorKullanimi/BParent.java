package day35_İnheritancedaConstructorKullanimi;

public class BParent extends AGrandParent  {
    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent klubu";

    BParent(){
        System.out.println("Parent constructor çalıştı");
    }
}
