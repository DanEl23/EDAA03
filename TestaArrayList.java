import java.util.ArrayList;

public class TestaArrayList {
    public static void main(String[] args) {
        ArrayList<Contato> listaContatos = new ArrayList<>();

        Contato c1 = new Contato("Contato 1", "1111-1111", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2222-2222", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3333-3333", "contato3@email.com");
        listaContatos.add(c1); 
        listaContatos.add(c2); 
        listaContatos.add(c3); 

        System.out.println("Quantidade de elementos: " + listaContatos.size());

        System.out.println("Elementos da lista:");
        for (Contato contato : listaContatos) {
            System.out.println(contato);
        }

        int posicao = 1; 
        System.out.println("Elemento na posição " + posicao + ": " + listaContatos.get(posicao));

        System.out.println("O contato 1 está na lista? " + listaContatos.contains(c1));

        Contato c4 = new Contato("Contato 4", "4444-4444", "contato4@email.com");
        listaContatos.add(1, c4); 
        System.out.println("Elementos da lista após adicionar Contato 4 na posição 1:");
        for (Contato contato : listaContatos) {
            System.out.println(contato);
        }

        listaContatos.remove(c2); 
        System.out.println("Elementos da lista após remover Contato 2:");
        for (Contato contato : listaContatos) {
            System.out.println(contato);
        }

        String nomePesquisa = "Contato 1";
        Contato resultadoNome = pesquisaPorNome(listaContatos, nomePesquisa);
        System.out.println("Resultado da pesquisa por nome (" + nomePesquisa + "): " + resultadoNome);

        String emailPesquisa = "contato3@email.com";
        Contato resultadoEmail = pesquisaPorEmail(listaContatos, emailPesquisa);
        System.out.println("Resultado da pesquisa por e-mail (" + emailPesquisa + "): " + resultadoEmail);

        String telefonePesquisa = "4444-4444";
        Contato resultadoTelefone = pesquisaPorTelefone(listaContatos, telefonePesquisa);
        System.out.println("Resultado da pesquisa por telefone (" + telefonePesquisa + "): " + resultadoTelefone);
    }

    public static Contato pesquisaPorNome(ArrayList<Contato> lista, String nome) {
        for (Contato contato : lista) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; 
    }

    public static Contato pesquisaPorEmail(ArrayList<Contato> lista, String email) {
        for (Contato contato : lista) {
            if (contato.getEmail().equalsIgnoreCase(email)) {
                return contato;
            }
        }
        return null; 
    }

    public static Contato pesquisaPorTelefone(ArrayList<Contato> lista, String telefone) {
        for (Contato contato : lista) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null; 
    }
}
