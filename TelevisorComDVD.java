public class Televisor {
       protected int canal;
       protected String tamanho;
       protected String modelo;

       Televisor() { 
              canal = 4;
              tamanho = "15 polegadas";
              modelo = "SEMP TOSHIBA";
       }

       Televisor(int c,String t,String m) { 
              canal = c;
              tamanho = t;
              modelo = m;
       }      

       public int getCanal() {
              return canal;
       }

       public void setCanal(int canal) {
              this.canal = canal;
       }

       public String getTamanho() {
              return tamanho;
       }

       public void setTamanho(String tamanho) {
              this.tamanho = tamanho;
       }

       public String getModelo() {
              return modelo;
       }

       public void setModelo(String modelo) {
              this.modelo = modelo;
       }

}

public class TelevisorComDVD extends Televisor{
       TelevisorComDVD () {
              canal = 31;
              tamanho = "20 polegadas";
              modelo = "PHILCO";
       }

       public String eject ( ) {
              return "Eject ativado";
       }

       public String play ( ) {
              return "Função Play ativada";
       }

       public String stop ( ) {
              return "Função Stop ativada";
       }

       public String pause ( ) {
              return "Função Pause ativada";
       }

}

public class CR {

public static void main(String[] args) {
              Televisor tv1 = new Televisor();
              Televisor tv2 = new Televisor(10,new String("10 polegadas"),new String("Gradiente"));
              TelevisorComDVD tvdvd1 = new TelevisorComDVD();
              System.out.println("O objeto tv1 é " + tv1.getModelo());
              System.out.println("O objeto tv2 é " + tv2.getModelo());
              System.out.println("O objeto tvdvd1 é " + tvdvd1.getModelo());
              tv1.setModelo("SAMSUNG");
              tv1.setCanal(5);
              tv1.setTamanho("70 polegadas");
              System.out.println("O objeto tv1 agora é " + tv1.getModelo());
              System.out.println("O objeto tv1 está no canal " + tv1.getCanal());
              System.out.println("O objeto tv1 tem " + tv1.getTamanho());

              System.out.println("Apertando o botão play do objeto tvdvd1 " + tvdvd1.play());
              System.out.println("Apertando o botão pause do objeto tvdvd1 " + tvdvd1.pause());
              System.out.println("Apertando o botão stop do objeto tvdvd1 " + tvdvd1.stop());
              System.out.println("Apertando o botão eject do objeto tvdvd1 " + tvdvd1.eject());

}

}