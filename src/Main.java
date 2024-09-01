//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        VetorClientes v1 = new VetorClientes(20);

        Cliente c1 = new Cliente("Pedro", 1111111, "pedro@gmail.com");
        Cliente c2 = new Cliente("Joao", 2222222, "joao@gmail.com");
        v1.inserir(c1);
        v1.inserir(c2);

        for (int i = 2; i < 30; i++) {
            Cliente cliente = new Cliente("Cliente" + i,  i, "cliente" + i + "@exemplo.com");
            v1.inserir(cliente);
        }

        v1.excluir(c1);
        v1.alterar(3,c2);

        v1.listarClientes();
    }
}