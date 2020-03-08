package model;

import lombok.Data;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Solution {

    @Id
    @Column(name = "SOLUTION_ID")
    Long solutionId;

    @Column(name = "TASK_NUMBER")
    Long taskNumber;

    String value;

    @ManyToOne
    @JoinColumn(name = "ASSIGNMENT_ID")
    Assignment assignmentId;

    @OneToOne
    @JoinColumn(name = "REPORT_ID")
    Report reportId;


}
