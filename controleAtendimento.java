public class controleAtendimento{
    
    static private int numSenha;
    private int numCaixa;
    
    controleAtendimento(int caixa){
        numCaixa = caixa;
        numSenha = 0;
        System.out.println("Caixa " + numCaixa + " iniciou a operação");
        
    }
    
    public void proximaSenha(){
        numSenha++;
        System.out.println("Cliente com senha numero " + numSenha + " favor");
        System.out.println(" dirigir-se ao caixa número:" + numCaixa);
        
    }
}