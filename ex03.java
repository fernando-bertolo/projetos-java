public class ex03{
    public static void main(String args[]){
        try{
            double num1;
            num1 = Double.parseDouble(args[0]);
            
            if(num1 == Integer.parseInt(args[0]) & num1 > 0){
                System.out.println(args[0] +" é positivo");
            }
            else if(num1 == Integer.parseInt(args[0]) & num1 < 0){
                System.out.println(args[0] +" é negativo");
            }
            else{
                System.out.println("Digite corretamente");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Numero de argumentos invalidos");
        }
        
        catch(NumberFormatException e){
            System.out.println("Digite um numero válido!");
        }
        
    }
}
