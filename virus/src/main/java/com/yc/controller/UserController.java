package com.yc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yc.beans.User;
import com.yc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> list = userService.findAll();
        model.addAttribute("list", list);
        return "/page/user/userItem.jsp";
    }

    @RequestMapping("/saveById")
    public String saveById(Model model, Integer id) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/page/user/userUpdate.jsp";
    }

    @RequestMapping("/deleteById")
    public String deleteById(Integer id) {
        userService.deleteById(id);
        return "findAll";
    }

    @RequestMapping("/updateById")
    public String updateById(User user) {
        userService.updateById(user);
        return "findAll";
    }

    @RequestMapping("/insert")
    public String insert(User user,Model model) {
        String encode = passwordEncoder.encode(user.getPassword());
        user.setPassword(encode);
        userService.insertById(user);
        model.addAttribute("msg","注册成功");
        return "/register.jsp";
    }
}