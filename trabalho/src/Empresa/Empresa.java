package Empresa;

    public class Empresa {
        public static void main(String[] args) {
            Funcionario[] funcionarios = new Funcionario[4];
            funcionarios[0] = new Gerente("Igor", 5000);
            funcionarios[1] = new Secretaria("Diego", 2500);
            funcionarios[2] = new Estagiario("Victor", 1200);
            funcionarios[3] = new Funcionario("Paloco", 3000);

            while (true) {
                System.out.println("Escolha uma opçao:");
                System.out.println("1. Listar funcionarios");
                System.out.println("2. Aumentar salario");
                System.out.println("3. Sair");
                int opcao = Menu.lerInteiro();

                switch (opcao) {
                    case 1:
                        Menu.listarFuncionarios(funcionarios);
                        break;
                    case 2:
                        System.out.println("Digite quantos % voce vai aumentar:");
                        double percentual = Menu.lerDouble();
                        Menu.aumentarSalario(funcionarios, percentual);
                        break;
                    case 3:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opcao invalida!");
                }
            }
        }
    }