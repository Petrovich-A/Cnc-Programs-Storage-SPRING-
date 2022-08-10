package by.petrovich.storage;

import by.petrovich.storage.accessingdatajpa.UserRepository;
import by.petrovich.storage.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CncProgramsStorageApplication {
    private static final Logger log = LoggerFactory.getLogger(CncProgramsStorageApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CncProgramsStorageApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository){
        return (args) -> {
          repository.save(new User("John", "Smith"));
          repository.save(new User("Ray", "Palmer"));
          log.info("Users found with findAll():");
          for (User user : repository.findAll()){
              log.info(user.toString());
          }
        };
    }

}
