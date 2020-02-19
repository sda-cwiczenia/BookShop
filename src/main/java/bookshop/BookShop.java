package bookshop;

import bookshop.model.entity.Book;
import bookshop.service.BookService;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {

    private static int nrMenu;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BookService ksiegarnia = new BookService();



        do {
            menu();
            switch (nrMenu) {
                case 1: {
                    ksiegarnia.pokazWszystkieKsiazki();
                    break;
                }
                case 2: {
                    ksiegarnia.dodajKsiazke();
                    break;
                }
                case 3: {
                    //menuUsunPracownika();
                    break;
                }
                case 4: {
                    //menuZnajdzPracownikaPoId();
                    break;
                }
                case 5: {
                    break;
                }

                default: {
                    System.out.println("Wybrałeś złą opcję!");
                    menu();
                }
            }
        } while (nrMenu != 5);
        System.out.println("Na dzisiaj to już koniec!");
    }

    private static void menu() {
        System.out.println("-------------");
        System.out.println("PROGRAM KSIĘGARNIA");
        System.out.println("-------------");
        System.out.println("1. Lista książek");
        System.out.println("2. Dodaj książkę");
        System.out.println("3. Usuń książkę");
        System.out.println("4. Znajdz książkę po autorze");
        System.out.println("5. Wyjście z programu");
        System.out.print("Wybierz opcję (1-5) : ");
        nrMenu = sc.nextInt();
    }
}
