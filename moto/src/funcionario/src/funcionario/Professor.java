package funcionario;

public class Professor extends Funcionario{
    private Integer numeroDeAulas;
    private Double valorPorAula;

    public Professor(String nome, Double salarioBase, Integer numeroDeAulas, Double valorPorAula){
        super(nome, salarioBase);
        this.numeroDeAulas = numeroDeAulas;
        this.valorPorAula = valorPorAula;
    }

    @Override
    public Double calcularSalario(){
        return super.calcularSalario() + (numeroDeAulas * valorPorAula);
    }

    @Override
    public String toString(){
        return "Cargo: Professor, " + super.toString() + ", Nº aulas: " + numeroDeAulas + ", Valor/aula: " + valorPorAula;
    }
}
