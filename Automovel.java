public class Automovel {

    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado;

    // Construtor padrão
    Automovel() {
        marca = "Toyota";
        modelo = "Corolla";
        cor = "Preto";
        ano = 2020;
        ligado = false; // Por padrão, o automóvel está desligado
    }

    // Construtor com parâmetros
    Automovel(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.ligado = false; // Por padrão, o automóvel está desligado
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para ligar o automóvel
    public String ligar() {
        ligado = true;
        return "Automóvel ligado";
    }

    // Método para desligar o automóvel
    public String desligar() {
        ligado = false;
        return "Automóvel desligado";
    }

    // Método main para testar a classe Automóvel
    public static void main(String[] args) {
        Automovel a1;
        Automovel a2;

        a1 = new Automovel(); // Usando o construtor padrão
        a2 = new Automovel("Honda", "Civic", "Prata", 2022); // Usando o construtor com parâmetros

        // Exibindo as características dos objetos a1 e a2
        System.out.println("O objeto a1 tem as seguintes características:");
        System.out.println("Marca: " + a1.getMarca());
        System.out.println("Modelo: " + a1.getModelo());
        System.out.println("Cor: " + a1.getCor());
        System.out.println("Ano: " + a1.getAno());
        System.out.println(a1.ligar()); // Ligando o automóvel a1
        System.out.println(a1.desligar()); // Desligando o automóvel a1

        System.out.println("O objeto a2 tem as seguintes características:");
        System.out.println("Marca: " + a2.getMarca());
        System.out.println("Modelo: " + a2.getModelo());
        System.out.println("Cor: " + a2.getCor());
        System.out.println("Ano: " + a2.getAno());
        System.out.println(a2.ligar()); // Ligando o automóvel a2
        System.out.println(a2.desligar()); // Desligando o automóvel a2
    }
}