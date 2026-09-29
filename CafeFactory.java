public class CafeFactory extends BebidaFactory{
    @Override 
    public Bebida criarBebida(){
        return new ProdutoCafe();
    }
}