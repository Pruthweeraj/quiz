package com.pruthwee.quiz.domain;

import org.springframework.stereotype.Component;

@Component
public class Result {

    private Long id;
    private User user;
    private Long score;

    public Result() {
    }

    public Result(Long id, User user, Long score) {
        this.id = id;
        this.user = user;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Result{");
        sb.append("id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
