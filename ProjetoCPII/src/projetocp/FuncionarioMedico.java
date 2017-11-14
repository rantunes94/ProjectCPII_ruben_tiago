package projetocp;

import java.util.Calendar;

public class FuncionarioMedico extends Funcionario {
    private String especialidade;
    private String seccaoTabalho;


    public FuncionarioMedico(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String especialidade, String seccaoTabalho) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.especialidade = especialidade;
        this.seccaoTabalho = seccaoTabalho;
    }
}
