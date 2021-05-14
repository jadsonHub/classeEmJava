package appmain;

import java.util.ArrayList;

public class Agencia {
    
       private Integer numero;
       private String  cidade;
       private ArrayList <ContaBanco> listarContas;
       
    public Agencia(Integer numero, String cidade){
       
        this.numero = numero;
        this.cidade = cidade;
        this.listarContas = new ArrayList();
        
    }
     
    public Integer getNumero(){
        return this.numero;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public void adicionarConta(ContaBanco Contas) {
        
        this.listarContas.add(Contas);
        
    }

   public void  listarContas() {
       int i = 0;
       
       System.out.println("Agencia: " +this.numero+" Cidade: " +this.cidade );
        while (i < listarContas.size()){

            System.out.println("\nNumero conta: "+ this.listarContas.get(i).getNumeroConta());
            System.out.println("Nome titular: "+ this.listarContas.get(i).getTitular());
            System.out.println("Tipo de conta:"+ this.listarContas.get(i).getTipoConta());
            System.out.println("saldo:R$ "+this.listarContas.get(i).getSaldo());
            i++;
        }
    }
      
    }
    

