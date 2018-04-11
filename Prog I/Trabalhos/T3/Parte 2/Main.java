//Não chamei os métodos de calcular anuidade e calcular taxa de entrega por que eles já são chamados no construtor da publicação semanal
import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o nome da publicação semanal :");
    String nome = new String(scan.next());
    System.out.println("Digite o preço do exemplar : ");
    System.out.print("R$ : ");
    double preco = scan.nextDouble();
    System.out.println("Digite o nome da editora : ");
    String editora = new String(scan.next());
    System.out.println("Digite o CNPJ da editora : ");
    String cnpj = new String(scan.next());
    PublicacaoSemanal pub = new PublicacaoSemanal(nome,preco,editora,cnpj);
    pub.imprimirDados();
  }
}
