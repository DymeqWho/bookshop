package dymitr.pawel.bookshop.dto.user;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dao.comments.Comment;
import lombok.*;

import java.util.List;
import java.util.Set;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String login;
    private String password;
    private String email;
    private String address;
    private List<Book> bookList;
    private Set<Comment> commentList;
}
