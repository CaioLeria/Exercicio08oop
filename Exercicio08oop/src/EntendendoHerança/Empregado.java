package EntendendoHerança;

public abstract class Empregado {
    private long matricula;
    private String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String toString() {
        return getNome()+" "+getMatricula();
    }

    public long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario();


}
