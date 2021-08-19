package dao.books;

import dao.comments.Comment;
import dao.user.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.List;

public class Book {
    private long id;
    private String summary;
    private String author;
    private String title;
    private long isbn;
    private BigDecimal price;
    private boolean outOfStockInfo;
    private List<Comment> commentList;
    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;


}
