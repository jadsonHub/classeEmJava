package appmain;

public  class ContaBanco {
      
    
   
    private String numeroConta;
    private String nomeTitular;
    private Character tipoConta ;
    private Float saldo = 0.0f;
    private Float limiteSaque;
    
    
    public ContaBanco( String numeroConta, String nomeTitular, Character tipoConta){
        
       
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.limiteSaque = 500f;
        setTipoConta(tipoConta);
        
        
    }
    public String setTitular(){
        
        return this.nomeTitular;
    }
   
    public String getTitular(){
        return this.nomeTitular;
    }
    
    public Character getTipoConta(){
        return this.tipoConta;
    }

    
    public String getNumeroConta() {
        return this.numeroConta;
    }
    
    public Float getSaldo(){
        return this.saldo;
    }
    
    
  
    public Float  setSacar(float valor){
        if(saldo >0){
            
            if( valor < saldo && valor <= limiteSaque){
                this.saldo = saldo - valor;
                System.out.println("Saque realizado com sucesso!");
            }else{
                System.out.println("Não e possivel fazer saque valor Invalido!");
            }    
        }
         else{
           System.out.println("Nao e possivel realizar o saque! conta sem saldo");
        } 
        return valor;
    }
     
    public Float setDepositar(Float valor ){
        
        if (valor > 0){
            saldo = saldo + valor;
        }
        
        return this.saldo;
    }
    
    
    
    public Character  setTipoConta(Character tipoConta){
        if(tipoConta == 'C' || tipoConta == 'P'){
            this.tipoConta = tipoConta;
        }else{
            this.tipoConta = 'P';
        }
        return this.tipoConta;
        
        
    }
     
    void ImprimirDados(){
         
        System.out.println("\tDados da conta");
        System.out.println("\nNome titular :"+this.nomeTitular+"\nNumero da conta:"+this.numeroConta+"\nTipo de conta :"+this.tipoConta+"\nSaldo R$"+this.saldo);
        
    }

    
     
}
