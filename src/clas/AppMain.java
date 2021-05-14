package appmain;



public class AppMain {

    public static void main(String[] args) {
        
        ContaBanco cb1 = new ContaBanco("141414-1", "Seu Madruga", 'P');
        cb1.setDepositar(1000.0f);
        cb1.setSacar(500.0f);
        
        ContaBanco cb2 = new ContaBanco("717171-7", "Dona Clotilde", 'C');
        cb2.setDepositar(1500.0f);
        
        
        Agencia ag = new Agencia(12345, "Tangamandápio");
        ag.adicionarConta(cb1);
        ag.adicionarConta(cb2);
        ag.listarContas();
        
    }
     
}