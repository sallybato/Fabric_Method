public class SucoFactory extends BebidaFactory{
    @Override
    public Bebida criarBebida(){
        return new ProdutoSuco();
    }
}