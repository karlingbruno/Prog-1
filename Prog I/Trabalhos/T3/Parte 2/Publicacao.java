class Publicacao{
  private String nome;
  private double precoExemplar;
  private double valorAnuidade;
  private Editora ed = new Editora();

  Publicacao(){
  }
  Publicacao(String nome,double preco,String editora,String cnpj){
    this.nome = nome;
    this.precoExemplar = preco;
    setEditora(editora);
    setCnp(cnpj);
  }
  void calcularAnuidade(){
    this.valorAnuidade = this.precoExemplar * 12;
  }
  String getNome(){
    return(nome);
  }
  double getPreco(){
    return(precoExemplar);
  }
  double getAnuidade(){
    return(valorAnuidade);
  }
  String getEditora(){
    return(ed.getNome());
  }
  String getCnp(){
    return(ed.getCnpj());
  }
  void setNome(String nome){
    this.nome = nome;
  }
  void setPreco(double preco){
    this.precoExemplar = preco;
  }
  void setAnuidade(double anuidade){
    this.valorAnuidade = anuidade;
  }
  void setEditora(String nome){
    ed.setNome(nome);
  }
  void setCnp(String cnpj){
    ed.setCnpj(cnpj);
  }
  void imprimirDados(){
    System.out.println("\nNome : "+this.nome);
    System.out.println("Preço por exemplar : "+this.precoExemplar);
    System.out.println("Valor da anuidade : "+this.valorAnuidade);
    ed.imprimir();
  }
}
