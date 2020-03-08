package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
public class Task {

    @Id
    @Column(name = "TASK_ID")
    Long taskId;

    private Integer number;

    @ManyToOne
    @JoinColumn(name = "ASSIGNMENT_ID")
    private Assignment assignmentId;

    @OneToMany
    @JoinColumn(name = "TASK_ID")
    private List<Answer> answer;

}
