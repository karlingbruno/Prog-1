import javax.swing.JOptionPane;
class Main{
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Qual é seu nome?");
    JOptionPane.showMessageDialog(null,"Olá "+nome+ "!");
  }
}
