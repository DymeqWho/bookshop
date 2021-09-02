package dymitr.pawel.bookshop.service.book;

import dymitr.pawel.bookshop.dao.books.Book;
import dymitr.pawel.bookshop.dto.book.BookRequest;
import dymitr.pawel.bookshop.dto.book.BookResponse;
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


    public BookResponse showBook(Long id) {
        Book book = findBookByID(id);
        BookResponse bookResponse = new BookResponse();
        bookResponse.setAuthor(book.getAuthor());
        bookResponse.setTitle(book.getTitle());
        bookResponse.setSummary(book.getSummary());
        bookResponse.setIsbn(book.getIsbn());
        bookResponse.setPrice(book.getPrice());
        bookResponse.setOutOfStockInfo(book.isOutOfStockInfo());
        return bookResponse;
    }

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

    public void deleteBook(Long id) {
        booksRepository.delete(booksRepository.getById(id));
    }

    public void editBook(BookRequest bookRequest, Long id) {
        Book book = findBookByID(id);
        book.setAuthor(bookRequest.getAuthor());
        book.setTitle(bookRequest.getTitle());
        book.setSummary(bookRequest.getSummary());
        book.setIsbn(bookRequest.getIsbn());
        book.setPrice(bookRequest.getPrice());
        book.setOutOfStockInfo(bookRequest.isOutOfStockInfo());
    }

    private Book findBookByID(Long id) {
        return booksRepository.findById(id).orElseThrow(() -> new RuntimeException("There is no such ID"));
    }
}
