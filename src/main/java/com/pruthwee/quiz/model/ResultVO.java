package com.pruthwee.quiz.model;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name = "result")
public class ResultVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserVO user;

    private Long score;

    public ResultVO() {
    }

    public ResultVO(Long id, UserVO user, Long score) {
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

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
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
        final StringBuilder sb = new StringBuilder("ResultVO{");
        sb.append("id=").append(id);
        sb.append(", user=").append(user);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }
}
