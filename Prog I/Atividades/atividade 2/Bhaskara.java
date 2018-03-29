class Bhaskara{
  int a;
  int b;
  int c;

  Bhaskara(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  void imprimeRaiz(){
    double delta = (b*b) - 4*a*c;
    System.out.println("\nDelta = "+delta);
    if(delta < 0){
      System.out.println("Não existem raizes reais \n");
    }
    else{
      double x1,x2;
      x1 = (-b  + Math.sqrt(delta)) / (2 * a);
      x2 = (-b  - Math.sqrt(delta)) / (2 * a);
      System.out.println("x' = "+ x1 + "\nx'' = "+x2);
    }
  }
}
