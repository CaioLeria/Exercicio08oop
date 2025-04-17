package EntendendoHerança;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class Menu {
   private Controle controle = new Controle();
   public void menu() {


    String aux = "1. cadastrar\n 2.pesquisar\n 3.listar\n4.finalizar";
    int opcao;

    while (true){
        opcao=parseInt(showInputDialog(aux));
        switch (opcao){
            case 1:
                cadastrar();
                break;
            case 2:
                pesquisar();
                break;
            case 3:
                listar();
                break;
            case 4:
                return;

            default:
                showMessageDialog(null, "opção Inválida");
        }

    }
   }

    private void listar() {
       showMessageDialog(null,controle.listarEmpregados());
    }

    private void pesquisar() {
        long matricula = parseLong(showInputDialog("Digite a matricula desejada: "));
       Empregado empregado = controle.pesquisarEmpregado(matricula);
       if (empregado == null){
           showMessageDialog(null,"Empregado não enconrado");
       } else{
           showMessageDialog(null, empregado);
       }
   }

    private void cadastrar() {
    String nome=null;
    long matricula=0;
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;
    double comissao, totalDeVendas;

    String mensagem ="1. Empregado horista\n2. Empregado comissionado\n 3.Sair";
        int opcao;
        Empregado empregado;
        while (true){
            opcao=parseInt(showInputDialog(mensagem));
            if(opcao ==3){
                return;
            }else if (opcao==1 || opcao==2){
                matricula = parseLong(showInputDialog("Digite a matricula: "));
                nome = showInputDialog("Digite o nome do Empegado");
            }

            switch (opcao){
                case 1:
                    totalDeHorasTrabalhadas = parseInt(showInputDialog("Digite a quantidade de horas trabalhadas"));
                    valorDaHoraTrabalhada = parseInt(showInputDialog("Digite o valor da hora trabalhada"));
                    empregado= new EmpregadoHorista(matricula,nome,totalDeHorasTrabalhadas,valorDaHoraTrabalhada);
                    controle.adicionarEmpregado(empregado);
                    break;
                case 2:
                    comissao = parseDouble(showInputDialog("Digite a porcentagem da comissao"));
                    totalDeVendas = parseDouble(showInputDialog("Digite quanto o funcionario vendeu"));
                    empregado = new EmpregadoComissionado(matricula,nome,totalDeVendas,comissao);
                    controle.adicionarEmpregado(empregado);
                    break;
                case 3:
                    return;

                default:
                    showMessageDialog(null, "opção Inválida");

            }

        }

   }
}
