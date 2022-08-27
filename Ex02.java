//Biblioteca importada para a entrada/leitura de dados
import java.util.Scanner;


class Ex02{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("=====Sistema de calculos=====");        
        System.out.println("1 - Digite 0 para parar o calculo\n");
        
        int contador = 0, soma = 0,somaPar = 0, somaImpar = 0, count = 0, maiorNumero = 0, countPar = 0, countImpar = 0;
        float media = 0, mediaNumeroPares = 0, mediaNumerosImpares = 0;
        //Utilização do while para repetir até que seja digitado 0
        while(contador == 0){ 
            System.out.println("Digite os valores inteiros: ");
            
            //entrada da variavel "valor" do tipo inteiro
            int valor = input.nextInt();
             
            // se valor for igual a 0 printa "zero detectado" e pare a execução
            if(valor == 0){
                System.out.println("\nZero detectado");
                contador = 1;
            }   
            
            //se "maiorNumero" for menor que "valor", "maiorNumero" recebe "valor"
            if(maiorNumero < valor){
                maiorNumero = valor;
            }
            
            //se o resto da divisao de valor por 2 for igual a 0 faça isso se nao faça aquilo
            if(valor % 2 == 0){
                countPar += 1;
                somaPar += valor;
            }else{
                countImpar += 1;
                somaImpar += valor;
            }
            
            count += 1;
            soma += valor;
        }
        
        count += -1;
        countPar += -1;
        media = soma / count;
        mediaNumeroPares = somaPar / countPar;
        mediaNumerosImpares = somaImpar / countImpar;
        
        //exibição dos valores
        System.out.println("\nA soma de todos os valores é: "+ soma);
        System.out.println("\nQuantidade de numeros digitados: "+ count);
        System.out.println("\nA media dos numeros é: "+ media);
        System.out.println("\nO maior numero é: "+ maiorNumero);
        System.out.println("\nA media dos numeros pares é: "+ mediaNumeroPares);
        System.out.println("\nA media dos numeros impares é: "+ mediaNumerosImpares);
      
        
        
       
        
}
    
}