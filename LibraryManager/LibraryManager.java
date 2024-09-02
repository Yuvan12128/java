package demo;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    static List <Book> books=new ArrayList<Book>();
   public static  void add(Book b) {
       books.add(b);
       System.out.println("books added");
   }
   static void Listbooks(){
       for(Book bo : books){
           System.out.println("ID : "+bo.id+"\nBook Name : "+bo.name+"\nAuthor Name : "+bo.author);
       }
   }
   public static void searchBooks(String query) {
       for(Book bo:books){
           System.out.println(bo.name.toLowerCase().contains(query.toLowerCase()));
       }
   }
}
