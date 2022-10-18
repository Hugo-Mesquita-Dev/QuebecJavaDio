package contaCorrente;

import conta.conta;

public class Corrente<Cliente> extends conta {

    public Corrente(conta.Cliente cliente) {
        super(cliente);}
    
    public void contaCorrente(Cliente cliente){
        
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirSaldo();
    }     
   
}
