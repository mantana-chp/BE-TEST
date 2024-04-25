package sit.int221.backendssa2.DTO;

import lombok.Getter;
import lombok.Setter;
import sit.int221.backendssa2.entities.Task;

import java.util.Date;

@Setter
@Getter
public class TaskDTO {
    private Integer id;
    private String title;
    private String assignees;
    private String status;
}
