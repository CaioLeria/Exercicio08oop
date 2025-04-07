public class Teste {
    public static void main(String[] args) {
        Empregado[] e = new Empregado[3];
        e[0]= new EmpregadoComissionado();
        e[1]=new EmpregadoHorista();
        e[2]=new EmpregadoHorista();

        for(Empregado i : e ){
            System.out.println(i.calcularSalario());
        }



    }
}
