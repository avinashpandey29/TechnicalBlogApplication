package Blog.service;

import Blog.modal.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public static boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }
}
