package org.raapp.model;

import org.springframework.data.annotation.Id;

import java.util.Calendar;

/**
 *
 */
@SuppressWarnings("unused")
public class AchievementHistorie {

    @Id
    private String id;
    private String userId;
    private String achievementId;
    private double difficulty;
    private Calendar time;

    public AchievementHistorie() {
    }

    public AchievementHistorie(String userId, String achievementId, double difficulty, Calendar time) {
        this.userId = userId;
        this.achievementId = achievementId;
        this.difficulty = difficulty;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(String achievementId) {
        this.achievementId = achievementId;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AchievementHistorie)) return false;

        AchievementHistorie that = (AchievementHistorie) o;

        if (Double.compare(that.difficulty, difficulty) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (achievementId != null ? !achievementId.equals(that.achievementId) : that.achievementId != null)
            return false;
        return time != null ? time.equals(that.time) : that.time == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (achievementId != null ? achievementId.hashCode() : 0);
        temp = Double.doubleToLongBits(difficulty);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AchievementHistorie{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", achievementId='" + achievementId + '\'' +
                ", difficulty=" + difficulty +
                ", time=" + time +
                '}';
    }
}
