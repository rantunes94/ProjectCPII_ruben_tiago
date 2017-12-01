package projetocp;

import java.util.Calendar;

public class FuncionarioOutros extends Funcionario{
    protected String funcao;

    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Funcionário Outro:");
        str.append(super.toString());
        str.append("\n\tFunção do funcionário: ").append(funcao);
        return str.toString();
    }
}
