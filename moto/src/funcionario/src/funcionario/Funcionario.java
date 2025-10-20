package funcionario;

public class Funcionario {
    private String nome;
    private Double salarioBase;

    public Funcionario(String nome, Double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
         return nome;
        }
    public String setNome(String nome){
        this.nome = nome;
            return nome;
    }
    public Double getSalarioBase(){
         return salarioBase;
        }

    public Double setSalarioBase(Double salarioBase){
        this.salarioBase = salarioBase;
        return salarioBase;
    }

    public Double calcularSalario(){
        return salarioBase;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", Salário base: " + salarioBase + ", Salário total: " + calcularSalario();
    }
}
