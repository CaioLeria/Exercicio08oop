package EntendendoHerança;

public class Teste {
    public static void main(String[] args) {
        Empregado[] e = new Empregado[3];
        e[0]= new EmpregadoComissionado(123,"Caio",25000,20);
        e[1]=new EmpregadoHorista(1234,"Fulano",200,20);
        e[2]=new EmpregadoHorista(12345,"Ciclano",120,20);

        for(Empregado i : e ){
            System.out.println(i);
            System.out.println(i.calcularSalario());
            System.out.println("-----------");


        }
    }
}
