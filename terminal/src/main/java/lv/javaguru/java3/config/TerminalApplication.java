package lv.javaguru.java3.config;

import lv.javaguru.java3.commands.CommandExecutor;
import lv.javaguru.java3.commands.CommandExecutorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableAutoConfiguration(exclude={HibernateJpaAutoConfiguration.class,DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"lv.javaguru.java3"} )
@EnableWebMvc
public class TerminalApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TerminalApplication.class, args);
    }

    @Bean
    CommandExecutor commandExecutor(){
        return new CommandExecutorImpl();
    }

    @Bean
    public ViewResolver internalResourceViewResolver(){
        System.out.println("here");
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/*");
        viewResolver.setSuffix(".jsp");
        return  viewResolver;
    }



}