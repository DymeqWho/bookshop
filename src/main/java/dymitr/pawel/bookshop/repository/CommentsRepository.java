package dymitr.pawel.bookshop.repository;

import dymitr.pawel.bookshop.dao.comments.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comment, Long> {
}
