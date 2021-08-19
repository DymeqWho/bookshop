package dymitr.pawel.bookshop.repository;

import dymitr.pawel.bookshop.dao.books.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book,Long>
{

}
