package dymitr.pawel.bookshop.dto.comments;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dao.user.User;
import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class commentsResponse {
    private User userId;
    private Book booksId;
    private String commentary;
}
