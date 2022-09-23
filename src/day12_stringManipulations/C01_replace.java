package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {
        String str=" Bu gun ha va cok guz el ";
        System.out.println(str.replace(" ",""));
        //hava kelimesini Java yapalım
        System.out.println(str.replace("ha va","Java"));
        System.out.println(str.replace("h","j").replace(" ",""));
        //guz el yerine harika yapalım
        System.out.println(str.replace("guz el","harika"));
        //cümleyi replace kullanarak bugun java cok guzel
        str=str.replace("Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel");
        System.out.println(str);

    }
}
