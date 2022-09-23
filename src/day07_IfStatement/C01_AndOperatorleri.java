package day07_IfStatement;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 &&c>=b);
        System.out.println(a<0 && b<20 &&c>=b);

        /* java && operatorü konusunda bize 2 seçenek sunar
        && kullanırsak ilk false bulduğunda sonocun false olduğunu bilir
        ve geriye kalan şartşarı incelemez.
        eğer & kullanırsak tüm şartları kontrol eder sonra sonucu belirler
        bu çalısma usulunden dolayı & operatoru && operatorune göre
        daha yavas calisir.*/

        System.out.println(a<0 & b<20 & c>=b);//false


    }
}
