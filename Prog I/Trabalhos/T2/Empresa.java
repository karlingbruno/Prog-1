import java.util.*;
class Empresa{
  String nome;
  String cnpj;
  ArrayList<Funcionario> bodegueiros = new ArrayList<>();
  ArrayList<Bebida> produtos = new ArrayList<>();
  ArrayList<Clientes> clientes = new ArrayList<>();
  Scanner scan = new Scanner(System.in);

  Empresa(){

  }
  Empresa(String nome,String cnpj){
    this.nome = nome;
    this.cnpj = cnpj;
  }

  int contrata(Funcionario func,int num){
    bodegueiros.add(func);
    num++;
    return(num);
  }

  void addclientes(Clientes cliente){
    clientes.add(cliente);
  }

  void addBebidas(Bebida haha){
    produtos.add(haha);
  }


  void estoqueBebidas(ArrayList<Bebida> produtos){
    System.out.println("\nDigite o nome da bebida : ");
    String aux = new String(scan.next());
    Bebida aux2 = new Bebida();
    Iterator<Bebida> i = produtos.iterator();
    while(i.hasNext()){
      Bebida io = i.next();
      if(aux == io.nome){
        aux2 = io;
        break;
      }else{
        System.out.println("Nome da bebida inválido !");
        return;
      }
    }
    System.out.println("Digite a quantidade de bebidas a adicionar no estoque : ");
    int x = scan.nextInt();
    aux2.estoque += x;
    System.out.println("Novo estoque de "+aux2.estoque);
  }
  void vendaBebidas(ArrayList<Bebida> produtos){
    System.out.println("\nDigite o nome da bebida : ");
    String aux4 = new String(scan.nextLine());
    Bebida aux5 = new Bebida();
    Iterator<Bebida> f = produtos.iterator();
    Bebida fo = new Bebida();
    while(f.hasNext()){
      fo = f.next();
      if(aux4 == fo.nome){
          break;
      }else{
        System.out.println("Bebida não encontrada ! ");
        return ;
      }
    }
    System.out.println("Digite a quantidade a vender : ");
    int vender = scan.nextInt();
    if(fo.confereEstoque(vender)){
      fo.estoque -= vender;
      System.out.println("Venda efetuada com sucesso ! ");
    }
    else{
      System.out.println("Estoque menor que a quantidade solicitada !");
    }
  }

  void mostra(){
    Iterator<Funcionario> n = bodegueiros.iterator();
    while(n.hasNext()){
      Funcionario no = n.next();
      System.out.println("\nNome :"+no.nome);
      System.out.println("CPF : "+no.cpf);
      System.out.println("Salário : "+no.salario);
    }
  }

  void mostraClientes(){
    Iterator<Clientes> j = clientes.iterator();
    while(j.hasNext()){
      Clientes jo = j.next();
      System.out.println("\nNome : "+jo.nome);
      System.out.println("CPF : "+jo.cpf);
      if(jo.fiado){
        System.out.println("Pode comprar fiado !");
      }else{
        System.out.println("Não pode comprar fiado !");
      }
    }
  }
  void mostraBebidas(){
    Iterator<Bebida> k = produtos.iterator();
    while(k.hasNext()){
      Bebida ko = k.next();
      System.out.println("\nNome : "+ko.nome);
      System.out.println("Teor alcoólico : "+ko.teor);
      System.out.println("Quantidade em ml : "+ko.quantidade);
      System.out.println("Preço : "+ko.preco);
      System.out.println("Estoque : "+ko.estoque);
    }
  }



}
