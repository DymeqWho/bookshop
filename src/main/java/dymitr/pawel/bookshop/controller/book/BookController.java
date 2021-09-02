package dymitr.pawel.bookshop.controller.book;

import dymitr.pawel.bookshop.dto.book.BookRequest;

import dymitr.pawel.bookshop.dto.book.BookResponse;
import dymitr.pawel.bookshop.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
@RequiredArgsConstructor
@Validated
public class BookController {
    private final BookService bookService;

    @PostMapping(path = "/bookshop/book")
    public void createBook(@RequestBody BookRequest bookRequest) {
        bookService.createBook(bookRequest);
    }

    @GetMapping(path = "/bookshop/book/{id}")
    public BookResponse showBook(@PathVariable(name = "id") Long id) {
        return bookService.showBook(id);
    }

    @PostMapping(path = "/bookshop/book/edit/{id}")
        public void editBook (@RequestBody BookRequest bookRequest, @PathVariable(name = "id") Long id){
        bookService.editBook(bookRequest, id);
    }

    @GetMapping(path = "/bookshop/book/delete/{id}")
    public void deleteById(@PathVariable(name = "id") Long id) {
        bookService.deleteBook(id);
    }

}


