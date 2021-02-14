package com.pruthwee.quiz.domain;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Question {

    private Long id;
    private String name;
    private List<Option> options;

    public Question() {
    }

    public Question(Long id, String name, List<Option> option) {
        this.id = id;
        this.name = name;
        this.options = option;
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Question{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", option=").append(options);
        sb.append('}');
        return sb.toString();
    }
}
