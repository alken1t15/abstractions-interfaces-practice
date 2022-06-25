package Task1;

import java.util.ArrayList;

public class LibrarianAndSupplier extends User implements Librarian, Supplier {
    ArrayList<String> nameBook = new ArrayList<>();

    {
        nameBook.add("Тёмные начала");
        nameBook.add("Винни Пух");
    }

    LibrarianAndSupplier(String name) {
        super(name);
    }

    @Override
    public void orderBook(User user, String nameBook) {
        new Library(nameBook);
        System.out.printf("%s заказал %s книгу у %s\n", this.getName(), nameBook, user.getName());
    }

    @Override
    public void bringBook(User user) {
        System.out.printf("%s принес книги в библиотеку\n", this.getName());
        new Library(nameBook);

    }
}