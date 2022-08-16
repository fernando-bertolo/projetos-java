class Par_Impar_IF {
    public static void main(String args[]){
        float n;
        n = Float.parseFloat(args[0]);
        
        if(n%2 == 0){
            System.out.println(n +" é PAR");
        }
        else{
            System.out.println(n + " é IMPAR");
            
        }
        
    }
}