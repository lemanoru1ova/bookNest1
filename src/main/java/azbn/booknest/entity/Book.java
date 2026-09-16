package azbn.booknest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 20,unique = true, nullable = false)
    private String isbn;

    @Column(name = "published_year")
    private Integer publishedYear;

    @Column(name = "available_copies", nullable = false)
    private Integer availableCopies;

    protected Book() {
    }


    public Book(String title, String isbn, Integer publishedYear, Integer availableCopies) {
        this.title = title;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.availableCopies = availableCopies;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public Integer getPublishedYear() { return publishedYear; }
    public Integer getAvailableCopies() { return availableCopies; }
}
