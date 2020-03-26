package com.yc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yc.beans.User;
import com.yc.mapper.*;
import com.yc.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserMapper userMapper;
public List<User> findAll() {
return userMapper.selectByExample(null);
}
public User findById(Integer id) {
return userMapper.selectByPrimaryKey(id);
}
public int updateById(User user) {
return userMapper.updateByPrimaryKey(user);
}
public int insertById(User user) {
return userMapper.insert(user);
}
public int deleteById(Integer id) {
return userMapper.deleteByPrimaryKey(id);
}
}
