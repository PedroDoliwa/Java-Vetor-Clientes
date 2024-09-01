import java.util.ArrayList;

public class VetorClientes {

    private Cliente[] clientes;
    private int posicaoAtual;


    public VetorClientes(int capacidade) {
        clientes = new Cliente[capacidade];
        posicaoAtual = 0;
    }


    public void inserir(Cliente cliente) {      // metodo inserir no final do vetor
        if (posicaoAtual < this.clientes.length) {
            clientes[posicaoAtual] = cliente;
            posicaoAtual++;
        } else {
            System.out.println("Vetor cheio.");
        }
    }

    public void inserir(Cliente cliente, int indice) {      // metodo inserir pelo indice
        for(int i = posicaoAtual-1; i >=indice; i--){
            clientes[i + 1] = clientes[i];
        }
        clientes[indice] = cliente;
        posicaoAtual++;
    }

    public void alterar(int indice, Cliente cliente) {  // metodo alterar elemento pelo indice
        if (indice > -1 && indice < posicaoAtual) {
            clientes[indice] = cliente;
        } else {
            System.out.println("Indice inválido");
        }
    }


    public void excluir(Cliente cliente) {      // metodo inserir no final do vetor
        boolean alterado = false;
        for (int i=0; i< posicaoAtual; i++){
            if(clientes[i] == cliente){
                clientes[i] = clientes[i+1];
                alterado = true;
            }
        }
        if(alterado){
            System.out.println("Cliente Excluido com Sucesso!");
            posicaoAtual--;
        }
    }



    public void listarClientes() {
        System.out.println("Lista de Clientes:");

        for (int i = 0; i < posicaoAtual; i++) {
            System.out.println(clientes[i]);
        }
    }

    public void buscarCliente(String nome) {
        boolean encontrado = false;
        for(int i = 0; i<posicaoAtual; i++) {
            if(clientes[i].getNome().equals(nome)) {
                System.out.println("Nome Encontrado com sucesso! \n" + clientes[i]);
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("Nome Não Encontrado");
        }
    }

    public void buscarEmail(String email) {
        boolean encontrado = false;
        for(int i = 0; i<posicaoAtual; i++) {
            if(clientes[i].getEmail().equals(email)) {
                System.out.println("Email Encontrado com sucesso! \n" + clientes[i]);
                encontrado = true;
            }
        }
        if(!encontrado) {
            System.out.println("Cliene Não Encontrado");
        }
    }
}
