public class Main {
 
        public static void main (String [] args){

            Cliente mateus = new Cliente();
            mateus.setNome("Mateus");
            mateus.setSobrenome("Andrade");
            mateus.setCpf("1908973232");

            Cliente jorge = new Cliente();
            jorge.setNome("jorge");
            jorge.setSobrenome("Silveira");
            jorge.setCpf("45245234523");

            Conta corrente = new ContaCorrente(mateus);
            corrente.depositar(100);

            Conta poupanca = new ContaPoupanca(jorge);
     
            corrente.transferir(50, poupanca);


            
            corrente.imprimirExtrato();
            poupanca.imprimirExtrato();
        

        }


}
