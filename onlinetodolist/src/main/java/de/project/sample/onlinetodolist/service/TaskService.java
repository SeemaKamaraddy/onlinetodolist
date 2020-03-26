
package de.project.sample.onlinetodolist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.project.sample.onlinetodolist.dao.TaskRepository;
import de.project.sample.onlinetodolist.model.Task;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public void addOrUpdateTask(Task task) {
		taskRepository.save(task);
	}

	public void removeTask(int id) {
		taskRepository.deleteById(id);

	}

	public Task getTaskById(int id) {
		Optional<Task> task = taskRepository.findById(id);
		return task.get();
	}
	
	public List<Task> getListsofTasksByUserId(String userId){
		return taskRepository.findByUserId(userId);
	}

	public List<Task> listTasks() {
		return taskRepository.findAll();
	}
}
