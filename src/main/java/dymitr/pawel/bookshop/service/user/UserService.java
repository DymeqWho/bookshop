package dymitr.pawel.bookshop.service.user;

import dymitr.pawel.bookshop.dao.user.User;
import dymitr.pawel.bookshop.dto.user.UserRequest;
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

    public void createNewUser(UserRequest userRequest){
        User user = new User();
        user.setLogin(userRequest.getLogin());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setAddress(userRequest.getAddress());
        usersRepository.save(user);
        logger.info("user " + user.getLogin() + " with email: " + user.getEmail() + " was created");
    }

}
