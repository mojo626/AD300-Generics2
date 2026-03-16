import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 6, -1, 2, 100, 3489));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("test", "b", "av", "ac"));
        ArrayList<Book> bookList = new ArrayList<>(Arrays.asList(new Book("A Tale of Two Cities"), new Book("The Little Prince"), new Book("The Alchemist")));

        System.out.println(Utils.sort(intList));
        System.out.println(Utils.sort(stringList));
        System.out.println(Utils.sort(bookList));
        System.out.println();

        Utils.printCollection(bookList);
        System.out.println();


        System.out.println("Sum");
        System.out.println(Utils.sumOfNumberList(intList));
        System.out.println();


        Cache<String> cache1 = new Cache<>();
        cache1.addItem(0, "a");
        cache1.addItem(1, "b");
        cache1.addItem(2, "c");

        Cache<String> cache2 = new Cache<>();
        cache2.addItem(3, "d");
        cache2.addItem(4, "e");
        cache2.addItem(5, "f");

        System.out.println(cache1);
        System.out.println(cache2);

        cache1.addAll(cache2);

        System.out.println(cache1);
    }
}
