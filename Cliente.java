public class Cliente{
    public static void main(String[] args) {
        
        BebidaFactory factorySuco = new SucoFactory();
        Bebida bebida1 = factorySuco.criarBebida();
        bebida1.preparar();

        BebidaFactory factoryCafe = new CafeFactory();
        Bebida bebida2 = factoryCafe.criarBebida();
        bebida2.preparar();
        
        BebidaFactory factoryCha = new ChaFactory();
        Bebida bebida3 = factoryCha.criarBebida();
        bebida3.preparar();

   //CLIENTE:
   //var factory = new ConcreteCreator();   // escolhe
   //var produto = factory.factoryMethod(); // cria
  // produto.metodoDoProduto();             // usa
    }
}