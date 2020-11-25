package sn.simplon.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	
	@Override
public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		PasswordEncoder passwordEncoder=PasswordEncoder();
		System.out.println("*****************");
		System.out.println(passwordEncoder.encode("1234"));
		System.out.println("******************");
		
		
		auth.inMemoryAuthentication().withUser("admin@admin.com").password(passwordEncoder.encode("1234")).roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password(passwordEncoder.encode("1234")).roles("USER");


}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin();
		http.authorizeRequests().antMatchers("/save**/**","/delete**/**").hasRole("ADMIN");
		http.authorizeRequests().anyRequest().authenticated();
		http.csrf();
//			.authorizeRequests()
//				.anyRequest()
//					.authenticated()
//						.and()
//		     .formLogin()		
//		     	.loginPage("/login")
//		     	.permitAll();
//		
	}
	@Bean
	public PasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}
