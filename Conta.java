public class Conta.java

private String nome;
private String numConta;
private String numAgencia;
private double saldo;

public String nome() {
	return nome;
}

public String numConta() {
	return numConta;
}

public String numAgencia() {
	return numAgencia
}

public void saldo(double saldo) {
	this.saldo = saldo;
}
public String toString() {
	String s= "Conta";
    s += "; nome:" + nome;
    s += "; numConta:" + numConta;
    s += "; numAgencia:" + numAgencia;
    s += "; saldo:" + saldo;
    s += "]";

    return s;
}

public void depositar(double valor) {
    saldo+=valor;
}

public boolean sacar(double valor){
	if ((saldo-valor) >=0) {
		saldo -= valor;
		return true;
	}
        return false;

}