package projetocp;

import java.util.Calendar;

public class FuncionarioOutros extends Funcionario{
    private String funcao;

    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
    }
}
