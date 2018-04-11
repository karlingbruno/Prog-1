class Mamifero extends Animal{
  String alimento;

  Mamifero(){

  }
  Mamifero (String nome, String cor, String alimento,int comprimento, double velocidade, int patas){
    super(nome,cor,"Terra",comprimento,velocidade,patas);
    this.alimento = alimento;
  }
  String getAlimento(){
    return(this.alimento);
  }
  void setAlimento(String alimento){
    this.alimento = alimento;
  }
  @Override
  void dados(){
    super.dados();
    System.out.println("Alimento : "+this.alimento);
  }
}
