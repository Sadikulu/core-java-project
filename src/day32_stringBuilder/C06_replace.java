package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Calm down");
        sb.replace(5,10,"Up");
        System.out.println(sb);//Calm Up

        sb.replace(4,5,"---");
        System.out.println(sb);//Calm---Up

        sb.replace(4,7," ");
        System.out.println(sb);//Calm Up

        sb.replace(5,7,"Down");
        System.out.println(sb);//Calm Down
        sb.replace(6,6,"Up");
        System.out.println(sb);//Calm DUpown

    }
}
