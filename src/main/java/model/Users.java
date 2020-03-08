package model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Users {

    @Id
    @Column(name = "USER_ID")
    Long userId;

    String name;

    @OneToMany
    @JoinColumn(name = "REPORT_ID")
    List<Report> reports;

}
