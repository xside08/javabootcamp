package main.java.com.andrii;
import java.util.*;

public class Screen {
    Scanner sc = new Scanner(System.in);
    Library library = new Library();
    public void showScreen() {
        library.setBooksList();
        boolean doWork = true;
        do {
            System.out.println("Виберіть дію, натиснувши на відповідну цифру:");
            System.out.println("1. Показати список книг, які є у наявності в бібліотеці");
            System.out.println("2. Показати список книг, які вже Ви брали");
            System.out.println("3. Any another number throws exit");
            System.out.println("4. Check date");

            int mainChooseInLibrary = sc.nextInt();

            if (mainChooseInLibrary == 1) {
                if(library.getBooksList().isEmpty()) {
                    System.out.println("No books in the library");
                } else {
                    System.out.println("Cписок книг, які є у бібліотеці: ");
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

            }else if(mainChooseInLibrary == 2) {
                if (library.getBooksOblik().isEmpty()) {
                    System.out.println("\t\tYou never took books\n");
                } else {
                    System.out.println("\t\t\tCписок книг, які ви вже брали");
                    library.showBooksAccounting();
                }
            } else if(mainChooseInLibrary == 4) {
                System.out.println("Insert date");
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
