package day09_ternary;


import java.util.Locale;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*kullanıcıdan gün ismini alın haftaiçi veya hafta sonu
        olduğunu yazdırın
         */
        //switch () içine long double float ve bolean değer yazılamaz

        /*String input = "pazartesi";
        input=input.toLowerCase();
          switch (input) {
            case "pazartesi":
                System.out.println("hafta içi");
            case "sali":
                System.out.println("hafta içi");
            case "carsamba":
                System.out.println("hafta içi");
            case "persembe":
                System.out.println("hafta içi");
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lütfen gecerli bir gün giriniz")
                };*/
        // aşağıdaki daha kolay
        String input = "pazartesi";// gün ismini kullanıcıdan almak yerine
        // biz yazıyoruz değiştirilebilir örn: String input = "sali";
        input=input.toLowerCase();
        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("lütfen gecerli bir gün giriniz");
        }
    }
}
