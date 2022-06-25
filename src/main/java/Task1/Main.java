package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ReaderAndLibrarian readerAndLibrarian = new ReaderAndLibrarian("Вася");
        SupplierAndAdministrator supplierAndAdministrator = new SupplierAndAdministrator("Петр");
        LibrarianAndSupplier librarianAndSupplier = new LibrarianAndSupplier("Никита");
        while (true) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Введите имя аккаунта в который вы хотите войти: readerAndLibrarian, librarianAndSupplier, supplierAndAdministrator");
                String command = bufferedReader.readLine();
                switch (command) {
                    case "readerAndLibrarian":
                        while (true) {
                            System.out.println("У вас есть набор команд: takeBook, returnBook");
                            String commands = bufferedReader.readLine();
                            switch (commands) {
                                case "takeBook":
                                    System.out.println("Введите название книги которую вы хотите взять");
                                    String nameBook = bufferedReader.readLine();
                                    readerAndLibrarian.takeBook(supplierAndAdministrator, nameBook);
                                    break;
                                case "returnBook":
                                    System.out.println("Введите название книги которую вы хотите вернуть");
                                    String nameBooks = bufferedReader.readLine();
                                    readerAndLibrarian.returnBook(supplierAndAdministrator, nameBooks);
                                    break;
                                case "orderBook":
                                    System.out.println("Введите название книги которую вы хотите заказать");
                                    String nameBook2 = bufferedReader.readLine();
                                    readerAndLibrarian.orderBook(supplierAndAdministrator, nameBook2);
                                    break;
                                default:
                                    System.out.println("Если вы хотите выйти из аккаунта введите команду exit");
                            }
                            if (commands.equalsIgnoreCase("exit")) {
                                break;
                            }
                        }
                        break;
                    case "librarianAndSupplier":
                        while (true) {
                            System.out.println("У вас есть набор команд: orderBook, returnBook");
                            String commands = bufferedReader.readLine();
                            switch (commands) {
                                case "orderBook":
                                    System.out.println("Введите название книги которую вы хотите заказать");
                                    String nameBook = bufferedReader.readLine();
                                    librarianAndSupplier.orderBook(supplierAndAdministrator, nameBook);
                                    break;
                                case "bringBook":
                                    librarianAndSupplier.bringBook(readerAndLibrarian);
                                    break;
                                default:
                                    System.out.println("Если вы хотите выйти из аккаунта введите команду exit");
                            }
                            if (commands.equalsIgnoreCase("exit")) {
                                break;
                            }
                        }
                        break;
                    case "supplierAndAdministrator":
                        while (true) {
                            System.out.println("У вас есть набор команд: findBook, bringBook, extraditeBook, overdueNotification");
                            String commands = bufferedReader.readLine();
                            switch (commands) {
                                case "findBook":
                                    System.out.println("Введите название книги которую вы хотите найти");
                                    String nameBook = bufferedReader.readLine();
                                    readerAndLibrarian.orderBook(supplierAndAdministrator, nameBook);
                                    break;
                                case "bringBook":
                                    supplierAndAdministrator.bringBook(readerAndLibrarian);
                                    break;
                                case "extraditeBook":
                                    System.out.println("Введите название книги которую вы хотите выдать");
                                    String nameBook2 = bufferedReader.readLine();
                                    supplierAndAdministrator.extraditeBook(readerAndLibrarian, nameBook2);
                                    break;
                                case "overdueNotification":
                                    supplierAndAdministrator.overdueNotification(readerAndLibrarian);
                                    break;
                                default:
                                    System.out.println("Если вы хотите выйти из аккаунта введите команду exit");
                            }
                            if (commands.equalsIgnoreCase("exit")) {
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("Введите правильно имя аккаунта");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}