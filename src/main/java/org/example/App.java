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
        Pessoa pessoa = new Pessoa();
        System.out.println( "Qual seu nome?" );
        pessoa.nome = entrada.nextLine() + " ";
        System.out.println( "Qual seu sobrenome?" );
        pessoa.sobreNome = entrada.nextLine();
        System.out.println( "Qual sua data de nascimento?");
        pessoa.dataNascimento = LocalDate.parse(entrada.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf(pessoa.saudacao());

    }
}
