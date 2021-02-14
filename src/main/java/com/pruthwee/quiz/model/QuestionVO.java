package com.pruthwee.quiz.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
@Table(name = "question")
public class QuestionVO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    private String name;

    @OneToMany()
    @JoinColumn(name = "option_id")
    private List<OptionVO> options;

    public QuestionVO() {
    }

    public QuestionVO(Long id, String name, List<OptionVO> options) {
        this.id = id;
        this.name = name;
        this.options = options;
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

    public List<OptionVO> getOptions() {
        return options;
    }

    public void setOptions(List<OptionVO> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuestionVO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", option=").append(options);
        sb.append('}');
        return sb.toString();
    }
}
