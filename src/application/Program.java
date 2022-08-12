package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
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
        
        /* Exercicio 5
        int n;
        System.out.println("Quantos numeros você vai digitar? ");
        n = sc.nextInt();
        int[] vect = new int[n];
        int maiorValor = 0;
        int posicaoMaiorValor = 0;
        
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um valor: ");
            vect[i] = sc.nextInt();
            if(vect[i] > maiorValor){
                maiorValor = vect[i];
                posicaoMaiorValor = i;
            }
        }
        
        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
        */
        
        /* Exercicio 6
        int n;
        System.out.println("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int [n];
        
        System.out.println("Digite os valores de A:");
        for (int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores de B:");
        for (int i = 0; i < vectB.length; i++){
            vectB[i] = sc.nextInt();
            vectC[i] = vectB[i] + vectA[i];
        }
        
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vectB.length; i++){
           System.out.println(vectC[i]);
        }
        */
        
        /* Exercicio 7
        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;
        
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        
        double avg = sum/vect.length;
        System.out.println();
        System.out.println("MEDIA DO VETOR = " + avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < avg){
                System.out.println(vect[i]);
            }
        }
        */
        
        /* Exercicio 8
        int n;
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();
        int[] vect = new int[n];
        int sum = 0;
        int qtdPares = 0;
        double avgPares = 0;
        
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0){
                sum += vect[i];
                qtdPares += 1;
            }
        }
        
        
        if(sum != 0){
            avgPares = sum / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", avgPares);
        }
        else{
            System.out.println("NENHUM NUMERO PAR");
        }
        */
        
        /* Exercicio 9
        int n;
        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();
        String[] vectNome = new String[n];
        int[] vectIdade = new int[n];
        int maisVelho = 0;
        int posicaoMaisVelho = 0;
        
        for(int i = 0; i < vectNome.length; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            vectNome[i] = sc.next();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();
            if(vectIdade[i] > maisVelho){
                posicaoMaisVelho = i;
                maisVelho = vectIdade[i];
            }
        }
        
        System.out.println("PESSOA MAIS VELHA: " + vectNome[posicaoMaisVelho]);
        */
        
        /* Exercicio 10
        int n;
        System.out.print("Quantos alunos serao digitados? ");
        n = sc.nextInt();
        Aluno[] vect = new Aluno[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno", (i+1));
            System.out.println();
            String nome = sc.next();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble(); 
            vect[i] = new Aluno(nome, nota1, nota2);
            vect[i].calculaMedia();
            vect[i].Situacao();
        }
        
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getSituacao().equals("APROVADO")){
                System.out.println(vect[i].getNome());
            }
        }
        */
        
        /* Exercicio 11
        
        int n;
        System.out.print("Quantas pessoas serao digitas? ");
        n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];
        double sumAlturaMulheres = 0;
        int numeroMulheres = 0;
        int numeroHomens = 0;
        double menorAltura = 10;
        double maiorAltura = 0;
        
        for (int i = 0; i < vect.length; i++){
            System.out.printf("Altura da %da pessoa: ",i+1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ",i+1);
            String sexo = sc.next();
            vect[i] = new Pessoa(altura, sexo);
            
            if(altura < menorAltura){
                menorAltura = altura;
            }
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            
            if(sexo.equals("F")){
                sumAlturaMulheres += altura;
                numeroMulheres += 1;
            }
            else{
                numeroHomens +=1;
            }
        }
        
        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", (sumAlturaMulheres / numeroMulheres));
        System.out.println("Numero de homens = " + numeroHomens);
        */
        
        /*Desafio Pensionato
        Reserva[] vect = new Reserva[10];
        int n;
        System.out.print("How many rooms will be rented? ");
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println("Rent #" + (i+1) + ": ");
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Reserva(nome, email, room);
            System.out.println();
        }
        
        System.out.println("Busy rooms:");
        for(Reserva reserva : vect){
            if(reserva != null){
                System.out.println(reserva);
            }
        }
        */
        
        /*Trabalhando com listas 
        List <String> list = new ArrayList<>();
        
        list.add("Marcia");
        list.add("Joao");
        list.add("Bruno");
        list.add("Marcus");
        
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println();
        
        list.add(2,"Marco");
        
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println();
        System.out.println(list.size());

        list.remove("Marco");
        for(String x : list){
            System.out.println(x);
        }
        
        list.remove(2);
        System.out.println();
        
        for(String x : list){
            System.out.println(x);
        }
        
        list.removeIf(x -> x.charAt(0) == 'J');
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("Index of Marcia: " + list.indexOf("Marcia"));
        System.out.println("Index of Joao: " + list.indexOf("Joao")); /*se não está na lista retorna -1
        
        list.add("Marcia");
        list.add("Joao");
        list.add("Bruno");
        list.add("Marcus");
        
        System.out.println("---------------------");
        for(String x : list){
            System.out.println(x);
        }
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        
        System.out.println("---------------------");
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
        */
        
        /* Exercicio list
        int n;
        System.out.print("How many employees will be registered? ");
        n = sc.nextInt();
        List<Employee> list = new ArrayList<>();
        System.out.println();
        
        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list,id)){
                System.out.println("Id already taken!");
                System.out.print("Insert other id: ");
                id = sc.nextInt();
                
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }
        
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        
        // Primeira forma de resolver exercicio de lista
        Integer position = position(list,id);
        
        if (position == null){
            System.out.println("This id does not exist!:");
        }
        else{
            System.out.print("Enter the percentage:");
            double increase = sc.nextDouble();
            list.get(position).increaseSalary(increase);
        }
        
        
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        if(emp == null){
            System.out.println("This id does not exist!:");
        }
        else{
            System.out.print("Enter the percentage:");
            double increase = sc.nextDouble();
            emp.increaseSalary(increase);
        }
        
        System.out.println();
        System.out.println("List of employees:");
        for(Employee i : list){
        System.out.println(i);
        }
        */
        
        /* Exercicio Matriz
        System.out.println("Qual será a dimensão da matrix?");
        int n = sc.nextInt();
        
        int [][] mat = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Main diagonal:");
        for(int i = 0; i < n; i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        
        int count = 0;
        
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count ++;
                }
            }
        }
        
        System.out.println("Negative numbers = " + count);
        */
        
        /* Exercicio propost Matriz
        int n,m;
        System.out.println("Quantas linhas a matriz terá?");
        n = sc.nextInt();
        System.out.println("Quantas colunas a matriz terá?");
        m = sc.nextInt();
        System.out.println();
        System.out.println("Digite os valores da matriz");
        int[][] mat = new int [n][m];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Qual valor você quer analisar?");
        int valor = sc.nextInt();
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == valor){
                    System.out.println("Posicao " + i + "," + j + ":");
                    if(j > 0){
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if(j < mat[i].length-1){
                        System.out.println("Direita: " + mat[i][j+1]);
                    }
                    if(i > 0){
                        System.out.println("Acima: " + mat[i-1][j]);
                    }
                    if(i < mat.length-1){
                        System.out.println("Abaixo: " + mat[i+1][j]);
                    }
                }   
            }
        }
        */
        
        sc.close();
    }
    
    // Primeira forma de resolver exercicio de lista
        public static Integer position(List<Employee> list, int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    
    
    public static boolean hasId(List <Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null; 
    }
    
}
