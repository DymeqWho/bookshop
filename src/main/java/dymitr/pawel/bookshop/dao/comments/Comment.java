package dymitr.pawel.bookshop.dao.comments;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dao.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private long userId;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private long booksId;
    private String commentary;
}
