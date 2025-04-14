package EntendendoHerança;

public class EmpregadoComissionado extends Empregado {
    private double totalVendas;
    private double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalVendas,double comissao) {
        super(matricula, nome);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString()+" vendas: R$"+this.totalVendas+" porcentagem de comissão: "+this.comissao+"%";
    }

    @Override
    public double calcularSalario() {
        return (this.totalVendas * this.comissao) / 100;
    }
}