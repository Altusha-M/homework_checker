package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Assignment {

    @Id
    @Column(name = "ASSIGNMENT_ID")
    Long assignmentId;

    String name;

    @OneToMany(fetch = FetchType.LAZY)
    List<Task> taskList;

}
