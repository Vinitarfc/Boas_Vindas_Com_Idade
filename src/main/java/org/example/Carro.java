package org.example;

public class Carro {
    String placa;
    String cor;
    String marca;
    Pessoa motorista;

    String saudacao(){
        return String.format("Carro de placa %s é dirigido por %s %s. Especificação do motorista %s",
                placa, motorista.nome, motorista.sobreNome, motorista.saudacao());
    }
}
