package org.raapp.model;

import org.springframework.data.annotation.Id;

/**
 * A model class for achievement information
 */
@SuppressWarnings("unused")
public class Achievement {

    @Id
    private String id;
    private String title;
    private String description;
    private double difficulty;
    private double difficultyUser;
    private long averageSolvingTime;
    private double averageSolvingRate;

    public Achievement() {

    }

    public Achievement(String title, String description, double difficulty, double difficultyUser, long averageSolvingTime, double averageSolvingRate) {
        this.title = title;
        this.description = description;
        this.difficulty = difficulty;
        this.difficultyUser = difficultyUser;
        this.averageSolvingTime = averageSolvingTime;
        this.averageSolvingRate = averageSolvingRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getDifficultyUser() {
        return difficultyUser;
    }

    public void setDifficultyUser(double difficultyUser) {
        this.difficultyUser = difficultyUser;
    }

    public long getAverageSolvingTime() {
        return averageSolvingTime;
    }

    public void setAverageSolvingTime(long averageSolvingTime) {
        this.averageSolvingTime = averageSolvingTime;
    }

    public double getAverageSolvingRate() {
        return averageSolvingRate;
    }

    public void setAverageSolvingRate(double averageSolvingRate) {
        this.averageSolvingRate = averageSolvingRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Achievement)) return false;

        Achievement that = (Achievement) o;

        if (Double.compare(that.difficulty, difficulty) != 0) return false;
        if (Double.compare(that.difficultyUser, difficultyUser) != 0) return false;
        if (averageSolvingTime != that.averageSolvingTime) return false;
        if (Double.compare(that.averageSolvingRate, averageSolvingRate) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(difficulty);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(difficultyUser);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (averageSolvingTime ^ (averageSolvingTime >>> 32));
        temp = Double.doubleToLongBits(averageSolvingRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", difficulty=" + difficulty +
                ", difficultyUser=" + difficultyUser +
                ", averageSolvingTime=" + averageSolvingTime +
                ", averageSolvingRate=" + averageSolvingRate +
                '}';
    }
}
