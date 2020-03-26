package de.project.sample.onlinetodolist.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import de.project.sample.onlinetodolist.dao.TaskRepository;
import de.project.sample.onlinetodolist.service.TaskService;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class TaskControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TaskService taskService;

	@MockBean
	private TaskRepository taskRepository;

	@WithMockUser("seema")
	@Test
	public void getTasksList_shouldSucceedWith200() throws Exception {
		mockMvc.perform(get("/tasks")).andExpect(status().is(204));
	}

}
