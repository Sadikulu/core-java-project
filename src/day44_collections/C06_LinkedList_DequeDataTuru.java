package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList<>();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.removeLastOccurrence("Selim");
        System.out.println(ll4);//[Cavidan,Mesut,Selim,Tevfik]
        System.out.println(ll4.pop());//Cavidan
        //LinkedList'in başındaki elementi siler ve bize döndürür

        ll4.remove();
        ll4.removeLast();
        ll4.removeFirst();
        System.out.println(ll4);//[]
        //deque iki taraflı Queue demektir dolayısıyla her metodun first ve last var

    }
}
