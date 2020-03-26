
package de.project.sample.onlinetodolist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.project.sample.onlinetodolist.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

	public List<Task> findByUserId(String userId);
}
