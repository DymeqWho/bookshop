package dymitr.pawel.bookshop.controller.book;

import dymitr.pawel.bookshop.dto.book.BookRequest;
import dymitr.pawel.bookshop.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
public class BookController {
    private final BookService bookService;

    @PostMapping(path = "/bookshop/book")
    public void createBook(@RequestBody BookRequest bookRequest) {
        bookService.createBook(bookRequest);
    }


}
