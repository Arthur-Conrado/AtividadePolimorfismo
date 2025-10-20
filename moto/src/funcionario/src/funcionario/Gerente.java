package funcionario;

public class Gerente extends Funcionario {
    private Double bonus;

    public Gerente(String nome, Double salarioBase, Double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    
    public Double getBonus(){
        return bonus;
    }

    public void setBonus(Double bonus){
        this.bonus = bonus;
    }

    
    @Override
    public Double calcularSalario(){
        return super.calcularSalario() + bonus;
    }

   
    public void autorizarOrcamento(Double valor){
        System.out.println(getNome() + " autorizou orçamento de R$ " + valor);
    }

    @Override
    public String toString(){
        return "Cargo: Gerente, " + super.toString() + ", Bonus: " + bonus;
    }
}