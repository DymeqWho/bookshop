package repository;

import dao.books.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface booksRepository extends JpaRepository<Book,Long>
{

}
