public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public ContaTerminal() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia; 
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

//    public void depositar(double valor) {
//        this.saldo =+ valor; 
//    }
//
//    public double saque(double valor) {
//        if (this.saldo<= valor) {
//            this.saldo =- valor;
//        }else{
//            System.out.println("Valor de saldo insuficiente!");
//        }
//        return this.saldo;
//    }

    
    public void exibirDados() {
        System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", getNomeCliente(), 
                getAgencia(), 
                getNumero(), 
                getSaldo());
    }
}
