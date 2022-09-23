package day22_multiDimensionalArray;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {
        //verilen bir multi arrayin tüm elementlerini yazdıran
        //bir method oluşturalım
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        elementleriYazdirma(sayilar);
    }

    public static void elementleriYazdirma(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {//inner arraylerin uzunluğuna bağlı
                System.out.print(sayilar[i][j]+" ");


            }

        }
    }
}
