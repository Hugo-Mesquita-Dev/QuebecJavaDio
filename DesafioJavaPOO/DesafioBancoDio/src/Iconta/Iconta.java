package Iconta;

import conta.conta;

public interface Iconta {
     void Sacar(double valor);

     void Depositar(double valor); 

     void Transferir(double valor, conta contaDestino);

     void imprimirExtrato();

}
