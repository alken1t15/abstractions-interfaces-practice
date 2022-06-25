package Task1;

import java.util.ArrayList;

public class SupplierAndAdministrator extends User implements Supplier, Administrator {
    Library library = new Library();
    ArrayList<String> nameBookArray = new ArrayList<>();

    {
        nameBookArray.add("Над пропастью во ржи");
        nameBookArray.add("Война и мир");
    }

    SupplierAndAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(User user) {
        int temp = (int) (Math.random() * 2);

        if (temp == 0) {
            System.out.println("У вас есть просрочка за возврат");
        } else {
            System.out.println("У вас нету просрочки за возврат");
        }
    }

    @Override
    public void findBook(User user, String nameBook) {
        String str = library.getBookInArray(nameBook);
        if (!str.isEmpty()) {
            System.out.printf("%s смог найти книгу %s для %s\n", this.getName(), nameBook, user.getName());
        } else {
            System.out.printf("%s не смог найти книгу %s для %s\n", this.getName(), nameBook, user.getName());
        }

    }

    @Override
    public void extraditeBook(User user, String nameBook) {
        String str = library.getBookInArray(nameBook);
        if (!str.isEmpty()) {
            System.out.printf("%s выдает книгу %s для %s\n", this.getName(), user.getName());
        } else {
            System.out.printf("%s не смог выдать книгу потому что такой книги нету для %s\n", this.getName(), user.getName());
        }
    }

    @Override
    public void bringBook(User user) {
        System.out.printf("%s принес книги в библиотеку\n", this.getName());
        new Library(nameBookArray);

    }
}