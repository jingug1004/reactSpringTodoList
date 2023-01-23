package com.example.demo.mapper;

import com.example.demo.VO.MembVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface User2Mapper {

    ArrayList<HashMap<String, Object>> findAll();

    List<MembVO.AlarmCodeNAlarmsInDTO> findInArrayClass(MembVO membVO);
}