package corejava.inheritance;

/**
 * Created by Gowtham on 04-11-2017.
 */
// Object class as a superclass
@SuppressWarnings("WeakerAccess")
public class Book {

    private String name;
    private String ISBN;
    private int noOfPages;

    public Book(String name, String ISBN, int noOfPages) {
        this.name = name;
        this.ISBN = ISBN;
        this.noOfPages = noOfPages;
    }

    public String getName() {
        return name;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    // By default, Object class's equals() uses "==" for testing equality.
    // It returns correct results for primitive types.
    // For objects, it returns true only when both objects are exactly the same. (reference comparision)

    // To test whether two objects are equal in the sense of equivalency (containing the same information),
    // equals() should be overridden.

    // If you override equals(), you must override hashCode() as well.
    @Override
    public boolean equals(Object obj) {
        // Both objects are exactly the same, ie. same memory location.
        if (this == obj) return true;

        if (obj instanceof Book) {
            return this.name.equals(((Book) obj).getName())
                    && this.ISBN.equals(((Book) obj).getISBN())
                    && this.noOfPages == ((Book) obj).getNoOfPages();
        } else {
            return false;
        }
    }

    // By default, the value returned by hashCode() is object's hash code, ie. the object's memory address in hexadecimal.
    // By definition, if two objects are equal, their hash code must also be equal.
    // So we must override hashCode() to return the same hash code for objects that are equal as per above equals().

    // Idea from Effective Java book
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + ISBN.hashCode();
        result = 31 * result + noOfPages;

        return result;
    }

    // It is recommended to implement toString() in all classes.
    @Override
    public String toString() {
        return "Name: " + this.name + "; ISBN: " + this.ISBN + "; No. of Pages: " + this.noOfPages;
    }
}

class App {

    public static void main(String[] args) {
        Book book1 = new Book("MyBook", "12345", 1000);
        Book book2 = new Book("MyBook", "12345", 1000);
        Book book3 = book1;
        Book book4 = new Book("MyBook2", "13579", 100);

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book4));
        System.out.println(book3.equals(book4));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
    }
}
