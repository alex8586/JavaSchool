package lv.javaguru.java3.config;

import com.sun.corba.se.impl.activation.CommandHandler;
import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.commands.CommandExecutorImpl;
import org.omg.CORBA.ORB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.io.PrintStream;


@Configuration
@EnableAutoConfiguration(exclude={HibernateJpaAutoConfiguration.class,DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"lv.javaguru.java3"} )
public class TerminalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TerminalApplication.class, args);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    CommandExecutor commandExecutor(){
        return new CommandExecutorImpl();
    }

}