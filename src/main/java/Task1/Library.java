package Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    static ArrayList<String> arrayOrderBook = new ArrayList<>();
    static ArrayList<String> arrayLibraryBook = new ArrayList<>();

    public Library() {

    }

    public Library(String name) {
        arrayOrderBook.add(name);
    }

    public Library(ArrayList<String> book) {
        Iterator iterator = book.iterator();
        while (iterator.hasNext()) {
            arrayLibraryBook.add((String) iterator.next());
        }

    }

    public String getBookInArray(String nameBook) {
        Iterator iterator = arrayLibraryBook.iterator();
        while (iterator.hasNext()) {
            String str = String.valueOf(iterator.next());
            if (str.equals(nameBook)) {
                arrayLibraryBook.remove(str);
                return str;
            }
        }
        return "";
    }

    public void addBookInArray(String nameBook) {
        arrayLibraryBook.add(nameBook);
    }

    public String foundBookInArray(String nameBook) {
        Iterator iterator = arrayLibraryBook.iterator();
        while (iterator.hasNext()) {
            String str = String.valueOf(iterator.next());
            if (str.equals(nameBook)) {
                return str;
            }
        }
        return "";
    }
}