package dymitr.pawel.bookshop.controller.comment;

import dymitr.pawel.bookshop.dto.comments.CommentsRequest;
import dymitr.pawel.bookshop.service.comment.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Validated
public class CommentController {

    private final CommentService commentService;

    @PostMapping(path = "/bookshop/{bookId}/{userId}")
    public void createComment(@PathVariable(name = "bookId") Long bookId, @PathVariable(name = "userId") Long userId, @RequestBody CommentsRequest commentsRequest) {
        commentService.createComment(userId, bookId, commentsRequest);
    }

}
