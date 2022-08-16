public class Carro{

        String marca;
        String modelo;
        String cor;
        int ano;
        float KM;
        float valor;
        boolean ligado;
        
        void status(){
            System.out.println("Marca: "+ this.marca);
            System.out.println("Modelo: "+ this.modelo);
            System.out.println("Cor: "+ this.cor);
            System.out.println("Ano: "+ this.ano);
            System.out.println("KM: "+ this.KM);
            System.out.println("Valor: "+ this.valor);
            
        }
        void acelerar(){
            if(this.ligado == true){
                System.out.println("O carro esta ligado, você pode acelerar!");
            }
            else{
                System.out.println("Você precisa ligar o carro para acelerar!");
            }
            
        }
        
        void ligar(){
            this.ligado = true;
            
        }
        void desligar(){
            this.ligado = false;
        }
        
        
    }

