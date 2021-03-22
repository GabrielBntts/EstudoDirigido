package Exercicio11;

import java.util.Scanner;

public class Animal {
    
    String especie;
    String cor;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cachorro c1 = new Cachorro();
        Mosca m1 = new Mosca();
        Papagaio p1 = new Papagaio();

        System.out.println("Digite os dados do animais abaixo ");

        
        System.out.println("Digite a cor do pelo do cachorro: ");
        c1.setCorPelo(ler.nextLine());    
    
        System.out.println("Digite a quantidade de patas da Mosca: ");
        m1.setQtdPatas(ler.nextInt());
    
        System.out.println("Digite a cor das penas do Papagaio: ");
        p1.setCorPena(ler.next()); 
    
        System.out.println("Dados do animal 1:");
        System.out.println("Especificações: "+c1.getCorPelo());

        System.out.println("*****************************");

        System.out.println("Dados do animal 2:");
        System.out.println("Especificações : "+m1.getQtdPatas());

        System.out.println("******************************");

        System.out.println("Dados do animal 3:");
        System.out.println("Especificações : "+p1.getCorPena());
      
    }

      
    
    }    

