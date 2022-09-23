package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);
        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3);//false
        System.out.println(str2.equals(str4));//true
        System.out.println(str2==str4);//false
        System.out.println(str1.equals(str4));//true
        System.out.println(str1==str4);//true
        /*
        yeni bir string oluştururken
        1-eşitliğin sağında new keywordu olursa java yeni bir
        obje ve referans oluşturur
        2-eğer eşitliğin sağında bir metod çalışıyor veya
         + işlemi yapılıyorsa String ımmutable olduğundan değişikliği
        kaydetmek üzere hemen bir kopya String ve referans oluşturur
        sonra değeri hesaplayıp bu yeni kopya pbjenin içine koyar

         */
        String str5="Ali Can";
        String str6=str1;
        System.out.println(str1.equals(str5));//true
        System.out.println(str1==str5);//true
        System.out.println(str1.equals(str6));//true
        System.out.println(str1==str6);//true
        System.out.println(str5.equals(str6));//true
        System.out.println(str5==str6);//true
        /*
        eğer yeni bir String objesi oluştururken
        new kwlimesi kullanılmaz veya eşitliğin sağında
        + işlemi yapılmazsa java bakar
        eğer daha önce oluşturulan String objelerden(String havuzu)
        birebir aynı String varsa o obje ve referansını kullanır
        birebir aynısı yoksa yeni bir obje oluşturur
         */

    }
}
