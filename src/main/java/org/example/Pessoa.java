package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String nome;
    String sobreNome;
    LocalDate dataNascimento;

    String saudacao(){
        return String
                 .format("Bem-vindo %s %s. Sua idade: %d", nome, sobreNome, dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS));

    }
}
