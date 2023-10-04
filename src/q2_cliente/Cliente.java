package q2_cliente;
public class Cliente {
	
	private static int ULTIMO_CODIGO = 1;
	private int codigo;
	private String nome;
	
	public Cliente() {
		codigo = ULTIMO_CODIGO++;
	}
	
	public Cliente(String nome) {
		this();
		this.nome = nome;
	}
	
	public Cliente(Integer c, String n) {
		this.codigo = c;
		this.nome = n;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}