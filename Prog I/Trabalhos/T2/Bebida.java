import java.util.*;
class Bebida{
  String nome;
  double teor;
  int quantidade;
  double preco;
  int estoque;
  int codigo;
  Scanner scan = new Scanner(System.in);

  Bebida(){

  }

  Bebida(String nome,double teor,int quantidade, double preco, int estoque){
    this.nome = nome;
    this.teor = teor;
    this.quantidade = quantidade;
    this.preco = preco;
    this.estoque = estoque;

  }

  boolean confereEstoque(int quant){
    estoque = this.estoque;
    if(quant > estoque){
      return false;
    }else{
        return true;
    }
  }



}
