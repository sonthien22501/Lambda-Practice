package LambdaExample.SortList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {


    public List<Book> getBookingSort(){
        List<Book> bookList = new BookDAO().getBooks();
        Collections.sort(bookList, (o1, o2) -> o2.getName().compareTo(o1.getName()));
        //Collections.sort(bookList, new MyComparator());
        return bookList;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookingSort());
    }
}

//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
