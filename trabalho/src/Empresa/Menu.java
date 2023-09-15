package Empresa;
import java.util.Scanner;

class Menu {
    public static void listarFuncionarios(Funcionario[] funcionarios) {
        System.out.println("Funcionarios:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public static void aumentarSalario(Funcionario[] funcionarios, double percentual) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(percentual);
        }
        System.out.println("Salarios aumentados em " + percentual + "%");
    }

    public static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double lerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}