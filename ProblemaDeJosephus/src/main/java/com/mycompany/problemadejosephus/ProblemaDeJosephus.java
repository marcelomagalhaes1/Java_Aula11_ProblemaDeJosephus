/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemadejosephus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Marcelo
 */
public class ProblemaDeJosephus {

     public static Pessoa josephus(List<Pessoa> roda, int m) {
        int indice = 0;
        while (roda.size() > 1) {

            indice = (indice + m - 1) % roda.size();

            roda.remove(indice);
        }

        return roda.get(0);
    }

    public static void main(String[] args) {

        List<Pessoa> roda = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Pessoa pessoa = new Pessoa("Nome" + i, "Telefone" + i, "Endereço" + i, "CPF" + i);
            roda.add(pessoa);
        }

        int m = new Random().nextInt(10) + 1;

        Pessoa ultimaPessoaRestante = josephus(roda, m);

        System.out.println("A última pessoa restante é: " + ultimaPessoaRestante.nome);
        System.out.println("Telefone: " + ultimaPessoaRestante.telefone);
        System.out.println("Endereço: " + ultimaPessoaRestante.endereco);
        System.out.println("CPF: " + ultimaPessoaRestante.cpf);
    }
}
