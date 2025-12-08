package systemdesign.designpattern.questions.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{
    private List<BookItem>  borrowedBooks = new ArrayList<>();
    private static final int MAX_BORROWED_BOOKS = 5;

    public Member(String id, String name){
        super(id, name);
    }

    public boolean checkoutBook(BookItem bookItem){
        if(borrowedBooks.size() >= MAX_BORROWED_BOOKS) return false;

        if(bookItem.checkout(this)){
            borrowedBooks.add(bookItem);
            return true;
        }

        return false;
    }

    public void returnBook(BookItem bookItem){
        if(borrowedBooks.remove(bookItem)){
            bookItem.returnBook();
        }
    }

    @Override
    void resetPassword() {
        System.out.println("member password reset");
    }
}
