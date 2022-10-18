package contaPoupança;

import conta.conta;

public class Poupanca extends conta {
    
    public Poupanca(conta.Cliente hugo){
        super(hugo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirSaldo();
    }
}
