package day35_İnheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonal {

    EMuhasebe(){
        System.out.println("Muhasebe parametresiz cons");
    }

    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli cons");
    }
}
