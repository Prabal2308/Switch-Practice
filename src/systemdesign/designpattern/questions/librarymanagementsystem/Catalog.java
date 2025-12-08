package systemdesign.designpattern.questions.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog {
    private final Map<String, List<BookItem>> titleBookmap = new HashMap<>();

    public void addBook(BookItem item){
        titleBookmap.computeIfAbsent(item.getBook().getTitle() , k -> new ArrayList<>()).add(item);
        System.out.println("Book added.");
    }

    public void removeBook(BookItem item){
        titleBookmap.get(item.getBook().getTitle()).remove(item);
        System.out.println("Book removed.");
    }

    public List<BookItem> searchByTitle(String title){
        return titleBookmap.getOrDefault(title, new ArrayList<>());
    }
}
