package repository;

import dao.comments.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface commentsRepository extends JpaRepository<Comment, Long> {
}
