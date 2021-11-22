import javax.naming.AuthenticationException;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean processUser(String name) throws AuthenticationException {
        User user = UserRepository.findOneByName(name);
        return true;
    }
}
