package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Report {

    @Id
    @Column(name = "REPORT_ID")
    private Long reportId;

    @ManyToOne
    @JoinColumn(name = "ASSIGNMENT_ID")
    private Assignment assignmentId;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Users userId;

    @OneToOne
    @JoinColumn(name = "SOLUTION_ID")
    private Solution solutionId;

    private String correctValue;

    private Boolean isCorrect;

}
