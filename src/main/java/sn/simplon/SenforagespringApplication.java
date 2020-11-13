package sn.simplon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sn.simplon.dao.IClientDao;
import sn.simplon.entities.Client;



@SpringBootApplication
public class SenforagespringApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SenforagespringApplication.class, args);

	}  
}
