public class exibicaoPessoas{
    public static void main(String args[]){
        System.out.println("Pessoa 1\n");
        Pesagem p1 = new Pesagem();
        
        p1.nome = "Fernando";
        p1.idade = 19;
        p1.peso = 70.0f;
        p1.altura = 1.70f;
        
        p1.MostrarNome();
        p1.MostrarIdade();
        p1.MostrarPeso();
        p1.MostrarAltura();
        p1.CalculoIMC();
        
        
        System.out.println("\nPessoa 2\n");
        
        Pesagem p2 = new Pesagem();
        
        p2.nome = "Tigas";
        p2.idade = 28;
        p2.peso = 80.0f;
        p2.altura = 1.8f;
        
        p2.MostrarNome();
        p2.MostrarIdade();
        p2.MostrarPeso();
        p2.MostrarAltura();
        p2.CalculoIMC();
        
    }
    
}