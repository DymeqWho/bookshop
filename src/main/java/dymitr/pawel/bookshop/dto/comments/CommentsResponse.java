package dymitr.pawel.bookshop.dto.comments;

import lombok.*;

@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentsResponse {
    private long userId;
    private long booksId;
    private String commentary;
}
