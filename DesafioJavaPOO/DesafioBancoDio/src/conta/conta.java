package conta;

import Iconta.Iconta;

public abstract class conta implements Iconta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public conta(Cliente cliente){
        this.agencia = conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

  @Override
    public void Sacar(double valor) {
      saldo -= valor;
    }

    @Override
    public void Depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void Transferir(double valor, conta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirSaldo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public enum Cliente {
        ;

        public Object getNome() {
            return null;
        }
    }
  

}
