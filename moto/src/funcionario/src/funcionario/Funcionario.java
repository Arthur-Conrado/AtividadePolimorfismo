public class Funcionario {
    Private String nome;
    Private Double salarioBase;

    public Funcionario (String nome, Double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract Double calcularSalario();

    public void exibir(){
        System.out.println("Funcionario :"+nome);
        System.out.prinln("Salario: R$"+calcularSalario());
    }

}
