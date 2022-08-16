class Estudando_carro{
    public static void main(String args[]){
        System.out.println("CARRO 1\n");
        
        Carro c1 = new Carro();
        
        c1.marca = "Honda";
        c1.modelo = "Civic";
        c1.cor = "Preto";
        c1.ano = 2022;
        c1.KM = 2000;
        c1.valor = 180000;
        
        c1.status();
        c1.ligar();
        c1.acelerar();
        
        System.out.println("\nCARRO 2\n");
    
        Carro c2 = new Carro();
        
        c2.marca = "Porsche";
        c2.modelo = "911";
        c2.cor = "Azul";
        c2.ano = 2020;
        c2.KM = 13000;
        c2.valor = 689000;
        
        c2.status();
        c2.desligar();
        c2.acelerar();
        
        
    }
}