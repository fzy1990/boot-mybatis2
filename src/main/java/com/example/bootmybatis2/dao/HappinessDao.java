package com.example.bootmybatis2.dao;

import com.example.bootmybatis2.entity.Happiness;
import org.apache.ibatis.annotations.*;

import java.util.HashMap;


@Mapper
public interface HappinessDao {
    Happiness findHappinessByCity(String city);
    int insertHappiness(HashMap<String, Object> map);
}
