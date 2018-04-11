class Peixe extends Animal{
  String caracteristica;

  Peixe(){

  }
  Peixe(String nome,String cor,String ambiente,int comprimento, double velocidade,String caracteristica){
    super(nome,cor,ambiente,comprimento,velocidade,0);
    this.caracteristica = caracteristica;
  }
  String getCaracteristica(){
    return(this.caracteristica);
  }
  void setCaracteristica(String caracteristica){
    this.caracteristica = caracteristica;
  }
  @Override
  void dados(){
    super.dados();
    System.out.println("Característica : "+this.caracteristica);
  }

}
