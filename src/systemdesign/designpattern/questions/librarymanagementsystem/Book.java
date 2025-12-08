package systemdesign.designpattern.questions.librarymanagementsystem;

public class Book {
    private String id;
    private String title;
    private String author;
    private String subject;

    public Book(String id, String title, String author, String subject){
        this.id = id;
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    //getters and setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }
}
