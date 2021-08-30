package dymitr.pawel.bookshop.service.book;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dto.book.BookRequest;
import dymitr.pawel.bookshop.repository.BooksRepository;
import dymitr.pawel.bookshop.repository.CommentsRepository;
import dymitr.pawel.bookshop.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
@Transactional
@RequiredArgsConstructor

public class BookService {
    private final BooksRepository booksRepository;
    private final CommentsRepository commentsRepository;
    private final UsersRepository usersRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public void createBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setTitle(bookRequest.getTitle());
        book.setAuthor(bookRequest.getAuthor());
        book.setIsbn(bookRequest.getIsbn());
        book.setSummary(bookRequest.getSummary());
        book.setPrice(bookRequest.getPrice());
        book.setOutOfStockInfo(bookRequest.isOutOfStockInfo());
        booksRepository.save(book);
        logger.info("Book was created " + book.getTitle());
    }
}
