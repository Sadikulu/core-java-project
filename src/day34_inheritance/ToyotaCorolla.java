package day34_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child classtan parent classa erişimde acces modifier kurallarını
        bypass edemeyiz.Örn: parent classtaki private class üyelerini
        child classtan kullanamayız

        aynı şekilde parent ve child farklı package'de ise parent
        classtaki default acces modifieri olan class üyelerini
        child classta kullanamayız
         */
        ToyotaCorolla arb1=new ToyotaCorolla();
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.model);//Model belirtilmedi

    }
}
