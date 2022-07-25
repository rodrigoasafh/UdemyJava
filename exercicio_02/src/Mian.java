import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rodrigo.vieira
 */
public class Mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Exercicio 5
        Scanner d = new Scanner (System.in);
        int cod, qtd;
        double calc;
        
        System.out.print("Infome Cód do Produto: ");
        cod = d.nextInt();
        
        
        if (cod == 1){
            System.out.println("Produto Escolhido: Cachorro-Quente");
            System.out.print("Infome Quantidade: ");
            qtd = d.nextInt();
            calc = qtd * 4.00;
            System.out.printf("Valor a Pagar = %.2f%n", calc);
        }
        else if (cod == 2) {
            System.out.println("Você escolheu: X-Salada");
            System.out.print("Infome Quantidade: ");
            qtd = d.nextInt();
            calc = qtd * 4.50;
            System.out.printf("Valor a Pagar = %.2f%n", calc);
        }
        else if (cod == 3) {
            System.out.println("Você escolheu: X-Bacon");
            System.out.print("Infome Quantidade: ");
            qtd = d.nextInt();
            calc = qtd * 5.00;
            System.out.printf("Valor a Paga = %.2f%n", calc);
        }
        else if (cod == 4){
            System.out.println("Você escolheu : Torrada Simples");
            System.out.print("Infome Quantidade: ");
            qtd = d.nextInt();
            calc = qtd * 2;
            System.out.printf("Valor a Paga = %.2f%n", calc);
        }
        else if (cod == 5){
            System.out.println("Você escolheu : Refrigerante");
            System.out.print("Infome Quantidade: ");
            qtd = d.nextInt();
            calc = qtd * 1.50;
            System.out.printf("Valor a Paga = %.2f%n", calc);
        }
        else{
            System.out.println("Cód Produto está errado!");
        }
        
        
        d.close();
        */
        
        /*Exercicio 06
        Scanner d  = new Scanner(System.in);
        double n;
                
        n = d.nextDouble();
        
        if (n < 0 ) {
            System.out.println("Fora do Intervalo");
        }
        else if (n >= 0 && n <= 25){
            System.out.println("Intervalo: [0, 25]");
        }
        else if (n >25 && n <= 50){
            System.out.println("Intervalo: [25, 50]");

        }
        else if (n > 50 && n <= 100){
            System.out.println("Intervalo [50, 100]");
        }
        else{
            System.out.println("Fora do Intevalo!");
        }
        */
        
        Scanner d = new Scanner(System.in);        
         
        double renda, imp = 0;
        
        renda = d.nextDouble();
        
        if (renda <= 2000){
            System.out.println("Isento");
        }
        else if (renda > 2000 && renda <= 3000){
            imp = 0.08 * renda;
            System.out.printf("Imposto a Pagar: %.2f%n", imp);
        }
        else if (renda > 3000 && renda <= 3002){
            imp = (0.08 * 1000) + (0.18 * 2);
            System.out.printf("Imposto a Pagar: %.2f%n", imp);
        }
        else if (renda > 3002 && renda < 4500){
            imp = 0.18 * renda;
            System.out.printf("Imposto a Pagar %.2f%n", imp);
        }
        else{
            imp = 0.28 * renda;
            System.out.printf("Imposto a Pagar %.2f%n", imp);
        }
            
        
    }
    
}
