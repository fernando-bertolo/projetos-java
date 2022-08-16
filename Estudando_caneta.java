public class Estudando_caneta{
    public static void main(String args[]){
        System.out.println("Caneta 1");
        
        Caneta c1 = new Caneta();
        
        c1.marca = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.7f;
        c1.carga = 50;
        c1.valor = 7.5f;
        
        c1.status();
        
    }
}