package dymitr.pawel.bookshop.controller.user;

import dymitr.pawel.bookshop.dto.user.UserRequest;
import dymitr.pawel.bookshop.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Validated
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/bookshop/user")
    public void createNewParticipant(@RequestBody UserRequest userRequest){
        userService.createNewUser(userRequest);
    }

}
