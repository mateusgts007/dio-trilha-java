package medio.Santanderprojeto;

import medio.Santanderprojeto.Conta;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(String numeroDaConta, String titular, double valor) {
        super(numeroDaConta, titular, valor);
    }


    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }


    public void sacar(double valor) {

        if (valor <= getSaldo()) {

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

        if (valor <= getSaldo()) {

            SetSaldo(getSaldo() - valor);

            destino.SetSaldo(destino.getSaldo() + valor);

            System.out.println("Transferência de " + valor + " realizada com sucesso para " + destino.getNumeroDaConta() + ".");

        } else {

            System.out.println("Saldo insuficiente para transferência.");
        }

    }

}
