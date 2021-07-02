public class Teste

public static void main(String[] args) {
	System.out.println("*** Teste Conta ***")

	Teste contaSimples = new 	Conta();
	contaSimples.setnome("Nome")
	contaSimples.setnumConta("3443")
	contaSimples.setnumAgencia("90900")

    contaSimples.depositar(50);

    if (contaSimples.sacar(50)) {
        System.out.println("Saque efetuado, seu saldo agora é =" + contaSimples.getSaldo);
}

   System.out.println(contaSimples)
}