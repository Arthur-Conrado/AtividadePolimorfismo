package moto;

public class Moto {
    private String nome;
    private Double peso;
    private String cor;
    private String material;
    private Double valor;
    

    public Moto(String nome, Double peso, String cor, String material, Double valor) {
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
        this.material = material;
        this.valor = valor;
        
    }


    public String Getnome() {
        return nome;
    }

    public Double Getpeso() {
        return peso;
    }

    public String Getcor() {
        return cor;
    }

    public String Getmaterial() {
        return material;
    }
    public Double Getvalor() {
        return valor;
    }

    public void setNome(String nome){
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido");
        }
    }

    public void setPeso(Double peso){
        if(peso != null && peso > 0){
            this.peso = peso;
        } else{
            System.out.println("peso invalido");
        }
    }

    public void setCor(String cor){
        if(cor != null && !cor.isEmpty()){
            this.cor = cor;
        } else{
            System.out.println("Cor invalida");
        }
    }

    public void setMaterial(String material){
        if(material != null && !material.isEmpty()){
            this.material = material;
        } else{
            System.out.println("Material invalido");
        }
    }

    public void setValor(Double valor){
        if(valor != null  && valor > 0){
            this.valor = valor;
        } else{
            System.out.println("Valor invalido");
        }
    }


    public void acelerar() {
        System.out.println("A moto " + nome + " esta acelerando.");
    }
    public void cor() {
        System.out.println("A cor da moto " + nome + " e " + cor + ".");
    }
    public void peso (){
        System.out.println("O peso da moto " + nome + " e " + peso + " kg.");
    }
}
