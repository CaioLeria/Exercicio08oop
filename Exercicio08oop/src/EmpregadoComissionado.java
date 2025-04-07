public class EmpregadoComissionado extends Empregado {
    double totalVendas;
    double comissão;

    public double calcularSalario() {
        //return (this.totalVendas * this.comissão) / 100;
        return 1;
    }
}