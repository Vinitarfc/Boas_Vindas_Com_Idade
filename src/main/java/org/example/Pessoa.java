package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String nome;
    String sobreNome;
    LocalDate dataNascimento;
    String cnh;

    Carro[] carros;

    public Pessoa(String Acnh, String Anome, String AsobreNome ){
        this.cnh = Acnh;
        this.nome = Anome;
        this.sobreNome = AsobreNome;
    }

    String saudacao(){
        return String
                 .format("Bem-vindo %s %s. Sua idade: %d e numero da CNH %s", nome, sobreNome, dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS), cnh);

    }
}
