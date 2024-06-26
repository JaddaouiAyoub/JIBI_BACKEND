package com.example.backend.controller;

import com.example.backend.model.dto.CodeDTO;
import com.example.backend.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/codes")
public class SMSRestController {

    @Autowired
    private SMSService smsService;

    @PostMapping("/send")
    public String sendCode(@RequestBody CodeDTO codeDTO) {
        return smsService.sendCode(codeDTO);
    }
}
