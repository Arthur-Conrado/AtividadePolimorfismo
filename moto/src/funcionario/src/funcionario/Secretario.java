package funcionario;

public class Secretario extends Funcionario {
    private Integer horasExtras;
    private Double valorPorHora;

    public Secretario(String nome, Double salarioBase, Integer horasExtras, Double valorPorHora){
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public Double calcularSalario(){
        return super.calcularSalario() + (horasExtras * valorPorHora);
    }

    @Override
    public String toString(){
        return "Cargo: Secretario, " + super.toString() + ", Horas extras: " + horasExtras + ", Valor/hora: " + valorPorHora;
    }
}
