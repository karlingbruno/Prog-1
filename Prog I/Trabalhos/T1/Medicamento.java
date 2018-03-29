class Medicamento{
  String nome;
  double precoVenda;
  Data dataValidade = new Data();
  Laboratorio laboratorio = new Laboratorio();
  boolean receitaObrigatoria;
  int qtdEstoque;

  Medicamento(){

  }
  Medicamento(String nome,double precoVenda,String dataValidade, Laboratorio laboratorio, boolean receitaObrigatoria, int qtdEstoque){
    this.nome = nome;
    this.precoVenda = precoVenda;
    this.laboratorio = laboratorio;
    this.receitaObrigatoria = receitaObrigatoria;
    this.qtdEstoque = qtdEstoque;
  }
  void reajustarPrecoVenda(double percentual){
      if(percentual > 0 ){
        precoVenda += precoVenda * (percentual / 100);
        System.out.println("Valor ajustado !\nNovo valor igual a : R$ "+precoVenda);
      }
      else if(percentual < 0){
        percentual = percentual * -1;
        precoVenda -= precoVenda * (percentual /100);
        System.out.println("Valor ajustado !\nNovo valor igual a : R$ "+precoVenda);
      }
      else if(percentual == 0){
        System.out.println("Percentual inválido, digite um novamente.");

      }
  }
  void vender(int quantidade){
    if(quantidade > qtdEstoque){
      System.out.println("Estoque menor do que o valor pedido.");
    }
    else{
      if(receitaObrigatoria){
        System.out.println("Esse medicamento precisa de receita !");
      }
      System.out.println("Preço total : R$ "+(quantidade * precoVenda));
      qtdEstoque -= quantidade;
      System.out.println("Venda concluida !");
    }
  }
  void comprar(int quantidade){
    qtdEstoque += quantidade;
    System.out.println("Estoque renovado !");
    System.out.println("Estoque atual : "+qtdEstoque);
  }
  void mostra(){
    if(nome == null){
      System.out.println("Nenhum medicamento cadastrado !");
    }else{
      System.out.println("\nNome : "+nome);
      System.out.println("Preço de venda : R$ "+precoVenda);
      dataValidade.data();
      System.out.println("Laboratorio : "+laboratorio.nomeFantasia);
      System.out.println("Razão social : "+laboratorio.razaoSocial);
      System.out.println("Inscrição Estadual : "+laboratorio.inscricaoEstadual);
      System.out.println("CNPJ : "+laboratorio.cnpj);
      System.out.println("Endereço : "+laboratorio.endereco);
      System.out.println("Telefone : "+laboratorio.telefone);
      System.out.println("Quantidade em estoque : "+qtdEstoque);
      if(receitaObrigatoria){
        System.out.println("Precisa de receita médica.");
      }else{
        System.out.println("Não precisa de receita médica.");
      }
    }
  }
}
