
public class TestaCarro {
    
   public static void main(String[] args) {
            Carro meuCarro;
            meuCarro = new Carro();
            meuCarro.cor = "Branco";
            meuCarro.modelo = "Kia Soul";
            meuCarro.velocidaAtual = 0;
            meuCarro.velocidaMaxima = 180;

         System.out.println("Modelo do carro, " + meuCarro.modelo);
    
}
   }
