package projetocp;

import java.util.Calendar;

public class FuncionarioTecnicoNAOUSAR { // apaguei o extends
    private String username;
    private String password;

    /* public FuncionarioTecnicoNAOUSAR(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String username, String password) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.username = username;
        this.password = password;
    } */

    public String getUsername() { return username; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();

        str.append(super.toString());
        str.append("\n\tNome de utilizador: ").append(username);
        //não listei a password por motivos de segurança do funcionário
        return str.toString();
    }
}
