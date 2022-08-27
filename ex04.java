public class ex04{
    public static void main(String args[]){
        
    for(int contador = 0; contador < 10; contador++){
        int num = 0;
        while(num < 5){
            num = (int)(Math.random()*10);
        }
        System.out.println(contador +"º Resultado: "+ num);
    }
    }
}

