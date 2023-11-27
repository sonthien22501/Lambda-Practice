package LambdaExample.SortList;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(101, "Core Java", 400));
        bookList.add(new Book(215, "Hibernate", 180));
        bookList.add(new Book(735, "Spring", 52));
        bookList.add(new Book(741, "Web Service", 1256));
        return  bookList;
    }
}
