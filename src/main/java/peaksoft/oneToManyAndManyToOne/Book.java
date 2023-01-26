package peaksoft.oneToManyAndManyToOne;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
