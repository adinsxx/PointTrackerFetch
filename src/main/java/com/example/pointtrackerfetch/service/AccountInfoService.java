package com.example.pointtrackerfetch.service;

import com.example.pointtrackerfetch.entity.AccountInfo;
import com.example.pointtrackerfetch.repo.AccountInfoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountInfoService {
    private AccountInfoRepository accountRepo;
    //object mapper provides functionality for reading/writing to/from POJOs.
    private ObjectMapper objectMapper;

    private AccountInfoService(AccountInfoRepository ar, ObjectMapper om){
        this.accountRepo = ar;
        this.objectMapper = om;
    }

    public List<AccountInfo> getAllAccounts() {
        List<AccountInfo> list = new ArrayList<>();
        accountRepo.findAll().forEach(list::add);
        return list;
    }
}
