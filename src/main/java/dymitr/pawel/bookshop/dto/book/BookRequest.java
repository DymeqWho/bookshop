package dymitr.pawel.bookshop.dto.book;

import dymitr.pawel.bookshop.dao.comments.Comment;
import dymitr.pawel.bookshop.dao.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest
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
