package org.raapp.repository;

import org.raapp.model.AchievementHistorie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hds on 29.03.17.
 */
@SuppressWarnings("unused")
@Repository
public interface AchievementHistoryRepository extends MongoRepository<AchievementHistorie, String> {

}
