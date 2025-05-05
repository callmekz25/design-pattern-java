package behavioral.iterator.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> iterator = list.iterator();
        System.out.print("First time: ");
        while (iterator.hasNext()){
            display(iterator.next());
        }
        System.out.println("");
        System.out.print("Second time: ");
        list.iterator().forEachRemaining(integer -> display(integer));
    }

    public static void display(int number) {
        System.out.print(number + " ");
    }
}
