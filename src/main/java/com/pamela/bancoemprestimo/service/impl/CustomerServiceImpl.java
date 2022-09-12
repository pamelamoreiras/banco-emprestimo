package com.pamela.bancoemprestimo.service.impl;

import com.pamela.bancoemprestimo.dto.CustomerRequest;
import com.pamela.bancoemprestimo.dto.CustomerResponse;
import com.pamela.bancoemprestimo.dto.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {

    public CustomerResponse execute(final CustomerRequest customerRequest) {
        if (customerRequest.getIncome() <= 3000){

            if (customerRequest.getAge() < 30
                    && customerRequest.getLocation().equalsIgnoreCase("SP")){
                return CustomerResponse.builder()
                        .name(customerRequest.getName())
                        .loans(List.of(Loan.builder()
                                        .type("personal")
                                        .taxes(1)
                                        .build(),
                                Loan.builder()
                                        .type("loan with guarantee")
                                        .taxes(2)
                                        .build()
                        ))
                        .build();
            }
        }

        if (customerRequest.getIncome() > 3000
                && customerRequest.getIncome() < 5000) {

            if (customerRequest.getLocation().equalsIgnoreCase("SP")) {
                return CustomerResponse.builder()
                        .name(customerRequest.getName())
                        .loans(List.of(Loan.builder()
                                .type("personal")
                                .taxes(1)
                                .build(),
                                Loan.builder()
                                        .type("loan with guarantee")
                                        .taxes(2)
                                        .build()
                                ))
                        .build();
            }
        }

        if (customerRequest.getIncome() > 5000) {

            if (customerRequest.getLocation().equalsIgnoreCase("SP")) {
                return CustomerResponse.builder()
                        .name(customerRequest.getName())
                        .loans(List.of(Loan.builder()
                                        .type("personal")
                                        .taxes(1)
                                        .build(),
                                Loan.builder()
                                        .type("loan with guarantee")
                                        .taxes(2)
                                        .build(),
                                Loan.builder()
                                        .type("consigned")
                                        .taxes(3)
                                        .build()
                        ))
                        .build();
            }

            return CustomerResponse.builder()
                    .name(customerRequest.getName())
                    .loans(List.of(Loan.builder()
                                    .type("personal")
                                    .taxes(1)
                                    .build(),
                            Loan.builder()
                                    .type("consigned")
                                    .taxes(2)
                                    .build()
                    ))
                    .build();
        }

        return CustomerResponse.builder()
                .name(customerRequest.getName())
                .loans(List.of(Loan.builder()
                        .type("personal")
                        .taxes(1)
                        .build()))
                .build();
    }
}
