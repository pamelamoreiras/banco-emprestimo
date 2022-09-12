# banco-emprestimo
Este repositório foi feito para treinar a habilidade de resolver um teste técnico de contratação.

A proposta da aplicação que vamos desenvolver em conjunto é disponibilizar a uma pessoa as modalidades
de empréstimo as quais ela tem acesso de acordo com algumas variáveis.
Abaixo seguem as regras de negócio relacionadas a concessão de empréstimo de acordo com o perfil da pessoa:

|       Salário           | Empréstimo pessoal |  Empréstimo c/ garantia  |   Consignado    |
| ----------------------- | ------------------ |  ----------------------  |   ----------    |
| Salário <= 3000         |        Sim         |           Sim***         |       Não       |
| ----------------------- | ------------------ |  ----------------------  |   ----------    |
| Salário > 3000 e < 5000 |        Sim         |           Sim**          |       Não       |
| ----------------------- | ------------------ |  ----------------------  |   ----------    |
| Salário => 5000         |        Sim         |           Sim*           |       Sim       |

*Clientes com menos de 30 anos;

** Clientes que residem em SP;

*** Clientes com menos de 30 anos que residem em SP
