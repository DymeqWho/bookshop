package dymitr.pawel.bookshop.dto.user;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dao.comments.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String login;
    private String password;
    private String email;
    private String address;
    private List<Book> bookList;
    private Set<Comment> commentList;
}
