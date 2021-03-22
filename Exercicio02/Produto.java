package Exercicio02;

import java.util.Scanner;

public class Produto {
  
    String nome;
    double valor = 0;
  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calcular t = new Calcular() ;
        System.out.println("Digite o nome do Produto: ");
        t.setNome(ler.nextLine());

        System.out.println("Digite o valor do Produto: ");
        t.setValor(ler.nextDouble());

        System.out.println("Nome do produto com desconto: "+t.getNome());
        System.out.println("Valor do produto com desconto:R$  "+t.calcularDesconto());
       
    
    }    

}