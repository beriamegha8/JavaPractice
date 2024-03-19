import java.util.Vector;
public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(); //we cant write int instead of Integer cuz Vector is a collection class and it only accepts wraper classes
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        for (Integer integer : v) {
            System.out.println(integer);
        }
        v.remove(2);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        v.add(2, 6);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println(v.size());
        v.clear();
        System.out.println(v.size());
    }
}
