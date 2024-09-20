public class Fogao {

    private int numeroDeBocas;
    private String cor;
    private String marca;
    private String modelo;
    private boolean ligado;

    // Construtor padrão
    Fogao() {
        numeroDeBocas = 4;
        cor = "Prata";
        marca = "Electrolux";
        modelo = "F120";
        ligado = false; // Por padrão, o fogão está desligado
    }

    // Construtor com parâmetros
    Fogao(int numeroDeBocas, String cor, String marca, String modelo) {
        this.numeroDeBocas = numeroDeBocas;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false; // Por padrão, o fogão está desligado
    }

    // Getters e Setters
    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }

    public void setNumeroDeBocas(int numeroDeBocas) {
        this.numeroDeBocas = numeroDeBocas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

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

    // Método para ligar o fogão
    public String ligar() {
        if (!ligado) {
            ligado = true;
            return "Fogão ligado.";
        } else {
            return "Fogão já está ligado.";
        }
    }

    // Método para desligar o fogão
    public String desligar() {
        if (ligado) {
            ligado = false;
            return "Fogão desligado.";
        } else {
            return "Fogão já está desligado.";
        }
    }

    // Método main para testar a classe Fogão
    public static void main(String[] args) {
        Fogao f1;
        Fogao f2;

        f1 = new Fogao(); // Usando o construtor padrão
        f2 = new Fogao(6, "Branco", "Brastemp", "B400"); // Usando o construtor com parâmetros

        // Exibindo as características dos objetos f1 e f2
        System.out.println("O objeto f1 tem as seguintes características:");
        System.out.println("Número de bocas: " + f1.getNumeroDeBocas());
        System.out.println("Cor: " + f1.getCor());
        System.out.println("Marca: " + f1.getMarca());
        System.out.println("Modelo: " + f1.getModelo());
        System.out.println(f1.ligar()); // Ligando o fogão f1
        System.out.println(f1.desligar()); // Desligando o fogão f1

        System.out.println("O objeto f2 tem as seguintes características:");
        System.out.println("Número de bocas: " + f2.getNumeroDeBocas());
        System.out.println("Cor: " + f2.getCor());
        System.out.println("Marca: " + f2.getMarca());
        System.out.println("Modelo: " + f2.getModelo());
        System.out.println(f2.ligar()); // Ligando o fogão f2
        System.out.println(f2.ligar()); // Tentando ligar novamente o fogão f2
        System.out.println(f2.desligar()); // Desligando o fogão f2
    }
}
