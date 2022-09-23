package day42_abstractClass_Interfaces;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{
    /*
    bir class'ı bir interface'ye child yapmak için implements
    keyword kullanılır implements dedikten sonra , yazarak
    istediğimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);//20
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(ISIM);
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
