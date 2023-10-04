package q1_produto;

public class TesteProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Biscoito Treloso");
        Produto p2 = new Produto();
        p2.setNome("Doritos");
        Produto.alterarNome(p1, "Biscoito Passatempo");
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());

    }
}

