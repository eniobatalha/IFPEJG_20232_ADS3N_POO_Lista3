package q2_cliente;

public class TesteCliente {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Poliana");
        Cliente c3 = new Cliente(45, "Poliana");
        Cliente c4 = new Cliente();
        c4.setNome("Carlos");
        c4.setCodigo(30);
        c4 = new Cliente("Nelson");

        System.out.println(c1.getCodigo());
        System.out.println(c2.getCodigo());
        System.out.println(c3.getCodigo());
        System.out.println(c4.getCodigo());
    }
}


