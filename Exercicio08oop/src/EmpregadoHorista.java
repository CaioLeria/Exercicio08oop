public class EmpregadoHorista extends Empregado{
    int totalHorasTrabalhadas;
    double valorHrTrabalhada;

    public double calcularSalario(){
        return 1;
        //return this.totalHorasTrabalhadas*this.valorHrTrabalhada;
    }
}
