package lv.javaguru.java3.config;

import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.commands.TransactionalCommandExecutorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"lv.javaguru.java3"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandExecutor commandExecutor(){
        return new TransactionalCommandExecutorImpl();
    }
}
