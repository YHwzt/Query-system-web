package com.yc.config;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.context.request.RequestContextListener;

import java.util.EventListener;

@Configuration
public class Security extends WebSecurityConfigurerAdapter {


    /*@Override
    public void configure(WebSecurity web) throws Exception {
        //设置静态资源不拦截
        web.ignoring().antMatchers("/js/**","/cs/**","/images/**");
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()                    //  定义当需要用户登录时候，转到的登录页面。
                .loginPage("/login.jsp")           // 设置登录页面
                .loginProcessingUrl("/login")  // 自定义的登录接口
                .defaultSuccessUrl("/index.jsp")
                .failureForwardUrl("/login.jsp")
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/login.jsp")//.logoutUrl("/login.jsp").deleteCookies("JSESSIONID")
                .and()
                .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/login.jsp").permitAll()     // 设置所有人都可以访问登录页面
                .antMatchers("/register.jsp").permitAll()
                .antMatchers("/user/insert").permitAll()
                .antMatchers("/logout").permitAll()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/images/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/layui/**").permitAll()
                .anyRequest()               // 任何请求,登录后可以访问
                .authenticated()
                .and()
                .csrf().disable()        // 关闭csrf防护
                .headers().frameOptions().disable();
    }
    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public ServletListenerRegistrationBean<EventListener> getDemoListener(){
        ServletListenerRegistrationBean<EventListener> registrationBean
                =new ServletListenerRegistrationBean<>();
        registrationBean.setListener(new RequestContextListener());
        //        registrationBean.setOrder(1);
        return registrationBean;
    }
}
