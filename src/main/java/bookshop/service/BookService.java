package bookshop.service;

import bookshop.model.dao.BookDao;
import bookshop.model.entity.Book;

import java.util.Scanner;

public class BookService {

    BookDao dao;
    private Scanner sc = new Scanner(System.in);
    String author, country, genre, title;
    int issueYear, sales;

    public BookService() {
        dao = new BookDao();
    }

    public void dodajKsiazke() {
        System.out.print("Autor :");
        author = sc.nextLine();
        System.out.println("Tytuł :");
        title = sc.nextLine();
        System.out.println("Kraj :");
        country = sc.nextLine();
        System.out.println("Kategoria :");
        genre = sc.nextLine();
        System.out.println("Rok wydania :");
        issueYear = sc.nextInt();
        System.out.println("Ilość sprzedanych książek (w mln) :");
        sales = sc.nextInt();

        Book book = new Book(author,country,title,issueYear,genre,sales);
        dao.saveUpdate(book);
    }

    public void pokazWszystkieKsiazki() {
        for (Book ksiazka : dao.getAll()) System.out.println(ksiazka);
    }
}
