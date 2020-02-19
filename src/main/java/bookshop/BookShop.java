package bookshop;

import bookshop.model.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BookShop {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("mydatabase").createEntityManager();

        List<Book> books = new ArrayList<>();
        books.add(new Book ("Karol Dickens","Wielka Brytania","Opowieść o dwóch miastach",1859,"powieść_historyczna",200));


        books.add(new Book ("J.R.R. Tolkien","Wielka Brytania","Władca Pierścieni",1954,"powieść_high_fantasy",150));

        books.add(new Book ("J.R.R. Tolkien","Wielka Brytania","Hobbit, czyli tam i z powrotem",1937,"powieść_high_fantasy",140));
        books.add(new Book ("Antoine de Saint-Exupéry","Francja","Mały Książę",1943,"powiastka_filozoficzna",140));

        books.add(new Book ("J.K. Rowling","Wielka Brytania","Harry Potter i Kamień Filozoficzny",1997,"powieść_fantasy",107));

        books.add(new Book ("Agatha Christie","Wielka Brytania","Dziesięciu Murzynków",1939,"powieść_kryminalna",100));
        books.add(new Book ("Cao Xueqin","Chiny","Sen czerwonego pawilonu",1754,"powieść_historyczna",100));
        books.add(new Book ("H. Rider Haggard","Wielka Brytania","Ona czyli historia niezwykłej wyprawy",1887,"powieść_science_fiction",100));
        books.add(new Book ("C.S. Lewis","Wielka Brytania","Lew, czarownica i stara szafa",1950,"powieść_fantasy",85));

        books.add(new Book ("Dan Brown","Stany Zjednoczone","Kod Leonarda da Vinci",2003,"powieść_sensacyjna",80));
        books.add(new Book ("Napoleon Hill","Stany Zjednoczone","Myśl i bogać się. Jak zrealizować ambicje i osiągnąć sukces",2006,"poradnik_psychologiczny",70));
        books.add(new Book ("J.D. Salinger","Stany Zjednoczone","Buszujący w zbożu",1951,"powieść psychologiczna",65));
        books.add(new Book ("Paulo Coelho","Brazylia","Alchemik",1988,"powiastka_filozoficzna",65));
        books.add(new Book ("J.K. Rowling","Wielka Brytania","Harry Potter i Komnata Tajemnic",1998,"powieść_fantasy",65));

        books.add(new Book ("J.K. Rowling","Wielka Brytania","Harry Potter i więzień Azkabanu",1998,"powieść_fantasy",60));

        books.add(new Book ("J.K. Rowling","Wielka Brytania","Harry Potter i Czara Ognia",2000,"powieść_fantasy",55));

        books.add(new Book ("J.K. Rowling","Wielka Brytania","Harry Potter i Zakon Feniksa",2003,"powieść_fantasy",55));

        books.add(new Book ("Gabriel García Márquez","Kolumbia","Sto lat samotności",1967,"realizm_magiczny",50));
        books.add(new Book ("Elwyn Brooks White","Stany Zjednoczone","Pajęczyna Szarloty",1952,"powieść_fantastyczna",50));
        books.add(new Book ("Vladimir Nabokov","Rosja","Lolita",1955,"romans, tragikomedia",50));
        books.add(new Book ("Share Hite","Niemcy","Sexual Honesty, by Women, For Women ",1976,"praca_naukowa",50));
        books.add(new Book ("Johnston McCulley","Stany Zjednoczone","The Curse of Capistrano (Zorro)",1919,"powieść",50));
        books.add(new Book ("Anna Sewell","Wielka Brytania","Czarny Książę",1877,"powieść",50));
        books.add(new Book ("Lucy Maud Montgomery","Wielka Brytania","Ania z Zielonego Wzgórza",1908,"powieść_dziecięca",50));
        books.add(new Book ("Lew Wallace","Stany Zjednoczone","Ben Hur",1880,"powieść_historyczna",50));
        books.add(new Book ("Benjamin Spock","Stany Zjednoczone","The Common Sense Book of Baby and Child Care",1946,"powieść_dziecięca",50));
        books.add(new Book ("Jack Higgins","Wielka Brytania","Orzeł wylądował",1975,"powieść_sensacyjna",50));
        books.add(new Book ("Richard Adams","Wielka Brytania","Wodnikowe Wzgórze",1972,"powieść_fantastyczna",50));
        books.add(new Book ("Robert James Waller","Stany Zjednoczone","Co się wydarzyło w Madison County",1992,"powieść",50));
        books.add(new Book ("J.P. Donleavy","Stany Zjednoczone","Ryży (The Ginger Man)",1955,"powieść",45));
        books.add(new Book ("Richard Bach","Stany Zjednoczone","Mewa",1970,"nowela",44));
        books.add(new Book ("E.L. James","Stany Zjednoczone","Pięćdziesiąt twarzy Greya",2011,"powieść_erotyczna",40));
        books.add(new Book ("V.C. Andrews","Stany Zjednoczone","Kwiaty na poddaszu",1979,"powieść_gotycka",40));
        books.add(new Book ("Harper Lee","Stany Zjednoczone","Zabić drozda",1960,"powieść",40));
        books.add(new Book ("Elbert Hubbard","Stany Zjednoczone","A Message to Garcia",1899,"powieść",40));
        books.add(new Book ("Jostein Gaarder","Norwegia","Świat Zofii",1911,"powieść_filozoficzna",40));
        books.add(new Book ("Dan Brown","Stany Zjednoczone","Anioły i demony",2000,"powieść_kryminalna",39));
        books.add(new Book ("Louisa L. Hay","Stany Zjednoczone","You Can Heal Your Life",1984,"powieść",36));
        books.add(new Book ("Hal Lindsey & Carole C. Carlson","Stany Zjednoczone","The Late, Great Planet Earth",1970,"powieść",35));
        books.add(new Book ("Wayne W. Dyer","Stany Zjednoczone","Your Erroneous Zones",1976,"poradnik_psychologiczny",35));
        books.add(new Book ("Jeffrey Archer","Wielka Brytania","Kane i Abel",1979,"powieść_kryminalna",34));
        books.add(new Book ("Colleen McCullough","Australia","Ptaki ciernistych krzewów",1977,"romans",30));

        books.add(new Book ("Margaret Mitchell","Stany Zjednoczone","Przeminęło z wiatrem",1936,"romans",30));
        books.add(new Book ("Anne Frank","Holandia","Dziennik Anny Frank",1947,"powieść_autobiograficzna",30));
        books.add(new Book ("Jacqueline Susann","Stany Zjednoczone","Dolina lalek",1966,"powieść",30));
        books.add(new Book ("Dan Brown","Stany Zjednoczone","Zaginiony symbol",2009,"powieść",30));
        books.add(new Book ("William Bradford Huie","Stany Zjednoczone","The Revolt of Mamie Stove",1951,"powieść",30));
        books.add(new Book ("Eric Carle","Stany Zjednoczone","The Very Hungry Caterpillar",1969,"powieść_dziecięca",30));
        books.add(new Book ("F. Scott Fitzgerald","Stany Zjednoczone","Wielki Gatsby",1925,"melodramat",25));


        for (Book book : books) {
            entityManager.getTransaction().begin();
            entityManager.merge(book);
            entityManager.getTransaction().commit();
            System.out.println(book);
        }

    }
}
