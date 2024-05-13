package medio.Santanderprojeto;

public class ContaCorrente extends Conta {
    
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroDaConta, String titular, double Saldo) {
        super(numeroDaConta, titular, Saldo);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }


    public void sacar(double valor) {

        if (valor <= (getSaldo() + limiteChequeEspecial)) {

            SetSaldo(getSaldo() - valor);

            System.out.println("Saque de " + valor + " realizado com sucesso.");

        } else {

            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {

        SetSaldo(getSaldo() + valor);

        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }


    public void transferir(Conta destino, double valor) {

        if (valor <= (getSaldo() + limiteChequeEspecial)) {

            SetSaldo(getSaldo() - valor);

            destino.SetSaldo(destino.getSaldo() + valor);

            System.out.println("Transferência de " + valor + " realizada com sucesso para " + destino.getNumeroDaConta() + ".");
            
        } else {

            System.out.println("Saldo insuficiente para transferência.");
        }

    }

}
