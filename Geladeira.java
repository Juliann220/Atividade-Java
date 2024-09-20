public class Geladeira {

       private int temperatura;
       private String cor;
       private String marca;
       private String modelo;

       Geladeira() {
              temperatura = 10;
              cor = "Branca";
              marca = "Electrolux";
              modelo = "E130";
       }

       Geladeira(int t, String c, String m, String model) {
              temperatura = t;
              cor = c;
              marca = m;
              modelo = model;
       }

       public int getTemperatura() {
              return temperatura;
       }

       public void setTemperatura(int t) {
              this.temperatura = t;
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

       public static void main(String[] args) {
              Geladeira g1;
              Geladeira g2;
              Geladeira g3;

              g1 = new Geladeira(); 
              g2 = new Geladeira(2,"Cinza","Brastemp","B22");
              g3 = new Geladeira(0,"Branca Gelo", "Consul", "C10");

              System.out.println("O objeto g1 tem as seguintes caracteristicas:");
              System.out.println("Temperatura: " + g1.getTemperatura());
              System.out.println("Cor: " + g1.getCor());
              System.out.println("Marca: " + g1.getMarca());
              System.out.println("Modelo: " + g1.getModelo());
              System.out.println("O objeto g2 tem as seguintes caracteristicas:");
              System.out.println("Temperatura: " + g2.getTemperatura());
              System.out.println("Cor: " + g2.getCor());
              System.out.println("Marca: " + g2.getMarca());
              System.out.println("Modelo: " + g2.getModelo());
              System.out.println("O objeto g3 tem as seguintes caracteristicas:");
              System.out.println("Temperatura: " + g3.getTemperatura());
              System.out.println("Cor: " + g3.getCor());
              System.out.println("Marca: " + g3.getMarca());
              System.out.println("Modelo: " + g3.getModelo());

              g1.setTemperatura(0);
              g2.setTemperatura(1);
              g3.setTemperatura(-2);

              System.out.println("O objeto g1 tem as seguintes caracteristicas:");
              System.out.println("Temperatura: " + g1.getTemperatura());
              System.out.println("Cor: " + g1.getCor());
              System.out.println("Marca: " + g1.getMarca());
              System.out.println("Modelo: " + g1.getModelo());
              System.out.println("O objeto g2 tem as seguintes caracteristicas:");
              System.out.println("Temperatura: " + g2.getTemperatura());
              System.out.println("Cor: " + g2.getCor());
              System.out.println("Marca: " + g2.getMarca());
              System.out.println("Modelo: " + g2.getModelo());
              System.out.println("O objeto g3 tem as seguintes caracteristicas:");
              System.out.println("Temperatura: " + g3.getTemperatura());
              System.out.println("Cor: " + g3.getCor());
              System.out.println("Marca: " + g3.getMarca());
              System.out.println("Modelo: " + g3.getModelo());

       }

}