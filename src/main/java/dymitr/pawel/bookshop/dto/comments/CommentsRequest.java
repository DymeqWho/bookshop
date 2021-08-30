package dymitr.pawel.bookshop.dto.comments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentsRequest {
    private long userId;
    private long booksId;
    private String commentary;
}
