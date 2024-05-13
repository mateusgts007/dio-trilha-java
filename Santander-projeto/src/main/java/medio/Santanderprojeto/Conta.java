package medio.Santanderprojeto;

public abstract class Conta {

    protected String numeroDaConta;
    protected String titular;
    protected double saldo;
    
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void SetNumeroDaConta(String numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public void SetTitular(String titular){
        this.titular = titular;
    }

    public void SetSaldo(double saldo){
        this.saldo = saldo;
    }

    public Conta(String numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    

}
