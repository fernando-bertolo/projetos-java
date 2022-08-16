class Par_Impar_Switch{
    public static void main(String args[]){
        int cont;
        for(cont = 0; cont < 5; cont++){
        
        float num1, op;
        num1 = Float.parseFloat(args[0]);
        
        op = num1 % 2;
        
        
        switch((int)op){
            case 0:
                System.out.println(args[0] +" é PAR!!");
                break;
            case 1:
                System.out.println(args[0] +" é IMPAR!!");
                break;
            
        }
            
        }
        
    }
}