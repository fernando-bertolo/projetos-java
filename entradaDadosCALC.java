import java.util.Scanner;

public class entradaDadosCALC{
    public static void main(){
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        
        //instanciando um objeto(calc) a classe calculadora
        calculadora calc = new calculadora(); 
        
        System.out.print("Digite o primeiro numero:");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo numero:");
        num2 = entrada.nextInt();  
        
        System.out.println("Soma: "+ calc.somar(num1, num2));
        System.out.println("Subtração: "+ calc.subtrair(num1, num2));
        System.out.println("Multiplição: "+ calc.mult(num1, num2));
        System.out.println("Divisão: "+ calc.div(num1, num2));
    }
}