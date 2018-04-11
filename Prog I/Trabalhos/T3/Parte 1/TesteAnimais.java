class TesteAnimais{
  public static void main(String[] args) {
    Animal camelo = new Animal("Camelo","Amarelo","Terra",150,2,4);
    Peixe tubarao = new Peixe("Tubarão","Cinzento","Mar",300,1.5,"Barbatanas e Cauda");
    Mamifero  urso = new Mamifero("Urso-do-canadá","Vermelho","Mel",180,0.5,4);
    System.out.println("Zoo:");
    System.out.println("------------------------------");
    camelo.dados();
    System.out.println("------------------------------");
    tubarao.dados();
    System.out.println("------------------------------");
    urso.dados();
    System.out.println("------------------------------");

  }
}
