import cliente.cliente;
import conta.Cliente;
import conta.conta;
import contaCorrente.Corrente;
import contaPoupança.Poupanca;


public class aplication {
   public static void main(String[] args) {
   
    Cliente Hugo = (Cliente) new cliente();
    Hugo.setNome("hugo");

   conta Cc = new Corrente<>(null);
   conta Poupe = new Poupanca(null);

   Cc.Depositar(100);
   Cc.imprimirExtrato();

   Poupe.Depositar(100);
   Poupe.imprimirExtrato();
 
  
}
}