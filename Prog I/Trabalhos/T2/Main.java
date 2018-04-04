import java.util.*;
class Main{
  public static void main(String[] args) {
    Empresa bodega = new Empresa();
    Scanner scan = new Scanner(System.in);
    int menu;
    int numFunc = 0;
    int numBeb = 0;
    //3 funcionários já preenchidos
    numFunc = bodega.contrata(new Funcionario("Zé","111.222.333-44",937.0),numFunc);
    numFunc = bodega.contrata(new Funcionario("Chico","222.111.333-44",1200.0),numFunc);
    numFunc = bodega.contrata(new Funcionario("Jão","444.444.444-44",1500.0),numFunc);
    //3 Bebidas já preenchidas
    bodega.addBebidas(new Bebida("Cerveja",3,500,5.00,500));
    bodega.addBebidas(new Bebida("Whisky",40,500,30.00,100));
    bodega.addBebidas(new Bebida("Vodka",45.5,600,45.00,60));
    System.out.println(numFunc);
    do{
      System.out.println("\n1 : Cadastrar Funcionario \n2 : Cadastrar Clientes \n3 Cadastrar Bebidas\n4 : Venda \n5 : Compra de estoque\n6 : Mostrar funcionarios \n7 : Mostrar clientes\n8 : Mostrar Bebidas \n0 : Sair");
      menu = scan.nextInt();
      switch(menu){
        case 1 :
          Funcionario aux = new Funcionario();
          System.out.println("\nDigite o nome do funcionario : ");
          aux.nome = scan.next();
          System.out.println("Digite o cpf do funcionario : ");
          aux.cpf = scan.next();
          System.out.println("Digite o salario do funcionario : ");
          aux.salario = scan.nextDouble();
          numFunc = bodega.contrata(aux,numFunc);
          System.out.println("Número de funcionarios : "+numFunc);
          System.out.println("Funcionario cadastrado com sucesso !");
          break;
        case 2 :
          Clientes aux2 = new Clientes();
          System.out.println("\nDigite o nome do cliente : ");
          aux2.nome = scan.next();
          System.out.println("Digite o cpf do cliente : ");
          aux2.cpf = scan.next();
          System.out.println("Ele pode comprar fiado ? (true ou false) :");
          aux2.fiado = scan.nextBoolean();
          bodega.addclientes(aux2);
          System.out.println("Cliente cadastrado com sucesso !");
          break;
        case 3 :
          Bebida aux3 = new Bebida();
          System.out.println("\nDigite o nome da bebida : ");
          aux3.nome = scan.next();
          System.out.println("Digite o teor alcoólico da bebida : ");
          aux3.teor = scan.nextDouble();
          System.out.println("Digite a quantidade em ml : ");
          aux3.quantidade = scan.nextInt();
          System.out.println("Digite o preço da bebida : ");
          System.out.print("R$ ");
          aux3.preco =  scan.nextDouble();
          System.out.println("Digite o a quantidade em estoque : ");
          aux3.estoque = scan.nextInt();
          bodega.addBebidas(aux3);
          break;
        case 4 :
          bodega.vendaBebidas(bodega.produtos);
          break;
        case 5 :
          bodega.estoqueBebidas(bodega.produtos);
          break;
        case 6 :
          bodega.mostra();
          break;
        case 7 :
          bodega.mostraClientes();
          break;
        case 8 :
          bodega.mostraBebidas();
          break;
        case 0 :
          break;
        default :
          System.out.println("\nOpção inválida !");
      }
    }while(menu  != 0);
  }
}
