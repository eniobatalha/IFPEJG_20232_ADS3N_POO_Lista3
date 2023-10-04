package q1_produto;
public class Produto {	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void alterarNome(Produto prod, String nome) {
        prod = new Produto();
        prod.setNome(nome);
    }

}
