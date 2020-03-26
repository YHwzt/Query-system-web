package com.yc.service.impl;

import com.yc.beans.User;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired(required=false)
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private UserService userService;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    username=username.trim();
		String password = request.getParameter("password").trim();
		String type = request.getParameter("type").trim();
		
		if (username.trim().equals("")||password.trim().equals("")) {
			System.out.println("请输入用户名和密码");
			throw new BadCredentialsException("请输入用户名和密码");
		}
		String dbPassword = findPasswordByUsernameAndType(username,type);
		if (dbPassword==null) {
			System.out.println("帐号不存在，请重新输入");
			throw new BadCredentialsException("帐号不存在，请重新输入");
		}
		System.out.println("passwordEncoder==="+passwordEncoder);
		if (passwordEncoder!=null) {
			if (!passwordEncoder.matches(password, dbPassword)) {
				System.out.println("密码错误，请重新输入");
				throw new BadCredentialsException("密码错误，请重新输入");
			}
		}else {
			if (!password.equals(dbPassword)) {
				System.out.println("密码错误，请重新输入");
				throw new BadCredentialsException("密码错误，请重新输入");
			}
		}
		
		
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//		List<Role> roles=null;
//		for (Role role : roles) {
//			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//		}
		UserDetails userDetails = new org.springframework.security.core.userdetails.User(username,
				dbPassword, authorities);
		return userDetails;
	}
	private String findPasswordByUsernameAndType(String username, String type) {
        List<User> list = userService.findAll();
        for (User user : list) {
			System.out.println(user);
            if (user.getUsername().equals(username)&&user.getType().startsWith(type)) {
                request.getSession().setAttribute("user",user);
                return user.getPassword();
            }
        }
		return null;
	}
}
