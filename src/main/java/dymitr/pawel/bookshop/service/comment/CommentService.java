package dymitr.pawel.bookshop.service.comment;

import dymitr.pawel.bookshop.dao.comments.Comment;
import dymitr.pawel.bookshop.dto.comments.CommentsRequest;
import dymitr.pawel.bookshop.repository.BooksRepository;
import dymitr.pawel.bookshop.repository.CommentsRepository;
import dymitr.pawel.bookshop.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {

    private final CommentsRepository commentsRepository;
    private final UsersRepository usersRepository;
    private final BooksRepository booksRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void createComment(Long userId, Long bookId, CommentsRequest commentsRequest) {
        Comment comment = new Comment();

        comment.setCommentary(commentsRequest.getCommentary());
        comment.setUserId(commentsRequest.getUserId());
        comment.setBooksId(comment.getBooksId());

        commentsRepository.save(comment);
        logger.info("comment was created by user: " + usersRepository.getById(userId).getLogin()
                + "for book: " + booksRepository.getById(bookId).getTitle());
    }
}
