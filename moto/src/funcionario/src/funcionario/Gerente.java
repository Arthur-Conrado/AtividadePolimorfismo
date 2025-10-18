package funcionario;

public class Gerente extends Funcionario {
    private Double bonus;

    public Gerente(String nome, Double salarioBase, Double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public Double calcularSalario(){
        return super.calcularSalario() + bonus;
    }

    @Override
    public String toString(){
        return "Cargo: Gerente, " + super.toString() + ", Bonus: " + bonus;
    }
}