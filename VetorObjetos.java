
public class VetorObjetos {
    private Contato[] contatos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        contatos = new Contato[capacidade];
        tamanho = 0;
    }

    public void adiciona(Contato contato) {
        if (tamanho == contatos.length) {
            // Redimensionar o vetor automaticamente (duplicar o tamanho)
            Contato[] novoArray = new Contato[contatos.length * 2];
            System.arraycopy(contatos, 0, novoArray, 0, contatos.length);
            contatos = novoArray;
        }
        contatos[tamanho] = contato;
        tamanho++;
    }

    public void adiciona(int posicao, Contato contato) {
        if (posicao >= 0 && posicao <= tamanho) {
            if (tamanho == contatos.length) {
                // Redimensionar o vetor automaticamente (duplicar o tamanho)
                Contato[] novoArray = new Contato[contatos.length * 2];
                System.arraycopy(contatos, 0, novoArray, 0, contatos.length);
                contatos = novoArray;
            }
            for (int i = tamanho - 1; i >= posicao; i--) {
                contatos[i + 1] = contatos[i];
            }
            contatos[posicao] = contato;
            tamanho++;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public int capacidade() {
        return contatos.length;
    }

    public Contato busca(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return contatos[posicao];
        }
        return null;
    }

    public int busca(Contato contato) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equals(contato)) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            for (int i = posicao; i < tamanho - 1; i++) {
                contatos[i] = contatos[i + 1];
            }
            contatos[tamanho - 1] = null;
            tamanho--;
            return true;
        }
        return false;
    }

    public void ordena() {
        Contato aux;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (contatos[i].compareTo(contatos[j]) > 0) { 
                    aux = contatos[i];
                    contatos[i] = contatos[j];
                    contatos[j] = aux;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            builder.append(contatos[i]).append("\n");
        }
        return builder.toString();
    }
}
