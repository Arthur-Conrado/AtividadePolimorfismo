import funcionario.Funcionario;
import funcionario.Professor;
import funcionario.Gerente;
import funcionario.Secretario;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de Gestão de Funcionários");

        funcionario.Funcionario p = new funcionario.Professor("João", 2000.0, 10, 50.0);
        funcionario.Funcionario g = new funcionario.Gerente("Maria", 5000.0, 1500.0);
        funcionario.Funcionario s = new funcionario.Secretario("Carlos", 1800.0, 20, 15.0);

        System.out.println(p);
        System.out.println(g);
        System.out.println(s);
    }
}
