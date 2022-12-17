package net.javaguides.springboot;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootreactBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootreactBackendApplication.class, args);
	}

	@Autowired
	public UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ramesh","fatter","ram@gmail.com"));
		this.userRepository.save(new User("Chaithu","annam","Chaitu@gmail.com"));
		this.userRepository.save(new User("lavanya","annam","lavanya@gmail.com"));
	}
}
