package Task1;

public interface Administrator {
    void overdueNotification(User user);

    void findBook(User user, String nameBook);

    void extraditeBook(User user, String nameBook);
}