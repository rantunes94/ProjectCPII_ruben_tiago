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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSeccaoTabalho() {
        return seccaoTabalho;
    }

    public void setSeccaoTabalho(String seccaoTabalho) {
        this.seccaoTabalho = seccaoTabalho;
    }

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Funcionário Médico:");
        str.append(super.toString());
        str.append("\n\tEspecialidade do médico: ").append(especialidade);
        str.append("\n\tSecção de trabalho do médico: ").append(seccaoTabalho);

        return str.toString();
    }
}
