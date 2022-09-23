package day37_overridding;

public class EToyota extends DAraba {

    void marka(){
        /*super.marka();
        eğer hem overridden hemde overridding metodun çalışmasını
        istersek ilk satıra super.marka(); yazabiliriz
         */
        System.out.println("Markamız Toyota");
    }

    void motor(){
        System.out.println("Toyota araçlar Toyota marka motor kullanır");
    }
}
