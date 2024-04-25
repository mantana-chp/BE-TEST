package sit.int221.backendssa2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.int221.backendssa2.entities.Task;
import sit.int221.backendssa2.exceptions.ItemNotFoundException;
import sit.int221.backendssa2.repositories.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTask(){
        return repository.findAll();
    }

    public Task getTaskById(Integer id){
        return repository.findById(id).orElseThrow(()->new ItemNotFoundException("Task " + id + " does not exist !!!"));
    }
}
