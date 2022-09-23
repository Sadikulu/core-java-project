package day37_overridding;

public class DAraba {

    private void yakit(){
        System.out.println("Tüm arabalar yakıt kullanır");
        /*
        parent classtan override edilmesini istemediğiniz
        metodları private, final veya static yapabilirsiniz
            */
    }

    void marka(){
        System.out.println("Tüm arabaların markası vardır");
    }

    void motor(){
        System.out.println("Tüm arabaların motoru vardır");
    }

}
