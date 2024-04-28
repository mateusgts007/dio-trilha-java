public class ContaCorrente extends Conta {/// classe filha da classe conta

   
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        
    }

    public void imprimirExtrato() {
       
        System.out.println("EXTRATO CONTA CORRENTE ********");
        imprimirInformacoesComuns();

        

    }


   

  


}
