package funcionario;

public class Professor extends Funcionario{
    private Integer numeroDeAulas;
    private Double valorPorAula;

    public Professor(String nome, Double salarioBase, Integer numeroDeAulas, Double valorPorAula){
        super(nome, salarioBase);
        this.numeroDeAulas = numeroDeAulas;
        this.valorPorAula = valorPorAula;
    }

   
    public Integer getNumeroDeAulas(){
        return numeroDeAulas;
    }

    public void setNumeroDeAulas(Integer numeroDeAulas){
        this.numeroDeAulas = numeroDeAulas;
    }

    public Double getValorPorAula(){
        return valorPorAula;
    }

    public void setValorPorAula(Double valorPorAula){
        this.valorPorAula = valorPorAula;
    }


    @Override
    public Double calcularSalario(){
        return super.calcularSalario() + (numeroDeAulas * valorPorAula);
    }


    public void darAula(int aulas){
        this.numeroDeAulas += aulas;
        System.out.println(getNome() + " deu " + aulas + " aulas. Total agora: " + this.numeroDeAulas);
    }

    @Override
    public String toString(){
        return "Cargo: Professor, " + super.toString() + ", Nº aulas: " + numeroDeAulas + ", Valor/aula: " + valorPorAula;
    }
}
