import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x,y,z,proc,procura;
    List<Conta> contas = new ArrayList<>();
    Conta cc = new Conta();
    do{
      System.out.println("1 : Adicionar nova conta \n2 : Depositar\n3 : Sacar \n4 : Listar todas as contas \n0 : Sair");
      x = scan.nextInt();
      switch(x){
        case 1 :
          Conta teste = new Conta();
          System.out.println("Digite o nome do titular da conta :");
          teste.dono = scan.next();
          System.out.println("Digite o saldo inicial da conta :");
          teste.saldo = scan.nextDouble();
          teste.numero = Conta.num;
          Conta.num++;
          contas.add(teste);
          break;
        case 2 :
          System.out.println("Digite o número da conta : ");
          procura = scan.nextInt();
          cc = contas.get(procura);
          System.out.println("Digite o valor do depósito : ");
          System.out.print("R$ ");
          cc.saldo += scan.nextDouble();
          System.out.println("Depósito efetuado com sucesso !\n");
          break;
        case 3 :
          System.out.println("Digite o número da conta : ");
          proc = scan.nextInt();
          cc = contas.get(proc);
          System.out.println("Digite o valor do saque : ");
          System.out.print("R$ ");
          cc.saldo -= scan.nextDouble();
          System.out.println("Saque efetuado com sucesso !\n");
          break;
        case 4 :
          for(int i = 0; i < contas.size(); i++){
            cc = contas.get(i);
            System.out.println("Titular : "+cc.dono);
            System.out.println("Número : "+cc.numero);
            System.out.println("Saldo : "+cc.saldo+"\n");
          }
          break;
        case 0 :
          break;
        default :
          System.out.println("Opção inválida !");
        }

    }while(x != 0);
  }
}
