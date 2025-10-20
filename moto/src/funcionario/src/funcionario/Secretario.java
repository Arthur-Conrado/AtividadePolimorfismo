package funcionario;

public class Secretario extends Funcionario {
    private Integer horasExtras;
    private Double valorPorHora;

    public Secretario(String nome, Double salarioBase, Integer horasExtras, Double valorPorHora){
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorPorHora = valorPorHora;
    }

    
    public Integer getHorasExtras(){
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras){
        this.horasExtras = horasExtras;
    }

    public Double getValorPorHora(){
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

   
    @Override
    public Double calcularSalario(){
        return super.calcularSalario() + (horasExtras * valorPorHora);
    }

    
    public void organizarAgenda(){
        System.out.println(getNome() + " está organizando a agenda.");
    }

    @Override
    public String toString(){
        return "Cargo: Secretario, " + super.toString() + ", Horas extras: " + horasExtras + ", Valor/hora: " + valorPorHora;
    }
    
}
