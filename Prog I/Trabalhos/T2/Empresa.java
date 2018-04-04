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
    System.out.println("\nDigite o codigo da bebida : ");
    int aux = scan.nextInt();
    Bebida aux2 = new Bebida();
    Iterator<Bebida> i = produtos.iterator();
    for(int h = 0;h < produtos.size(); h++){
      if(aux == h){
        aux2 = produtos.get(h);
        System.out.println("Digite a quantidade de bebidas a adicionar no estoque : ");
        int x = scan.nextInt();
        aux2.estoque += x;
        System.out.println("Novo estoque de "+aux2.estoque);
        return;
      }

    }
    System.out.println("Codigo inválido !");
    return;
  }

  void vendaBebidas(ArrayList<Bebida> produtos){
    System.out.println("\nDigite o codigo da bebida : ");
    int aux4 = scan.nextInt();
    Bebida aux5 = new Bebida();
    Iterator<Bebida> f = produtos.iterator();
    Bebida fo = new Bebida();
    for(int l = 0 ; l < produtos.size(); l++){
      if(aux4 == l){
        aux5 = produtos.get(l);
        System.out.println("Digite a quantidade a vender : ");
        int vender = scan.nextInt();
        if(aux5.confereEstoque(vender)){
          aux5.estoque -= vender;
          System.out.println("Venda efetuada com sucesso ! ");
          return;
        }
        else{
          System.out.println("Estoque menor que a quantidade solicitada !");
          return;
        }
      }
    }
    System.out.println("Código não encontrado");
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
    int p = 0;
    while(k.hasNext()){
      Bebida ko = k.next();
      System.out.println("\nNome : "+ko.nome);
      System.out.println("Teor alcoólico : "+ko.teor);
      System.out.println("Quantidade em ml : "+ko.quantidade);
      System.out.println("Preço : "+ko.preco);
      System.out.println("Estoque : "+ko.estoque);
      System.out.println("Codigo : "+p);
      p++;
    }
  }



}
