package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
public class Answer {

    @Id
    @Column(name = "ANSWER_ID")
    Long answerId;

    String value;

    @ManyToOne
    @JoinColumn(name = "TASK_ID")
    Task taskId;

}
