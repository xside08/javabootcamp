package main.java.com.andrii;
import java.util.*;

public class Screen {
    Scanner sc = new Scanner(System.in);
    Library library = new Library();

    public void showScreen() {
        library.setBooksList();
        boolean doWork = true;
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        do {
            System.out.println("Choose action, pressed on strict number:");
            System.out.println("1. To show list of books, which are presented");
            System.out.println("2. List of books you have taken");
            System.out.println("3. Check date");
            System.out.println("4. Any another number throws exit of the program");

            int mainChooseInLibrary = sc.nextInt();

            if (mainChooseInLibrary == number1) {
                if(library.getBooksList().isEmpty()) {
                    System.out.println("No books in the library");
                } else {
                    System.out.println("List of books in the library: ");
                    int counter = 1;
                    for (Book book : library.getBooksList()) {
                        System.out.println("" + counter++  + book);
                    }

                    System.out.println("Choose a book you wanna get");

                    int choosenNum = sc.nextInt();
                    Book book = library.getBooksList().get(choosenNum - 1);
                    System.out.println(book);
                    library.addBookToAccounting(new Date(), book);
                    library.deleteBookFromBookList(book);
                }

            }else if(mainChooseInLibrary == number2) {
                if (library.getBooksOblik().isEmpty()) {
                    System.out.println("\t\tYou never took books\n");
                } else {
                    System.out.println("\t\t\tList of books you have taken");
                    library.showBooksAccounting();
                }
            } else if(mainChooseInLibrary == number3) {
                System.out.println("Insert date in format year/month/day ");
                int year = sc.nextInt();
                int month = sc.nextInt();
                int day = sc.nextInt();
                Date date = new Date(year, month, day);
                date.setHours(sc.nextInt());
                date.setMinutes(sc.nextInt());
                date.setSeconds(sc.nextInt());
                Map<Date, Book> booksOblik = library.getBooksOblik();
                Book book = booksOblik.get(date);
                if (book == null) {
                    System.out.println("At this day you didn't take any book");
                } else {
                    System.out.println("You took: " + book.toString() );
                }
            } else {
                doWork = false;
            }
        } while(doWork);
        System.out.println("bye");
    }
}
