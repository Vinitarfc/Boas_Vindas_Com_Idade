package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println( "Qual número da sua CNH?" );
        System.out.println( "Qual seu nome?" );
        System.out.println( "Qual seu sobrenome?" );
        Pessoa pessoa = new Pessoa(entrada.next(), entrada.next(), entrada.next());
        System.out.println( "Qual sua data de nascimento?");
        pessoa.dataNascimento = LocalDate.parse(entrada.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Carro fusca = new Carro();
        fusca.cor = "Branco";
        fusca.marca = "VW";
        fusca.placa = "mmm1m234";
        fusca.motorista = pessoa;

        System.out.printf(fusca.saudacao());

    }
}
