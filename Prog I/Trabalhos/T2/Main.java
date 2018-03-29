import java.util.*;
class Main{
  public static void main(String[] args) {
    Empresa bodega = new Empresa();
    Funcionario teste = new Funcionario();
    int numFunc = 0;
    //3 funcionários já preenchidos
    teste.nome = "Zé";
    teste.cpf = "111.222.333-44";
    teste.salario = 937.0;
    bodega.contrata(teste,numFunc);
    teste.nome = "Chico";
    teste.cpf = "222.111.333-44";
    teste.salario = 1200.0;
    bodega.contrata(teste,numFunc);
    teste.nome = "Zé";
    teste.cpf = "100.200.300-44";
    teste.salario = 1000.0;
    bodega.contrata(teste,numFunc);
    
  }
}
