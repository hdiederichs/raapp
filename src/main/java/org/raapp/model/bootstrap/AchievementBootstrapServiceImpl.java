package org.raapp.model.bootstrap;

import org.raapp.model.Achievement;
import org.raapp.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by Tobias Glassner on 13.04.17.
 */
@Service
public class AchievementBootstrapServiceImpl extends AbstractBootstrapService<Achievement> {

    private String BOOTSTRAP_FILE = "bootstrap/achievements.json";

    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public void bootstrap() {
        try {
            achievementRepository.deleteAll();
            achievementRepository.save(readData(Achievement.class));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBootstrapFile() { return BOOTSTRAP_FILE; }
}
