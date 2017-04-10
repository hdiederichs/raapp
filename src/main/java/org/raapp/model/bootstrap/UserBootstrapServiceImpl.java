package org.raapp.model.bootstrap;

import org.raapp.model.User;
import org.raapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by hds on 28.03.17.
 */
@Service
public class UserBootstrapServiceImpl extends AbstractBootstrapService<User> {

    private String BOOTSTRAP_FILE = "/bootstrap/users.json";

    @Autowired
    private UserRepository userRepository;

    @Override
    public void bootstrap() {
        try {
            userRepository.deleteAll();
            userRepository.save(readData(User.class));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBootstrapFile() {
        return BOOTSTRAP_FILE;
    }
}
