package pl.sda.javagdy2.spring.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

@Autowired
    DataSource dataSource;

@Override
protected void configure(AuthenticationManagerBuilder auth)
    throws Exception{
    auth.jdbcAuthentication()
            .dataSource(dataSource).passwordEncoder(new BCryptPasswordEncoder());
}
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//        throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("{noop}pasword")
//                .roles("USER")
//                .and()
//                .withUser("user1")
//                .password("{noop}pasword1")
//                .roles("USER")
//                .and()
//                .withUser("user2")
//                .password("{noop}pasword2")
//                .roles("ADMIN");
//    }



}
