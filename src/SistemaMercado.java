import java.util.ArrayList;
public class SistemaMercado
{
    private ArrayList<Produto> produtos;
    public SistemaMercado()
    {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto)
    {
        produtos.add(produto);
    }
    public void listarProdutos()
    {
        for (Produto produto : produtos)
        {
            produto.mostraDados();
        }
    }

    public Produto buscarProduto(String nome)
    {
        for (Produto produto : produtos)
        {
            if (produto.getNome().equals(nome))
            {
                return produto; 
            }
        }
        return null;
    }
}
