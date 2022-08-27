public class Pesagem{
    String nome;
    int idade;
    float peso;
    float altura;
    float IMC;
    
    void MostrarNome(){
        System.out.println("Nome: "+ this.nome);
    }
    
    void MostrarIdade(){
        System.out.println("Idade: "+ this.idade);
    }
    
    void MostrarPeso(){
        System.out.println("Peso: "+ this.peso);
    }
    void MostrarAltura(){
        System.out.println("Altura: "+ this.altura);
    }
    void CalculoIMC(){
        IMC = this.peso / (this.altura * this.altura);
        if(IMC < 18.5){
            System.out.println("Seu IMC é: "+ IMC);
            System.out.println("Abaixo do peso");
        }
            else if(IMC >= 18.5 && IMC <= 24.9){
                System.out.println("Seu IMC é: "+ IMC);
                System.out.println("Peso Normal");
            }
                else if(IMC >= 25 && IMC <= 29.9){
                    System.out.println("Seu IMC é: "+ IMC);
                    System.out.println("Acima do peso");
                }
                    else if(IMC >= 30 && IMC <= 34.9){
                        System.out.println("Seu IMC é: "+ IMC);
                        System.out.println("Obesidade grau 1");
                    }
                        else if(IMC >= 35 && IMC <= 39.9){
                            System.out.println("Seu IMC é: "+ IMC);
                            System.out.println("Obesidade grau 2");
                        }
                            else{
                                System.out.println("Seu IMC é: "+ IMC);
                                System.out.println("Obesidade grau 3");
                            }
        
    }
}