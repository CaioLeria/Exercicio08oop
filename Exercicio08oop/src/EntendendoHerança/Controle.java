package EntendendoHerança;

public class Controle {
    Empregado[] empregado = new Empregado[3];
    int index = 0;

    public void adicionarEmpregado(Empregado empregado) {
        this.empregado[index++]=empregado;
    }

    public Empregado pesquisarEmpregado(long matricula) {
        Empregado empregadoAchado=null;
        for (int i = 0; i < index; i++) {
            if (matricula == empregado[i].getMatricula()) {
                empregadoAchado=empregado[1];
            }
        }
        return empregadoAchado;
    }

    public String listarEmpregados (){
        String aux ="";
        for (int i=0; i<index;i++){
            aux += "Informações dos funcionarios\n" + empregado[i];
            aux += "\nSalário R$"+empregado[i].calcularSalario();
        }
        return aux;
    }

}
