class Animal {
  private String nome;
  private String cor;
  private String ambiente;
  private int comprimento;
  private double velocidade;
  private int patas;

  Animal(){

  }
  Animal(String nome,String cor,String ambiente,int comprimento, double velocidade,int patas){
    this.nome = nome;
    this.cor = cor;
    this.ambiente = ambiente;
    this.comprimento = comprimento;
    this.velocidade = velocidade;
    this.patas = patas;
  }
  String getNome(){
    return(this.nome);
  }
  String getCor(){
    return(this.cor);
  }
  String getAmbiente(){
    return(this.ambiente);
  }
  int getComprimento(){
    return(this.comprimento);
  }
  double getVelocidade(){
    return(this.velocidade);
  }
  int getPatas(){
    return(this.patas);
  }
  void setNome(String nome){
    this.nome = nome;
  }
  void setCor(String cor){
    this.cor = cor;
  }
  void setAmbiente(String ambiente){
    this.ambiente = ambiente;
  }
  void setComprimento(int comprimento){
    this.comprimento = comprimento;
  }
  void setVelocidade(double velocidade){
    this.velocidade = velocidade;
  }
  void setPatas(int patas){
    this.patas = patas;
  }
  void dados(){
    System.out.println("Nome : "+this.nome);
    System.out.println("Cor : "+this.cor);
    System.out.println("Ambiente : "+this.ambiente);
    System.out.println("Comprimento : "+this.comprimento);
    System.out.println("Velocidade : "+this.velocidade);
    System.out.println("Patas : "+this.patas);
  }
}
