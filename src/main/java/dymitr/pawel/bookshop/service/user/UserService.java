package dymitr.pawel.bookshop.service.user;

import dymitr.pawel.bookshop.dao.user.User;
import dymitr.pawel.bookshop.dto.user.UserRequest;
import dymitr.pawel.bookshop.dto.user.UserResponse;
import dymitr.pawel.bookshop.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UsersRepository usersRepository;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void createNewUser(UserRequest userRequest) {
        User user = new User();
        user.setLogin(userRequest.getLogin());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setAddress(userRequest.getAddress());
        usersRepository.save(user);
        logger.info("user " + user.getLogin() + " with email: " + user.getEmail() + " was created");
    }

    public void deleteUserById(Long id) {
        String login = findUserById(id).getLogin();
        usersRepository.deleteById(id);
        logger.info("user " + login + " was deleted");
    }

    public UserResponse showUser(Long id) {
        UserResponse userResponse = new UserResponse();
        User userFromDB = findUserById(id);
        userResponse.setLogin(userFromDB.getLogin());
        userResponse.setEmail(userFromDB.getEmail());
        userResponse.setAddress(userFromDB.getAddress());
        userResponse.setPassword(userFromDB.getPassword());
        userResponse.setBookList(userFromDB.getBookList());
        userResponse.setCommentList(userFromDB.getCommentList());

        return userResponse;
    }

    public void editUser(UserRequest userRequest, Long id) {
        User user = findUserById(id);
        String oldLogin = user.getLogin();
        user.setLogin(userRequest.getLogin());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setAddress(userRequest.getAddress());

        logger.info("user " + oldLogin + " was edited to " + user.getLogin());
    }

    private User findUserById(long id){
        return usersRepository.findById(id).orElseThrow(() -> new RuntimeException("there is no such id"));
    }
}
