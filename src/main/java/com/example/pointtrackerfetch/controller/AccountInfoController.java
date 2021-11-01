package com.example.pointtrackerfetch.controller;

import com.example.pointtrackerfetch.entity.AccountInfo;
import com.example.pointtrackerfetch.repo.AccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountInfoController {
    private AccountInfoRepository repo;

    @Autowired
    public AccountInfoController(AccountInfoRepository ar) {
        this.repo = ar;
    }

    @GetMapping("/api/accounts")
    public List<AccountInfo> getInfo(){
        return repo.findAll();
    }


}
