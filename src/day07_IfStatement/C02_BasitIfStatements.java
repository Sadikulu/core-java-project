package day07_IfStatement;

public class C02_BasitIfStatements {
    public static void main(String[] args) {
        int sayi=-23;
        if (sayi>0){
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'in kati");
        }
        /*basit if cümleleri kodun diğer parçalarından bağımsızdır
        sadece şartı kontrol eder, şart sağlanıyorsa if body çalışır
        yoksa çalışmaz.
        birden fazla if cümlesi varsa girilen şarta bağlı olarak
        tümünde if body çalışabilir, kısmen if bodyleri çalışabilir
        veya hiçbir if body çalışmayabilir.*/
    }
}
