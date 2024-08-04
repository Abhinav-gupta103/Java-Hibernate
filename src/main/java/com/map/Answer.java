package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;
    @OneToOne(mappedBy = "answer")
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }

    public int getanswerId() {
        return answerId;
    }

    public void setanswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getanswer() {
        return answer;
    }

    public void setanswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
    }

}
