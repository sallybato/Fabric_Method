public class ChaFactory extends BebidaFactory{
    @Override 
    public Bebida criarBebida(){
        return new ProdutoCha();
    }
}