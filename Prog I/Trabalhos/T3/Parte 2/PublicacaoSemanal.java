class PublicacaoSemanal extends Publicacao{
  double taxaEntrega;

  PublicacaoSemanal(){
  }

  PublicacaoSemanal(String nome,double precoExemplar,String editora, String cnpj){
    super(nome,precoExemplar,editora,cnpj);
    this.calcularTaxaEntrega();
    this.calcularAnuidade();
  }

  @Override
  void calcularAnuidade(){
    setAnuidade(getPreco() * 52);
  }

  void calcularTaxaEntrega(){
    this.taxaEntrega = super.getPreco() * 0.05;
  }

  @Override
  void imprimirDados(){
    super.imprimirDados();
    System.out.println("Taxa de Entrega : "+this.taxaEntrega);
  }
}
