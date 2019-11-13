package fr.jha.todoapp;

import fr.jha.todoapp.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication {
    public static void main(String[] args) {SpringApplication.run(TodoappApplication.class, args);}
}
