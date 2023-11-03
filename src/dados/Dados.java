package dados;

import java.util.Arrays;
import trabalho.*;

public class Dados {
    private Imovel[] imoveis;
    private int nImoveis = 0;

    public Dados() {
        imoveis = new Imovel[100];
    }

    // Getters and setters

    public Imovel[] getImoveis() {
        return imoveis;
    }

    public int getnImoveis() {
        return nImoveis;
    }

    public void setnImoveis(int nImoveis) {
        this.nImoveis = nImoveis;
    }

    public void preencherDados() {
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            imoveis[i] = new Imovel("Casa " + s, "Local " + s, i, i, i);
        }
        nImoveis = 10;
    }

    public void adicionarImovel(Imovel novoImovel) {
        if (nImoveis < imoveis.length) {
            imoveis[nImoveis] = novoImovel;
            nImoveis++;
            System.out.println("Imovel adicionado com sucesso!");
        } else {
            System.out.println("A capacidade maxima de anuncios foi atingida. Nao eh possivel adicionar mais imoveis.");
        }
    }

    public void removerImovel(Imovel imovelParaRemover) {
        int indiceEncontrado = -1;

        for (int i = 0; i < nImoveis; i++) {
            if (imoveis[i] != null && imoveis[i].equals(imovelParaRemover)) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            // Remover o imóvel encontrando
            for (int i = indiceEncontrado; i < nImoveis - 1; i++) {
                imoveis[i] = imoveis[i + 1];
            }
            imoveis[nImoveis - 1] = null;
            nImoveis--;
            System.out.println("Imovel removido com sucesso!");
        } else {
            System.out.println("Imovel nao encontrado na lista.");
        }
    }

    public int buscarImovel(Imovel imovelParaBuscar) {
        for (int i = 0; i < nImoveis; i++) {
            if (imoveis[i] != null && imoveis[i].equals(imovelParaBuscar)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o imóvel não for encontrado
    }

    @Override
    public String toString() {
        return "Dados [imoveis=" + Arrays.toString(imoveis) + ", nImoveis=" + nImoveis + "]";
    }
}
