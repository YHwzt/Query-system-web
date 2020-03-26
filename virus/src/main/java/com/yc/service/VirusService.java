package com.yc.service;

import java.util.List;
import com.yc.beans.Virus;
import org.apache.ibatis.annotations.Mapper;

public interface VirusService {
List<Virus> findAll();
Virus findById(Integer id);
int deleteById(Integer id);
int updateById(Virus virus);
int insertById(Virus virus);
}
