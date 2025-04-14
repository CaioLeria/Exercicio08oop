package EntendendoHerança;

public class EmpregadoHorista extends Empregado {
    private int totalHorasTrabalhadas;
    private double valorHrTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalHorasTrabalhadas, double valorHrTrabalhada) {
        super(matricula, nome);
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
        this.valorHrTrabalhada = valorHrTrabalhada;
    }

    @Override
    public double calcularSalario(){
        return this.totalHorasTrabalhadas*this.valorHrTrabalhada;
    }

    @Override
    public String toString() {
        return super.toString()+" horas trabalhadas: "+this.totalHorasTrabalhadas+"hrs "+" valor da hora R$"+this.valorHrTrabalhada;
    }
}
