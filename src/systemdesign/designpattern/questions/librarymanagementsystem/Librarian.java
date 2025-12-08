package systemdesign.designpattern.questions.librarymanagementsystem;

public class Librarian extends User{

    public Librarian(String id, String name){
        super(id, name);
    }

    public void addBook(BookItem bookItem, Catalog catalog){
        System.out.println("Adding book to catalog");
        catalog.addBook(bookItem);
    }

    public void removeBook(BookItem bookItem, Catalog catalog){
        System.out.println("Removing book from catalog");
        catalog.removeBook(bookItem);
    }

    @Override
    void resetPassword() {
        System.out.println("librarian password reset");
    }
}
