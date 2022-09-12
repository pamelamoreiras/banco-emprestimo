package com.pamela.bancoemprestimo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {

    private String name;
    private String cpf;
    private Integer age;
    private String location;
    private Double income;
    private List<Loan> loans;

}
