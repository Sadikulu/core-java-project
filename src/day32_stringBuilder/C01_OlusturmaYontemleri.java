package day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Candır");
        StringBuilder sb3 = new StringBuilder(5);

        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//16

        System.out.println(sb2.length());//11
        System.out.println(sb2.capacity());//27
        sb2.trimToSize();
        System.out.println(sb2.length());//11
        System.out.println(sb2.capacity());//11

        System.out.println(sb3.length());//0
        System.out.println(sb3.capacity());//10

        sb1.append("java");
        System.out.println(sb1.length());//4
        System.out.println(sb1.capacity());//16

        sb1.append(" candır");
        System.out.println(sb1.length());//11
        System.out.println(sb1.capacity());//16

        sb1.append(", bilen bilir.");
        System.out.println(sb1.length());//25
        System.out.println(sb1.capacity());//34 ((16*2)+2)

        StringBuilder sb4= new StringBuilder();
        sb4.append("Java candır");
        System.out.println(sb4.length());//11
        System.out.println(sb4.capacity());//16

        sb3.append("anim");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        sb3.append("alsanimalıiıl");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        sb3.append("animal");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
    }
}
