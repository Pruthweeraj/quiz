package com.pruthwee.quiz.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name = "user")
public class UserVO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String password;
    private String role;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    private ResultVO result;


    public UserVO() {
    }

    public UserVO(Long id, String name, String password, String role, ResultVO result) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ResultVO getResult() {
        return result;
    }

    public void setResult(ResultVO result) {
        this.result = result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserVO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", role='").append(role).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
