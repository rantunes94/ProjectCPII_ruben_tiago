package projetocp;

public class TipoEquipamento {
    private int numero;
    private String designacao;

    public TipoEquipamento(int numero, String designacao) {
        this.numero = numero;
        this.designacao = designacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
}
