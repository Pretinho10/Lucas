
public class TestaMoto {
    
     public static void main(String[] args) {
            Moto Mot;
            Mot = new Moto();
            Mot.cor = "Preta";
            Mot.modelo = "Titan 125cc";
            Mot.velocidaAtual = 0;
            Mot.velocidaMaxima = 125;

         System.out.println("Modelo da Moto, " + Mot.modelo);
    
}
