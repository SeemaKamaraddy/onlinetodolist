package de.project.sample.onlinetodolist.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/showAddTaskpage").setViewName("addTask");
		registry.addViewController("/greetUser").setViewName("greetUser");
		registry.addViewController("/showEditTaskpage").setViewName("editTask");
	}

}
