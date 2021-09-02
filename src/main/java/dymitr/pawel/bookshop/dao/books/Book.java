package dymitr.pawel.bookshop.dao.books;

import dymitr.pawel.bookshop.dao.comments.Comment;
import dymitr.pawel.bookshop.dao.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String summary;
    private String author;
    private String title;
    private long isbn;
    private BigDecimal price;
    private boolean outOfStockInfo;
    @OneToMany(mappedBy = "booksId")
    private Set<Comment> commentList;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


}
