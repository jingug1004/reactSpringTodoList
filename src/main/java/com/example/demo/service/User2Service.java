package com.example.demo.service;

import com.example.demo.VO.MembVO;
import com.example.demo.mapper.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class User2Service {

    @Autowired
    User2Mapper userMapper;

    public ArrayList<HashMap<String, Object>> findAll(MembVO membVO) {
        return userMapper.findAll(membVO);
    }

    public List<MembVO.AlarmCodeNAlarmsInDTO> findInArrayClass(MembVO membVO) {
        return userMapper.findInArrayClass(membVO);
    }

    public List<Map> findResultTypeMap(MembVO membVO) {
        return userMapper.findResultTypeMap(membVO);
    }
}
