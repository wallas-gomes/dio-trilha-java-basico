import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
                int numero;
                String agencia;
                String nomeCliente;
                Double saldo= (double) 150;
                Scanner teclado= new Scanner(System.in);
                System.out.println("Por favor, digite o numero da agencia");
                agencia = teclado.next();
                System.out.println("Digite  numero da sua conta");
                numero = teclado.nextInt();
                System.out.println("Por favor, digite o seu nome");
                nomeCliente = teclado.next();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Olá ");
                stringBuilder.append(nomeCliente);
                stringBuilder.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
                stringBuilder.append(agencia);
                stringBuilder.append(" conta ");
                stringBuilder.append(numero);
                stringBuilder.append(" e seu saldo R$ ");
                stringBuilder.append(saldo);
                stringBuilder.append(" já está disponivel para saque");
                System.out.println(stringBuilder.toString());
    }
}