package com.example.bootmybatis2.service;


import com.example.bootmybatis2.dao.HappinessDao;
import com.example.bootmybatis2.entity.Happiness;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class HappinessService {

    @Resource
    private HappinessDao happinessDao;

    public Happiness selectService(String city) {
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public String insertService(String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("city", name);
        map.put("num", 9421);
        try {
            happinessDao.insertHappiness(map);
//        int a = 1 / 0; //模拟故障
            return "添加成功";
        } catch (Exception e) {
            return "error";
        }
    }
}
