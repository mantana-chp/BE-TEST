package sit.int221.backendssa2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "task")
public class Task {
    @Id
    @Column(name = "id" , nullable = false)
    private Integer id;
    @Column(name = "taskTitle", nullable = false, length = 100)
    private String title;
    @Column(name = "taskAssignees", length = 30)
    private String assignees;
    @Column(name = "taskStatus", nullable = false)
    private String status;
    @Column(name = "taskDescription", length = 500)
    private String description;
     private Date createdOn;
     private Date updatedOn;
}

