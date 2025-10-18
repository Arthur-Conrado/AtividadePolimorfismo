public class Professor extends Funcionario{
    Private Integer numeroDeAulas;
    Private Double valorPorAula;

    public Professor(String nome, Double salarioBase, Integer numeroDeAulas, Double valorPorAula){
        super(nome, salarioBase);
        this.numeroDeAulas = numeroDeAulas;
        this.valorPorAula = valorPorAula;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + (numeroDeAulas * valorPorAula);
    }

}
