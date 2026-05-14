public class Produto
{
    private String nome;
    private int qtdeEstoque;
    private double precoUnit;

    Produto(String nome,int qtdeEstoque,double precoUnit)
    {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
    }

    public void mostraDados()
    {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade em estoque: " + qtdeEstoque);
        System.out.println("Preço unitário: " + precoUnit);
    }
    
    public void adicionaEstoque(int quantidade)
    {
        if (quantidade < 1)
        {
            System.out.println("Valor inválido para adição de estoque");
        }
        else
        {
            qtdeEstoque += quantidade;
        }
    }

    public void removeEstoque(int quantidade)
    {
        if (qtdeEstoque < quantidade)
        {
            System.out.println("Quantidade indispónivel em estoque");
        }
        else
        {
            qtdeEstoque -= quantidade;
        }
    }

    public String getNome()
    {
        return nome;
    }
    
    public void alterarPreco(double novoPreco)
    {
        if (novoPreco > 0)
        {
            precoUnit = novoPreco;
        }
        else
        {
            System.out.println("Preço inválido");
        }
    }
}
