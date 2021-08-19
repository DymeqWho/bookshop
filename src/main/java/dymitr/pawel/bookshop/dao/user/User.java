package dymitr.pawel.bookshop.dao.user;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dao.comments.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private long id;
   private String login;
   private String password;
   private String email;
   private String address;
   @OneToMany(mappedBy = "user")
   private List<Book> bookList;
   @OneToMany(mappedBy = "userId")
   private Set<Comment> commentList;
}
