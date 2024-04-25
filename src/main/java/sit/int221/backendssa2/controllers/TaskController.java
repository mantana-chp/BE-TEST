package sit.int221.backendssa2.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int221.backendssa2.DTO.TaskDTO;
import sit.int221.backendssa2.entities.Task;
import sit.int221.backendssa2.services.TaskService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/itb-kk")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {
    @Autowired
    private TaskService service;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/v1/tasks")
    public List<TaskDTO> getAllTasks(){
        List<Task> tasks = service.getAllTask();
        return tasks.stream()
                .map(task -> modelMapper.map(task, TaskDTO.class))
                .collect(Collectors.toList());
    }


    @GetMapping("/v1/tasks/{id}")
    public Task getTaskById(@PathVariable Integer id){
        return service.getTaskById(id);
    }
}
