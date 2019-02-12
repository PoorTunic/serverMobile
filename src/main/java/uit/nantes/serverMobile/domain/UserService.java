package uit.nantes.serverMobile.domain;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import uit.nantes.serverMobile.api.entities.User;
import uit.nantes.serverMobile.infra.jpa.IUserRepository;

/**
 * @author Djurdjevic Sacha
 */
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public User findById(String id) {
        User result = new User("","","");
        try {
            result = userRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
        return result;
    }

    public User findByPseudo(String pseudo) {
        return userRepository.findByPseudo(pseudo);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void updatePseudo(String id, String pseudo) {
        User userUpdate = userRepository.findById(id).get();
        userUpdate.setPseudo(pseudo);
        userRepository.save(userUpdate);
    }

    public void updatePassword(String id, String password) {
        User userUpdate = userRepository.findById(id).get();
        userUpdate.setPassword(password);
        userRepository.save(userUpdate);
    }

    public void updateEmail(String id, String email) {
        User userUpdate = userRepository.findById(id).get();
        userUpdate.setEmail(email);
        userRepository.save(userUpdate);
    }

    public void insert(User user) {
        userRepository.save(user);
    }

    public void deleteById(String id) {
        User userDelete = userRepository.findById(id).get();
        userRepository.delete(userDelete);
    }

}
