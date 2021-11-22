import java.util.Scanner;

public class Banco {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.next();

        System.out.println("CPF: ");
        int cpf = sc.nextInt();

        System.out.println("Profissão:");
        String profissao = sc.next();

        System.out.println("Deposito inicial:");
        double depositoInicial = sc.nextDouble();

        Cliente cliente = new Cliente(nome, cpf, profissao);
        Conta conta = new Conta(depositoInicial, cliente);

        conta.deposita(100);

        boolean conseguiuRetirar = conta.saca(20);
		System.out.println("\nSaldo: " + conta.getSaldo());
		
        if (conseguiuRetirar) {
			System.out.println("Sacou com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}

        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("CPF: " + conta.getTitular().getCpf());
        System.out.println("Profissão: " + conta.getTitular().getProfissao());

        System.out.println("\nConta Corrente: " + conta.getAgencia() + " " + conta.getNumero());
        System.out.println("\nSaldo: " + conta.getSaldo());

        sc.close();
    }
}
