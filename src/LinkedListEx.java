import java.util.*;
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.addFirst(5);
        list.addLast(55);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        list.add(2, 25);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2, 35);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(35));
        System.out.println(list.indexOf(35));
        System.out.println(list.lastIndexOf(35));
        list.clear();
        System.out.println(list);
    }
}
