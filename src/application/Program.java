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
        
        /* Exercicio 3
        int n;
        System.out.println("Quantos pessoas serão digitadas?");
        n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        double sumAltura = 0;
        double menores16Anos = 0;
        
        
        for (int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            
            if(idade < 16){
                menores16Anos += 1;
            }
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sumAltura += altura;
            vect[i] = new Pessoa(nome, idade, altura);
        }
        
        double mediaAltura = sumAltura/vect.length;
        System.out.println("Altura media: " + mediaAltura);
        
        double porcentagem16Anos = (menores16Anos / vect.length) * 100;
        System.out.println("Pessoas com mais de 16 anos: " + porcentagem16Anos + "%");
        
        for (int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }
        */
        
        /* Exercicio 4
        int n;
        System.out.print("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int[] vect = new int[n];
        
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println();
        
        System.out.println("NUMEROS PARES:");
        int qtdPares = 0;
        
        for(int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.print(vect[i]);
                System.out.print(" ");
                qtdPares += 1;
            }    
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);
        */
        
        
        
        sc.close();
    }
    
}
