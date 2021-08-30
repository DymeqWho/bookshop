package dymitr.pawel.bookshop.dto.book;

import dymitr.pawel.bookshop.dao.comments.Comment;
import dymitr.pawel.bookshop.dao.user.User;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse
{
    private String summary;
    private String author;
    private String title;
    private long isbn;
    private BigDecimal price;
    private boolean outOfStockInfo;
    private Set<Comment> commentList;
    private User user;
}
