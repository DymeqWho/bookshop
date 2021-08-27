package dymitr.pawel.bookshop.controller.user;

import dymitr.pawel.bookshop.dto.user.UserRequest;
import dymitr.pawel.bookshop.dto.user.UserResponse;
import dymitr.pawel.bookshop.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/bookshop/user")
    public void createNewUser(@RequestBody UserRequest userRequest) {
        userService.createNewUser(userRequest);
    }

    @GetMapping(path = "/bookshop/user/delete/{id}")
    public void deleteUserById(@PathVariable(name = "id") Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping(path = "/bookshop/user/{id}")
    public UserResponse showUser(@PathVariable(name = "id") Long id) {
        return userService.showUser(id);
    }

}
