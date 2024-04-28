public abstract class Conta implements ContaInterface { // classe pai de conta corrente e poupança
// classe abstrata nao pode ser instanciada com o new, nao faz sentido instanciar a classe conta

private static  int AGENCIA_PADRAO = 1;
private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        
        System.out.println("Informe o valor para deposito");
        
       
        this.saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        
        if (valor <= saldo){
        this.saldo -= valor;
        }

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    protected void imprimirInformacoesComuns(){ /// so filhos tem acesso
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f", this.saldo));
   
}

    public void informacoesclientes(){
        System.out.println(String.format("Nome: %s", this.cliente.getNome()));
        System.out.println(String.format("Sobrenome: %s", this.cliente.getSobrenome()));
        System.out.println(String.format("Cpf: %s", this.cliente.getCpf()));
        
    }

    public int getAgencia (){
        return agencia;
    }

    public int getNumero (){
        return numero;
    }

    public double getSaldo (){
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

  

}
