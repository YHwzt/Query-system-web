package com.yc.service;

import java.util.List;
import com.yc.beans.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserService {
List<User> findAll();
User findById(Integer id);
int deleteById(Integer id);
int updateById(User user);
int insertById(User user);
}
