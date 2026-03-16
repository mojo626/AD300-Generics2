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
        
    }
}
