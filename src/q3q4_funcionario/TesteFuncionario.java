package q3q4_funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCpf("43500344322");
        f1.setNome("Júlio dos Santos");
        f1.setSalario(3450.00);

        Funcionario f2 = new Funcionario();
        f2.setCpf("304.304.233-33");
        f2.setNome("Adriana Milena da Paz e Souza");
        f2.setSalario(8550.40);

        System.out.println("FUNCIONÁRIO 1");
        if (f1.obterQuantidadeLetrasNome() > 20) {
            System.out.println("Nome: " + f1.obterNomeAbreviado());
        } else {
            System.out.println("Nome: " + f1.getNome());
        }

        if (f1.verificarCPFFormatado()) {
            System.out.println("CPF: " + f1.getCpf());
        } else {
            System.out.println("CPF: " + f1.formatarCPF());
        }

        f1.adicionarAumentoSalario(12.5);
        System.out.println("Recebe: " + f1.obterNumeroSalariosMinimos() + " salários mínimos");

        System.out.println();

        System.out.println("FUNCIONÁRIO 2");
        if (f2.obterQuantidadeLetrasNome() > 20) {
            System.out.println("Nome: " + f2.obterNomeAbreviado());
        } else {
            System.out.println("Nome: " + f2.getNome());
        }

        if (f2.verificarCPFFormatado()) {
            System.out.println("CPF: " + f2.getCpf());
        } else {
            System.out.println("CPF: " + f2.formatarCPF());
        }

        f2.adicionarAumentoSalario(7.5);
        System.out.println("Recebe: " + f2.obterNumeroSalariosMinimos() + " salários mínimos");
    }
}
