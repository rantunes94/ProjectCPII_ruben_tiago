package projetocp;

import java.util.Calendar;

public class FuncionarioTecnico extends FuncionarioOutros {
    private String username;
    private String password;

    public FuncionarioTecnico(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao, String username, String password) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes, funcao);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
