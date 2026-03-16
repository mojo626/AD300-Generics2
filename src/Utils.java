import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Utils {
    
    public static <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> list) {
        Collections.sort(list);

        return list;
    }

    public static void printCollection(Collection<?> collection) {
        System.out.println("Collection: ");
        for (var item : collection) {
            System.out.println(item.toString());
        }
    }

    public static double sumOfNumberList(List<? extends Number> list) {
        double sum = 0.0;

        for (Number num : list) {
            sum += num.doubleValue();
        }
        
        return sum;
    }
}
