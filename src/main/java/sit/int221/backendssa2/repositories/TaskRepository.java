package sit.int221.backendssa2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int221.backendssa2.entities.Task;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
