package dymitr.pawel.bookshop.dto.comments;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dao.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class CommentsRequest {
    private User userId;
    private Book booksId;
    private String commentary;
}
