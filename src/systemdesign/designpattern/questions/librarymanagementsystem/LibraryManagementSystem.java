package systemdesign.designpattern.questions.librarymanagementsystem;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald", "Scribner");
        BookItem bookItem1 = new BookItem("BI1", book1);

        Catalog catalog = new Catalog();
        Librarian librarian = new Librarian("L1", "Alice");
        librarian.addBook(bookItem1, catalog);
        Member member = new Member("M1", "Bob");
        boolean isCheckedOut = member.checkoutBook(bookItem1);
        System.out.println("Book checked out: " + isCheckedOut);

        double calculateFine = Fine.calculateFine(bookItem1.getdueDate());
        System.out.println("Fine amount: " + calculateFine);

        member.returnBook(bookItem1);
        System.out.println("Book returned.");

        catalog.removeBook(bookItem1);
    }
}
