package day35_İnheritancedaConstructorKullanimi;

public class AGrandParent {
    protected String isim="Grandpa ismi belirtilmedi";
    /*
    her classta görünmese bile bir constructor vardır
    bu classta obje oluşturmak istediğimizde default
    constructor devreye girecektir
    default constructorı gözlemleyemeyeceğimiz için onun
    yerine kullanılabilecek parametresiz constructor oluşturalım
     */
    protected String grandpaKlupAdi="Grandpa klubu";
    AGrandParent(){
        System.out.println("Grandpa constructor çalıştı");

    }
}
