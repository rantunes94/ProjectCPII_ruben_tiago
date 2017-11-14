package projetocp;

public class Divisao {
    private String designacao;
    private String localizacao;
    private int quantidadeEquipamentosInstalados;

    public Divisao(String designacao, String localizacao, int quantidadeEquipamentosInstalados) {
        this.designacao = designacao;
        this.localizacao = localizacao;
        this.quantidadeEquipamentosInstalados = quantidadeEquipamentosInstalados;
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

    public void setQuantidadeEquipamentosInstalados(int quantidadeEquipamentosInstalados) {
        this.quantidadeEquipamentosInstalados = quantidadeEquipamentosInstalados;
    }


}
