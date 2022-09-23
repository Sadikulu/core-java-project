package day22_multiDimensionalArray;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen iki katlı bir multi arrayde outur indexi ve inner
        indexi aynı olan sayilarin toplamını bulunuz
         int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
         [0][0]+[1][1]+[2][2]+....
         */
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        int istenenToplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length ; j++) {
                if (i==j){
                    istenenToplam+=sayilar[i][j];
                }
            }
        }
        System.out.println("toplam : "+istenenToplam);
    }
}
