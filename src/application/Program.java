package application;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /* Exercicio 1
        int n = 0;
        do{
        System.out.println("Quantos números você vai digitar?");
        n = sc.nextInt();
        } while(n > 10);
        
        int [] vect = new int[n];
        
        for (int i = 0; i < vect.length; i++){
            System.out.println ("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.println ("NUMERO NEGATIVOS:");
    
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println (vect[i]);
            }
        }
        */
        
        /* Exercicio 2
        int n;
        System.out.println("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;
        
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }
        System.out.println();
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + sum/vect.length);
        */
        
        int n;
        System.out.println("Quantos pessoas serão digitadas?");
        n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        int sumAltura = 0;
        int menores16Anos = 0;
        
        
        for (int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            if(idade < 16){
                menores16Anos += 1;
            }
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            sumAltura += altura;
            vect[i] = new Pessoa(nome, idade, altura);
        }
        
        
        
        
        sc.close();
    }
    
}
