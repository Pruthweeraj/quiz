package com.pruthwee.quiz.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name = "option")
public class OptionVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionVO question;

    @Column(name = "is_answer")
    private boolean answer;

    public OptionVO() {
    }

    public OptionVO(Long id, String name, QuestionVO question, boolean answer) {
        this.id = id;
        this.name = name;
        this.question = question;
        this.answer = answer;
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

    public QuestionVO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionVO question) {
        this.question = question;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OptionVO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", question=").append(question);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }
}
