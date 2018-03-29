import java.util.*;
class Empresa{
  String nome;
  String cnpj;
  List<Funcionario> bodegueiros = new ArrayList<>();

  Empresa(){

  }

  void contrata(Funcionario func,int num){
    bodegueiros.add(func);
    num++;
  }
  void exibeFunc(){
    for(int i = 0; i < bodegueiros.size() ; i++){
      System.out.println("Nome :"+bodegueiros.nome);
      System.out.println("");
    }
  }

}
