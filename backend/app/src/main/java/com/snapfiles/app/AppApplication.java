package com.snapfiles.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan("com.snapfiles.app.*")
public class AppApplication implements CommandLineRunner{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        String sql = " DESC CARS ";
        try {
            jdbcTemplate.execute(sql);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        
    }
}
