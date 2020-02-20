package bookshop.model.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@AllArgsConstructor
@Data
public class Book {
    @GeneratedValue
    @Id
    long id;
    String author;
    String country;
    String title;
    int issueYear;
    String genre;
    int sales;  // in millions

    public Book(String author, String country, String title, int issueYear, String genre, int sales) {
        this.author = author;
        this.country = country;
        this.title = title;
        this.issueYear = issueYear;
        this.genre = genre;
        this.sales = sales;
    }

    public Book() {
    }
}
