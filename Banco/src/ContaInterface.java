public interface ContaInterface { /// "contrato" classe abstrata de metodos abstratos,
 //obriga a implementar oq ela tem

     void depositar (double valor); /// colocar public é redundante pq todos os metodos ja sao publicos

     void sacar (double valor);
    
     void transferir (double valor, Conta contaDestino); /// metodo generico pra contas corrente e poupanca

    void imprimirExtrato();

    void informacoesclientes();
}
