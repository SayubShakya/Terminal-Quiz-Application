package com.sayub.model;

import java.io.Serializable;

public class Score implements Serializable {

    private int id;

    private String username;

    private int score;

    private long timeInSeconds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public long getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    @Override
    public String toString() {
        return "Score{" +
                "username='" + username + '\'' +
                ", score=" + score +
                ", timeInSeconds=" + timeInSeconds +
                '}';
    }
}
