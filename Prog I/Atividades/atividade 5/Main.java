import javax.swing.JOptionPane;
class Main{
  public static void main(String[] args) {
    String num1 = JOptionPane.showInputDialog("Digite o primeiro número :");
    String num2 = JOptionPane.showInputDialog("Digite o segundo número :");

    int numero1 = Integer.parseInt(num1);
    int numero2 = Integer.parseInt(num2);
    numero1 += numero2;
    JOptionPane.showMessageDialog(null,"A soma é "+numero1,"Soma de dois inteiros",JOptionPane.PLAIN_MESSAGE) ;
  }
}
