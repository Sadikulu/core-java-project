package day40_final;

public abstract class CAbstract {

    void toplama(){
        System.out.println("Bu metod toplama yapar");
    }

    abstract void carpma();

    abstract void bolme();
     void cikarma(){
         System.out.println("Bu metod çıkarma yapar");
     }
    /*
    bir metodun başına abstract yazarsanız
    bu metodun child class'lar için bir standart olduğunu declare
    ederiz ve metod body'sine ihtiyaç kalmaz
     */
}
