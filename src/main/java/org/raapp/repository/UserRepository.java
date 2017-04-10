package org.raapp.repository;

import org.raapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hds on 27.03.17.
 */
@SuppressWarnings("unused")
@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User getFirstByCustomer_FirstName(String firstName);
    List<User> findByCustomer_LastName(String lastName);

}
