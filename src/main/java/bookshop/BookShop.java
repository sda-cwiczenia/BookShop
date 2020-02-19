package bookshop;

import bookshop.model.entity.Book;
import bookshop.service.BookService;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BookShop {
    public static void main(String[] args) {

        BookService ksiegarnia = new BookService();

        System.out.println("PROGRAM KSIĘGARNIA");

        System.out.println("Dodaj kiążkę");
        ksiegarnia.dodajKsiazke();




    }
}
