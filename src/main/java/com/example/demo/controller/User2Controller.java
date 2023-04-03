package com.example.demo.controller;

import com.example.demo.VO.MembVO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/app/")
public class User2Controller {

    @Autowired
    User2Service userService;

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResponseEntity<?> findAll(@RequestBody(required = false) MembVO membVO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("200");
        responseDTO.setRes(userService.findAll(membVO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = "findInArrayClass")
    public ResponseEntity<?> findInArrayClass(@RequestBody(required = false) MembVO membVO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("200");
        responseDTO.setRes(userService.findInArrayClass(membVO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = "findResultTypeMap")
    public ResponseEntity<?> findResultTypeMap(@RequestBody(required = false) MembVO membVO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setResultCode("200");
        responseDTO.setRes(userService.findResultTypeMap(membVO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
