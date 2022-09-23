package day35_İnheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen {

    Matematikciler(){
        System.out.println("Matematikciler parametresiz cons");
    }

    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
    /*
    this(); constructor call içinde bulunan classtaki constructorları
    super(); ise parent classtaki constructorları çağırır

    this(); veya super(); parametre yapısına uygun bir cons yoksa
    java CTE verir

    constructor konusunda gördüğümüz this. o clastaki instance
    variableleri refere ediyordu

    inheritancede super. vardır
    ve parents classtaki instance variableleri refere eder
     */
}
