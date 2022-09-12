package com.pamela.bancoemprestimo.controller;

import com.pamela.bancoemprestimo.dto.CustomerRequest;
import com.pamela.bancoemprestimo.dto.CustomerResponse;
import com.pamela.bancoemprestimo.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl service;

    @GetMapping
    public CustomerResponse qualquerNome(@RequestBody final CustomerRequest customerRequest){
        return service.execute(customerRequest);
    }
}
