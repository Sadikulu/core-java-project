package day41_abstrackClass_Interface;

public abstract class EToyota extends DAraba {


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar çevreci motor kullanır");
    }
    /*
    parent class'taki stamdart belirleyici metodlar(abstract metodlar)
    tamamı child class tarafından override edilmelidir

    concrete metodların override edilme mecburiyeti yoktur
    istersek override ederiz, istemezsek etmeyiz

    Aslında toyota classıda obje üreteceğimiz bir class değil
    bu durumda eğer proje tasarımı yapıyorsanız toyota
    class'ınıda abstract yapmanız güzel olur

     */
}
