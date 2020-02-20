package bookshop.service;

import bookshop.model.dao.BookDao;
import bookshop.model.entity.Book;

import java.util.Optional;
import java.util.Scanner;

public class BookService {

    BookDao dao;
    private Scanner sc = new Scanner(System.in);
    String author, country, genre, title;
    int issueYear, sales, id;

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

    public void znajdzKsiazke() {
        System.out.print("Podaj autora : ");
        author = sc.nextLine().trim();
        //System.out.println("Książki "+author+" liczba "+dao.getByAuthor(author).size());
        System.out.println(author);
        for (Book ksiazka: dao.getByAuthor(author)) System.out.println(ksiazka);
    }

    public void usunKsiazke() {
        System.out.print(" Podaj id książki do usunięcia :");
        id = sc.nextInt();

        Book ksazka = dao.get(id);
        dao.delete(ksazka);
    }

    public void znajdzKsiazkePoKraju() {
        System.out.print("Podaj kraj : ");
        country = sc.nextLine();
        System.out.println("Książki z kraju : "+country);
        for (Book ksiazka: dao.getByCountry(country)) System.out.println(ksiazka);
    }

    }
