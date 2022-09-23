package day33_encapsulation;

public class Araba {
    String marka="Marka belirtilmedi";//markanın acces midifieri default acces modifier
                                      //olduğunda package içinde kullanılabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektrikli";//tüm arabalar elektrikli ise bu variablenin değiştirlmemesi lazım
    //private yaptığımız model ve yakit varablelarına erişimi yetkilendirelim
    //modele değer atanabilsin ama görülemesin(setter)
    //yakıt görülebilsin ama değer atanamasın(getter)

    public String getYakit() {
        return yakit;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
