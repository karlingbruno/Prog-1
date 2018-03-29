import java.util.Scanner;
class testeScanner{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite seu nome completo :");
    String name = new String(scan.nextLine());
    System.out.println("Digite sua idade : ");
    int idade = scan.nextInt();
    System.out.println("Digite sua letra favorita : ");
    char fav = scan.next().charAt(0);
    System.out.println("Nome : " + name + "\nIdade : "+ idade + "\nLetra : " + fav);
  }
}
