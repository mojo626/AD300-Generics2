public class Book implements Comparable<Book> {
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book: " + this.title;
    }
}
