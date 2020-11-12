package sn.simplon;

import org.apache.tomcat.jni.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sn.simplon.dao.IUserDao;

@SpringBootApplication
public class SenforagespringApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =SpringApplication.run(SenforagespringApplication.class, args);
	}
    IUserDao iUser = ctx.getBean(IUserDao.class);
    
    User user = new User();
    
}
