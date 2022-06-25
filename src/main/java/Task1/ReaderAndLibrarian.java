package Task1;

public class ReaderAndLibrarian extends User implements Librarian, Reader {
    Library library = new Library();

    ReaderAndLibrarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(User user, String nameBook) {
        new Library(nameBook);
        System.out.printf("%s заказал %s книгу для %s", this.getName(), nameBook, user.getName());
    }

    @Override
    public void takeBook(User user, String nameBook) {
        String str = library.getBookInArray(nameBook);
        if (!str.isEmpty()) {
            System.out.printf("%s взял %s книгу у %s\n", this.getName(), str, user.getName());
        } else {
            System.out.printf("%s не смог взять книгу потому что такой книги нету у %s\n", this.getName(), user.getName());
        }
    }

    @Override
    public void returnBook(User user, String nameBook) {
        library.addBookInArray(nameBook);
        System.out.printf("%s вернул %s книгу %s\n", this.getName(), nameBook, user.getName());
    }
}