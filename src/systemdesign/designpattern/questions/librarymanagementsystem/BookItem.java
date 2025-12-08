package systemdesign.designpattern.questions.librarymanagementsystem;

import java.util.Date;

public class BookItem {
    private String barcode;
    private String status;
    private Book book;
    private Date borrowedDate;
    private Date dueDate;

    public BookItem(String barcode, Book book){
        this.barcode = barcode;
        this.book = book;
        this.status = BookStatus.AVAILABLE.name();
    }

    public boolean checkout(Member member){
        if(this.status.equals(BookStatus.AVAILABLE.name())){
            this.status = BookStatus.ISSUED.name();
            this.borrowedDate = new Date();
            //set due date to 14 days from borrowed date
            this.dueDate = new Date(borrowedDate.getTime() + 14 * 24 * 60 * 60 * 1000);
            return true;
        }
        return false;
    }

    public void returnBook(){
        this.status = BookStatus.AVAILABLE.name();
        this.borrowedDate = null;
        this.dueDate = null;
    }

    public Book getBook() {
        return book;
    }

    public Date getdueDate() {
        return dueDate;
    }
}
