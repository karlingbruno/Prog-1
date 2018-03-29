import java.util.*;
import javax.swing.JOptionPane;
class Programa{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Conta minhaConta = new Conta();
    System.out.println("Digite o nome do titular da conta : ");
    minhaConta.dono = scan.nextLine();
    System.out.println("Digite o saldo inicial dessa conta : ");
    minhaConta.saldo = scan.nextDouble();
    System.out.println("\nDono da conta : "+minhaConta.dono);
    System.out.println("Saldo da conta : "+minhaConta.saldo);
    minhaConta.sacar(500);
    System.out.println("Saldo da conta após o saque :"+minhaConta.saldo);
    minhaConta.depositar(222);
    System.out.println("Saldo da conta após o deposito : "+minhaConta.saldo);
  }
}
