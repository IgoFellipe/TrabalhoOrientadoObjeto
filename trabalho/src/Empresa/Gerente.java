package Empresa;

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentarSalario(double percentual) {
        super.aumentarSalario(percentual + 10);
    }
}