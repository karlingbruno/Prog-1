import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Medicamento med = new Medicamento();
    int x = 0;
    do{
        System.out.println("\n\n1 : Mostrar dados\n2 : Vender\n3 : Cadastrar\n4 : Reajuste de preço\n5 : Compra de estoque\n6 : Sair");
        x = scan.nextInt();
        switch (x) {
          case 1 :
            med.mostra();
            break;
          case 2:
            if(med.nome == null){
              System.out.println("Nenhum medicamento cadastrado !");
            }else{
              System.out.println("Digite a quantidade :");
              int quantidade = scan.nextInt();
              med.vender(quantidade);
            }
            break;
          case 3:
            System.out.println("Digite o nome do medicamento :");
            med.nome = scan.next();
            System.out.println("Digite o preço de venda do produto :");
            med.precoVenda = scan.nextDouble();
            System.out.println("Digite o dia do vencimento do produto :");
            med.dataValidade.dia = scan.nextInt();
            System.out.println("Digite o mes do vencimento do produto :");
            med.dataValidade.mes = scan.nextInt();
            System.out.println("Digite o ano do vencimento do produto :");
            med.dataValidade.ano = scan.nextInt();
            System.out.println("Digite o nome do laboratório :");
            med.laboratorio.nomeFantasia = scan.next();
            System.out.println("Digite a razão social do laboratório :");
            med.laboratorio.razaoSocial = scan.next();
            System.out.println("Digite a inscricão estadual do laboratório :");
            med.laboratorio.inscricaoEstadual = scan.next();
            System.out.println("Digite o cnpj do laboratório : ");
            med.laboratorio.cnpj = scan.next();
            System.out.println("Digite a rua do laboratório : ");
            med.laboratorio.endereco = scan.next();
            System.out.println("Digite o telefone do laboratório : ");
            med.laboratorio.telefone = scan.next();
            System.out.println("Receita obrigatória ?");
            med.receitaObrigatoria = scan.nextBoolean();
            System.out.println("Digite a quantidade em estoque : ");
            med.qtdEstoque = scan.nextInt();
            break;
          case 4:
          if(med.nome == null){
            System.out.println("Nenhum medicamento cadastrado !");
          }else{
            System.out.println("Digite a porcentagem (sem o %) :");
            int percentual = scan.nextInt();
            med.reajustarPrecoVenda(percentual);
          }
            break;
          case 5:
            if(med.nome == null){
              System.out.println("Nenhum medicamento cadastrado !");
            }else{
              System.out.println("Digite a quantidade a adicionar no estoque : ");
              int q2 = scan.nextInt();
              med.comprar(q2);
            }
            break;
          default:
            break;

        }

    }while(x != 6);
  }
}
