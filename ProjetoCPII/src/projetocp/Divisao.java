package projetocp;

import java.io.Serializable;

public class Divisao implements Serializable {
    public static int quantidadeEquipamentosInstalados; // isto so se faz quando se associa uma divisao....
    private String designacao;
    private String localizacao;
    // array list de equipamentos

    public Divisao(String designacao, String localizacao) {
        quantidadeEquipamentosInstalados++; // incrementar a quantidade quando se cria uma nova instancia
        this.designacao = designacao;
        this.localizacao = localizacao;

    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidadeEquipamentosInstalados() {
        return quantidadeEquipamentosInstalados;
    }

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Divisão:");
        str.append("\n\tDesignação da divisão: ").append(designacao);
        str.append("\n\tLocalização da divisão: ").append(localizacao);
        return str.toString();
    }


}
