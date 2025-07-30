package Array;
import java.util.ArrayList;

public class ArrayListone {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);//use wrapper classes
        list.add(67);
        list.add(23);
        list.add(11);
        list.add(20);
        list.add(90);
        list.add(100);
        list.add(100);

        System.out.println(list);
    }
}