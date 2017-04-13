package org.raapp.model;

import org.springframework.data.annotation.Id;

/**
 * A model class for user information
 */
@SuppressWarnings("unused")
public class User {

    @Id
    private String id;
    private String userName;
    private String password;
    private Customer customer;
    private String currentAchievementId;
    private double score;
    private int level;

    public User(String userName, String password, Customer customer, String currentAchievementId, double score, int level) {
        this.userName = userName;
        this.password = password;
        this.customer = customer;
        this.currentAchievementId = currentAchievementId;
        this.score = score;
        this.level = level;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCurrentAchievementId() {
        return currentAchievementId;
    }

    public void setCurrentAchievementId(String currentAchievementId) {
        this.currentAchievementId = currentAchievementId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (Double.compare(user.score, score) != 0) return false;
        if (level != user.level) return false;
        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (customer != null ? !customer.equals(user.customer) : user.customer != null) return false;
        return currentAchievementId != null ? currentAchievementId.equals(user.currentAchievementId) : user.currentAchievementId == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (currentAchievementId != null ? currentAchievementId.hashCode() : 0);
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", customer=" + customer +
                ", currentAchievementId='" + currentAchievementId + '\'' +
                ", score=" + score +
                ", level=" + level +
                '}';
    }
}
