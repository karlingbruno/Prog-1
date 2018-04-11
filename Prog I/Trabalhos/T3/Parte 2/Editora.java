class Editora{
  private String nome;
  private String cnpj;

  Editora(){
  }
  Editora(String nome, String cnpj){
    this.nome = nome;
    this.cnpj = cnpj;
  }
  String getNome(){
    return(this.nome);
  }
  String getCnpj(){
    return(this.cnpj);
  }
  void setNome(String nome){
    this.nome = nome;
  }
  void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }
  void imprimir(){
    System.out.println("Nome da editora : "+this.nome);
    System.out.println("CNPJ : "+this.cnpj);
  }
}
