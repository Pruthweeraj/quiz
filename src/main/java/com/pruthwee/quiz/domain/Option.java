package com.pruthwee.quiz.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Option {

    private Long id;
    private String name;
    private Question question;
    private boolean selected;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private boolean answer;

    public Option() {
    }

    public Option(Long id, String name, Question question, boolean selected, boolean answer) {
        this.id = id;
        this.name = name;
        this.question = question;
        this.selected = selected;
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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Option{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", question=").append(question);
        sb.append(", selected=").append(selected);
        sb.append(", answer=").append(answer);
        sb.append('}');
        return sb.toString();
    }
}
