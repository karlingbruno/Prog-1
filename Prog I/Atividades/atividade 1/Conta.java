class Conta{
  int numero;
  String dono;
  double saldo;

  void sacar(double valor){
    this.saldo -= valor;
  }
  void depositar(double valor){
    this.saldo += valor;
  }
}
