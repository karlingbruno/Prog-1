import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite A:");
    int a = scan.nextInt();
    System.out.println("Digite B:");
    int b = scan.nextInt();
    System.out.println("Digite C:");
    int c = scan.nextInt();
    Bhaskara hehe = new Bhaskara(a,b,c);
    hehe.imprimeRaiz();

  }
}
